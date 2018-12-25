package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Contacts")
@js.native
object ContactsNs extends js.Object {
  
  trait Address extends js.Object {
    var city: java.lang.String
    var country: java.lang.String
    var id: java.lang.String
    var isoCountryCode: java.lang.String
    var label: java.lang.String
    var neighborhood: java.lang.String
    var poBox: java.lang.String
    var postalCode: java.lang.String
    var region: java.lang.String
    var street: java.lang.String
  }
  
  // Types
  /**
       * A set of fields that define information about a single entity.
       */
  
  trait Contact extends js.Object {
    var addresses: js.UndefOr[js.Array[Address]] = js.undefined
    var birthday: js.UndefOr[ContactDate] = js.undefined
    var company: js.UndefOr[java.lang.String] = js.undefined
    var contactType: ContactType
    var dates: js.UndefOr[js.Array[ContactDate]] = js.undefined
    var department: js.UndefOr[java.lang.String] = js.undefined
    var emails: js.UndefOr[js.Array[Email]] = js.undefined
    var firstName: js.UndefOr[java.lang.String] = js.undefined
    var id: java.lang.String
    var image: js.UndefOr[Image] = js.undefined
    var imageAvailable: js.UndefOr[scala.Boolean] = js.undefined
    var instantMessageAddresses: js.UndefOr[js.Array[InstantMessageAddress]] = js.undefined
    var jobTitle: js.UndefOr[java.lang.String] = js.undefined
    var lastName: js.UndefOr[java.lang.String] = js.undefined
    var maidenName: js.UndefOr[java.lang.String] = js.undefined
    var middleName: js.UndefOr[java.lang.String] = js.undefined
    var name: java.lang.String
    var namePrefix: js.UndefOr[java.lang.String] = js.undefined
    var nameSuffix: js.UndefOr[java.lang.String] = js.undefined
    var nickname: js.UndefOr[java.lang.String] = js.undefined
    /**
             * iOS only
             */
    var nonGregorianBirthday: js.UndefOr[ContactDate] = js.undefined
    var note: js.UndefOr[java.lang.String] = js.undefined
    var phoneNumbers: js.UndefOr[js.Array[PhoneNumber]] = js.undefined
    var phoneticFirstName: js.UndefOr[java.lang.String] = js.undefined
    var phoneticLastName: js.UndefOr[java.lang.String] = js.undefined
    var phoneticMiddleName: js.UndefOr[java.lang.String] = js.undefined
    var rawImage: js.UndefOr[Image] = js.undefined
    var relationships: js.UndefOr[js.Array[Relationship]] = js.undefined
    /**
             * iOS only
             */
    var socialProfiles: js.UndefOr[js.Array[SocialProfile]] = js.undefined
    var urlAddresses: js.UndefOr[js.Array[UrlAddress]] = js.undefined
  }
  
  
  trait ContactDate extends js.Object {
    var day: scala.Double
    var format: CalendarFormat
    var id: java.lang.String
    var label: java.lang.String
    var month: scala.Double
    var year: scala.Double
  }
  
  /**
       * Used to query contacts from the user's device
       */
  
  trait ContactQuery extends js.Object {
    /** iOS Only */
    var containerID: js.UndefOr[java.lang.String] = js.undefined
    var fields: js.UndefOr[js.Array[Field]] = js.undefined
    /** iOS Only */
    var groupId: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String] = js.undefined
    /** iOS Only */
    var name: js.UndefOr[java.lang.String] = js.undefined
    var pageOffset: js.UndefOr[scala.Double] = js.undefined
    var pageSize: js.UndefOr[scala.Double] = js.undefined
    /** iOS Only */
    var rawContacts: js.UndefOr[scala.Boolean] = js.undefined
    /** Android Only */
    var sort: js.UndefOr[SortType] = js.undefined
  }
  
  
  trait ContactResponse extends js.Object {
    var data: js.Array[Contact]
    /**
             * This will be true if there are more contacts to retrieve beyond what is returned
             */
    var hasNextPage: scala.Boolean
    /**
             * `true` if there are previous contacts that weren't retrieved due to `pageOffset`
             */
    var hasPreviousPage: scala.Boolean
  }
  
  /**
       * A parent to contacts and groups.
       * iOS Only
       */
  
  trait Container extends js.Object {
    var id: java.lang.String
    var name: java.lang.String
  }
  
  /**
       * Used to query native contact containers.
       * iOS Only
       */
  
  trait ContainerQuery extends js.Object {
    var contactId: js.UndefOr[java.lang.String] = js.undefined
    var containerId: js.UndefOr[java.lang.String] = js.undefined
    var groupId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait Email extends js.Object {
    var email: java.lang.String
    var id: java.lang.String
    var isPrimary: scala.Boolean
    var label: java.lang.String
  }
  
  /**
       * Denotes the functionality of a native contact form
       */
  
  trait FormOptions extends js.Object {
    var allowsActions: js.UndefOr[scala.Boolean] = js.undefined
    var allowsEditing: js.UndefOr[scala.Boolean] = js.undefined
    var alternateName: js.UndefOr[java.lang.String] = js.undefined
    var cancelButtonTitle: js.UndefOr[java.lang.String] = js.undefined
    var displayedPropertyKeys: js.UndefOr[js.Array[Field]] = js.undefined
    var groupId: js.UndefOr[java.lang.String] = js.undefined
    var isNew: js.UndefOr[scala.Boolean] = js.undefined
    var message: js.UndefOr[java.lang.String] = js.undefined
    var preventAnimation: js.UndefOr[scala.Boolean] = js.undefined
    var shouldShowLinkedContacts: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  /**
       * A parent to contacts. A contact can belong to multiple groups.
       * iOS Only
       */
  
  trait Group extends js.Object {
    var id: java.lang.String
    var name: java.lang.String
  }
  
  /**
       * Used to query native contact groups.
       * iOS Only
       */
  
  trait GroupQuery extends js.Object {
    var containerId: js.UndefOr[java.lang.String] = js.undefined
    var groupId: js.UndefOr[java.lang.String] = js.undefined
    var groupName: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
       * Information regarding thumbnail images
       */
  
  trait Image extends js.Object {
    /**
             * Avoid using Base 64 in React Native
             * iOS only
             */
    var base64: js.UndefOr[java.lang.String] = js.undefined
    /**
             * iOS only
             * In Android you can get dimensions using `ReactNative.Image.getSize`
             */
    var height: js.UndefOr[scala.Double] = js.undefined
    var uri: java.lang.String
    /**
             * iOS only
             * In Android you can get dimensions using `ReactNative.Image.getSize`
             */
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  
  trait InstantMessageAddress extends js.Object {
    var id: java.lang.String
    var label: java.lang.String
    var localizedProfile: java.lang.String
    var service: java.lang.String
    var username: java.lang.String
  }
  
  
  trait PhoneNumber extends js.Object {
    var countryCode: java.lang.String
    var digits: java.lang.String
    var id: java.lang.String
    var isPrimary: scala.Boolean
    var label: java.lang.String
    var number: java.lang.String
  }
  
  
  trait Relationship extends js.Object {
    var id: java.lang.String
    var label: java.lang.String
    var name: java.lang.String
  }
  
  /**
       * iOS only
       */
  
  trait SocialProfile extends js.Object {
    var id: java.lang.String
    var label: java.lang.String
    var localizedProfile: java.lang.String
    var service: java.lang.String
    var url: java.lang.String
    var userId: java.lang.String
    var username: java.lang.String
  }
  
  
  trait UrlAddress extends js.Object {
    var id: java.lang.String
    var label: java.lang.String
    var url: java.lang.String
  }
  
  // iOS Only - temporary
  /**
       * Creates a new contact and adds it to the system.
       * iOS Only - temporary
       */
  def addContactAsync(contact: Contact): js.Promise[java.lang.String] = js.native
  // iOS Only - temporary
  /**
       * Creates a new contact and adds it to the system.
       * iOS Only - temporary
       */
  def addContactAsync(contact: Contact, containerId: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
       * Add a contact as a member to a group. A contact can be a member of multiple groups.
       * iOS Only
       */
  def addExistingContactToGroupAsync(contactId: java.lang.String, groupId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Add a group to a container.
       * iOS Only
       */
  def addExistingGroupToContainerAsync(groupId: java.lang.String, containerId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Create a group with a name, and add it to a container. If the container is undefined, the default container will be targeted.
       * iOS Only
       */
  def createGroupAsync(groupName: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
       * Create a group with a name, and add it to a container. If the container is undefined, the default container will be targeted.
       * iOS Only
       */
  def createGroupAsync(groupName: java.lang.String, containerId: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
       * Returns a contact matching the input id. Used for gathering precise data about a contact.
       */
  def getContactByIdAsync(contactId: java.lang.String): js.Promise[Contact] = js.native
  /**
       * Returns a contact matching the input id. Used for gathering precise data about a contact.
       */
  def getContactByIdAsync(contactId: java.lang.String, fields: js.Array[Field]): js.Promise[Contact] = js.native
  // Methods
  /**
       * Return a list of contacts that fit a given criteria. You can get all of the contacts by passing no criteria.
       */
  def getContactsAsync(): js.Promise[ContactResponse] = js.native
  // Methods
  /**
       * Return a list of contacts that fit a given criteria. You can get all of the contacts by passing no criteria.
       */
  def getContactsAsync(contactQuery: ContactQuery): js.Promise[ContactResponse] = js.native
  /**
       * Query a list of system containers.
       * iOS Only
       */
  def getContainersAsync(containerQuery: ContainerQuery): js.Promise[js.Array[Container]] = js.native
  /**
       * Get the default container's ID.
       * iOS Only
       */
  def getDefaultContainerIdAsync(): js.Promise[java.lang.String] = js.native
  /**
       * Query and return a list of system groups.
       * iOS Only
       */
  def getGroupsAsync(query: GroupQuery): js.Promise[js.Array[Group]] = js.native
  // iOS Only
  /**
       * Present a native form for manipulating contacts.
       * iOS Only
       */
  def presentFormAsync(contactId: java.lang.String): js.Promise[scala.Unit] = js.native
  // iOS Only
  /**
       * Present a native form for manipulating contacts.
       * iOS Only
       */
  def presentFormAsync(contactId: java.lang.String, contact: Contact): js.Promise[scala.Unit] = js.native
  // iOS Only
  /**
       * Present a native form for manipulating contacts.
       * iOS Only
       */
  def presentFormAsync(contactId: java.lang.String, contact: Contact, formOptions: FormOptions): js.Promise[scala.Unit] = js.native
  /**
       * Delete a contact from the system.
       * iOS Only - temporary
       */
  def removeContactAsync(contactId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Remove a contact's membership from a given group. This will not delete the contact.
       * iOS Only
       */
  def removeContactFromGroupAsync(contactId: java.lang.String, groupId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Delete a group from the device.
       * iOS Only
       */
  def removeGroupAsync(groupId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Mutate the information of an existing contact.
       * iOS Only - temporary
       */
  def updateContactAsync(contact: Contact): js.Promise[java.lang.String] = js.native
  /**
       * Change the name of an existing group.
       * iOS Only
       */
  def updateGroupNameAsync(groupName: java.lang.String, groupId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Query a set of contacts and write them to a local uri that can be used for sharing with `ReactNative.Share`.
       * iOS Only - temporary
       */
  def writeContactToFileAsync(contactQuery: ContactQuery): js.Promise[java.lang.String] = js.native
  @JSName("CalendarFormats")
  @js.native
  object CalendarFormatsNs extends js.Object {
    val Chinese: Chinese = js.native
    val Gregorian: Gregorian = js.native
    val Hebrew: Hebrew = js.native
    val Islamic: Islamic = js.native
    type Chinese = expoLib.expoLibStrings.chinese
    type Gregorian = expoLib.expoLibStrings.gregorian
    type Hebrew = expoLib.expoLibStrings.hebrew
    type Islamic = expoLib.expoLibStrings.islamic
  }
  
  /**
       * iOS Only
       */
  @JSName("ContactTypes")
  @js.native
  object ContactTypesNs extends js.Object {
    val Company: Company = js.native
    val Person: Person = js.native
    type Company = expoLib.expoLibStrings.company
    type Person = expoLib.expoLibStrings.person
  }
  
  /**
       * iOS Only
       */
  @JSName("ContainerTypes")
  @js.native
  object ContainerTypesNs extends js.Object {
    val CardDAV: CardDAV = js.native
    val Exchange: Exchange = js.native
    val Local: Local = js.native
    val Unassigned: Unassigned = js.native
    type CardDAV = expoLib.expoLibStrings.cardDAV
    type Exchange = expoLib.expoLibStrings.exchange
    type Local = expoLib.expoLibStrings.local
    type Unassigned = expoLib.expoLibStrings.unassigned
  }
  
  // Constants
  @JSName("Fields")
  @js.native
  object FieldsNs extends js.Object {
    val Addresses: Addresses = js.native
    val Birthday: Birthday = js.native
    val Company: Company = js.native
    val ContactType: ContactType = js.native
    val Dates: Dates = js.native
    val Department: Department = js.native
    val Emails: Emails = js.native
    val FirstName: FirstName = js.native
    val ID: ID = js.native
    val Image: Image = js.native
    val ImageAvailable: ImageAvailable = js.native
    val InstantMessageAddresses: InstantMessageAddresses = js.native
    val JobTitle: JobTitle = js.native
    val LastName: LastName = js.native
    val MaidenName: MaidenName = js.native
    val MiddleName: MiddleName = js.native
    val Name: Name = js.native
    val NamePrefix: NamePrefix = js.native
    val NameSuffix: NameSuffix = js.native
    val Nickname: Nickname = js.native
    val NonGregorianBirthday: NonGregorianBirthday = js.native
    val Note: Note = js.native
    val PhoneNumbers: PhoneNumbers = js.native
    val PhoneticFirstName: PhoneticFirstName = js.native
    val PhoneticLastName: PhoneticLastName = js.native
    val PhoneticMiddleName: PhoneticMiddleName = js.native
    val RawImage: RawImage = js.native
    val Relationships: Relationships = js.native
    val SocialProfiles: SocialProfiles = js.native
    val UrlAddresses: UrlAddresses = js.native
    type Addresses = expoLib.expoLibStrings.addresses
    type Birthday = expoLib.expoLibStrings.birthday
    type Company = expoLib.expoLibStrings.company
    type ContactType = expoLib.expoLibStrings.contactType
    type Dates = expoLib.expoLibStrings.dates
    type Department = expoLib.expoLibStrings.department
    type Emails = expoLib.expoLibStrings.emails
    type FirstName = expoLib.expoLibStrings.firstName
    type ID = expoLib.expoLibStrings.id
    type Image = expoLib.expoLibStrings.image
    type ImageAvailable = expoLib.expoLibStrings.imageAvailable
    type InstantMessageAddresses = expoLib.expoLibStrings.instantMessageAddresses
    type JobTitle = expoLib.expoLibStrings.jobTitle
    type LastName = expoLib.expoLibStrings.lastName
    type MaidenName = expoLib.expoLibStrings.maidenName
    type MiddleName = expoLib.expoLibStrings.middleName
    type Name = expoLib.expoLibStrings.name
    type NamePrefix = expoLib.expoLibStrings.namePrefix
    type NameSuffix = expoLib.expoLibStrings.nameSuffix
    type Nickname = expoLib.expoLibStrings.nickname
    type NonGregorianBirthday = expoLib.expoLibStrings.nonGregorianBirthday
    type Note = expoLib.expoLibStrings.note
    type PhoneNumbers = expoLib.expoLibStrings.phoneNumbers
    type PhoneticFirstName = expoLib.expoLibStrings.phoneticFirstName
    type PhoneticLastName = expoLib.expoLibStrings.phoneticLastName
    type PhoneticMiddleName = expoLib.expoLibStrings.phoneticMiddleName
    type RawImage = expoLib.expoLibStrings.rawImage
    type Relationships = expoLib.expoLibStrings.relationships
    type SocialProfiles = expoLib.expoLibStrings.socialProfiles
    type UrlAddresses = expoLib.expoLibStrings.urlAddresses
  }
  
  @JSName("FormTypes")
  @js.native
  object FormTypesNs extends js.Object {
    val Default: Default = js.native
    val New: New = js.native
    val Unknown: Unknown = js.native
    type Default = expoLib.expoLibStrings.default
    type New = expoLib.expoLibStrings.`new`
    type Unknown = expoLib.expoLibStrings.unknown
  }
  
  @JSName("SortTypes")
  @js.native
  object SortTypesNs extends js.Object {
    val FirstName: FirstName = js.native
    val LastName: LastName = js.native
    val UserDefault: UserDefault = js.native
    type FirstName = expoLib.expoLibStrings.firstName
    type LastName = expoLib.expoLibStrings.lastName
    type UserDefault = expoLib.expoLibStrings.userDefault
  }
  
  type CalendarFormat = expoLib.expoMod.ContactsNs.CalendarFormatsNs.Gregorian | expoLib.expoMod.ContactsNs.CalendarFormatsNs.Chinese | expoLib.expoMod.ContactsNs.CalendarFormatsNs.Hebrew | expoLib.expoMod.ContactsNs.CalendarFormatsNs.Islamic
  type ContactType = expoLib.expoMod.ContactsNs.ContactTypesNs.Person | expoLib.expoMod.ContactsNs.ContactTypesNs.Company
  type ContainerType = expoLib.expoMod.ContactsNs.ContainerTypesNs.Local | expoLib.expoMod.ContactsNs.ContainerTypesNs.Exchange | expoLib.expoMod.ContactsNs.ContainerTypesNs.CardDAV | expoLib.expoMod.ContactsNs.ContainerTypesNs.Unassigned
  type Field = expoLib.expoMod.ContactsNs.FieldsNs.ID | expoLib.expoMod.ContactsNs.FieldsNs.Name | expoLib.expoMod.ContactsNs.FieldsNs.FirstName | expoLib.expoMod.ContactsNs.FieldsNs.MiddleName | expoLib.expoMod.ContactsNs.FieldsNs.LastName | expoLib.expoMod.ContactsNs.FieldsNs.NamePrefix | expoLib.expoMod.ContactsNs.FieldsNs.NameSuffix | expoLib.expoMod.ContactsNs.FieldsNs.PhoneticFirstName | expoLib.expoMod.ContactsNs.FieldsNs.PhoneticMiddleName | expoLib.expoMod.ContactsNs.FieldsNs.PhoneticLastName | expoLib.expoMod.ContactsNs.FieldsNs.Birthday | expoLib.expoMod.ContactsNs.FieldsNs.Emails | expoLib.expoMod.ContactsNs.FieldsNs.PhoneNumbers | expoLib.expoMod.ContactsNs.FieldsNs.Addresses | expoLib.expoMod.ContactsNs.FieldsNs.InstantMessageAddresses | expoLib.expoMod.ContactsNs.FieldsNs.UrlAddresses | expoLib.expoMod.ContactsNs.FieldsNs.Company | expoLib.expoMod.ContactsNs.FieldsNs.JobTitle | expoLib.expoMod.ContactsNs.FieldsNs.Department | expoLib.expoMod.ContactsNs.FieldsNs.ImageAvailable | expoLib.expoMod.ContactsNs.FieldsNs.Image | expoLib.expoMod.ContactsNs.FieldsNs.Note | expoLib.expoMod.ContactsNs.FieldsNs.Dates | expoLib.expoMod.ContactsNs.FieldsNs.Relationships | expoLib.expoMod.ContactsNs.FieldsNs.Nickname | expoLib.expoMod.ContactsNs.FieldsNs.RawImage | expoLib.expoMod.ContactsNs.FieldsNs.MaidenName | expoLib.expoMod.ContactsNs.FieldsNs.ContactType | expoLib.expoMod.ContactsNs.FieldsNs.SocialProfiles | expoLib.expoMod.ContactsNs.FieldsNs.NonGregorianBirthday
  type FormType = expoLib.expoMod.ContactsNs.FormTypesNs.New | expoLib.expoMod.ContactsNs.FormTypesNs.Unknown | expoLib.expoMod.ContactsNs.FormTypesNs.Default
  type SortType = expoLib.expoMod.ContactsNs.SortTypesNs.FirstName | expoLib.expoMod.ContactsNs.SortTypesNs.LastName | expoLib.expoMod.ContactsNs.SortTypesNs.UserDefault
}


package typings.expo.expoMod

import typings.expo.expoMod.ContactsNs.Address
import typings.expo.expoMod.ContactsNs.CalendarFormat
import typings.expo.expoMod.ContactsNs.CalendarFormatsNs.Chinese
import typings.expo.expoMod.ContactsNs.CalendarFormatsNs.Gregorian
import typings.expo.expoMod.ContactsNs.CalendarFormatsNs.Hebrew
import typings.expo.expoMod.ContactsNs.CalendarFormatsNs.Islamic
import typings.expo.expoMod.ContactsNs.Contact
import typings.expo.expoMod.ContactsNs.ContactDate
import typings.expo.expoMod.ContactsNs.ContactQuery
import typings.expo.expoMod.ContactsNs.ContactResponse
import typings.expo.expoMod.ContactsNs.ContactType
import typings.expo.expoMod.ContactsNs.ContactTypesNs.Company
import typings.expo.expoMod.ContactsNs.ContactTypesNs.Person
import typings.expo.expoMod.ContactsNs.Container
import typings.expo.expoMod.ContactsNs.ContainerQuery
import typings.expo.expoMod.ContactsNs.ContainerTypesNs.CardDAV
import typings.expo.expoMod.ContactsNs.ContainerTypesNs.Exchange
import typings.expo.expoMod.ContactsNs.ContainerTypesNs.Local
import typings.expo.expoMod.ContactsNs.ContainerTypesNs.Unassigned
import typings.expo.expoMod.ContactsNs.Email
import typings.expo.expoMod.ContactsNs.Field
import typings.expo.expoMod.ContactsNs.FieldsNs.Addresses
import typings.expo.expoMod.ContactsNs.FieldsNs.Birthday
import typings.expo.expoMod.ContactsNs.FieldsNs.Dates
import typings.expo.expoMod.ContactsNs.FieldsNs.Department
import typings.expo.expoMod.ContactsNs.FieldsNs.Emails
import typings.expo.expoMod.ContactsNs.FieldsNs.FirstName
import typings.expo.expoMod.ContactsNs.FieldsNs.ID
import typings.expo.expoMod.ContactsNs.FieldsNs.ImageAvailable
import typings.expo.expoMod.ContactsNs.FieldsNs.InstantMessageAddresses
import typings.expo.expoMod.ContactsNs.FieldsNs.JobTitle
import typings.expo.expoMod.ContactsNs.FieldsNs.LastName
import typings.expo.expoMod.ContactsNs.FieldsNs.MaidenName
import typings.expo.expoMod.ContactsNs.FieldsNs.MiddleName
import typings.expo.expoMod.ContactsNs.FieldsNs.Name
import typings.expo.expoMod.ContactsNs.FieldsNs.NamePrefix
import typings.expo.expoMod.ContactsNs.FieldsNs.NameSuffix
import typings.expo.expoMod.ContactsNs.FieldsNs.Nickname
import typings.expo.expoMod.ContactsNs.FieldsNs.NonGregorianBirthday
import typings.expo.expoMod.ContactsNs.FieldsNs.Note
import typings.expo.expoMod.ContactsNs.FieldsNs.PhoneNumbers
import typings.expo.expoMod.ContactsNs.FieldsNs.PhoneticFirstName
import typings.expo.expoMod.ContactsNs.FieldsNs.PhoneticLastName
import typings.expo.expoMod.ContactsNs.FieldsNs.PhoneticMiddleName
import typings.expo.expoMod.ContactsNs.FieldsNs.RawImage
import typings.expo.expoMod.ContactsNs.FieldsNs.Relationships
import typings.expo.expoMod.ContactsNs.FieldsNs.SocialProfiles
import typings.expo.expoMod.ContactsNs.FieldsNs.UrlAddresses
import typings.expo.expoMod.ContactsNs.FormOptions
import typings.expo.expoMod.ContactsNs.FormTypesNs.Default
import typings.expo.expoMod.ContactsNs.FormTypesNs.New
import typings.expo.expoMod.ContactsNs.FormTypesNs.Unknown
import typings.expo.expoMod.ContactsNs.Group
import typings.expo.expoMod.ContactsNs.GroupQuery
import typings.expo.expoMod.ContactsNs.Image
import typings.expo.expoMod.ContactsNs.InstantMessageAddress
import typings.expo.expoMod.ContactsNs.PhoneNumber
import typings.expo.expoMod.ContactsNs.Relationship
import typings.expo.expoMod.ContactsNs.SocialProfile
import typings.expo.expoMod.ContactsNs.SortType
import typings.expo.expoMod.ContactsNs.SortTypesNs.UserDefault
import typings.expo.expoMod.ContactsNs.UrlAddress
import typings.expo.expoStrings.`new`
import typings.expo.expoStrings.addresses
import typings.expo.expoStrings.birthday
import typings.expo.expoStrings.cardDAV
import typings.expo.expoStrings.chinese
import typings.expo.expoStrings.company
import typings.expo.expoStrings.contactType
import typings.expo.expoStrings.dates
import typings.expo.expoStrings.default
import typings.expo.expoStrings.department
import typings.expo.expoStrings.emails
import typings.expo.expoStrings.exchange
import typings.expo.expoStrings.firstName
import typings.expo.expoStrings.gregorian
import typings.expo.expoStrings.hebrew
import typings.expo.expoStrings.id
import typings.expo.expoStrings.image
import typings.expo.expoStrings.imageAvailable
import typings.expo.expoStrings.instantMessageAddresses
import typings.expo.expoStrings.islamic
import typings.expo.expoStrings.jobTitle
import typings.expo.expoStrings.lastName
import typings.expo.expoStrings.local
import typings.expo.expoStrings.maidenName
import typings.expo.expoStrings.middleName
import typings.expo.expoStrings.name
import typings.expo.expoStrings.namePrefix
import typings.expo.expoStrings.nameSuffix
import typings.expo.expoStrings.nickname
import typings.expo.expoStrings.nonGregorianBirthday
import typings.expo.expoStrings.note
import typings.expo.expoStrings.person
import typings.expo.expoStrings.phoneNumbers
import typings.expo.expoStrings.phoneticFirstName
import typings.expo.expoStrings.phoneticLastName
import typings.expo.expoStrings.phoneticMiddleName
import typings.expo.expoStrings.rawImage
import typings.expo.expoStrings.relationships
import typings.expo.expoStrings.socialProfiles
import typings.expo.expoStrings.unassigned
import typings.expo.expoStrings.unknown
import typings.expo.expoStrings.urlAddresses
import typings.expo.expoStrings.userDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Contacts")
@js.native
object ContactsNs extends js.Object {
  trait Address extends js.Object {
    var city: String
    var country: String
    var id: String
    var isoCountryCode: String
    var label: String
    var neighborhood: String
    var poBox: String
    var postalCode: String
    var region: String
    var street: String
  }
  
  // Types
  /**
    * A set of fields that define information about a single entity.
    */
  trait Contact extends js.Object {
    var addresses: js.UndefOr[js.Array[Address]] = js.undefined
    var birthday: js.UndefOr[ContactDate] = js.undefined
    var company: js.UndefOr[String] = js.undefined
    var contactType: ContactType
    var dates: js.UndefOr[js.Array[ContactDate]] = js.undefined
    var department: js.UndefOr[String] = js.undefined
    var emails: js.UndefOr[js.Array[Email]] = js.undefined
    var firstName: js.UndefOr[String] = js.undefined
    var id: String
    var image: js.UndefOr[Image] = js.undefined
    var imageAvailable: js.UndefOr[Boolean] = js.undefined
    var instantMessageAddresses: js.UndefOr[js.Array[InstantMessageAddress]] = js.undefined
    var jobTitle: js.UndefOr[String] = js.undefined
    var lastName: js.UndefOr[String] = js.undefined
    var maidenName: js.UndefOr[String] = js.undefined
    var middleName: js.UndefOr[String] = js.undefined
    var name: String
    var namePrefix: js.UndefOr[String] = js.undefined
    var nameSuffix: js.UndefOr[String] = js.undefined
    var nickname: js.UndefOr[String] = js.undefined
    /**
      * iOS only
      */
    var nonGregorianBirthday: js.UndefOr[ContactDate] = js.undefined
    var note: js.UndefOr[String] = js.undefined
    var phoneNumbers: js.UndefOr[js.Array[PhoneNumber]] = js.undefined
    var phoneticFirstName: js.UndefOr[String] = js.undefined
    var phoneticLastName: js.UndefOr[String] = js.undefined
    var phoneticMiddleName: js.UndefOr[String] = js.undefined
    var rawImage: js.UndefOr[Image] = js.undefined
    var relationships: js.UndefOr[js.Array[Relationship]] = js.undefined
    /**
      * iOS only
      */
    var socialProfiles: js.UndefOr[js.Array[SocialProfile]] = js.undefined
    var urlAddresses: js.UndefOr[js.Array[UrlAddress]] = js.undefined
  }
  
  trait ContactDate extends js.Object {
    var day: Double
    var format: CalendarFormat
    var id: String
    var label: String
    var month: Double
    var year: Double
  }
  
  /**
    * Used to query contacts from the user's device
    */
  trait ContactQuery extends js.Object {
    /** iOS Only */
    var containerID: js.UndefOr[String] = js.undefined
    var fields: js.UndefOr[js.Array[Field]] = js.undefined
    /** iOS Only */
    var groupId: js.UndefOr[String] = js.undefined
    var id: js.UndefOr[String] = js.undefined
    /** iOS Only */
    var name: js.UndefOr[String] = js.undefined
    var pageOffset: js.UndefOr[Double] = js.undefined
    var pageSize: js.UndefOr[Double] = js.undefined
    /** iOS Only */
    var rawContacts: js.UndefOr[Boolean] = js.undefined
    /** Android Only */
    var sort: js.UndefOr[SortType] = js.undefined
  }
  
  trait ContactResponse extends js.Object {
    var data: js.Array[Contact]
    /**
      * This will be true if there are more contacts to retrieve beyond what is returned
      */
    var hasNextPage: Boolean
    /**
      * `true` if there are previous contacts that weren't retrieved due to `pageOffset`
      */
    var hasPreviousPage: Boolean
  }
  
  /**
    * A parent to contacts and groups.
    * iOS Only
    */
  trait Container extends js.Object {
    var id: String
    var name: String
  }
  
  /**
    * Used to query native contact containers.
    * iOS Only
    */
  trait ContainerQuery extends js.Object {
    var contactId: js.UndefOr[String] = js.undefined
    var containerId: js.UndefOr[String] = js.undefined
    var groupId: js.UndefOr[String] = js.undefined
  }
  
  trait Email extends js.Object {
    var email: String
    var id: String
    var isPrimary: Boolean
    var label: String
  }
  
  /**
    * Denotes the functionality of a native contact form
    */
  trait FormOptions extends js.Object {
    var allowsActions: js.UndefOr[Boolean] = js.undefined
    var allowsEditing: js.UndefOr[Boolean] = js.undefined
    var alternateName: js.UndefOr[String] = js.undefined
    var cancelButtonTitle: js.UndefOr[String] = js.undefined
    var displayedPropertyKeys: js.UndefOr[js.Array[Field]] = js.undefined
    var groupId: js.UndefOr[String] = js.undefined
    var isNew: js.UndefOr[Boolean] = js.undefined
    var message: js.UndefOr[String] = js.undefined
    var preventAnimation: js.UndefOr[Boolean] = js.undefined
    var shouldShowLinkedContacts: js.UndefOr[Boolean] = js.undefined
  }
  
  /**
    * A parent to contacts. A contact can belong to multiple groups.
    * iOS Only
    */
  trait Group extends js.Object {
    var id: String
    var name: String
  }
  
  /**
    * Used to query native contact groups.
    * iOS Only
    */
  trait GroupQuery extends js.Object {
    var containerId: js.UndefOr[String] = js.undefined
    var groupId: js.UndefOr[String] = js.undefined
    var groupName: js.UndefOr[String] = js.undefined
  }
  
  /**
    * Information regarding thumbnail images
    */
  trait Image extends js.Object {
    /**
      * Avoid using Base 64 in React Native
      * iOS only
      */
    var base64: js.UndefOr[String] = js.undefined
    /**
      * iOS only
      * In Android you can get dimensions using `ReactNative.Image.getSize`
      */
    var height: js.UndefOr[Double] = js.undefined
    var uri: String
    /**
      * iOS only
      * In Android you can get dimensions using `ReactNative.Image.getSize`
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  
  trait InstantMessageAddress extends js.Object {
    var id: String
    var label: String
    var localizedProfile: String
    var service: String
    var username: String
  }
  
  trait PhoneNumber extends js.Object {
    var countryCode: String
    var digits: String
    var id: String
    var isPrimary: Boolean
    var label: String
    var number: String
  }
  
  trait Relationship extends js.Object {
    var id: String
    var label: String
    var name: String
  }
  
  /**
    * iOS only
    */
  trait SocialProfile extends js.Object {
    var id: String
    var label: String
    var localizedProfile: String
    var service: String
    var url: String
    var userId: String
    var username: String
  }
  
  trait UrlAddress extends js.Object {
    var id: String
    var label: String
    var url: String
  }
  
  // iOS Only - temporary
  /**
    * Creates a new contact and adds it to the system.
    * iOS Only - temporary
    */
  def addContactAsync(contact: Contact): js.Promise[String] = js.native
  def addContactAsync(contact: Contact, containerId: String): js.Promise[String] = js.native
  /**
    * Add a contact as a member to a group. A contact can be a member of multiple groups.
    * iOS Only
    */
  def addExistingContactToGroupAsync(contactId: String, groupId: String): js.Promise[Unit] = js.native
  /**
    * Add a group to a container.
    * iOS Only
    */
  def addExistingGroupToContainerAsync(groupId: String, containerId: String): js.Promise[Unit] = js.native
  /**
    * Create a group with a name, and add it to a container. If the container is undefined, the default container will be targeted.
    * iOS Only
    */
  def createGroupAsync(groupName: String): js.Promise[String] = js.native
  def createGroupAsync(groupName: String, containerId: String): js.Promise[String] = js.native
  /**
    * Returns a contact matching the input id. Used for gathering precise data about a contact.
    */
  def getContactByIdAsync(contactId: String): js.Promise[Contact] = js.native
  def getContactByIdAsync(contactId: String, fields: js.Array[Field]): js.Promise[Contact] = js.native
  // Methods
  /**
    * Return a list of contacts that fit a given criteria. You can get all of the contacts by passing no criteria.
    */
  def getContactsAsync(): js.Promise[ContactResponse] = js.native
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
  def getDefaultContainerIdAsync(): js.Promise[String] = js.native
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
  def presentFormAsync(contactId: String): js.Promise[Unit] = js.native
  def presentFormAsync(contactId: String, contact: Contact): js.Promise[Unit] = js.native
  def presentFormAsync(contactId: String, contact: Contact, formOptions: FormOptions): js.Promise[Unit] = js.native
  /**
    * Delete a contact from the system.
    * iOS Only - temporary
    */
  def removeContactAsync(contactId: String): js.Promise[Unit] = js.native
  /**
    * Remove a contact's membership from a given group. This will not delete the contact.
    * iOS Only
    */
  def removeContactFromGroupAsync(contactId: String, groupId: String): js.Promise[Unit] = js.native
  /**
    * Delete a group from the device.
    * iOS Only
    */
  def removeGroupAsync(groupId: String): js.Promise[Unit] = js.native
  /**
    * Mutate the information of an existing contact.
    * iOS Only - temporary
    */
  def updateContactAsync(contact: Contact): js.Promise[String] = js.native
  /**
    * Change the name of an existing group.
    * iOS Only
    */
  def updateGroupNameAsync(groupName: String, groupId: String): js.Promise[Unit] = js.native
  /**
    * Query a set of contacts and write them to a local uri that can be used for sharing with `ReactNative.Share`.
    * iOS Only - temporary
    */
  def writeContactToFileAsync(contactQuery: ContactQuery): js.Promise[String] = js.native
  @JSName("CalendarFormats")
  @js.native
  object CalendarFormatsNs extends js.Object {
    val Chinese: typings.expo.expoMod.ContactsNs.CalendarFormatsNs.Chinese = js.native
    val Gregorian: typings.expo.expoMod.ContactsNs.CalendarFormatsNs.Gregorian = js.native
    val Hebrew: typings.expo.expoMod.ContactsNs.CalendarFormatsNs.Hebrew = js.native
    val Islamic: typings.expo.expoMod.ContactsNs.CalendarFormatsNs.Islamic = js.native
    type Chinese = chinese
    type Gregorian = gregorian
    type Hebrew = hebrew
    type Islamic = islamic
  }
  
  /**
    * iOS Only
    */
  @JSName("ContactTypes")
  @js.native
  object ContactTypesNs extends js.Object {
    val Company: typings.expo.expoMod.ContactsNs.ContactTypesNs.Company = js.native
    val Person: typings.expo.expoMod.ContactsNs.ContactTypesNs.Person = js.native
    type Company = company
    type Person = person
  }
  
  /**
    * iOS Only
    */
  @JSName("ContainerTypes")
  @js.native
  object ContainerTypesNs extends js.Object {
    val CardDAV: typings.expo.expoMod.ContactsNs.ContainerTypesNs.CardDAV = js.native
    val Exchange: typings.expo.expoMod.ContactsNs.ContainerTypesNs.Exchange = js.native
    val Local: typings.expo.expoMod.ContactsNs.ContainerTypesNs.Local = js.native
    val Unassigned: typings.expo.expoMod.ContactsNs.ContainerTypesNs.Unassigned = js.native
    type CardDAV = cardDAV
    type Exchange = exchange
    type Local = local
    type Unassigned = unassigned
  }
  
  // Constants
  @JSName("Fields")
  @js.native
  object FieldsNs extends js.Object {
    val Addresses: typings.expo.expoMod.ContactsNs.FieldsNs.Addresses = js.native
    val Birthday: typings.expo.expoMod.ContactsNs.FieldsNs.Birthday = js.native
    val Company: typings.expo.expoMod.ContactsNs.FieldsNs.Company = js.native
    val ContactType: typings.expo.expoMod.ContactsNs.FieldsNs.ContactType = js.native
    val Dates: typings.expo.expoMod.ContactsNs.FieldsNs.Dates = js.native
    val Department: typings.expo.expoMod.ContactsNs.FieldsNs.Department = js.native
    val Emails: typings.expo.expoMod.ContactsNs.FieldsNs.Emails = js.native
    val FirstName: typings.expo.expoMod.ContactsNs.FieldsNs.FirstName = js.native
    val ID: typings.expo.expoMod.ContactsNs.FieldsNs.ID = js.native
    val Image: typings.expo.expoMod.ContactsNs.FieldsNs.Image = js.native
    val ImageAvailable: typings.expo.expoMod.ContactsNs.FieldsNs.ImageAvailable = js.native
    val InstantMessageAddresses: typings.expo.expoMod.ContactsNs.FieldsNs.InstantMessageAddresses = js.native
    val JobTitle: typings.expo.expoMod.ContactsNs.FieldsNs.JobTitle = js.native
    val LastName: typings.expo.expoMod.ContactsNs.FieldsNs.LastName = js.native
    val MaidenName: typings.expo.expoMod.ContactsNs.FieldsNs.MaidenName = js.native
    val MiddleName: typings.expo.expoMod.ContactsNs.FieldsNs.MiddleName = js.native
    val Name: typings.expo.expoMod.ContactsNs.FieldsNs.Name = js.native
    val NamePrefix: typings.expo.expoMod.ContactsNs.FieldsNs.NamePrefix = js.native
    val NameSuffix: typings.expo.expoMod.ContactsNs.FieldsNs.NameSuffix = js.native
    val Nickname: typings.expo.expoMod.ContactsNs.FieldsNs.Nickname = js.native
    val NonGregorianBirthday: typings.expo.expoMod.ContactsNs.FieldsNs.NonGregorianBirthday = js.native
    val Note: typings.expo.expoMod.ContactsNs.FieldsNs.Note = js.native
    val PhoneNumbers: typings.expo.expoMod.ContactsNs.FieldsNs.PhoneNumbers = js.native
    val PhoneticFirstName: typings.expo.expoMod.ContactsNs.FieldsNs.PhoneticFirstName = js.native
    val PhoneticLastName: typings.expo.expoMod.ContactsNs.FieldsNs.PhoneticLastName = js.native
    val PhoneticMiddleName: typings.expo.expoMod.ContactsNs.FieldsNs.PhoneticMiddleName = js.native
    val RawImage: typings.expo.expoMod.ContactsNs.FieldsNs.RawImage = js.native
    val Relationships: typings.expo.expoMod.ContactsNs.FieldsNs.Relationships = js.native
    val SocialProfiles: typings.expo.expoMod.ContactsNs.FieldsNs.SocialProfiles = js.native
    val UrlAddresses: typings.expo.expoMod.ContactsNs.FieldsNs.UrlAddresses = js.native
    type Addresses = addresses
    type Birthday = birthday
    type Company = company
    type ContactType = contactType
    type Dates = dates
    type Department = department
    type Emails = emails
    type FirstName = firstName
    type ID = id
    type Image = image
    type ImageAvailable = imageAvailable
    type InstantMessageAddresses = instantMessageAddresses
    type JobTitle = jobTitle
    type LastName = lastName
    type MaidenName = maidenName
    type MiddleName = middleName
    type Name = name
    type NamePrefix = namePrefix
    type NameSuffix = nameSuffix
    type Nickname = nickname
    type NonGregorianBirthday = nonGregorianBirthday
    type Note = note
    type PhoneNumbers = phoneNumbers
    type PhoneticFirstName = phoneticFirstName
    type PhoneticLastName = phoneticLastName
    type PhoneticMiddleName = phoneticMiddleName
    type RawImage = rawImage
    type Relationships = relationships
    type SocialProfiles = socialProfiles
    type UrlAddresses = urlAddresses
  }
  
  @JSName("FormTypes")
  @js.native
  object FormTypesNs extends js.Object {
    val Default: typings.expo.expoMod.ContactsNs.FormTypesNs.Default = js.native
    val New: typings.expo.expoMod.ContactsNs.FormTypesNs.New = js.native
    val Unknown: typings.expo.expoMod.ContactsNs.FormTypesNs.Unknown = js.native
    type Default = default
    type New = `new`
    type Unknown = unknown
  }
  
  @JSName("SortTypes")
  @js.native
  object SortTypesNs extends js.Object {
    val FirstName: typings.expo.expoMod.ContactsNs.SortTypesNs.FirstName = js.native
    val LastName: typings.expo.expoMod.ContactsNs.SortTypesNs.LastName = js.native
    val UserDefault: typings.expo.expoMod.ContactsNs.SortTypesNs.UserDefault = js.native
    type FirstName = firstName
    type LastName = lastName
    type UserDefault = userDefault
  }
  
  type CalendarFormat = Gregorian | Chinese | Hebrew | Islamic
  type ContactType = Person | Company
  type ContainerType = Local | Exchange | CardDAV | Unassigned
  type Field = ID | Name | FirstName | MiddleName | LastName | NamePrefix | NameSuffix | PhoneticFirstName | PhoneticMiddleName | PhoneticLastName | Birthday | Emails | PhoneNumbers | Addresses | InstantMessageAddresses | UrlAddresses | typings.expo.expoMod.ContactsNs.FieldsNs.Company | JobTitle | Department | ImageAvailable | typings.expo.expoMod.ContactsNs.FieldsNs.Image | Note | Dates | Relationships | Nickname | RawImage | MaidenName | typings.expo.expoMod.ContactsNs.FieldsNs.ContactType | SocialProfiles | NonGregorianBirthday
  type FormType = New | Unknown | Default
  type SortType = typings.expo.expoMod.ContactsNs.SortTypesNs.FirstName | typings.expo.expoMod.ContactsNs.SortTypesNs.LastName | UserDefault
}


package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.People.Collection.ContactGroups.MembersCollection
import typings.googleAppsScript.GoogleAppsScript.People.Collection.ContactGroupsCollection
import typings.googleAppsScript.GoogleAppsScript.People.Collection.People.ConnectionsCollection
import typings.googleAppsScript.GoogleAppsScript.People.Collection.PeopleCollection
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Address
import typings.googleAppsScript.GoogleAppsScript.People.Schema.AgeRangeType
import typings.googleAppsScript.GoogleAppsScript.People.Schema.BatchGetContactGroupsResponse
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Biography
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Birthday
import typings.googleAppsScript.GoogleAppsScript.People.Schema.BraggingRights
import typings.googleAppsScript.GoogleAppsScript.People.Schema.ContactGroup
import typings.googleAppsScript.GoogleAppsScript.People.Schema.ContactGroupMembership
import typings.googleAppsScript.GoogleAppsScript.People.Schema.ContactGroupMetadata
import typings.googleAppsScript.GoogleAppsScript.People.Schema.CoverPhoto
import typings.googleAppsScript.GoogleAppsScript.People.Schema.CreateContactGroupRequest
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Date
import typings.googleAppsScript.GoogleAppsScript.People.Schema.DomainMembership
import typings.googleAppsScript.GoogleAppsScript.People.Schema.EmailAddress
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Event
import typings.googleAppsScript.GoogleAppsScript.People.Schema.FieldMetadata
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Gender
import typings.googleAppsScript.GoogleAppsScript.People.Schema.GetPeopleResponse
import typings.googleAppsScript.GoogleAppsScript.People.Schema.ImClient
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Interest
import typings.googleAppsScript.GoogleAppsScript.People.Schema.ListConnectionsResponse
import typings.googleAppsScript.GoogleAppsScript.People.Schema.ListContactGroupsResponse
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Locale
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Membership
import typings.googleAppsScript.GoogleAppsScript.People.Schema.ModifyContactGroupMembersRequest
import typings.googleAppsScript.GoogleAppsScript.People.Schema.ModifyContactGroupMembersResponse
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Name
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Nickname
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Occupation
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Organization
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Person
import typings.googleAppsScript.GoogleAppsScript.People.Schema.PersonMetadata
import typings.googleAppsScript.GoogleAppsScript.People.Schema.PhoneNumber
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Photo
import typings.googleAppsScript.GoogleAppsScript.People.Schema.ProfileMetadata
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Relation
import typings.googleAppsScript.GoogleAppsScript.People.Schema.RelationshipInterest
import typings.googleAppsScript.GoogleAppsScript.People.Schema.RelationshipStatus
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Residence
import typings.googleAppsScript.GoogleAppsScript.People.Schema.SipAddress
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Skill
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Source
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Tagline
import typings.googleAppsScript.GoogleAppsScript.People.Schema.UpdateContactGroupRequest
import typings.googleAppsScript.GoogleAppsScript.People.Schema.Url
import typings.googleAppsScript.GoogleAppsScript.People.Schema.UserDefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait People extends StObject {
  
  var ContactGroups: js.UndefOr[ContactGroupsCollection] = js.native
  
  var People: js.UndefOr[PeopleCollection] = js.native
  
  // Create a new instance of Address
  def newAddress(): Address = js.native
  
  // Create a new instance of AgeRangeType
  def newAgeRangeType(): AgeRangeType = js.native
  
  // Create a new instance of Biography
  def newBiography(): Biography = js.native
  
  // Create a new instance of Birthday
  def newBirthday(): Birthday = js.native
  
  // Create a new instance of BraggingRights
  def newBraggingRights(): BraggingRights = js.native
  
  // Create a new instance of ContactGroup
  def newContactGroup(): ContactGroup = js.native
  
  // Create a new instance of ContactGroupMembership
  def newContactGroupMembership(): ContactGroupMembership = js.native
  
  // Create a new instance of ContactGroupMetadata
  def newContactGroupMetadata(): ContactGroupMetadata = js.native
  
  // Create a new instance of CoverPhoto
  def newCoverPhoto(): CoverPhoto = js.native
  
  // Create a new instance of CreateContactGroupRequest
  def newCreateContactGroupRequest(): CreateContactGroupRequest = js.native
  
  // Create a new instance of Date
  def newDate(): Date = js.native
  
  // Create a new instance of DomainMembership
  def newDomainMembership(): DomainMembership = js.native
  
  // Create a new instance of EmailAddress
  def newEmailAddress(): EmailAddress = js.native
  
  // Create a new instance of Event
  def newEvent(): Event = js.native
  
  // Create a new instance of FieldMetadata
  def newFieldMetadata(): FieldMetadata = js.native
  
  // Create a new instance of Gender
  def newGender(): Gender = js.native
  
  // Create a new instance of ImClient
  def newImClient(): ImClient = js.native
  
  // Create a new instance of Interest
  def newInterest(): Interest = js.native
  
  // Create a new instance of Locale
  def newLocale(): Locale = js.native
  
  // Create a new instance of Membership
  def newMembership(): Membership = js.native
  
  // Create a new instance of ModifyContactGroupMembersRequest
  def newModifyContactGroupMembersRequest(): ModifyContactGroupMembersRequest = js.native
  
  // Create a new instance of Name
  def newName(): Name = js.native
  
  // Create a new instance of Nickname
  def newNickname(): Nickname = js.native
  
  // Create a new instance of Occupation
  def newOccupation(): Occupation = js.native
  
  // Create a new instance of Organization
  def newOrganization(): Organization = js.native
  
  // Create a new instance of Person
  def newPerson(): Person = js.native
  
  // Create a new instance of PersonMetadata
  def newPersonMetadata(): PersonMetadata = js.native
  
  // Create a new instance of PhoneNumber
  def newPhoneNumber(): PhoneNumber = js.native
  
  // Create a new instance of Photo
  def newPhoto(): Photo = js.native
  
  // Create a new instance of ProfileMetadata
  def newProfileMetadata(): ProfileMetadata = js.native
  
  // Create a new instance of Relation
  def newRelation(): Relation = js.native
  
  // Create a new instance of RelationshipInterest
  def newRelationshipInterest(): RelationshipInterest = js.native
  
  // Create a new instance of RelationshipStatus
  def newRelationshipStatus(): RelationshipStatus = js.native
  
  // Create a new instance of Residence
  def newResidence(): Residence = js.native
  
  // Create a new instance of SipAddress
  def newSipAddress(): SipAddress = js.native
  
  // Create a new instance of Skill
  def newSkill(): Skill = js.native
  
  // Create a new instance of Source
  def newSource(): Source = js.native
  
  // Create a new instance of Tagline
  def newTagline(): Tagline = js.native
  
  // Create a new instance of UpdateContactGroupRequest
  def newUpdateContactGroupRequest(): UpdateContactGroupRequest = js.native
  
  // Create a new instance of Url
  def newUrl(): Url = js.native
  
  // Create a new instance of UserDefined
  def newUserDefined(): UserDefined = js.native
}
object People {
  
  @scala.inline
  def apply(
    newAddress: () => Address,
    newAgeRangeType: () => AgeRangeType,
    newBiography: () => Biography,
    newBirthday: () => Birthday,
    newBraggingRights: () => BraggingRights,
    newContactGroup: () => ContactGroup,
    newContactGroupMembership: () => ContactGroupMembership,
    newContactGroupMetadata: () => ContactGroupMetadata,
    newCoverPhoto: () => CoverPhoto,
    newCreateContactGroupRequest: () => CreateContactGroupRequest,
    newDate: () => Date,
    newDomainMembership: () => DomainMembership,
    newEmailAddress: () => EmailAddress,
    newEvent: () => Event,
    newFieldMetadata: () => FieldMetadata,
    newGender: () => Gender,
    newImClient: () => ImClient,
    newInterest: () => Interest,
    newLocale: () => Locale,
    newMembership: () => Membership,
    newModifyContactGroupMembersRequest: () => ModifyContactGroupMembersRequest,
    newName: () => Name,
    newNickname: () => Nickname,
    newOccupation: () => Occupation,
    newOrganization: () => Organization,
    newPerson: () => Person,
    newPersonMetadata: () => PersonMetadata,
    newPhoneNumber: () => PhoneNumber,
    newPhoto: () => Photo,
    newProfileMetadata: () => ProfileMetadata,
    newRelation: () => Relation,
    newRelationshipInterest: () => RelationshipInterest,
    newRelationshipStatus: () => RelationshipStatus,
    newResidence: () => Residence,
    newSipAddress: () => SipAddress,
    newSkill: () => Skill,
    newSource: () => Source,
    newTagline: () => Tagline,
    newUpdateContactGroupRequest: () => UpdateContactGroupRequest,
    newUrl: () => Url,
    newUserDefined: () => UserDefined
  ): People = {
    val __obj = js.Dynamic.literal(newAddress = js.Any.fromFunction0(newAddress), newAgeRangeType = js.Any.fromFunction0(newAgeRangeType), newBiography = js.Any.fromFunction0(newBiography), newBirthday = js.Any.fromFunction0(newBirthday), newBraggingRights = js.Any.fromFunction0(newBraggingRights), newContactGroup = js.Any.fromFunction0(newContactGroup), newContactGroupMembership = js.Any.fromFunction0(newContactGroupMembership), newContactGroupMetadata = js.Any.fromFunction0(newContactGroupMetadata), newCoverPhoto = js.Any.fromFunction0(newCoverPhoto), newCreateContactGroupRequest = js.Any.fromFunction0(newCreateContactGroupRequest), newDate = js.Any.fromFunction0(newDate), newDomainMembership = js.Any.fromFunction0(newDomainMembership), newEmailAddress = js.Any.fromFunction0(newEmailAddress), newEvent = js.Any.fromFunction0(newEvent), newFieldMetadata = js.Any.fromFunction0(newFieldMetadata), newGender = js.Any.fromFunction0(newGender), newImClient = js.Any.fromFunction0(newImClient), newInterest = js.Any.fromFunction0(newInterest), newLocale = js.Any.fromFunction0(newLocale), newMembership = js.Any.fromFunction0(newMembership), newModifyContactGroupMembersRequest = js.Any.fromFunction0(newModifyContactGroupMembersRequest), newName = js.Any.fromFunction0(newName), newNickname = js.Any.fromFunction0(newNickname), newOccupation = js.Any.fromFunction0(newOccupation), newOrganization = js.Any.fromFunction0(newOrganization), newPerson = js.Any.fromFunction0(newPerson), newPersonMetadata = js.Any.fromFunction0(newPersonMetadata), newPhoneNumber = js.Any.fromFunction0(newPhoneNumber), newPhoto = js.Any.fromFunction0(newPhoto), newProfileMetadata = js.Any.fromFunction0(newProfileMetadata), newRelation = js.Any.fromFunction0(newRelation), newRelationshipInterest = js.Any.fromFunction0(newRelationshipInterest), newRelationshipStatus = js.Any.fromFunction0(newRelationshipStatus), newResidence = js.Any.fromFunction0(newResidence), newSipAddress = js.Any.fromFunction0(newSipAddress), newSkill = js.Any.fromFunction0(newSkill), newSource = js.Any.fromFunction0(newSource), newTagline = js.Any.fromFunction0(newTagline), newUpdateContactGroupRequest = js.Any.fromFunction0(newUpdateContactGroupRequest), newUrl = js.Any.fromFunction0(newUrl), newUserDefined = js.Any.fromFunction0(newUserDefined))
    __obj.asInstanceOf[People]
  }
  
  object Collection {
    
    object ContactGroups {
      
      @js.native
      trait MembersCollection extends StObject {
        
        // Modify the members of a contact group owned by the authenticated user.
        // <br>
        // The only system contact groups that can have members added are
        // `contactGroups/myContacts` and `contactGroups/starred`. Other system
        // contact groups are deprecated and can only have contacts removed.
        def modify(resource: ModifyContactGroupMembersRequest, resourceName: String): ModifyContactGroupMembersResponse = js.native
      }
      object MembersCollection {
        
        @scala.inline
        def apply(modify: (ModifyContactGroupMembersRequest, String) => ModifyContactGroupMembersResponse): MembersCollection = {
          val __obj = js.Dynamic.literal(modify = js.Any.fromFunction2(modify))
          __obj.asInstanceOf[MembersCollection]
        }
        
        @scala.inline
        implicit class MembersCollectionMutableBuilder[Self <: MembersCollection] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setModify(value: (ModifyContactGroupMembersRequest, String) => ModifyContactGroupMembersResponse): Self = StObject.set(x, "modify", js.Any.fromFunction2(value))
        }
      }
    }
    
    @js.native
    trait ContactGroupsCollection extends StObject {
      
      var Members: js.UndefOr[MembersCollection] = js.native
      
      // Get a list of contact groups owned by the authenticated user by specifying
      // a list of contact group resource names.
      def batchGet(): BatchGetContactGroupsResponse = js.native
      // Get a list of contact groups owned by the authenticated user by specifying
      // a list of contact group resource names.
      def batchGet(optionalArgs: js.Object): BatchGetContactGroupsResponse = js.native
      
      // Create a new contact group owned by the authenticated user.
      def create(resource: CreateContactGroupRequest): ContactGroup = js.native
      
      // Get a specific contact group owned by the authenticated user by specifying
      // a contact group resource name.
      def get(resourceName: String): ContactGroup = js.native
      // Get a specific contact group owned by the authenticated user by specifying
      // a contact group resource name.
      def get(resourceName: String, optionalArgs: js.Object): ContactGroup = js.native
      
      // List all contact groups owned by the authenticated user. Members of the
      // contact groups are not populated.
      def list(): ListContactGroupsResponse = js.native
      // List all contact groups owned by the authenticated user. Members of the
      // contact groups are not populated.
      def list(optionalArgs: js.Object): ListContactGroupsResponse = js.native
      
      // Delete an existing contact group owned by the authenticated user by
      // specifying a contact group resource name.
      def remove(resourceName: String): Unit = js.native
      // Delete an existing contact group owned by the authenticated user by
      // specifying a contact group resource name.
      def remove(resourceName: String, optionalArgs: js.Object): Unit = js.native
      
      // Update the name of an existing contact group owned by the authenticated
      // user.
      def update(resource: UpdateContactGroupRequest, resourceName: String): ContactGroup = js.native
    }
    
    object People {
      
      @js.native
      trait ConnectionsCollection extends StObject {
        
        // Provides a list of the authenticated user's contacts merged with any
        // connected profiles.
        // <br>
        // The request throws a 400 error if 'personFields' is not specified.
        def list(resourceName: String): ListConnectionsResponse = js.native
        // Provides a list of the authenticated user's contacts merged with any
        // connected profiles.
        // <br>
        // The request throws a 400 error if 'personFields' is not specified.
        def list(resourceName: String, optionalArgs: js.Object): ListConnectionsResponse = js.native
      }
    }
    
    @js.native
    trait PeopleCollection extends StObject {
      
      var Connections: js.UndefOr[ConnectionsCollection] = js.native
      
      // Create a new contact and return the person resource for that contact.
      def createContact(resource: Person): Person = js.native
      // Create a new contact and return the person resource for that contact.
      def createContact(resource: Person, optionalArgs: js.Object): Person = js.native
      
      // Delete a contact person. Any non-contact data will not be deleted.
      def deleteContact(resourceName: String): Unit = js.native
      
      // Provides information about a person by specifying a resource name. Use
      // `people/me` to indicate the authenticated user.
      // <br>
      // The request throws a 400 error if 'personFields' is not specified.
      def get(resourceName: String): Person = js.native
      // Provides information about a person by specifying a resource name. Use
      // `people/me` to indicate the authenticated user.
      // <br>
      // The request throws a 400 error if 'personFields' is not specified.
      def get(resourceName: String, optionalArgs: js.Object): Person = js.native
      
      // Provides information about a list of specific people by specifying a list
      // of requested resource names. Use `people/me` to indicate the authenticated
      // user.
      // <br>
      // The request throws a 400 error if 'personFields' is not specified.
      def getBatchGet(): GetPeopleResponse = js.native
      // Provides information about a list of specific people by specifying a list
      // of requested resource names. Use `people/me` to indicate the authenticated
      // user.
      // <br>
      // The request throws a 400 error if 'personFields' is not specified.
      def getBatchGet(optionalArgs: js.Object): GetPeopleResponse = js.native
      
      // Update contact data for an existing contact person. Any non-contact data
      // will not be modified.
      // The request throws a 400 error if `updatePersonFields` is not specified.
      // <br>
      // The request throws a 400 error if `person.metadata.sources` is not
      // specified for the contact to be updated.
      // <br>
      // The request throws a 412 error if `person.metadata.sources.etag` is
      // different than the contact's etag, which indicates the contact has changed
      // since its data was read. Clients should get the latest person and re-apply
      // their updates to the latest person.
      def updateContact(resource: Person, resourceName: String): Person = js.native
      // Update contact data for an existing contact person. Any non-contact data
      // will not be modified.
      // The request throws a 400 error if `updatePersonFields` is not specified.
      // <br>
      // The request throws a 400 error if `person.metadata.sources` is not
      // specified for the contact to be updated.
      // <br>
      // The request throws a 412 error if `person.metadata.sources.etag` is
      // different than the contact's etag, which indicates the contact has changed
      // since its data was read. Clients should get the latest person and re-apply
      // their updates to the latest person.
      def updateContact(resource: Person, resourceName: String, optionalArgs: js.Object): Person = js.native
    }
  }
  
  @scala.inline
  implicit class PeopleMutableBuilder[Self <: People] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactGroups(value: ContactGroupsCollection): Self = StObject.set(x, "ContactGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactGroupsUndefined: Self = StObject.set(x, "ContactGroups", js.undefined)
    
    @scala.inline
    def setNewAddress(value: () => Address): Self = StObject.set(x, "newAddress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAgeRangeType(value: () => AgeRangeType): Self = StObject.set(x, "newAgeRangeType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBiography(value: () => Biography): Self = StObject.set(x, "newBiography", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBirthday(value: () => Birthday): Self = StObject.set(x, "newBirthday", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBraggingRights(value: () => BraggingRights): Self = StObject.set(x, "newBraggingRights", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewContactGroup(value: () => ContactGroup): Self = StObject.set(x, "newContactGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewContactGroupMembership(value: () => ContactGroupMembership): Self = StObject.set(x, "newContactGroupMembership", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewContactGroupMetadata(value: () => ContactGroupMetadata): Self = StObject.set(x, "newContactGroupMetadata", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCoverPhoto(value: () => CoverPhoto): Self = StObject.set(x, "newCoverPhoto", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCreateContactGroupRequest(value: () => CreateContactGroupRequest): Self = StObject.set(x, "newCreateContactGroupRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDate(value: () => Date): Self = StObject.set(x, "newDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDomainMembership(value: () => DomainMembership): Self = StObject.set(x, "newDomainMembership", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEmailAddress(value: () => EmailAddress): Self = StObject.set(x, "newEmailAddress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEvent(value: () => Event): Self = StObject.set(x, "newEvent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFieldMetadata(value: () => FieldMetadata): Self = StObject.set(x, "newFieldMetadata", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGender(value: () => Gender): Self = StObject.set(x, "newGender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewImClient(value: () => ImClient): Self = StObject.set(x, "newImClient", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewInterest(value: () => Interest): Self = StObject.set(x, "newInterest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLocale(value: () => Locale): Self = StObject.set(x, "newLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMembership(value: () => Membership): Self = StObject.set(x, "newMembership", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewModifyContactGroupMembersRequest(value: () => ModifyContactGroupMembersRequest): Self = StObject.set(x, "newModifyContactGroupMembersRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewName(value: () => Name): Self = StObject.set(x, "newName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewNickname(value: () => Nickname): Self = StObject.set(x, "newNickname", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewOccupation(value: () => Occupation): Self = StObject.set(x, "newOccupation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewOrganization(value: () => Organization): Self = StObject.set(x, "newOrganization", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPerson(value: () => Person): Self = StObject.set(x, "newPerson", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPersonMetadata(value: () => PersonMetadata): Self = StObject.set(x, "newPersonMetadata", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPhoneNumber(value: () => PhoneNumber): Self = StObject.set(x, "newPhoneNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPhoto(value: () => Photo): Self = StObject.set(x, "newPhoto", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewProfileMetadata(value: () => ProfileMetadata): Self = StObject.set(x, "newProfileMetadata", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRelation(value: () => Relation): Self = StObject.set(x, "newRelation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRelationshipInterest(value: () => RelationshipInterest): Self = StObject.set(x, "newRelationshipInterest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRelationshipStatus(value: () => RelationshipStatus): Self = StObject.set(x, "newRelationshipStatus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewResidence(value: () => Residence): Self = StObject.set(x, "newResidence", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSipAddress(value: () => SipAddress): Self = StObject.set(x, "newSipAddress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSkill(value: () => Skill): Self = StObject.set(x, "newSkill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSource(value: () => Source): Self = StObject.set(x, "newSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTagline(value: () => Tagline): Self = StObject.set(x, "newTagline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateContactGroupRequest(value: () => UpdateContactGroupRequest): Self = StObject.set(x, "newUpdateContactGroupRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUrl(value: () => Url): Self = StObject.set(x, "newUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUserDefined(value: () => UserDefined): Self = StObject.set(x, "newUserDefined", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeople(value: PeopleCollection): Self = StObject.set(x, "People", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeopleUndefined: Self = StObject.set(x, "People", js.undefined)
  }
  
  object Schema {
    
    @js.native
    trait Address extends StObject {
      
      var city: js.UndefOr[String] = js.native
      
      var country: js.UndefOr[String] = js.native
      
      var countryCode: js.UndefOr[String] = js.native
      
      var extendedAddress: js.UndefOr[String] = js.native
      
      var formattedType: js.UndefOr[String] = js.native
      
      var formattedValue: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var poBox: js.UndefOr[String] = js.native
      
      var postalCode: js.UndefOr[String] = js.native
      
      var region: js.UndefOr[String] = js.native
      
      var streetAddress: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Address {
      
      @scala.inline
      def apply(): Address = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Address]
      }
      
      @scala.inline
      implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
        
        @scala.inline
        def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
        
        @scala.inline
        def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
        
        @scala.inline
        def setExtendedAddress(value: String): Self = StObject.set(x, "extendedAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtendedAddressUndefined: Self = StObject.set(x, "extendedAddress", js.undefined)
        
        @scala.inline
        def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        @scala.inline
        def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setPoBox(value: String): Self = StObject.set(x, "poBox", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPoBoxUndefined: Self = StObject.set(x, "poBox", js.undefined)
        
        @scala.inline
        def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
        
        @scala.inline
        def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
        
        @scala.inline
        def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait AgeRangeType extends StObject {
      
      var ageRange: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
    }
    object AgeRangeType {
      
      @scala.inline
      def apply(): AgeRangeType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AgeRangeType]
      }
      
      @scala.inline
      implicit class AgeRangeTypeMutableBuilder[Self <: AgeRangeType] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      }
    }
    
    @js.native
    trait BatchGetContactGroupsResponse extends StObject {
      
      var responses: js.UndefOr[js.Array[ContactGroupResponse]] = js.native
    }
    object BatchGetContactGroupsResponse {
      
      @scala.inline
      def apply(): BatchGetContactGroupsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchGetContactGroupsResponse]
      }
      
      @scala.inline
      implicit class BatchGetContactGroupsResponseMutableBuilder[Self <: BatchGetContactGroupsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setResponses(value: js.Array[ContactGroupResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
        
        @scala.inline
        def setResponsesVarargs(value: ContactGroupResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Biography extends StObject {
      
      var contentType: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object Biography {
      
      @scala.inline
      def apply(): Biography = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Biography]
      }
      
      @scala.inline
      implicit class BiographyMutableBuilder[Self <: Biography] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait Birthday extends StObject {
      
      var date: js.UndefOr[Date] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var text: js.UndefOr[String] = js.native
    }
    object Birthday {
      
      @scala.inline
      def apply(): Birthday = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Birthday]
      }
      
      @scala.inline
      implicit class BirthdayMutableBuilder[Self <: Birthday] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    @js.native
    trait BraggingRights extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object BraggingRights {
      
      @scala.inline
      def apply(): BraggingRights = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BraggingRights]
      }
      
      @scala.inline
      implicit class BraggingRightsMutableBuilder[Self <: BraggingRights] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait ContactGroup extends StObject {
      
      var etag: js.UndefOr[String] = js.native
      
      var formattedName: js.UndefOr[String] = js.native
      
      var groupType: js.UndefOr[String] = js.native
      
      var memberCount: js.UndefOr[Double] = js.native
      
      var memberResourceNames: js.UndefOr[js.Array[String]] = js.native
      
      var metadata: js.UndefOr[ContactGroupMetadata] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var resourceName: js.UndefOr[String] = js.native
    }
    object ContactGroup {
      
      @scala.inline
      def apply(): ContactGroup = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContactGroup]
      }
      
      @scala.inline
      implicit class ContactGroupMutableBuilder[Self <: ContactGroup] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setFormattedName(value: String): Self = StObject.set(x, "formattedName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedNameUndefined: Self = StObject.set(x, "formattedName", js.undefined)
        
        @scala.inline
        def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
        
        @scala.inline
        def setMemberCount(value: Double): Self = StObject.set(x, "memberCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMemberCountUndefined: Self = StObject.set(x, "memberCount", js.undefined)
        
        @scala.inline
        def setMemberResourceNames(value: js.Array[String]): Self = StObject.set(x, "memberResourceNames", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMemberResourceNamesUndefined: Self = StObject.set(x, "memberResourceNames", js.undefined)
        
        @scala.inline
        def setMemberResourceNamesVarargs(value: String*): Self = StObject.set(x, "memberResourceNames", js.Array(value :_*))
        
        @scala.inline
        def setMetadata(value: ContactGroupMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
      }
    }
    
    @js.native
    trait ContactGroupMembership extends StObject {
      
      var contactGroupId: js.UndefOr[String] = js.native
    }
    object ContactGroupMembership {
      
      @scala.inline
      def apply(): ContactGroupMembership = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContactGroupMembership]
      }
      
      @scala.inline
      implicit class ContactGroupMembershipMutableBuilder[Self <: ContactGroupMembership] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContactGroupId(value: String): Self = StObject.set(x, "contactGroupId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContactGroupIdUndefined: Self = StObject.set(x, "contactGroupId", js.undefined)
      }
    }
    
    @js.native
    trait ContactGroupMetadata extends StObject {
      
      var deleted: js.UndefOr[Boolean] = js.native
      
      var updateTime: js.UndefOr[String] = js.native
    }
    object ContactGroupMetadata {
      
      @scala.inline
      def apply(): ContactGroupMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContactGroupMetadata]
      }
      
      @scala.inline
      implicit class ContactGroupMetadataMutableBuilder[Self <: ContactGroupMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        @scala.inline
        def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
      }
    }
    
    @js.native
    trait ContactGroupResponse extends StObject {
      
      var contactGroup: js.UndefOr[ContactGroup] = js.native
      
      var requestedResourceName: js.UndefOr[String] = js.native
      
      var status: js.UndefOr[Status] = js.native
    }
    object ContactGroupResponse {
      
      @scala.inline
      def apply(): ContactGroupResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContactGroupResponse]
      }
      
      @scala.inline
      implicit class ContactGroupResponseMutableBuilder[Self <: ContactGroupResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContactGroup(value: ContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
        
        @scala.inline
        def setRequestedResourceName(value: String): Self = StObject.set(x, "requestedResourceName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestedResourceNameUndefined: Self = StObject.set(x, "requestedResourceName", js.undefined)
        
        @scala.inline
        def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    @js.native
    trait CoverPhoto extends StObject {
      
      var default: js.UndefOr[Boolean] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var url: js.UndefOr[String] = js.native
    }
    object CoverPhoto {
      
      @scala.inline
      def apply(): CoverPhoto = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CoverPhoto]
      }
      
      @scala.inline
      implicit class CoverPhotoMutableBuilder[Self <: CoverPhoto] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    @js.native
    trait CreateContactGroupRequest extends StObject {
      
      var contactGroup: js.UndefOr[ContactGroup] = js.native
    }
    object CreateContactGroupRequest {
      
      @scala.inline
      def apply(): CreateContactGroupRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateContactGroupRequest]
      }
      
      @scala.inline
      implicit class CreateContactGroupRequestMutableBuilder[Self <: CreateContactGroupRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContactGroup(value: ContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
      }
    }
    
    @js.native
    trait Date extends StObject {
      
      var day: js.UndefOr[Double] = js.native
      
      var month: js.UndefOr[Double] = js.native
      
      var year: js.UndefOr[Double] = js.native
    }
    object Date {
      
      @scala.inline
      def apply(): Date = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Date]
      }
      
      @scala.inline
      implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
        
        @scala.inline
        def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
        
        @scala.inline
        def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      }
    }
    
    @js.native
    trait DomainMembership extends StObject {
      
      var inViewerDomain: js.UndefOr[Boolean] = js.native
    }
    object DomainMembership {
      
      @scala.inline
      def apply(): DomainMembership = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DomainMembership]
      }
      
      @scala.inline
      implicit class DomainMembershipMutableBuilder[Self <: DomainMembership] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInViewerDomain(value: Boolean): Self = StObject.set(x, "inViewerDomain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInViewerDomainUndefined: Self = StObject.set(x, "inViewerDomain", js.undefined)
      }
    }
    
    @js.native
    trait EmailAddress extends StObject {
      
      var displayName: js.UndefOr[String] = js.native
      
      var formattedType: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object EmailAddress {
      
      @scala.inline
      def apply(): EmailAddress = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EmailAddress]
      }
      
      @scala.inline
      implicit class EmailAddressMutableBuilder[Self <: EmailAddress] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        @scala.inline
        def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait Event extends StObject {
      
      var date: js.UndefOr[Date] = js.native
      
      var formattedType: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Event {
      
      @scala.inline
      def apply(): Event = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Event]
      }
      
      @scala.inline
      implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
        
        @scala.inline
        def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait FieldMetadata extends StObject {
      
      var primary: js.UndefOr[Boolean] = js.native
      
      var source: js.UndefOr[Source] = js.native
      
      var verified: js.UndefOr[Boolean] = js.native
    }
    object FieldMetadata {
      
      @scala.inline
      def apply(): FieldMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FieldMetadata]
      }
      
      @scala.inline
      implicit class FieldMetadataMutableBuilder[Self <: FieldMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
        
        @scala.inline
        def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        @scala.inline
        def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
      }
    }
    
    @js.native
    trait Gender extends StObject {
      
      var formattedValue: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object Gender {
      
      @scala.inline
      def apply(): Gender = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Gender]
      }
      
      @scala.inline
      implicit class GenderMutableBuilder[Self <: Gender] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait GetPeopleResponse extends StObject {
      
      var responses: js.UndefOr[js.Array[PersonResponse]] = js.native
    }
    object GetPeopleResponse {
      
      @scala.inline
      def apply(): GetPeopleResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetPeopleResponse]
      }
      
      @scala.inline
      implicit class GetPeopleResponseMutableBuilder[Self <: GetPeopleResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setResponses(value: js.Array[PersonResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
        
        @scala.inline
        def setResponsesVarargs(value: PersonResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ImClient extends StObject {
      
      var formattedProtocol: js.UndefOr[String] = js.native
      
      var formattedType: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var protocol: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var username: js.UndefOr[String] = js.native
    }
    object ImClient {
      
      @scala.inline
      def apply(): ImClient = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ImClient]
      }
      
      @scala.inline
      implicit class ImClientMutableBuilder[Self <: ImClient] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormattedProtocol(value: String): Self = StObject.set(x, "formattedProtocol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedProtocolUndefined: Self = StObject.set(x, "formattedProtocol", js.undefined)
        
        @scala.inline
        def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
    
    @js.native
    trait Interest extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object Interest {
      
      @scala.inline
      def apply(): Interest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Interest]
      }
      
      @scala.inline
      implicit class InterestMutableBuilder[Self <: Interest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait ListConnectionsResponse extends StObject {
      
      var connections: js.UndefOr[js.Array[Person]] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
      
      var nextSyncToken: js.UndefOr[String] = js.native
      
      var totalItems: js.UndefOr[Double] = js.native
      
      var totalPeople: js.UndefOr[Double] = js.native
    }
    object ListConnectionsResponse {
      
      @scala.inline
      def apply(): ListConnectionsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListConnectionsResponse]
      }
      
      @scala.inline
      implicit class ListConnectionsResponseMutableBuilder[Self <: ListConnectionsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnections(value: js.Array[Person]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
        
        @scala.inline
        def setConnectionsVarargs(value: Person*): Self = StObject.set(x, "connections", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
        
        @scala.inline
        def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
        
        @scala.inline
        def setTotalPeople(value: Double): Self = StObject.set(x, "totalPeople", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalPeopleUndefined: Self = StObject.set(x, "totalPeople", js.undefined)
      }
    }
    
    @js.native
    trait ListContactGroupsResponse extends StObject {
      
      var contactGroups: js.UndefOr[js.Array[ContactGroup]] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
      
      var nextSyncToken: js.UndefOr[String] = js.native
      
      var totalItems: js.UndefOr[Double] = js.native
    }
    object ListContactGroupsResponse {
      
      @scala.inline
      def apply(): ListContactGroupsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListContactGroupsResponse]
      }
      
      @scala.inline
      implicit class ListContactGroupsResponseMutableBuilder[Self <: ListContactGroupsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContactGroups(value: js.Array[ContactGroup]): Self = StObject.set(x, "contactGroups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContactGroupsUndefined: Self = StObject.set(x, "contactGroups", js.undefined)
        
        @scala.inline
        def setContactGroupsVarargs(value: ContactGroup*): Self = StObject.set(x, "contactGroups", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
        
        @scala.inline
        def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
      }
    }
    
    @js.native
    trait Locale extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object Locale {
      
      @scala.inline
      def apply(): Locale = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Locale]
      }
      
      @scala.inline
      implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait Membership extends StObject {
      
      var contactGroupMembership: js.UndefOr[ContactGroupMembership] = js.native
      
      var domainMembership: js.UndefOr[DomainMembership] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
    }
    object Membership {
      
      @scala.inline
      def apply(): Membership = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Membership]
      }
      
      @scala.inline
      implicit class MembershipMutableBuilder[Self <: Membership] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContactGroupMembership(value: ContactGroupMembership): Self = StObject.set(x, "contactGroupMembership", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContactGroupMembershipUndefined: Self = StObject.set(x, "contactGroupMembership", js.undefined)
        
        @scala.inline
        def setDomainMembership(value: DomainMembership): Self = StObject.set(x, "domainMembership", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainMembershipUndefined: Self = StObject.set(x, "domainMembership", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      }
    }
    
    @js.native
    trait ModifyContactGroupMembersRequest extends StObject {
      
      var resourceNamesToAdd: js.UndefOr[js.Array[String]] = js.native
      
      var resourceNamesToRemove: js.UndefOr[js.Array[String]] = js.native
    }
    object ModifyContactGroupMembersRequest {
      
      @scala.inline
      def apply(): ModifyContactGroupMembersRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyContactGroupMembersRequest]
      }
      
      @scala.inline
      implicit class ModifyContactGroupMembersRequestMutableBuilder[Self <: ModifyContactGroupMembersRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setResourceNamesToAdd(value: js.Array[String]): Self = StObject.set(x, "resourceNamesToAdd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceNamesToAddUndefined: Self = StObject.set(x, "resourceNamesToAdd", js.undefined)
        
        @scala.inline
        def setResourceNamesToAddVarargs(value: String*): Self = StObject.set(x, "resourceNamesToAdd", js.Array(value :_*))
        
        @scala.inline
        def setResourceNamesToRemove(value: js.Array[String]): Self = StObject.set(x, "resourceNamesToRemove", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceNamesToRemoveUndefined: Self = StObject.set(x, "resourceNamesToRemove", js.undefined)
        
        @scala.inline
        def setResourceNamesToRemoveVarargs(value: String*): Self = StObject.set(x, "resourceNamesToRemove", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ModifyContactGroupMembersResponse extends StObject {
      
      var notFoundResourceNames: js.UndefOr[js.Array[String]] = js.native
    }
    object ModifyContactGroupMembersResponse {
      
      @scala.inline
      def apply(): ModifyContactGroupMembersResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyContactGroupMembersResponse]
      }
      
      @scala.inline
      implicit class ModifyContactGroupMembersResponseMutableBuilder[Self <: ModifyContactGroupMembersResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNotFoundResourceNames(value: js.Array[String]): Self = StObject.set(x, "notFoundResourceNames", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotFoundResourceNamesUndefined: Self = StObject.set(x, "notFoundResourceNames", js.undefined)
        
        @scala.inline
        def setNotFoundResourceNamesVarargs(value: String*): Self = StObject.set(x, "notFoundResourceNames", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Name extends StObject {
      
      var displayName: js.UndefOr[String] = js.native
      
      var displayNameLastFirst: js.UndefOr[String] = js.native
      
      var familyName: js.UndefOr[String] = js.native
      
      var givenName: js.UndefOr[String] = js.native
      
      var honorificPrefix: js.UndefOr[String] = js.native
      
      var honorificSuffix: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var middleName: js.UndefOr[String] = js.native
      
      var phoneticFamilyName: js.UndefOr[String] = js.native
      
      var phoneticFullName: js.UndefOr[String] = js.native
      
      var phoneticGivenName: js.UndefOr[String] = js.native
      
      var phoneticHonorificPrefix: js.UndefOr[String] = js.native
      
      var phoneticHonorificSuffix: js.UndefOr[String] = js.native
      
      var phoneticMiddleName: js.UndefOr[String] = js.native
    }
    object Name {
      
      @scala.inline
      def apply(): Name = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Name]
      }
      
      @scala.inline
      implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameLastFirst(value: String): Self = StObject.set(x, "displayNameLastFirst", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameLastFirstUndefined: Self = StObject.set(x, "displayNameLastFirst", js.undefined)
        
        @scala.inline
        def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        @scala.inline
        def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
        
        @scala.inline
        def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
        
        @scala.inline
        def setHonorificPrefix(value: String): Self = StObject.set(x, "honorificPrefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHonorificPrefixUndefined: Self = StObject.set(x, "honorificPrefix", js.undefined)
        
        @scala.inline
        def setHonorificSuffix(value: String): Self = StObject.set(x, "honorificSuffix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHonorificSuffixUndefined: Self = StObject.set(x, "honorificSuffix", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
        
        @scala.inline
        def setPhoneticFamilyName(value: String): Self = StObject.set(x, "phoneticFamilyName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhoneticFamilyNameUndefined: Self = StObject.set(x, "phoneticFamilyName", js.undefined)
        
        @scala.inline
        def setPhoneticFullName(value: String): Self = StObject.set(x, "phoneticFullName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhoneticFullNameUndefined: Self = StObject.set(x, "phoneticFullName", js.undefined)
        
        @scala.inline
        def setPhoneticGivenName(value: String): Self = StObject.set(x, "phoneticGivenName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhoneticGivenNameUndefined: Self = StObject.set(x, "phoneticGivenName", js.undefined)
        
        @scala.inline
        def setPhoneticHonorificPrefix(value: String): Self = StObject.set(x, "phoneticHonorificPrefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhoneticHonorificPrefixUndefined: Self = StObject.set(x, "phoneticHonorificPrefix", js.undefined)
        
        @scala.inline
        def setPhoneticHonorificSuffix(value: String): Self = StObject.set(x, "phoneticHonorificSuffix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhoneticHonorificSuffixUndefined: Self = StObject.set(x, "phoneticHonorificSuffix", js.undefined)
        
        @scala.inline
        def setPhoneticMiddleName(value: String): Self = StObject.set(x, "phoneticMiddleName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhoneticMiddleNameUndefined: Self = StObject.set(x, "phoneticMiddleName", js.undefined)
      }
    }
    
    @js.native
    trait Nickname extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object Nickname {
      
      @scala.inline
      def apply(): Nickname = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Nickname]
      }
      
      @scala.inline
      implicit class NicknameMutableBuilder[Self <: Nickname] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait Occupation extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object Occupation {
      
      @scala.inline
      def apply(): Occupation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Occupation]
      }
      
      @scala.inline
      implicit class OccupationMutableBuilder[Self <: Occupation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait Organization extends StObject {
      
      var current: js.UndefOr[Boolean] = js.native
      
      var department: js.UndefOr[String] = js.native
      
      var domain: js.UndefOr[String] = js.native
      
      var endDate: js.UndefOr[Date] = js.native
      
      var formattedType: js.UndefOr[String] = js.native
      
      var jobDescription: js.UndefOr[String] = js.native
      
      var location: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var phoneticName: js.UndefOr[String] = js.native
      
      var startDate: js.UndefOr[Date] = js.native
      
      var symbol: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Organization {
      
      @scala.inline
      def apply(): Organization = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Organization]
      }
      
      @scala.inline
      implicit class OrganizationMutableBuilder[Self <: Organization] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
        
        @scala.inline
        def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
        
        @scala.inline
        def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
        
        @scala.inline
        def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        @scala.inline
        def setJobDescription(value: String): Self = StObject.set(x, "jobDescription", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJobDescriptionUndefined: Self = StObject.set(x, "jobDescription", js.undefined)
        
        @scala.inline
        def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPhoneticName(value: String): Self = StObject.set(x, "phoneticName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhoneticNameUndefined: Self = StObject.set(x, "phoneticName", js.undefined)
        
        @scala.inline
        def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
        
        @scala.inline
        def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Person extends StObject {
      
      var addresses: js.UndefOr[js.Array[Address]] = js.native
      
      var ageRange: js.UndefOr[String] = js.native
      
      var ageRanges: js.UndefOr[js.Array[AgeRangeType]] = js.native
      
      var biographies: js.UndefOr[js.Array[Biography]] = js.native
      
      var birthdays: js.UndefOr[js.Array[Birthday]] = js.native
      
      var braggingRights: js.UndefOr[js.Array[BraggingRights]] = js.native
      
      var coverPhotos: js.UndefOr[js.Array[CoverPhoto]] = js.native
      
      var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.native
      
      var etag: js.UndefOr[String] = js.native
      
      var events: js.UndefOr[js.Array[Event]] = js.native
      
      var genders: js.UndefOr[js.Array[Gender]] = js.native
      
      var imClients: js.UndefOr[js.Array[ImClient]] = js.native
      
      var interests: js.UndefOr[js.Array[Interest]] = js.native
      
      var locales: js.UndefOr[js.Array[Locale]] = js.native
      
      var memberships: js.UndefOr[js.Array[Membership]] = js.native
      
      var metadata: js.UndefOr[PersonMetadata] = js.native
      
      var names: js.UndefOr[js.Array[Name]] = js.native
      
      var nicknames: js.UndefOr[js.Array[Nickname]] = js.native
      
      var occupations: js.UndefOr[js.Array[Occupation]] = js.native
      
      var organizations: js.UndefOr[js.Array[Organization]] = js.native
      
      var phoneNumbers: js.UndefOr[js.Array[PhoneNumber]] = js.native
      
      var photos: js.UndefOr[js.Array[Photo]] = js.native
      
      var relations: js.UndefOr[js.Array[Relation]] = js.native
      
      var relationshipInterests: js.UndefOr[js.Array[RelationshipInterest]] = js.native
      
      var relationshipStatuses: js.UndefOr[js.Array[RelationshipStatus]] = js.native
      
      var residences: js.UndefOr[js.Array[Residence]] = js.native
      
      var resourceName: js.UndefOr[String] = js.native
      
      var sipAddresses: js.UndefOr[js.Array[SipAddress]] = js.native
      
      var skills: js.UndefOr[js.Array[Skill]] = js.native
      
      var taglines: js.UndefOr[js.Array[Tagline]] = js.native
      
      var urls: js.UndefOr[js.Array[Url]] = js.native
      
      var userDefined: js.UndefOr[js.Array[UserDefined]] = js.native
    }
    object Person {
      
      @scala.inline
      def apply(): Person = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Person]
      }
      
      @scala.inline
      implicit class PersonMutableBuilder[Self <: Person] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
        
        @scala.inline
        def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value :_*))
        
        @scala.inline
        def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
        
        @scala.inline
        def setAgeRanges(value: js.Array[AgeRangeType]): Self = StObject.set(x, "ageRanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAgeRangesUndefined: Self = StObject.set(x, "ageRanges", js.undefined)
        
        @scala.inline
        def setAgeRangesVarargs(value: AgeRangeType*): Self = StObject.set(x, "ageRanges", js.Array(value :_*))
        
        @scala.inline
        def setBiographies(value: js.Array[Biography]): Self = StObject.set(x, "biographies", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBiographiesUndefined: Self = StObject.set(x, "biographies", js.undefined)
        
        @scala.inline
        def setBiographiesVarargs(value: Biography*): Self = StObject.set(x, "biographies", js.Array(value :_*))
        
        @scala.inline
        def setBirthdays(value: js.Array[Birthday]): Self = StObject.set(x, "birthdays", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBirthdaysUndefined: Self = StObject.set(x, "birthdays", js.undefined)
        
        @scala.inline
        def setBirthdaysVarargs(value: Birthday*): Self = StObject.set(x, "birthdays", js.Array(value :_*))
        
        @scala.inline
        def setBraggingRights(value: js.Array[BraggingRights]): Self = StObject.set(x, "braggingRights", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBraggingRightsUndefined: Self = StObject.set(x, "braggingRights", js.undefined)
        
        @scala.inline
        def setBraggingRightsVarargs(value: BraggingRights*): Self = StObject.set(x, "braggingRights", js.Array(value :_*))
        
        @scala.inline
        def setCoverPhotos(value: js.Array[CoverPhoto]): Self = StObject.set(x, "coverPhotos", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCoverPhotosUndefined: Self = StObject.set(x, "coverPhotos", js.undefined)
        
        @scala.inline
        def setCoverPhotosVarargs(value: CoverPhoto*): Self = StObject.set(x, "coverPhotos", js.Array(value :_*))
        
        @scala.inline
        def setEmailAddresses(value: js.Array[EmailAddress]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailAddressesUndefined: Self = StObject.set(x, "emailAddresses", js.undefined)
        
        @scala.inline
        def setEmailAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "emailAddresses", js.Array(value :_*))
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
        
        @scala.inline
        def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
        
        @scala.inline
        def setGenders(value: js.Array[Gender]): Self = StObject.set(x, "genders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGendersUndefined: Self = StObject.set(x, "genders", js.undefined)
        
        @scala.inline
        def setGendersVarargs(value: Gender*): Self = StObject.set(x, "genders", js.Array(value :_*))
        
        @scala.inline
        def setImClients(value: js.Array[ImClient]): Self = StObject.set(x, "imClients", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImClientsUndefined: Self = StObject.set(x, "imClients", js.undefined)
        
        @scala.inline
        def setImClientsVarargs(value: ImClient*): Self = StObject.set(x, "imClients", js.Array(value :_*))
        
        @scala.inline
        def setInterests(value: js.Array[Interest]): Self = StObject.set(x, "interests", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInterestsUndefined: Self = StObject.set(x, "interests", js.undefined)
        
        @scala.inline
        def setInterestsVarargs(value: Interest*): Self = StObject.set(x, "interests", js.Array(value :_*))
        
        @scala.inline
        def setLocales(value: js.Array[Locale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
        
        @scala.inline
        def setLocalesVarargs(value: Locale*): Self = StObject.set(x, "locales", js.Array(value :_*))
        
        @scala.inline
        def setMemberships(value: js.Array[Membership]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
        
        @scala.inline
        def setMembershipsVarargs(value: Membership*): Self = StObject.set(x, "memberships", js.Array(value :_*))
        
        @scala.inline
        def setMetadata(value: PersonMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setNames(value: js.Array[Name]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
        
        @scala.inline
        def setNamesVarargs(value: Name*): Self = StObject.set(x, "names", js.Array(value :_*))
        
        @scala.inline
        def setNicknames(value: js.Array[Nickname]): Self = StObject.set(x, "nicknames", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNicknamesUndefined: Self = StObject.set(x, "nicknames", js.undefined)
        
        @scala.inline
        def setNicknamesVarargs(value: Nickname*): Self = StObject.set(x, "nicknames", js.Array(value :_*))
        
        @scala.inline
        def setOccupations(value: js.Array[Occupation]): Self = StObject.set(x, "occupations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOccupationsUndefined: Self = StObject.set(x, "occupations", js.undefined)
        
        @scala.inline
        def setOccupationsVarargs(value: Occupation*): Self = StObject.set(x, "occupations", js.Array(value :_*))
        
        @scala.inline
        def setOrganizations(value: js.Array[Organization]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
        
        @scala.inline
        def setOrganizationsVarargs(value: Organization*): Self = StObject.set(x, "organizations", js.Array(value :_*))
        
        @scala.inline
        def setPhoneNumbers(value: js.Array[PhoneNumber]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
        
        @scala.inline
        def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value :_*))
        
        @scala.inline
        def setPhotos(value: js.Array[Photo]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
        
        @scala.inline
        def setPhotosVarargs(value: Photo*): Self = StObject.set(x, "photos", js.Array(value :_*))
        
        @scala.inline
        def setRelations(value: js.Array[Relation]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
        
        @scala.inline
        def setRelationsVarargs(value: Relation*): Self = StObject.set(x, "relations", js.Array(value :_*))
        
        @scala.inline
        def setRelationshipInterests(value: js.Array[RelationshipInterest]): Self = StObject.set(x, "relationshipInterests", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelationshipInterestsUndefined: Self = StObject.set(x, "relationshipInterests", js.undefined)
        
        @scala.inline
        def setRelationshipInterestsVarargs(value: RelationshipInterest*): Self = StObject.set(x, "relationshipInterests", js.Array(value :_*))
        
        @scala.inline
        def setRelationshipStatuses(value: js.Array[RelationshipStatus]): Self = StObject.set(x, "relationshipStatuses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelationshipStatusesUndefined: Self = StObject.set(x, "relationshipStatuses", js.undefined)
        
        @scala.inline
        def setRelationshipStatusesVarargs(value: RelationshipStatus*): Self = StObject.set(x, "relationshipStatuses", js.Array(value :_*))
        
        @scala.inline
        def setResidences(value: js.Array[Residence]): Self = StObject.set(x, "residences", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResidencesUndefined: Self = StObject.set(x, "residences", js.undefined)
        
        @scala.inline
        def setResidencesVarargs(value: Residence*): Self = StObject.set(x, "residences", js.Array(value :_*))
        
        @scala.inline
        def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
        
        @scala.inline
        def setSipAddresses(value: js.Array[SipAddress]): Self = StObject.set(x, "sipAddresses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSipAddressesUndefined: Self = StObject.set(x, "sipAddresses", js.undefined)
        
        @scala.inline
        def setSipAddressesVarargs(value: SipAddress*): Self = StObject.set(x, "sipAddresses", js.Array(value :_*))
        
        @scala.inline
        def setSkills(value: js.Array[Skill]): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkillsUndefined: Self = StObject.set(x, "skills", js.undefined)
        
        @scala.inline
        def setSkillsVarargs(value: Skill*): Self = StObject.set(x, "skills", js.Array(value :_*))
        
        @scala.inline
        def setTaglines(value: js.Array[Tagline]): Self = StObject.set(x, "taglines", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTaglinesUndefined: Self = StObject.set(x, "taglines", js.undefined)
        
        @scala.inline
        def setTaglinesVarargs(value: Tagline*): Self = StObject.set(x, "taglines", js.Array(value :_*))
        
        @scala.inline
        def setUrls(value: js.Array[Url]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
        
        @scala.inline
        def setUrlsVarargs(value: Url*): Self = StObject.set(x, "urls", js.Array(value :_*))
        
        @scala.inline
        def setUserDefined(value: js.Array[UserDefined]): Self = StObject.set(x, "userDefined", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserDefinedUndefined: Self = StObject.set(x, "userDefined", js.undefined)
        
        @scala.inline
        def setUserDefinedVarargs(value: UserDefined*): Self = StObject.set(x, "userDefined", js.Array(value :_*))
      }
    }
    
    @js.native
    trait PersonMetadata extends StObject {
      
      var deleted: js.UndefOr[Boolean] = js.native
      
      var linkedPeopleResourceNames: js.UndefOr[js.Array[String]] = js.native
      
      var objectType: js.UndefOr[String] = js.native
      
      var previousResourceNames: js.UndefOr[js.Array[String]] = js.native
      
      var sources: js.UndefOr[js.Array[Source]] = js.native
    }
    object PersonMetadata {
      
      @scala.inline
      def apply(): PersonMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PersonMetadata]
      }
      
      @scala.inline
      implicit class PersonMetadataMutableBuilder[Self <: PersonMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        @scala.inline
        def setLinkedPeopleResourceNames(value: js.Array[String]): Self = StObject.set(x, "linkedPeopleResourceNames", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkedPeopleResourceNamesUndefined: Self = StObject.set(x, "linkedPeopleResourceNames", js.undefined)
        
        @scala.inline
        def setLinkedPeopleResourceNamesVarargs(value: String*): Self = StObject.set(x, "linkedPeopleResourceNames", js.Array(value :_*))
        
        @scala.inline
        def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
        
        @scala.inline
        def setPreviousResourceNames(value: js.Array[String]): Self = StObject.set(x, "previousResourceNames", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreviousResourceNamesUndefined: Self = StObject.set(x, "previousResourceNames", js.undefined)
        
        @scala.inline
        def setPreviousResourceNamesVarargs(value: String*): Self = StObject.set(x, "previousResourceNames", js.Array(value :_*))
        
        @scala.inline
        def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
        
        @scala.inline
        def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value :_*))
      }
    }
    
    @js.native
    trait PersonResponse extends StObject {
      
      var httpStatusCode: js.UndefOr[Double] = js.native
      
      var person: js.UndefOr[Person] = js.native
      
      var requestedResourceName: js.UndefOr[String] = js.native
      
      var status: js.UndefOr[Status] = js.native
    }
    object PersonResponse {
      
      @scala.inline
      def apply(): PersonResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PersonResponse]
      }
      
      @scala.inline
      implicit class PersonResponseMutableBuilder[Self <: PersonResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHttpStatusCode(value: Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpStatusCodeUndefined: Self = StObject.set(x, "httpStatusCode", js.undefined)
        
        @scala.inline
        def setPerson(value: Person): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
        
        @scala.inline
        def setRequestedResourceName(value: String): Self = StObject.set(x, "requestedResourceName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestedResourceNameUndefined: Self = StObject.set(x, "requestedResourceName", js.undefined)
        
        @scala.inline
        def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    @js.native
    trait PhoneNumber extends StObject {
      
      var canonicalForm: js.UndefOr[String] = js.native
      
      var formattedType: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object PhoneNumber {
      
      @scala.inline
      def apply(): PhoneNumber = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PhoneNumber]
      }
      
      @scala.inline
      implicit class PhoneNumberMutableBuilder[Self <: PhoneNumber] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCanonicalForm(value: String): Self = StObject.set(x, "canonicalForm", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCanonicalFormUndefined: Self = StObject.set(x, "canonicalForm", js.undefined)
        
        @scala.inline
        def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait Photo extends StObject {
      
      var default: js.UndefOr[Boolean] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var url: js.UndefOr[String] = js.native
    }
    object Photo {
      
      @scala.inline
      def apply(): Photo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Photo]
      }
      
      @scala.inline
      implicit class PhotoMutableBuilder[Self <: Photo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    @js.native
    trait ProfileMetadata extends StObject {
      
      var objectType: js.UndefOr[String] = js.native
      
      var userTypes: js.UndefOr[js.Array[String]] = js.native
    }
    object ProfileMetadata {
      
      @scala.inline
      def apply(): ProfileMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ProfileMetadata]
      }
      
      @scala.inline
      implicit class ProfileMetadataMutableBuilder[Self <: ProfileMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
        
        @scala.inline
        def setUserTypes(value: js.Array[String]): Self = StObject.set(x, "userTypes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserTypesUndefined: Self = StObject.set(x, "userTypes", js.undefined)
        
        @scala.inline
        def setUserTypesVarargs(value: String*): Self = StObject.set(x, "userTypes", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Relation extends StObject {
      
      var formattedType: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var person: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Relation {
      
      @scala.inline
      def apply(): Relation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Relation]
      }
      
      @scala.inline
      implicit class RelationMutableBuilder[Self <: Relation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setPerson(value: String): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait RelationshipInterest extends StObject {
      
      var formattedValue: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object RelationshipInterest {
      
      @scala.inline
      def apply(): RelationshipInterest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RelationshipInterest]
      }
      
      @scala.inline
      implicit class RelationshipInterestMutableBuilder[Self <: RelationshipInterest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait RelationshipStatus extends StObject {
      
      var formattedValue: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object RelationshipStatus {
      
      @scala.inline
      def apply(): RelationshipStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RelationshipStatus]
      }
      
      @scala.inline
      implicit class RelationshipStatusMutableBuilder[Self <: RelationshipStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait Residence extends StObject {
      
      var current: js.UndefOr[Boolean] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object Residence {
      
      @scala.inline
      def apply(): Residence = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Residence]
      }
      
      @scala.inline
      implicit class ResidenceMutableBuilder[Self <: Residence] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait SipAddress extends StObject {
      
      var formattedType: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object SipAddress {
      
      @scala.inline
      def apply(): SipAddress = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SipAddress]
      }
      
      @scala.inline
      implicit class SipAddressMutableBuilder[Self <: SipAddress] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait Skill extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object Skill {
      
      @scala.inline
      def apply(): Skill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Skill]
      }
      
      @scala.inline
      implicit class SkillMutableBuilder[Self <: Skill] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait Source extends StObject {
      
      var etag: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var profileMetadata: js.UndefOr[ProfileMetadata] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var updateTime: js.UndefOr[String] = js.native
    }
    object Source {
      
      @scala.inline
      def apply(): Source = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Source]
      }
      
      @scala.inline
      implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setProfileMetadata(value: ProfileMetadata): Self = StObject.set(x, "profileMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProfileMetadataUndefined: Self = StObject.set(x, "profileMetadata", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
      }
    }
    
    @js.native
    trait Status extends StObject {
      
      var code: js.UndefOr[Double] = js.native
      
      var details: js.UndefOr[js.Array[js.Object]] = js.native
      
      var message: js.UndefOr[String] = js.native
    }
    object Status {
      
      @scala.inline
      def apply(): Status = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Status]
      }
      
      @scala.inline
      implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        @scala.inline
        def setDetails(value: js.Array[js.Object]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
        
        @scala.inline
        def setDetailsVarargs(value: js.Object*): Self = StObject.set(x, "details", js.Array(value :_*))
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      }
    }
    
    @js.native
    trait Tagline extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object Tagline {
      
      @scala.inline
      def apply(): Tagline = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Tagline]
      }
      
      @scala.inline
      implicit class TaglineMutableBuilder[Self <: Tagline] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait UpdateContactGroupRequest extends StObject {
      
      var contactGroup: js.UndefOr[ContactGroup] = js.native
    }
    object UpdateContactGroupRequest {
      
      @scala.inline
      def apply(): UpdateContactGroupRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateContactGroupRequest]
      }
      
      @scala.inline
      implicit class UpdateContactGroupRequestMutableBuilder[Self <: UpdateContactGroupRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContactGroup(value: ContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
      }
    }
    
    @js.native
    trait Url extends StObject {
      
      var formattedType: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object Url {
      
      @scala.inline
      def apply(): Url = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Url]
      }
      
      @scala.inline
      implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait UserDefined extends StObject {
      
      var key: js.UndefOr[String] = js.native
      
      var metadata: js.UndefOr[FieldMetadata] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object UserDefined {
      
      @scala.inline
      def apply(): UserDefined = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserDefined]
      }
      
      @scala.inline
      implicit class UserDefinedMutableBuilder[Self <: UserDefined] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
}

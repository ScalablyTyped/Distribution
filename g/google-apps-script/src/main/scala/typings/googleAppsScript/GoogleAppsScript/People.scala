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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait People extends StObject {
  
  var ContactGroups: js.UndefOr[ContactGroupsCollection] = js.undefined
  
  var People: js.UndefOr[PeopleCollection] = js.undefined
  
  // Create a new instance of Address
  def newAddress(): Address
  
  // Create a new instance of AgeRangeType
  def newAgeRangeType(): AgeRangeType
  
  // Create a new instance of Biography
  def newBiography(): Biography
  
  // Create a new instance of Birthday
  def newBirthday(): Birthday
  
  // Create a new instance of BraggingRights
  def newBraggingRights(): BraggingRights
  
  // Create a new instance of ContactGroup
  def newContactGroup(): ContactGroup
  
  // Create a new instance of ContactGroupMembership
  def newContactGroupMembership(): ContactGroupMembership
  
  // Create a new instance of ContactGroupMetadata
  def newContactGroupMetadata(): ContactGroupMetadata
  
  // Create a new instance of CoverPhoto
  def newCoverPhoto(): CoverPhoto
  
  // Create a new instance of CreateContactGroupRequest
  def newCreateContactGroupRequest(): CreateContactGroupRequest
  
  // Create a new instance of Date
  def newDate(): Date
  
  // Create a new instance of DomainMembership
  def newDomainMembership(): DomainMembership
  
  // Create a new instance of EmailAddress
  def newEmailAddress(): EmailAddress
  
  // Create a new instance of Event
  def newEvent(): Event
  
  // Create a new instance of FieldMetadata
  def newFieldMetadata(): FieldMetadata
  
  // Create a new instance of Gender
  def newGender(): Gender
  
  // Create a new instance of ImClient
  def newImClient(): ImClient
  
  // Create a new instance of Interest
  def newInterest(): Interest
  
  // Create a new instance of Locale
  def newLocale(): Locale
  
  // Create a new instance of Membership
  def newMembership(): Membership
  
  // Create a new instance of ModifyContactGroupMembersRequest
  def newModifyContactGroupMembersRequest(): ModifyContactGroupMembersRequest
  
  // Create a new instance of Name
  def newName(): Name
  
  // Create a new instance of Nickname
  def newNickname(): Nickname
  
  // Create a new instance of Occupation
  def newOccupation(): Occupation
  
  // Create a new instance of Organization
  def newOrganization(): Organization
  
  // Create a new instance of Person
  def newPerson(): Person
  
  // Create a new instance of PersonMetadata
  def newPersonMetadata(): PersonMetadata
  
  // Create a new instance of PhoneNumber
  def newPhoneNumber(): PhoneNumber
  
  // Create a new instance of Photo
  def newPhoto(): Photo
  
  // Create a new instance of ProfileMetadata
  def newProfileMetadata(): ProfileMetadata
  
  // Create a new instance of Relation
  def newRelation(): Relation
  
  // Create a new instance of RelationshipInterest
  def newRelationshipInterest(): RelationshipInterest
  
  // Create a new instance of RelationshipStatus
  def newRelationshipStatus(): RelationshipStatus
  
  // Create a new instance of Residence
  def newResidence(): Residence
  
  // Create a new instance of SipAddress
  def newSipAddress(): SipAddress
  
  // Create a new instance of Skill
  def newSkill(): Skill
  
  // Create a new instance of Source
  def newSource(): Source
  
  // Create a new instance of Tagline
  def newTagline(): Tagline
  
  // Create a new instance of UpdateContactGroupRequest
  def newUpdateContactGroupRequest(): UpdateContactGroupRequest
  
  // Create a new instance of Url
  def newUrl(): Url
  
  // Create a new instance of UserDefined
  def newUserDefined(): UserDefined
}
object People {
  
  inline def apply(
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
      
      trait MembersCollection extends StObject {
        
        // Modify the members of a contact group owned by the authenticated user.
        // <br>
        // The only system contact groups that can have members added are
        // `contactGroups/myContacts` and `contactGroups/starred`. Other system
        // contact groups are deprecated and can only have contacts removed.
        def modify(resource: ModifyContactGroupMembersRequest, resourceName: String): ModifyContactGroupMembersResponse
      }
      object MembersCollection {
        
        inline def apply(modify: (ModifyContactGroupMembersRequest, String) => ModifyContactGroupMembersResponse): MembersCollection = {
          val __obj = js.Dynamic.literal(modify = js.Any.fromFunction2(modify))
          __obj.asInstanceOf[MembersCollection]
        }
        
        extension [Self <: MembersCollection](x: Self) {
          
          inline def setModify(value: (ModifyContactGroupMembersRequest, String) => ModifyContactGroupMembersResponse): Self = StObject.set(x, "modify", js.Any.fromFunction2(value))
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
  
  extension [Self <: People](x: Self) {
    
    inline def setContactGroups(value: ContactGroupsCollection): Self = StObject.set(x, "ContactGroups", value.asInstanceOf[js.Any])
    
    inline def setContactGroupsUndefined: Self = StObject.set(x, "ContactGroups", js.undefined)
    
    inline def setNewAddress(value: () => Address): Self = StObject.set(x, "newAddress", js.Any.fromFunction0(value))
    
    inline def setNewAgeRangeType(value: () => AgeRangeType): Self = StObject.set(x, "newAgeRangeType", js.Any.fromFunction0(value))
    
    inline def setNewBiography(value: () => Biography): Self = StObject.set(x, "newBiography", js.Any.fromFunction0(value))
    
    inline def setNewBirthday(value: () => Birthday): Self = StObject.set(x, "newBirthday", js.Any.fromFunction0(value))
    
    inline def setNewBraggingRights(value: () => BraggingRights): Self = StObject.set(x, "newBraggingRights", js.Any.fromFunction0(value))
    
    inline def setNewContactGroup(value: () => ContactGroup): Self = StObject.set(x, "newContactGroup", js.Any.fromFunction0(value))
    
    inline def setNewContactGroupMembership(value: () => ContactGroupMembership): Self = StObject.set(x, "newContactGroupMembership", js.Any.fromFunction0(value))
    
    inline def setNewContactGroupMetadata(value: () => ContactGroupMetadata): Self = StObject.set(x, "newContactGroupMetadata", js.Any.fromFunction0(value))
    
    inline def setNewCoverPhoto(value: () => CoverPhoto): Self = StObject.set(x, "newCoverPhoto", js.Any.fromFunction0(value))
    
    inline def setNewCreateContactGroupRequest(value: () => CreateContactGroupRequest): Self = StObject.set(x, "newCreateContactGroupRequest", js.Any.fromFunction0(value))
    
    inline def setNewDate(value: () => Date): Self = StObject.set(x, "newDate", js.Any.fromFunction0(value))
    
    inline def setNewDomainMembership(value: () => DomainMembership): Self = StObject.set(x, "newDomainMembership", js.Any.fromFunction0(value))
    
    inline def setNewEmailAddress(value: () => EmailAddress): Self = StObject.set(x, "newEmailAddress", js.Any.fromFunction0(value))
    
    inline def setNewEvent(value: () => Event): Self = StObject.set(x, "newEvent", js.Any.fromFunction0(value))
    
    inline def setNewFieldMetadata(value: () => FieldMetadata): Self = StObject.set(x, "newFieldMetadata", js.Any.fromFunction0(value))
    
    inline def setNewGender(value: () => Gender): Self = StObject.set(x, "newGender", js.Any.fromFunction0(value))
    
    inline def setNewImClient(value: () => ImClient): Self = StObject.set(x, "newImClient", js.Any.fromFunction0(value))
    
    inline def setNewInterest(value: () => Interest): Self = StObject.set(x, "newInterest", js.Any.fromFunction0(value))
    
    inline def setNewLocale(value: () => Locale): Self = StObject.set(x, "newLocale", js.Any.fromFunction0(value))
    
    inline def setNewMembership(value: () => Membership): Self = StObject.set(x, "newMembership", js.Any.fromFunction0(value))
    
    inline def setNewModifyContactGroupMembersRequest(value: () => ModifyContactGroupMembersRequest): Self = StObject.set(x, "newModifyContactGroupMembersRequest", js.Any.fromFunction0(value))
    
    inline def setNewName(value: () => Name): Self = StObject.set(x, "newName", js.Any.fromFunction0(value))
    
    inline def setNewNickname(value: () => Nickname): Self = StObject.set(x, "newNickname", js.Any.fromFunction0(value))
    
    inline def setNewOccupation(value: () => Occupation): Self = StObject.set(x, "newOccupation", js.Any.fromFunction0(value))
    
    inline def setNewOrganization(value: () => Organization): Self = StObject.set(x, "newOrganization", js.Any.fromFunction0(value))
    
    inline def setNewPerson(value: () => Person): Self = StObject.set(x, "newPerson", js.Any.fromFunction0(value))
    
    inline def setNewPersonMetadata(value: () => PersonMetadata): Self = StObject.set(x, "newPersonMetadata", js.Any.fromFunction0(value))
    
    inline def setNewPhoneNumber(value: () => PhoneNumber): Self = StObject.set(x, "newPhoneNumber", js.Any.fromFunction0(value))
    
    inline def setNewPhoto(value: () => Photo): Self = StObject.set(x, "newPhoto", js.Any.fromFunction0(value))
    
    inline def setNewProfileMetadata(value: () => ProfileMetadata): Self = StObject.set(x, "newProfileMetadata", js.Any.fromFunction0(value))
    
    inline def setNewRelation(value: () => Relation): Self = StObject.set(x, "newRelation", js.Any.fromFunction0(value))
    
    inline def setNewRelationshipInterest(value: () => RelationshipInterest): Self = StObject.set(x, "newRelationshipInterest", js.Any.fromFunction0(value))
    
    inline def setNewRelationshipStatus(value: () => RelationshipStatus): Self = StObject.set(x, "newRelationshipStatus", js.Any.fromFunction0(value))
    
    inline def setNewResidence(value: () => Residence): Self = StObject.set(x, "newResidence", js.Any.fromFunction0(value))
    
    inline def setNewSipAddress(value: () => SipAddress): Self = StObject.set(x, "newSipAddress", js.Any.fromFunction0(value))
    
    inline def setNewSkill(value: () => Skill): Self = StObject.set(x, "newSkill", js.Any.fromFunction0(value))
    
    inline def setNewSource(value: () => Source): Self = StObject.set(x, "newSource", js.Any.fromFunction0(value))
    
    inline def setNewTagline(value: () => Tagline): Self = StObject.set(x, "newTagline", js.Any.fromFunction0(value))
    
    inline def setNewUpdateContactGroupRequest(value: () => UpdateContactGroupRequest): Self = StObject.set(x, "newUpdateContactGroupRequest", js.Any.fromFunction0(value))
    
    inline def setNewUrl(value: () => Url): Self = StObject.set(x, "newUrl", js.Any.fromFunction0(value))
    
    inline def setNewUserDefined(value: () => UserDefined): Self = StObject.set(x, "newUserDefined", js.Any.fromFunction0(value))
    
    inline def setPeople(value: PeopleCollection): Self = StObject.set(x, "People", value.asInstanceOf[js.Any])
    
    inline def setPeopleUndefined: Self = StObject.set(x, "People", js.undefined)
  }
  
  object Schema {
    
    trait Address extends StObject {
      
      var city: js.UndefOr[String] = js.undefined
      
      var country: js.UndefOr[String] = js.undefined
      
      var countryCode: js.UndefOr[String] = js.undefined
      
      var extendedAddress: js.UndefOr[String] = js.undefined
      
      var formattedType: js.UndefOr[String] = js.undefined
      
      var formattedValue: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var poBox: js.UndefOr[String] = js.undefined
      
      var postalCode: js.UndefOr[String] = js.undefined
      
      var region: js.UndefOr[String] = js.undefined
      
      var streetAddress: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Address {
      
      inline def apply(): Address = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Address]
      }
      
      extension [Self <: Address](x: Self) {
        
        inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
        
        inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
        
        inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
        
        inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
        
        inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
        
        inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
        
        inline def setExtendedAddress(value: String): Self = StObject.set(x, "extendedAddress", value.asInstanceOf[js.Any])
        
        inline def setExtendedAddressUndefined: Self = StObject.set(x, "extendedAddress", js.undefined)
        
        inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
        
        inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setPoBox(value: String): Self = StObject.set(x, "poBox", value.asInstanceOf[js.Any])
        
        inline def setPoBoxUndefined: Self = StObject.set(x, "poBox", js.undefined)
        
        inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
        
        inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
        
        inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
        
        inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
        
        inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait AgeRangeType extends StObject {
      
      var ageRange: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
    }
    object AgeRangeType {
      
      inline def apply(): AgeRangeType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AgeRangeType]
      }
      
      extension [Self <: AgeRangeType](x: Self) {
        
        inline def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
        
        inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      }
    }
    
    trait BatchGetContactGroupsResponse extends StObject {
      
      var responses: js.UndefOr[js.Array[ContactGroupResponse]] = js.undefined
    }
    object BatchGetContactGroupsResponse {
      
      inline def apply(): BatchGetContactGroupsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchGetContactGroupsResponse]
      }
      
      extension [Self <: BatchGetContactGroupsResponse](x: Self) {
        
        inline def setResponses(value: js.Array[ContactGroupResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
        
        inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
        
        inline def setResponsesVarargs(value: ContactGroupResponse*): Self = StObject.set(x, "responses", js.Array(value*))
      }
    }
    
    trait Biography extends StObject {
      
      var contentType: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Biography {
      
      inline def apply(): Biography = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Biography]
      }
      
      extension [Self <: Biography](x: Self) {
        
        inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
        
        inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait Birthday extends StObject {
      
      var date: js.UndefOr[Date] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var text: js.UndefOr[String] = js.undefined
    }
    object Birthday {
      
      inline def apply(): Birthday = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Birthday]
      }
      
      extension [Self <: Birthday](x: Self) {
        
        inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    trait BraggingRights extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object BraggingRights {
      
      inline def apply(): BraggingRights = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BraggingRights]
      }
      
      extension [Self <: BraggingRights](x: Self) {
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait ContactGroup extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var formattedName: js.UndefOr[String] = js.undefined
      
      var groupType: js.UndefOr[String] = js.undefined
      
      var memberCount: js.UndefOr[Double] = js.undefined
      
      var memberResourceNames: js.UndefOr[js.Array[String]] = js.undefined
      
      var metadata: js.UndefOr[ContactGroupMetadata] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var resourceName: js.UndefOr[String] = js.undefined
    }
    object ContactGroup {
      
      inline def apply(): ContactGroup = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContactGroup]
      }
      
      extension [Self <: ContactGroup](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setFormattedName(value: String): Self = StObject.set(x, "formattedName", value.asInstanceOf[js.Any])
        
        inline def setFormattedNameUndefined: Self = StObject.set(x, "formattedName", js.undefined)
        
        inline def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
        
        inline def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
        
        inline def setMemberCount(value: Double): Self = StObject.set(x, "memberCount", value.asInstanceOf[js.Any])
        
        inline def setMemberCountUndefined: Self = StObject.set(x, "memberCount", js.undefined)
        
        inline def setMemberResourceNames(value: js.Array[String]): Self = StObject.set(x, "memberResourceNames", value.asInstanceOf[js.Any])
        
        inline def setMemberResourceNamesUndefined: Self = StObject.set(x, "memberResourceNames", js.undefined)
        
        inline def setMemberResourceNamesVarargs(value: String*): Self = StObject.set(x, "memberResourceNames", js.Array(value*))
        
        inline def setMetadata(value: ContactGroupMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
        
        inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
      }
    }
    
    trait ContactGroupMembership extends StObject {
      
      var contactGroupId: js.UndefOr[String] = js.undefined
    }
    object ContactGroupMembership {
      
      inline def apply(): ContactGroupMembership = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContactGroupMembership]
      }
      
      extension [Self <: ContactGroupMembership](x: Self) {
        
        inline def setContactGroupId(value: String): Self = StObject.set(x, "contactGroupId", value.asInstanceOf[js.Any])
        
        inline def setContactGroupIdUndefined: Self = StObject.set(x, "contactGroupId", js.undefined)
      }
    }
    
    trait ContactGroupMetadata extends StObject {
      
      var deleted: js.UndefOr[Boolean] = js.undefined
      
      var updateTime: js.UndefOr[String] = js.undefined
    }
    object ContactGroupMetadata {
      
      inline def apply(): ContactGroupMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContactGroupMetadata]
      }
      
      extension [Self <: ContactGroupMetadata](x: Self) {
        
        inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
      }
    }
    
    trait ContactGroupResponse extends StObject {
      
      var contactGroup: js.UndefOr[ContactGroup] = js.undefined
      
      var requestedResourceName: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[Status] = js.undefined
    }
    object ContactGroupResponse {
      
      inline def apply(): ContactGroupResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContactGroupResponse]
      }
      
      extension [Self <: ContactGroupResponse](x: Self) {
        
        inline def setContactGroup(value: ContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
        
        inline def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
        
        inline def setRequestedResourceName(value: String): Self = StObject.set(x, "requestedResourceName", value.asInstanceOf[js.Any])
        
        inline def setRequestedResourceNameUndefined: Self = StObject.set(x, "requestedResourceName", js.undefined)
        
        inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait CoverPhoto extends StObject {
      
      var default: js.UndefOr[Boolean] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
    }
    object CoverPhoto {
      
      inline def apply(): CoverPhoto = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CoverPhoto]
      }
      
      extension [Self <: CoverPhoto](x: Self) {
        
        inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait CreateContactGroupRequest extends StObject {
      
      var contactGroup: js.UndefOr[ContactGroup] = js.undefined
    }
    object CreateContactGroupRequest {
      
      inline def apply(): CreateContactGroupRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateContactGroupRequest]
      }
      
      extension [Self <: CreateContactGroupRequest](x: Self) {
        
        inline def setContactGroup(value: ContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
        
        inline def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
      }
    }
    
    trait Date extends StObject {
      
      var day: js.UndefOr[Double] = js.undefined
      
      var month: js.UndefOr[Double] = js.undefined
      
      var year: js.UndefOr[Double] = js.undefined
    }
    object Date {
      
      inline def apply(): Date = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Date]
      }
      
      extension [Self <: Date](x: Self) {
        
        inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
        
        inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
        
        inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
        
        inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
        
        inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
        
        inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      }
    }
    
    trait DomainMembership extends StObject {
      
      var inViewerDomain: js.UndefOr[Boolean] = js.undefined
    }
    object DomainMembership {
      
      inline def apply(): DomainMembership = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DomainMembership]
      }
      
      extension [Self <: DomainMembership](x: Self) {
        
        inline def setInViewerDomain(value: Boolean): Self = StObject.set(x, "inViewerDomain", value.asInstanceOf[js.Any])
        
        inline def setInViewerDomainUndefined: Self = StObject.set(x, "inViewerDomain", js.undefined)
      }
    }
    
    trait EmailAddress extends StObject {
      
      var displayName: js.UndefOr[String] = js.undefined
      
      var formattedType: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object EmailAddress {
      
      inline def apply(): EmailAddress = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EmailAddress]
      }
      
      extension [Self <: EmailAddress](x: Self) {
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait Event extends StObject {
      
      var date: js.UndefOr[Date] = js.undefined
      
      var formattedType: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Event {
      
      inline def apply(): Event = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Event]
      }
      
      extension [Self <: Event](x: Self) {
        
        inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
        
        inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait FieldMetadata extends StObject {
      
      var primary: js.UndefOr[Boolean] = js.undefined
      
      var source: js.UndefOr[Source] = js.undefined
      
      var verified: js.UndefOr[Boolean] = js.undefined
    }
    object FieldMetadata {
      
      inline def apply(): FieldMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FieldMetadata]
      }
      
      extension [Self <: FieldMetadata](x: Self) {
        
        inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
        
        inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
        
        inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
        
        inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
      }
    }
    
    trait Gender extends StObject {
      
      var formattedValue: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Gender {
      
      inline def apply(): Gender = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Gender]
      }
      
      extension [Self <: Gender](x: Self) {
        
        inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
        
        inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait GetPeopleResponse extends StObject {
      
      var responses: js.UndefOr[js.Array[PersonResponse]] = js.undefined
    }
    object GetPeopleResponse {
      
      inline def apply(): GetPeopleResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetPeopleResponse]
      }
      
      extension [Self <: GetPeopleResponse](x: Self) {
        
        inline def setResponses(value: js.Array[PersonResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
        
        inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
        
        inline def setResponsesVarargs(value: PersonResponse*): Self = StObject.set(x, "responses", js.Array(value*))
      }
    }
    
    trait ImClient extends StObject {
      
      var formattedProtocol: js.UndefOr[String] = js.undefined
      
      var formattedType: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var protocol: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var username: js.UndefOr[String] = js.undefined
    }
    object ImClient {
      
      inline def apply(): ImClient = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ImClient]
      }
      
      extension [Self <: ImClient](x: Self) {
        
        inline def setFormattedProtocol(value: String): Self = StObject.set(x, "formattedProtocol", value.asInstanceOf[js.Any])
        
        inline def setFormattedProtocolUndefined: Self = StObject.set(x, "formattedProtocol", js.undefined)
        
        inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
        
        inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
    
    trait Interest extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Interest {
      
      inline def apply(): Interest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Interest]
      }
      
      extension [Self <: Interest](x: Self) {
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait ListConnectionsResponse extends StObject {
      
      var connections: js.UndefOr[js.Array[Person]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var nextSyncToken: js.UndefOr[String] = js.undefined
      
      var totalItems: js.UndefOr[Double] = js.undefined
      
      var totalPeople: js.UndefOr[Double] = js.undefined
    }
    object ListConnectionsResponse {
      
      inline def apply(): ListConnectionsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListConnectionsResponse]
      }
      
      extension [Self <: ListConnectionsResponse](x: Self) {
        
        inline def setConnections(value: js.Array[Person]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
        
        inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
        
        inline def setConnectionsVarargs(value: Person*): Self = StObject.set(x, "connections", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
        
        inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
        
        inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
        
        inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
        
        inline def setTotalPeople(value: Double): Self = StObject.set(x, "totalPeople", value.asInstanceOf[js.Any])
        
        inline def setTotalPeopleUndefined: Self = StObject.set(x, "totalPeople", js.undefined)
      }
    }
    
    trait ListContactGroupsResponse extends StObject {
      
      var contactGroups: js.UndefOr[js.Array[ContactGroup]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var nextSyncToken: js.UndefOr[String] = js.undefined
      
      var totalItems: js.UndefOr[Double] = js.undefined
    }
    object ListContactGroupsResponse {
      
      inline def apply(): ListContactGroupsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListContactGroupsResponse]
      }
      
      extension [Self <: ListContactGroupsResponse](x: Self) {
        
        inline def setContactGroups(value: js.Array[ContactGroup]): Self = StObject.set(x, "contactGroups", value.asInstanceOf[js.Any])
        
        inline def setContactGroupsUndefined: Self = StObject.set(x, "contactGroups", js.undefined)
        
        inline def setContactGroupsVarargs(value: ContactGroup*): Self = StObject.set(x, "contactGroups", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
        
        inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
        
        inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
        
        inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
      }
    }
    
    trait Locale extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Locale {
      
      inline def apply(): Locale = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Locale]
      }
      
      extension [Self <: Locale](x: Self) {
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait Membership extends StObject {
      
      var contactGroupMembership: js.UndefOr[ContactGroupMembership] = js.undefined
      
      var domainMembership: js.UndefOr[DomainMembership] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
    }
    object Membership {
      
      inline def apply(): Membership = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Membership]
      }
      
      extension [Self <: Membership](x: Self) {
        
        inline def setContactGroupMembership(value: ContactGroupMembership): Self = StObject.set(x, "contactGroupMembership", value.asInstanceOf[js.Any])
        
        inline def setContactGroupMembershipUndefined: Self = StObject.set(x, "contactGroupMembership", js.undefined)
        
        inline def setDomainMembership(value: DomainMembership): Self = StObject.set(x, "domainMembership", value.asInstanceOf[js.Any])
        
        inline def setDomainMembershipUndefined: Self = StObject.set(x, "domainMembership", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      }
    }
    
    trait ModifyContactGroupMembersRequest extends StObject {
      
      var resourceNamesToAdd: js.UndefOr[js.Array[String]] = js.undefined
      
      var resourceNamesToRemove: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ModifyContactGroupMembersRequest {
      
      inline def apply(): ModifyContactGroupMembersRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyContactGroupMembersRequest]
      }
      
      extension [Self <: ModifyContactGroupMembersRequest](x: Self) {
        
        inline def setResourceNamesToAdd(value: js.Array[String]): Self = StObject.set(x, "resourceNamesToAdd", value.asInstanceOf[js.Any])
        
        inline def setResourceNamesToAddUndefined: Self = StObject.set(x, "resourceNamesToAdd", js.undefined)
        
        inline def setResourceNamesToAddVarargs(value: String*): Self = StObject.set(x, "resourceNamesToAdd", js.Array(value*))
        
        inline def setResourceNamesToRemove(value: js.Array[String]): Self = StObject.set(x, "resourceNamesToRemove", value.asInstanceOf[js.Any])
        
        inline def setResourceNamesToRemoveUndefined: Self = StObject.set(x, "resourceNamesToRemove", js.undefined)
        
        inline def setResourceNamesToRemoveVarargs(value: String*): Self = StObject.set(x, "resourceNamesToRemove", js.Array(value*))
      }
    }
    
    trait ModifyContactGroupMembersResponse extends StObject {
      
      var notFoundResourceNames: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ModifyContactGroupMembersResponse {
      
      inline def apply(): ModifyContactGroupMembersResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyContactGroupMembersResponse]
      }
      
      extension [Self <: ModifyContactGroupMembersResponse](x: Self) {
        
        inline def setNotFoundResourceNames(value: js.Array[String]): Self = StObject.set(x, "notFoundResourceNames", value.asInstanceOf[js.Any])
        
        inline def setNotFoundResourceNamesUndefined: Self = StObject.set(x, "notFoundResourceNames", js.undefined)
        
        inline def setNotFoundResourceNamesVarargs(value: String*): Self = StObject.set(x, "notFoundResourceNames", js.Array(value*))
      }
    }
    
    trait Name extends StObject {
      
      var displayName: js.UndefOr[String] = js.undefined
      
      var displayNameLastFirst: js.UndefOr[String] = js.undefined
      
      var familyName: js.UndefOr[String] = js.undefined
      
      var givenName: js.UndefOr[String] = js.undefined
      
      var honorificPrefix: js.UndefOr[String] = js.undefined
      
      var honorificSuffix: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var middleName: js.UndefOr[String] = js.undefined
      
      var phoneticFamilyName: js.UndefOr[String] = js.undefined
      
      var phoneticFullName: js.UndefOr[String] = js.undefined
      
      var phoneticGivenName: js.UndefOr[String] = js.undefined
      
      var phoneticHonorificPrefix: js.UndefOr[String] = js.undefined
      
      var phoneticHonorificSuffix: js.UndefOr[String] = js.undefined
      
      var phoneticMiddleName: js.UndefOr[String] = js.undefined
    }
    object Name {
      
      inline def apply(): Name = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Name]
      }
      
      extension [Self <: Name](x: Self) {
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameLastFirst(value: String): Self = StObject.set(x, "displayNameLastFirst", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameLastFirstUndefined: Self = StObject.set(x, "displayNameLastFirst", js.undefined)
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
        
        inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
        
        inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
        
        inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
        
        inline def setHonorificPrefix(value: String): Self = StObject.set(x, "honorificPrefix", value.asInstanceOf[js.Any])
        
        inline def setHonorificPrefixUndefined: Self = StObject.set(x, "honorificPrefix", js.undefined)
        
        inline def setHonorificSuffix(value: String): Self = StObject.set(x, "honorificSuffix", value.asInstanceOf[js.Any])
        
        inline def setHonorificSuffixUndefined: Self = StObject.set(x, "honorificSuffix", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
        
        inline def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
        
        inline def setPhoneticFamilyName(value: String): Self = StObject.set(x, "phoneticFamilyName", value.asInstanceOf[js.Any])
        
        inline def setPhoneticFamilyNameUndefined: Self = StObject.set(x, "phoneticFamilyName", js.undefined)
        
        inline def setPhoneticFullName(value: String): Self = StObject.set(x, "phoneticFullName", value.asInstanceOf[js.Any])
        
        inline def setPhoneticFullNameUndefined: Self = StObject.set(x, "phoneticFullName", js.undefined)
        
        inline def setPhoneticGivenName(value: String): Self = StObject.set(x, "phoneticGivenName", value.asInstanceOf[js.Any])
        
        inline def setPhoneticGivenNameUndefined: Self = StObject.set(x, "phoneticGivenName", js.undefined)
        
        inline def setPhoneticHonorificPrefix(value: String): Self = StObject.set(x, "phoneticHonorificPrefix", value.asInstanceOf[js.Any])
        
        inline def setPhoneticHonorificPrefixUndefined: Self = StObject.set(x, "phoneticHonorificPrefix", js.undefined)
        
        inline def setPhoneticHonorificSuffix(value: String): Self = StObject.set(x, "phoneticHonorificSuffix", value.asInstanceOf[js.Any])
        
        inline def setPhoneticHonorificSuffixUndefined: Self = StObject.set(x, "phoneticHonorificSuffix", js.undefined)
        
        inline def setPhoneticMiddleName(value: String): Self = StObject.set(x, "phoneticMiddleName", value.asInstanceOf[js.Any])
        
        inline def setPhoneticMiddleNameUndefined: Self = StObject.set(x, "phoneticMiddleName", js.undefined)
      }
    }
    
    trait Nickname extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Nickname {
      
      inline def apply(): Nickname = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Nickname]
      }
      
      extension [Self <: Nickname](x: Self) {
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait Occupation extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Occupation {
      
      inline def apply(): Occupation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Occupation]
      }
      
      extension [Self <: Occupation](x: Self) {
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait Organization extends StObject {
      
      var current: js.UndefOr[Boolean] = js.undefined
      
      var department: js.UndefOr[String] = js.undefined
      
      var domain: js.UndefOr[String] = js.undefined
      
      var endDate: js.UndefOr[Date] = js.undefined
      
      var formattedType: js.UndefOr[String] = js.undefined
      
      var jobDescription: js.UndefOr[String] = js.undefined
      
      var location: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var phoneticName: js.UndefOr[String] = js.undefined
      
      var startDate: js.UndefOr[Date] = js.undefined
      
      var symbol: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Organization {
      
      inline def apply(): Organization = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Organization]
      }
      
      extension [Self <: Organization](x: Self) {
        
        inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
        
        inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
        
        inline def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
        
        inline def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
        
        inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        inline def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
        
        inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
        
        inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        inline def setJobDescription(value: String): Self = StObject.set(x, "jobDescription", value.asInstanceOf[js.Any])
        
        inline def setJobDescriptionUndefined: Self = StObject.set(x, "jobDescription", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPhoneticName(value: String): Self = StObject.set(x, "phoneticName", value.asInstanceOf[js.Any])
        
        inline def setPhoneticNameUndefined: Self = StObject.set(x, "phoneticName", js.undefined)
        
        inline def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
        
        inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
        
        inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
        
        inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Person extends StObject {
      
      var addresses: js.UndefOr[js.Array[Address]] = js.undefined
      
      var ageRange: js.UndefOr[String] = js.undefined
      
      var ageRanges: js.UndefOr[js.Array[AgeRangeType]] = js.undefined
      
      var biographies: js.UndefOr[js.Array[Biography]] = js.undefined
      
      var birthdays: js.UndefOr[js.Array[Birthday]] = js.undefined
      
      var braggingRights: js.UndefOr[js.Array[BraggingRights]] = js.undefined
      
      var coverPhotos: js.UndefOr[js.Array[CoverPhoto]] = js.undefined
      
      var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var events: js.UndefOr[js.Array[Event]] = js.undefined
      
      var genders: js.UndefOr[js.Array[Gender]] = js.undefined
      
      var imClients: js.UndefOr[js.Array[ImClient]] = js.undefined
      
      var interests: js.UndefOr[js.Array[Interest]] = js.undefined
      
      var locales: js.UndefOr[js.Array[Locale]] = js.undefined
      
      var memberships: js.UndefOr[js.Array[Membership]] = js.undefined
      
      var metadata: js.UndefOr[PersonMetadata] = js.undefined
      
      var names: js.UndefOr[js.Array[Name]] = js.undefined
      
      var nicknames: js.UndefOr[js.Array[Nickname]] = js.undefined
      
      var occupations: js.UndefOr[js.Array[Occupation]] = js.undefined
      
      var organizations: js.UndefOr[js.Array[Organization]] = js.undefined
      
      var phoneNumbers: js.UndefOr[js.Array[PhoneNumber]] = js.undefined
      
      var photos: js.UndefOr[js.Array[Photo]] = js.undefined
      
      var relations: js.UndefOr[js.Array[Relation]] = js.undefined
      
      var relationshipInterests: js.UndefOr[js.Array[RelationshipInterest]] = js.undefined
      
      var relationshipStatuses: js.UndefOr[js.Array[RelationshipStatus]] = js.undefined
      
      var residences: js.UndefOr[js.Array[Residence]] = js.undefined
      
      var resourceName: js.UndefOr[String] = js.undefined
      
      var sipAddresses: js.UndefOr[js.Array[SipAddress]] = js.undefined
      
      var skills: js.UndefOr[js.Array[Skill]] = js.undefined
      
      var taglines: js.UndefOr[js.Array[Tagline]] = js.undefined
      
      var urls: js.UndefOr[js.Array[Url]] = js.undefined
      
      var userDefined: js.UndefOr[js.Array[UserDefined]] = js.undefined
    }
    object Person {
      
      inline def apply(): Person = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Person]
      }
      
      extension [Self <: Person](x: Self) {
        
        inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
        
        inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
        
        inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
        
        inline def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
        
        inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
        
        inline def setAgeRanges(value: js.Array[AgeRangeType]): Self = StObject.set(x, "ageRanges", value.asInstanceOf[js.Any])
        
        inline def setAgeRangesUndefined: Self = StObject.set(x, "ageRanges", js.undefined)
        
        inline def setAgeRangesVarargs(value: AgeRangeType*): Self = StObject.set(x, "ageRanges", js.Array(value*))
        
        inline def setBiographies(value: js.Array[Biography]): Self = StObject.set(x, "biographies", value.asInstanceOf[js.Any])
        
        inline def setBiographiesUndefined: Self = StObject.set(x, "biographies", js.undefined)
        
        inline def setBiographiesVarargs(value: Biography*): Self = StObject.set(x, "biographies", js.Array(value*))
        
        inline def setBirthdays(value: js.Array[Birthday]): Self = StObject.set(x, "birthdays", value.asInstanceOf[js.Any])
        
        inline def setBirthdaysUndefined: Self = StObject.set(x, "birthdays", js.undefined)
        
        inline def setBirthdaysVarargs(value: Birthday*): Self = StObject.set(x, "birthdays", js.Array(value*))
        
        inline def setBraggingRights(value: js.Array[BraggingRights]): Self = StObject.set(x, "braggingRights", value.asInstanceOf[js.Any])
        
        inline def setBraggingRightsUndefined: Self = StObject.set(x, "braggingRights", js.undefined)
        
        inline def setBraggingRightsVarargs(value: BraggingRights*): Self = StObject.set(x, "braggingRights", js.Array(value*))
        
        inline def setCoverPhotos(value: js.Array[CoverPhoto]): Self = StObject.set(x, "coverPhotos", value.asInstanceOf[js.Any])
        
        inline def setCoverPhotosUndefined: Self = StObject.set(x, "coverPhotos", js.undefined)
        
        inline def setCoverPhotosVarargs(value: CoverPhoto*): Self = StObject.set(x, "coverPhotos", js.Array(value*))
        
        inline def setEmailAddresses(value: js.Array[EmailAddress]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
        
        inline def setEmailAddressesUndefined: Self = StObject.set(x, "emailAddresses", js.undefined)
        
        inline def setEmailAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "emailAddresses", js.Array(value*))
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
        
        inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
        
        inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
        
        inline def setGenders(value: js.Array[Gender]): Self = StObject.set(x, "genders", value.asInstanceOf[js.Any])
        
        inline def setGendersUndefined: Self = StObject.set(x, "genders", js.undefined)
        
        inline def setGendersVarargs(value: Gender*): Self = StObject.set(x, "genders", js.Array(value*))
        
        inline def setImClients(value: js.Array[ImClient]): Self = StObject.set(x, "imClients", value.asInstanceOf[js.Any])
        
        inline def setImClientsUndefined: Self = StObject.set(x, "imClients", js.undefined)
        
        inline def setImClientsVarargs(value: ImClient*): Self = StObject.set(x, "imClients", js.Array(value*))
        
        inline def setInterests(value: js.Array[Interest]): Self = StObject.set(x, "interests", value.asInstanceOf[js.Any])
        
        inline def setInterestsUndefined: Self = StObject.set(x, "interests", js.undefined)
        
        inline def setInterestsVarargs(value: Interest*): Self = StObject.set(x, "interests", js.Array(value*))
        
        inline def setLocales(value: js.Array[Locale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
        
        inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
        
        inline def setLocalesVarargs(value: Locale*): Self = StObject.set(x, "locales", js.Array(value*))
        
        inline def setMemberships(value: js.Array[Membership]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
        
        inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
        
        inline def setMembershipsVarargs(value: Membership*): Self = StObject.set(x, "memberships", js.Array(value*))
        
        inline def setMetadata(value: PersonMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setNames(value: js.Array[Name]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
        
        inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
        
        inline def setNamesVarargs(value: Name*): Self = StObject.set(x, "names", js.Array(value*))
        
        inline def setNicknames(value: js.Array[Nickname]): Self = StObject.set(x, "nicknames", value.asInstanceOf[js.Any])
        
        inline def setNicknamesUndefined: Self = StObject.set(x, "nicknames", js.undefined)
        
        inline def setNicknamesVarargs(value: Nickname*): Self = StObject.set(x, "nicknames", js.Array(value*))
        
        inline def setOccupations(value: js.Array[Occupation]): Self = StObject.set(x, "occupations", value.asInstanceOf[js.Any])
        
        inline def setOccupationsUndefined: Self = StObject.set(x, "occupations", js.undefined)
        
        inline def setOccupationsVarargs(value: Occupation*): Self = StObject.set(x, "occupations", js.Array(value*))
        
        inline def setOrganizations(value: js.Array[Organization]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
        
        inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
        
        inline def setOrganizationsVarargs(value: Organization*): Self = StObject.set(x, "organizations", js.Array(value*))
        
        inline def setPhoneNumbers(value: js.Array[PhoneNumber]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
        
        inline def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
        
        inline def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value*))
        
        inline def setPhotos(value: js.Array[Photo]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
        
        inline def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
        
        inline def setPhotosVarargs(value: Photo*): Self = StObject.set(x, "photos", js.Array(value*))
        
        inline def setRelations(value: js.Array[Relation]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
        
        inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
        
        inline def setRelationsVarargs(value: Relation*): Self = StObject.set(x, "relations", js.Array(value*))
        
        inline def setRelationshipInterests(value: js.Array[RelationshipInterest]): Self = StObject.set(x, "relationshipInterests", value.asInstanceOf[js.Any])
        
        inline def setRelationshipInterestsUndefined: Self = StObject.set(x, "relationshipInterests", js.undefined)
        
        inline def setRelationshipInterestsVarargs(value: RelationshipInterest*): Self = StObject.set(x, "relationshipInterests", js.Array(value*))
        
        inline def setRelationshipStatuses(value: js.Array[RelationshipStatus]): Self = StObject.set(x, "relationshipStatuses", value.asInstanceOf[js.Any])
        
        inline def setRelationshipStatusesUndefined: Self = StObject.set(x, "relationshipStatuses", js.undefined)
        
        inline def setRelationshipStatusesVarargs(value: RelationshipStatus*): Self = StObject.set(x, "relationshipStatuses", js.Array(value*))
        
        inline def setResidences(value: js.Array[Residence]): Self = StObject.set(x, "residences", value.asInstanceOf[js.Any])
        
        inline def setResidencesUndefined: Self = StObject.set(x, "residences", js.undefined)
        
        inline def setResidencesVarargs(value: Residence*): Self = StObject.set(x, "residences", js.Array(value*))
        
        inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
        
        inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
        
        inline def setSipAddresses(value: js.Array[SipAddress]): Self = StObject.set(x, "sipAddresses", value.asInstanceOf[js.Any])
        
        inline def setSipAddressesUndefined: Self = StObject.set(x, "sipAddresses", js.undefined)
        
        inline def setSipAddressesVarargs(value: SipAddress*): Self = StObject.set(x, "sipAddresses", js.Array(value*))
        
        inline def setSkills(value: js.Array[Skill]): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
        
        inline def setSkillsUndefined: Self = StObject.set(x, "skills", js.undefined)
        
        inline def setSkillsVarargs(value: Skill*): Self = StObject.set(x, "skills", js.Array(value*))
        
        inline def setTaglines(value: js.Array[Tagline]): Self = StObject.set(x, "taglines", value.asInstanceOf[js.Any])
        
        inline def setTaglinesUndefined: Self = StObject.set(x, "taglines", js.undefined)
        
        inline def setTaglinesVarargs(value: Tagline*): Self = StObject.set(x, "taglines", js.Array(value*))
        
        inline def setUrls(value: js.Array[Url]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
        
        inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
        
        inline def setUrlsVarargs(value: Url*): Self = StObject.set(x, "urls", js.Array(value*))
        
        inline def setUserDefined(value: js.Array[UserDefined]): Self = StObject.set(x, "userDefined", value.asInstanceOf[js.Any])
        
        inline def setUserDefinedUndefined: Self = StObject.set(x, "userDefined", js.undefined)
        
        inline def setUserDefinedVarargs(value: UserDefined*): Self = StObject.set(x, "userDefined", js.Array(value*))
      }
    }
    
    trait PersonMetadata extends StObject {
      
      var deleted: js.UndefOr[Boolean] = js.undefined
      
      var linkedPeopleResourceNames: js.UndefOr[js.Array[String]] = js.undefined
      
      var objectType: js.UndefOr[String] = js.undefined
      
      var previousResourceNames: js.UndefOr[js.Array[String]] = js.undefined
      
      var sources: js.UndefOr[js.Array[Source]] = js.undefined
    }
    object PersonMetadata {
      
      inline def apply(): PersonMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PersonMetadata]
      }
      
      extension [Self <: PersonMetadata](x: Self) {
        
        inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        inline def setLinkedPeopleResourceNames(value: js.Array[String]): Self = StObject.set(x, "linkedPeopleResourceNames", value.asInstanceOf[js.Any])
        
        inline def setLinkedPeopleResourceNamesUndefined: Self = StObject.set(x, "linkedPeopleResourceNames", js.undefined)
        
        inline def setLinkedPeopleResourceNamesVarargs(value: String*): Self = StObject.set(x, "linkedPeopleResourceNames", js.Array(value*))
        
        inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
        
        inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
        
        inline def setPreviousResourceNames(value: js.Array[String]): Self = StObject.set(x, "previousResourceNames", value.asInstanceOf[js.Any])
        
        inline def setPreviousResourceNamesUndefined: Self = StObject.set(x, "previousResourceNames", js.undefined)
        
        inline def setPreviousResourceNamesVarargs(value: String*): Self = StObject.set(x, "previousResourceNames", js.Array(value*))
        
        inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
        
        inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
        
        inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
      }
    }
    
    trait PersonResponse extends StObject {
      
      var httpStatusCode: js.UndefOr[Double] = js.undefined
      
      var person: js.UndefOr[Person] = js.undefined
      
      var requestedResourceName: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[Status] = js.undefined
    }
    object PersonResponse {
      
      inline def apply(): PersonResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PersonResponse]
      }
      
      extension [Self <: PersonResponse](x: Self) {
        
        inline def setHttpStatusCode(value: Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
        
        inline def setHttpStatusCodeUndefined: Self = StObject.set(x, "httpStatusCode", js.undefined)
        
        inline def setPerson(value: Person): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
        
        inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
        
        inline def setRequestedResourceName(value: String): Self = StObject.set(x, "requestedResourceName", value.asInstanceOf[js.Any])
        
        inline def setRequestedResourceNameUndefined: Self = StObject.set(x, "requestedResourceName", js.undefined)
        
        inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait PhoneNumber extends StObject {
      
      var canonicalForm: js.UndefOr[String] = js.undefined
      
      var formattedType: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object PhoneNumber {
      
      inline def apply(): PhoneNumber = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PhoneNumber]
      }
      
      extension [Self <: PhoneNumber](x: Self) {
        
        inline def setCanonicalForm(value: String): Self = StObject.set(x, "canonicalForm", value.asInstanceOf[js.Any])
        
        inline def setCanonicalFormUndefined: Self = StObject.set(x, "canonicalForm", js.undefined)
        
        inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait Photo extends StObject {
      
      var default: js.UndefOr[Boolean] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
    }
    object Photo {
      
      inline def apply(): Photo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Photo]
      }
      
      extension [Self <: Photo](x: Self) {
        
        inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait ProfileMetadata extends StObject {
      
      var objectType: js.UndefOr[String] = js.undefined
      
      var userTypes: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ProfileMetadata {
      
      inline def apply(): ProfileMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ProfileMetadata]
      }
      
      extension [Self <: ProfileMetadata](x: Self) {
        
        inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
        
        inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
        
        inline def setUserTypes(value: js.Array[String]): Self = StObject.set(x, "userTypes", value.asInstanceOf[js.Any])
        
        inline def setUserTypesUndefined: Self = StObject.set(x, "userTypes", js.undefined)
        
        inline def setUserTypesVarargs(value: String*): Self = StObject.set(x, "userTypes", js.Array(value*))
      }
    }
    
    trait Relation extends StObject {
      
      var formattedType: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var person: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Relation {
      
      inline def apply(): Relation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Relation]
      }
      
      extension [Self <: Relation](x: Self) {
        
        inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setPerson(value: String): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
        
        inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait RelationshipInterest extends StObject {
      
      var formattedValue: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object RelationshipInterest {
      
      inline def apply(): RelationshipInterest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RelationshipInterest]
      }
      
      extension [Self <: RelationshipInterest](x: Self) {
        
        inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
        
        inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait RelationshipStatus extends StObject {
      
      var formattedValue: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object RelationshipStatus {
      
      inline def apply(): RelationshipStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RelationshipStatus]
      }
      
      extension [Self <: RelationshipStatus](x: Self) {
        
        inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
        
        inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait Residence extends StObject {
      
      var current: js.UndefOr[Boolean] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Residence {
      
      inline def apply(): Residence = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Residence]
      }
      
      extension [Self <: Residence](x: Self) {
        
        inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
        
        inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait SipAddress extends StObject {
      
      var formattedType: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object SipAddress {
      
      inline def apply(): SipAddress = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SipAddress]
      }
      
      extension [Self <: SipAddress](x: Self) {
        
        inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait Skill extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Skill {
      
      inline def apply(): Skill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Skill]
      }
      
      extension [Self <: Skill](x: Self) {
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait Source extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var profileMetadata: js.UndefOr[ProfileMetadata] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var updateTime: js.UndefOr[String] = js.undefined
    }
    object Source {
      
      inline def apply(): Source = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Source]
      }
      
      extension [Self <: Source](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setProfileMetadata(value: ProfileMetadata): Self = StObject.set(x, "profileMetadata", value.asInstanceOf[js.Any])
        
        inline def setProfileMetadataUndefined: Self = StObject.set(x, "profileMetadata", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
      }
    }
    
    trait Status extends StObject {
      
      var code: js.UndefOr[Double] = js.undefined
      
      var details: js.UndefOr[js.Array[js.Object]] = js.undefined
      
      var message: js.UndefOr[String] = js.undefined
    }
    object Status {
      
      inline def apply(): Status = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Status]
      }
      
      extension [Self <: Status](x: Self) {
        
        inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        inline def setDetails(value: js.Array[js.Object]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
        
        inline def setDetailsVarargs(value: js.Object*): Self = StObject.set(x, "details", js.Array(value*))
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      }
    }
    
    trait Tagline extends StObject {
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Tagline {
      
      inline def apply(): Tagline = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Tagline]
      }
      
      extension [Self <: Tagline](x: Self) {
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait UpdateContactGroupRequest extends StObject {
      
      var contactGroup: js.UndefOr[ContactGroup] = js.undefined
    }
    object UpdateContactGroupRequest {
      
      inline def apply(): UpdateContactGroupRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateContactGroupRequest]
      }
      
      extension [Self <: UpdateContactGroupRequest](x: Self) {
        
        inline def setContactGroup(value: ContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
        
        inline def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
      }
    }
    
    trait Url extends StObject {
      
      var formattedType: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Url {
      
      inline def apply(): Url = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Url]
      }
      
      extension [Self <: Url](x: Self) {
        
        inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
        
        inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait UserDefined extends StObject {
      
      var key: js.UndefOr[String] = js.undefined
      
      var metadata: js.UndefOr[FieldMetadata] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object UserDefined {
      
      inline def apply(): UserDefined = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserDefined]
      }
      
      extension [Self <: UserDefined](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
}

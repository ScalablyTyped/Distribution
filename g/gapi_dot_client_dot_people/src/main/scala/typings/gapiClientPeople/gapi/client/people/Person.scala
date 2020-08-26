package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Person extends js.Object {
  /** The person's street addresses. */
  var addresses: js.UndefOr[js.Array[Address]] = js.native
  /**
    * Output only. &#42;&#42;DEPRECATED&#42;&#42; (Please use `person.ageRanges` instead)
    *
    * The person's age range.
    */
  var ageRange: js.UndefOr[String] = js.native
  /** Output only. The person's age ranges. */
  var ageRanges: js.UndefOr[js.Array[AgeRangeType]] = js.native
  /** The person's biographies. */
  var biographies: js.UndefOr[js.Array[Biography]] = js.native
  /** The person's birthdays. */
  var birthdays: js.UndefOr[js.Array[Birthday]] = js.native
  /** The person's bragging rights. */
  var braggingRights: js.UndefOr[js.Array[BraggingRights]] = js.native
  /** Output only. The person's cover photos. */
  var coverPhotos: js.UndefOr[js.Array[CoverPhoto]] = js.native
  /** The person's email addresses. */
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.native
  /**
    * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the
    * resource. Used for web cache validation.
    */
  var etag: js.UndefOr[String] = js.native
  /** The person's events. */
  var events: js.UndefOr[js.Array[Event]] = js.native
  /** The person's genders. */
  var genders: js.UndefOr[js.Array[Gender]] = js.native
  /** The person's instant messaging clients. */
  var imClients: js.UndefOr[js.Array[ImClient]] = js.native
  /** The person's interests. */
  var interests: js.UndefOr[js.Array[Interest]] = js.native
  /** The person's locale preferences. */
  var locales: js.UndefOr[js.Array[Locale]] = js.native
  /** The person's group memberships. */
  var memberships: js.UndefOr[js.Array[Membership]] = js.native
  /** Output only. Metadata about the person. */
  var metadata: js.UndefOr[PersonMetadata] = js.native
  /** The person's names. */
  var names: js.UndefOr[js.Array[Name]] = js.native
  /** The person's nicknames. */
  var nicknames: js.UndefOr[js.Array[Nickname]] = js.native
  /** The person's occupations. */
  var occupations: js.UndefOr[js.Array[Occupation]] = js.native
  /** The person's past or current organizations. */
  var organizations: js.UndefOr[js.Array[Organization]] = js.native
  /** The person's phone numbers. */
  var phoneNumbers: js.UndefOr[js.Array[PhoneNumber]] = js.native
  /** Output only. The person's photos. */
  var photos: js.UndefOr[js.Array[Photo]] = js.native
  /** The person's relations. */
  var relations: js.UndefOr[js.Array[Relation]] = js.native
  /** Output only. The person's relationship interests. */
  var relationshipInterests: js.UndefOr[js.Array[RelationshipInterest]] = js.native
  /** Output only. The person's relationship statuses. */
  var relationshipStatuses: js.UndefOr[js.Array[RelationshipStatus]] = js.native
  /** The person's residences. */
  var residences: js.UndefOr[js.Array[Residence]] = js.native
  /**
    * The resource name for the person, assigned by the server. An ASCII string
    * with a max length of 27 characters, in the form of
    * `people/{person_id}`.
    */
  var resourceName: js.UndefOr[String] = js.native
  /** The person's SIP addresses. */
  var sipAddresses: js.UndefOr[js.Array[SipAddress]] = js.native
  /** The person's skills. */
  var skills: js.UndefOr[js.Array[Skill]] = js.native
  /** Output only. The person's taglines. */
  var taglines: js.UndefOr[js.Array[Tagline]] = js.native
  /** The person's associated URLs. */
  var urls: js.UndefOr[js.Array[Url]] = js.native
  /** The person's user defined data. */
  var userDefined: js.UndefOr[js.Array[UserDefined]] = js.native
}

object Person {
  @scala.inline
  def apply(): Person = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Person]
  }
  @scala.inline
  implicit class PersonOps[Self <: Person] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressesVarargs(value: Address*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[Address]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    @scala.inline
    def setAgeRange(value: String): Self = this.set("ageRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeRange: Self = this.set("ageRange", js.undefined)
    @scala.inline
    def setAgeRangesVarargs(value: AgeRangeType*): Self = this.set("ageRanges", js.Array(value :_*))
    @scala.inline
    def setAgeRanges(value: js.Array[AgeRangeType]): Self = this.set("ageRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeRanges: Self = this.set("ageRanges", js.undefined)
    @scala.inline
    def setBiographiesVarargs(value: Biography*): Self = this.set("biographies", js.Array(value :_*))
    @scala.inline
    def setBiographies(value: js.Array[Biography]): Self = this.set("biographies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBiographies: Self = this.set("biographies", js.undefined)
    @scala.inline
    def setBirthdaysVarargs(value: Birthday*): Self = this.set("birthdays", js.Array(value :_*))
    @scala.inline
    def setBirthdays(value: js.Array[Birthday]): Self = this.set("birthdays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBirthdays: Self = this.set("birthdays", js.undefined)
    @scala.inline
    def setBraggingRightsVarargs(value: BraggingRights*): Self = this.set("braggingRights", js.Array(value :_*))
    @scala.inline
    def setBraggingRights(value: js.Array[BraggingRights]): Self = this.set("braggingRights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBraggingRights: Self = this.set("braggingRights", js.undefined)
    @scala.inline
    def setCoverPhotosVarargs(value: CoverPhoto*): Self = this.set("coverPhotos", js.Array(value :_*))
    @scala.inline
    def setCoverPhotos(value: js.Array[CoverPhoto]): Self = this.set("coverPhotos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverPhotos: Self = this.set("coverPhotos", js.undefined)
    @scala.inline
    def setEmailAddressesVarargs(value: EmailAddress*): Self = this.set("emailAddresses", js.Array(value :_*))
    @scala.inline
    def setEmailAddresses(value: js.Array[EmailAddress]): Self = this.set("emailAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddresses: Self = this.set("emailAddresses", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[Event]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setGendersVarargs(value: Gender*): Self = this.set("genders", js.Array(value :_*))
    @scala.inline
    def setGenders(value: js.Array[Gender]): Self = this.set("genders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenders: Self = this.set("genders", js.undefined)
    @scala.inline
    def setImClientsVarargs(value: ImClient*): Self = this.set("imClients", js.Array(value :_*))
    @scala.inline
    def setImClients(value: js.Array[ImClient]): Self = this.set("imClients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImClients: Self = this.set("imClients", js.undefined)
    @scala.inline
    def setInterestsVarargs(value: Interest*): Self = this.set("interests", js.Array(value :_*))
    @scala.inline
    def setInterests(value: js.Array[Interest]): Self = this.set("interests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterests: Self = this.set("interests", js.undefined)
    @scala.inline
    def setLocalesVarargs(value: Locale*): Self = this.set("locales", js.Array(value :_*))
    @scala.inline
    def setLocales(value: js.Array[Locale]): Self = this.set("locales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    @scala.inline
    def setMembershipsVarargs(value: Membership*): Self = this.set("memberships", js.Array(value :_*))
    @scala.inline
    def setMemberships(value: js.Array[Membership]): Self = this.set("memberships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberships: Self = this.set("memberships", js.undefined)
    @scala.inline
    def setMetadata(value: PersonMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setNamesVarargs(value: Name*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[Name]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    @scala.inline
    def setNicknamesVarargs(value: Nickname*): Self = this.set("nicknames", js.Array(value :_*))
    @scala.inline
    def setNicknames(value: js.Array[Nickname]): Self = this.set("nicknames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNicknames: Self = this.set("nicknames", js.undefined)
    @scala.inline
    def setOccupationsVarargs(value: Occupation*): Self = this.set("occupations", js.Array(value :_*))
    @scala.inline
    def setOccupations(value: js.Array[Occupation]): Self = this.set("occupations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccupations: Self = this.set("occupations", js.undefined)
    @scala.inline
    def setOrganizationsVarargs(value: Organization*): Self = this.set("organizations", js.Array(value :_*))
    @scala.inline
    def setOrganizations(value: js.Array[Organization]): Self = this.set("organizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizations: Self = this.set("organizations", js.undefined)
    @scala.inline
    def setPhoneNumbersVarargs(value: PhoneNumber*): Self = this.set("phoneNumbers", js.Array(value :_*))
    @scala.inline
    def setPhoneNumbers(value: js.Array[PhoneNumber]): Self = this.set("phoneNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumbers: Self = this.set("phoneNumbers", js.undefined)
    @scala.inline
    def setPhotosVarargs(value: Photo*): Self = this.set("photos", js.Array(value :_*))
    @scala.inline
    def setPhotos(value: js.Array[Photo]): Self = this.set("photos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotos: Self = this.set("photos", js.undefined)
    @scala.inline
    def setRelationsVarargs(value: Relation*): Self = this.set("relations", js.Array(value :_*))
    @scala.inline
    def setRelations(value: js.Array[Relation]): Self = this.set("relations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelations: Self = this.set("relations", js.undefined)
    @scala.inline
    def setRelationshipInterestsVarargs(value: RelationshipInterest*): Self = this.set("relationshipInterests", js.Array(value :_*))
    @scala.inline
    def setRelationshipInterests(value: js.Array[RelationshipInterest]): Self = this.set("relationshipInterests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationshipInterests: Self = this.set("relationshipInterests", js.undefined)
    @scala.inline
    def setRelationshipStatusesVarargs(value: RelationshipStatus*): Self = this.set("relationshipStatuses", js.Array(value :_*))
    @scala.inline
    def setRelationshipStatuses(value: js.Array[RelationshipStatus]): Self = this.set("relationshipStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationshipStatuses: Self = this.set("relationshipStatuses", js.undefined)
    @scala.inline
    def setResidencesVarargs(value: Residence*): Self = this.set("residences", js.Array(value :_*))
    @scala.inline
    def setResidences(value: js.Array[Residence]): Self = this.set("residences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResidences: Self = this.set("residences", js.undefined)
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    @scala.inline
    def setSipAddressesVarargs(value: SipAddress*): Self = this.set("sipAddresses", js.Array(value :_*))
    @scala.inline
    def setSipAddresses(value: js.Array[SipAddress]): Self = this.set("sipAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSipAddresses: Self = this.set("sipAddresses", js.undefined)
    @scala.inline
    def setSkillsVarargs(value: Skill*): Self = this.set("skills", js.Array(value :_*))
    @scala.inline
    def setSkills(value: js.Array[Skill]): Self = this.set("skills", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkills: Self = this.set("skills", js.undefined)
    @scala.inline
    def setTaglinesVarargs(value: Tagline*): Self = this.set("taglines", js.Array(value :_*))
    @scala.inline
    def setTaglines(value: js.Array[Tagline]): Self = this.set("taglines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaglines: Self = this.set("taglines", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: Url*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[Url]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
    @scala.inline
    def setUserDefinedVarargs(value: UserDefined*): Self = this.set("userDefined", js.Array(value :_*))
    @scala.inline
    def setUserDefined(value: js.Array[UserDefined]): Self = this.set("userDefined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDefined: Self = this.set("userDefined", js.undefined)
  }
  
}


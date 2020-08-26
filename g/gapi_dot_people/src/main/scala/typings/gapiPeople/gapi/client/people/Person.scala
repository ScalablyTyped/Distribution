package typings.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Person extends js.Object {
  var BraggingRights: js.UndefOr[js.Array[typings.gapiPeople.gapi.client.people.BraggingRights]] = js.native
  var addresses: js.UndefOr[js.Array[Address]] = js.native
  var ageRange: js.UndefOr[AgeRange] = js.native
  var biographies: js.UndefOr[js.Array[Biography]] = js.native
  var birthdays: js.UndefOr[js.Array[Birthday]] = js.native
  var coverPhotos: js.Array[CoverPhoto] = js.native
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.native
  var etag: String = js.native
  var events: js.UndefOr[js.Array[Event]] = js.native
  var genders: js.UndefOr[js.Array[Gender]] = js.native
  var imClients: js.UndefOr[js.Array[ImClient]] = js.native
  var interests: js.UndefOr[js.Array[Interest]] = js.native
  var locales: js.Array[Locale] = js.native
  var memberships: js.UndefOr[js.Array[Membership]] = js.native
  var metadata: PersonMetadata = js.native
  var names: js.Array[Name] = js.native
  var nicknames: js.UndefOr[js.Array[Nickname]] = js.native
  var occupations: js.UndefOr[js.Array[Occupation]] = js.native
  var organizations: js.UndefOr[js.Array[Organization]] = js.native
  var phoneNumbers: js.UndefOr[js.Array[PhoneNumber]] = js.native
  var photos: js.UndefOr[js.Array[Photo]] = js.native
  var relations: js.UndefOr[js.Array[Relation]] = js.native
  var relationshipInterests: js.UndefOr[js.Array[RelationshipInterest]] = js.native
  var relationshipStatuses: js.UndefOr[js.Array[RelationshipStatus]] = js.native
  var residences: js.UndefOr[js.Array[Residence]] = js.native
  var resourceName: String = js.native
  var skills: js.UndefOr[js.Array[Skill]] = js.native
  var taglines: js.UndefOr[js.Array[Tagline]] = js.native
  var urls: js.UndefOr[js.Array[Url]] = js.native
}

object Person {
  @scala.inline
  def apply(
    coverPhotos: js.Array[CoverPhoto],
    etag: String,
    locales: js.Array[Locale],
    metadata: PersonMetadata,
    names: js.Array[Name],
    resourceName: String
  ): Person = {
    val __obj = js.Dynamic.literal(coverPhotos = coverPhotos.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
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
    def setCoverPhotosVarargs(value: CoverPhoto*): Self = this.set("coverPhotos", js.Array(value :_*))
    @scala.inline
    def setCoverPhotos(value: js.Array[CoverPhoto]): Self = this.set("coverPhotos", value.asInstanceOf[js.Any])
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalesVarargs(value: Locale*): Self = this.set("locales", js.Array(value :_*))
    @scala.inline
    def setLocales(value: js.Array[Locale]): Self = this.set("locales", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: PersonMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamesVarargs(value: Name*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[Name]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBraggingRightsVarargs(value: BraggingRights*): Self = this.set("BraggingRights", js.Array(value :_*))
    @scala.inline
    def setBraggingRights(value: js.Array[BraggingRights]): Self = this.set("BraggingRights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBraggingRights: Self = this.set("BraggingRights", js.undefined)
    @scala.inline
    def setAddressesVarargs(value: Address*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[Address]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    @scala.inline
    def setAgeRange(value: AgeRange): Self = this.set("ageRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeRange: Self = this.set("ageRange", js.undefined)
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
    def setEmailAddressesVarargs(value: EmailAddress*): Self = this.set("emailAddresses", js.Array(value :_*))
    @scala.inline
    def setEmailAddresses(value: js.Array[EmailAddress]): Self = this.set("emailAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddresses: Self = this.set("emailAddresses", js.undefined)
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
    def setMembershipsVarargs(value: Membership*): Self = this.set("memberships", js.Array(value :_*))
    @scala.inline
    def setMemberships(value: js.Array[Membership]): Self = this.set("memberships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberships: Self = this.set("memberships", js.undefined)
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
  }
  
}


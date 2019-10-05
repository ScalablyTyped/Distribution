package typings.gapiDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  var BraggingRights: js.UndefOr[js.Array[typings.gapiDotPeople.gapi.client.people.BraggingRights]] = js.undefined
  var addresses: js.UndefOr[js.Array[Address]] = js.undefined
  var ageRange: js.UndefOr[AgeRange] = js.undefined
  var biographies: js.UndefOr[js.Array[Biography]] = js.undefined
  var birthdays: js.UndefOr[js.Array[Birthday]] = js.undefined
  var coverPhotos: js.Array[CoverPhoto]
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.undefined
  var etag: String
  var events: js.UndefOr[js.Array[Event]] = js.undefined
  var genders: js.UndefOr[js.Array[Gender]] = js.undefined
  var imClients: js.UndefOr[js.Array[ImClient]] = js.undefined
  var interests: js.UndefOr[js.Array[Interest]] = js.undefined
  var locales: js.Array[Locale]
  var memberships: js.UndefOr[js.Array[Membership]] = js.undefined
  var metadata: PersonMetadata
  var names: js.Array[Name]
  var nicknames: js.UndefOr[js.Array[Nickname]] = js.undefined
  var occupations: js.UndefOr[js.Array[Occupation]] = js.undefined
  var organizations: js.UndefOr[js.Array[Organization]] = js.undefined
  var phoneNumbers: js.UndefOr[js.Array[PhoneNumber]] = js.undefined
  var photos: js.UndefOr[js.Array[Photo]] = js.undefined
  var relations: js.UndefOr[js.Array[Relation]] = js.undefined
  var relationshipInterests: js.UndefOr[js.Array[RelationshipInterest]] = js.undefined
  var relationshipStatuses: js.UndefOr[js.Array[RelationshipStatus]] = js.undefined
  var residences: js.UndefOr[js.Array[Residence]] = js.undefined
  var resourceName: String
  var skills: js.UndefOr[js.Array[Skill]] = js.undefined
  var taglines: js.UndefOr[js.Array[Tagline]] = js.undefined
  var urls: js.UndefOr[js.Array[Url]] = js.undefined
}

object Person {
  @scala.inline
  def apply(
    coverPhotos: js.Array[CoverPhoto],
    etag: String,
    locales: js.Array[Locale],
    metadata: PersonMetadata,
    names: js.Array[Name],
    resourceName: String,
    BraggingRights: js.Array[BraggingRights] = null,
    addresses: js.Array[Address] = null,
    ageRange: AgeRange = null,
    biographies: js.Array[Biography] = null,
    birthdays: js.Array[Birthday] = null,
    emailAddresses: js.Array[EmailAddress] = null,
    events: js.Array[Event] = null,
    genders: js.Array[Gender] = null,
    imClients: js.Array[ImClient] = null,
    interests: js.Array[Interest] = null,
    memberships: js.Array[Membership] = null,
    nicknames: js.Array[Nickname] = null,
    occupations: js.Array[Occupation] = null,
    organizations: js.Array[Organization] = null,
    phoneNumbers: js.Array[PhoneNumber] = null,
    photos: js.Array[Photo] = null,
    relations: js.Array[Relation] = null,
    relationshipInterests: js.Array[RelationshipInterest] = null,
    relationshipStatuses: js.Array[RelationshipStatus] = null,
    residences: js.Array[Residence] = null,
    skills: js.Array[Skill] = null,
    taglines: js.Array[Tagline] = null,
    urls: js.Array[Url] = null
  ): Person = {
    val __obj = js.Dynamic.literal(coverPhotos = coverPhotos, etag = etag, locales = locales, metadata = metadata, names = names, resourceName = resourceName)
    if (BraggingRights != null) __obj.updateDynamic("BraggingRights")(BraggingRights)
    if (addresses != null) __obj.updateDynamic("addresses")(addresses)
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange)
    if (biographies != null) __obj.updateDynamic("biographies")(biographies)
    if (birthdays != null) __obj.updateDynamic("birthdays")(birthdays)
    if (emailAddresses != null) __obj.updateDynamic("emailAddresses")(emailAddresses)
    if (events != null) __obj.updateDynamic("events")(events)
    if (genders != null) __obj.updateDynamic("genders")(genders)
    if (imClients != null) __obj.updateDynamic("imClients")(imClients)
    if (interests != null) __obj.updateDynamic("interests")(interests)
    if (memberships != null) __obj.updateDynamic("memberships")(memberships)
    if (nicknames != null) __obj.updateDynamic("nicknames")(nicknames)
    if (occupations != null) __obj.updateDynamic("occupations")(occupations)
    if (organizations != null) __obj.updateDynamic("organizations")(organizations)
    if (phoneNumbers != null) __obj.updateDynamic("phoneNumbers")(phoneNumbers)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (relations != null) __obj.updateDynamic("relations")(relations)
    if (relationshipInterests != null) __obj.updateDynamic("relationshipInterests")(relationshipInterests)
    if (relationshipStatuses != null) __obj.updateDynamic("relationshipStatuses")(relationshipStatuses)
    if (residences != null) __obj.updateDynamic("residences")(residences)
    if (skills != null) __obj.updateDynamic("skills")(skills)
    if (taglines != null) __obj.updateDynamic("taglines")(taglines)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[Person]
  }
}


package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  /** The person's street addresses. */
  var addresses: js.UndefOr[js.Array[Address]] = js.undefined
  /**
    * &#42;&#42;DEPRECATED&#42;&#42; (Please use `person.ageRanges` instead)&#42;&#42;
    *
    * The person's read-only age range.
    */
  var ageRange: js.UndefOr[String] = js.undefined
  /** The person's read-only age ranges. */
  var ageRanges: js.UndefOr[js.Array[AgeRangeType]] = js.undefined
  /** The person's biographies. */
  var biographies: js.UndefOr[js.Array[Biography]] = js.undefined
  /** The person's birthdays. */
  var birthdays: js.UndefOr[js.Array[Birthday]] = js.undefined
  /** The person's bragging rights. */
  var braggingRights: js.UndefOr[js.Array[BraggingRights]] = js.undefined
  /** The person's read-only cover photos. */
  var coverPhotos: js.UndefOr[js.Array[CoverPhoto]] = js.undefined
  /** The person's email addresses. */
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.undefined
  /**
    * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the
    * resource. Used for web cache validation.
    */
  var etag: js.UndefOr[String] = js.undefined
  /** The person's events. */
  var events: js.UndefOr[js.Array[Event]] = js.undefined
  /** The person's genders. */
  var genders: js.UndefOr[js.Array[Gender]] = js.undefined
  /** The person's instant messaging clients. */
  var imClients: js.UndefOr[js.Array[ImClient]] = js.undefined
  /** The person's interests. */
  var interests: js.UndefOr[js.Array[Interest]] = js.undefined
  /** The person's locale preferences. */
  var locales: js.UndefOr[js.Array[Locale]] = js.undefined
  /** The person's read-only group memberships. */
  var memberships: js.UndefOr[js.Array[Membership]] = js.undefined
  /** Read-only metadata about the person. */
  var metadata: js.UndefOr[PersonMetadata] = js.undefined
  /** The person's names. */
  var names: js.UndefOr[js.Array[Name]] = js.undefined
  /** The person's nicknames. */
  var nicknames: js.UndefOr[js.Array[Nickname]] = js.undefined
  /** The person's occupations. */
  var occupations: js.UndefOr[js.Array[Occupation]] = js.undefined
  /** The person's past or current organizations. */
  var organizations: js.UndefOr[js.Array[Organization]] = js.undefined
  /** The person's phone numbers. */
  var phoneNumbers: js.UndefOr[js.Array[PhoneNumber]] = js.undefined
  /** The person's read-only photos. */
  var photos: js.UndefOr[js.Array[Photo]] = js.undefined
  /** The person's relations. */
  var relations: js.UndefOr[js.Array[Relation]] = js.undefined
  /** The person's read-only relationship interests. */
  var relationshipInterests: js.UndefOr[js.Array[RelationshipInterest]] = js.undefined
  /** The person's read-only relationship statuses. */
  var relationshipStatuses: js.UndefOr[js.Array[RelationshipStatus]] = js.undefined
  /** The person's residences. */
  var residences: js.UndefOr[js.Array[Residence]] = js.undefined
  /**
    * The resource name for the person, assigned by the server. An ASCII string
    * with a max length of 27 characters, in the form of
    * `people/`<var>person_id</var>.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  /** The person's skills. */
  var skills: js.UndefOr[js.Array[Skill]] = js.undefined
  /** The person's read-only taglines. */
  var taglines: js.UndefOr[js.Array[Tagline]] = js.undefined
  /** The person's associated URLs. */
  var urls: js.UndefOr[js.Array[Url]] = js.undefined
  /** The person's user defined data. */
  var userDefined: js.UndefOr[js.Array[UserDefined]] = js.undefined
}

object Person {
  @scala.inline
  def apply(
    addresses: js.Array[Address] = null,
    ageRange: String = null,
    ageRanges: js.Array[AgeRangeType] = null,
    biographies: js.Array[Biography] = null,
    birthdays: js.Array[Birthday] = null,
    braggingRights: js.Array[BraggingRights] = null,
    coverPhotos: js.Array[CoverPhoto] = null,
    emailAddresses: js.Array[EmailAddress] = null,
    etag: String = null,
    events: js.Array[Event] = null,
    genders: js.Array[Gender] = null,
    imClients: js.Array[ImClient] = null,
    interests: js.Array[Interest] = null,
    locales: js.Array[Locale] = null,
    memberships: js.Array[Membership] = null,
    metadata: PersonMetadata = null,
    names: js.Array[Name] = null,
    nicknames: js.Array[Nickname] = null,
    occupations: js.Array[Occupation] = null,
    organizations: js.Array[Organization] = null,
    phoneNumbers: js.Array[PhoneNumber] = null,
    photos: js.Array[Photo] = null,
    relations: js.Array[Relation] = null,
    relationshipInterests: js.Array[RelationshipInterest] = null,
    relationshipStatuses: js.Array[RelationshipStatus] = null,
    residences: js.Array[Residence] = null,
    resourceName: String = null,
    skills: js.Array[Skill] = null,
    taglines: js.Array[Tagline] = null,
    urls: js.Array[Url] = null,
    userDefined: js.Array[UserDefined] = null
  ): Person = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange.asInstanceOf[js.Any])
    if (ageRanges != null) __obj.updateDynamic("ageRanges")(ageRanges.asInstanceOf[js.Any])
    if (biographies != null) __obj.updateDynamic("biographies")(biographies.asInstanceOf[js.Any])
    if (birthdays != null) __obj.updateDynamic("birthdays")(birthdays.asInstanceOf[js.Any])
    if (braggingRights != null) __obj.updateDynamic("braggingRights")(braggingRights.asInstanceOf[js.Any])
    if (coverPhotos != null) __obj.updateDynamic("coverPhotos")(coverPhotos.asInstanceOf[js.Any])
    if (emailAddresses != null) __obj.updateDynamic("emailAddresses")(emailAddresses.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (genders != null) __obj.updateDynamic("genders")(genders.asInstanceOf[js.Any])
    if (imClients != null) __obj.updateDynamic("imClients")(imClients.asInstanceOf[js.Any])
    if (interests != null) __obj.updateDynamic("interests")(interests.asInstanceOf[js.Any])
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (memberships != null) __obj.updateDynamic("memberships")(memberships.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    if (nicknames != null) __obj.updateDynamic("nicknames")(nicknames.asInstanceOf[js.Any])
    if (occupations != null) __obj.updateDynamic("occupations")(occupations.asInstanceOf[js.Any])
    if (organizations != null) __obj.updateDynamic("organizations")(organizations.asInstanceOf[js.Any])
    if (phoneNumbers != null) __obj.updateDynamic("phoneNumbers")(phoneNumbers.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    if (relations != null) __obj.updateDynamic("relations")(relations.asInstanceOf[js.Any])
    if (relationshipInterests != null) __obj.updateDynamic("relationshipInterests")(relationshipInterests.asInstanceOf[js.Any])
    if (relationshipStatuses != null) __obj.updateDynamic("relationshipStatuses")(relationshipStatuses.asInstanceOf[js.Any])
    if (residences != null) __obj.updateDynamic("residences")(residences.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (skills != null) __obj.updateDynamic("skills")(skills.asInstanceOf[js.Any])
    if (taglines != null) __obj.updateDynamic("taglines")(taglines.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (userDefined != null) __obj.updateDynamic("userDefined")(userDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
}


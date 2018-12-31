package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

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
  var ageRange: js.UndefOr[java.lang.String] = js.undefined
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
  var etag: js.UndefOr[java.lang.String] = js.undefined
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
  var resourceName: js.UndefOr[java.lang.String] = js.undefined
  /** The person's skills. */
  var skills: js.UndefOr[js.Array[Skill]] = js.undefined
  /** The person's read-only taglines. */
  var taglines: js.UndefOr[js.Array[Tagline]] = js.undefined
  /** The person's associated URLs. */
  var urls: js.UndefOr[js.Array[Url]] = js.undefined
  /** The person's user defined data. */
  var userDefined: js.UndefOr[js.Array[UserDefined]] = js.undefined
}


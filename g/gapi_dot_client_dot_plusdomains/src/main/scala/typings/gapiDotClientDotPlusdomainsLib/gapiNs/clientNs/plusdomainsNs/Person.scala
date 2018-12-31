package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  /** A short biography for this person. */
  var aboutMe: js.UndefOr[java.lang.String] = js.undefined
  /** The person's date of birth, represented as YYYY-MM-DD. */
  var birthday: js.UndefOr[java.lang.String] = js.undefined
  /** The "bragging rights" line of this person. */
  var braggingRights: js.UndefOr[java.lang.String] = js.undefined
  /** For followers who are visible, the number of people who have added this person or page to a circle. */
  var circledByCount: js.UndefOr[scala.Double] = js.undefined
  /** The cover photo content. */
  var cover: js.UndefOr[gapiDotClientDotPlusdomainsLib.Anon_CoverInfo] = js.undefined
  /** (this field is not currently used) */
  var currentLocation: js.UndefOr[java.lang.String] = js.undefined
  /** The name of this person, which is suitable for display. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The hosted domain name for the user's Google Apps account. For instance, example.com. The plus.profile.emails.read or email scope is needed to get this
    * domain name.
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of email addresses that this person has, including their Google account email address, and the public verified email addresses on their Google+
    * profile. The plus.profile.emails.read scope is needed to retrieve these email addresses, or the email scope can be used to retrieve just the Google
    * account email address.
    */
  var emails: js.UndefOr[js.Array[gapiDotClientDotPlusdomainsLib.Anon_TypeValueString]] = js.undefined
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The person's gender. Possible values include, but are not limited to, the following values:
    * - "male" - Male gender.
    * - "female" - Female gender.
    * - "other" - Other.
    */
  var gender: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of this person. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The representation of the person's profile photo. */
  var image: js.UndefOr[gapiDotClientDotPlusdomainsLib.Anon_UrlIsDefault] = js.undefined
  /** Whether this user has signed up for Google+. */
  var isPlusUser: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies this resource as a person. Value: "plus#person". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** An object representation of the individual components of a person's name. */
  var name: js.UndefOr[gapiDotClientDotPlusdomainsLib.Anon_FamilyName] = js.undefined
  /** The nickname of this person. */
  var nickname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type of person within Google+. Possible values include, but are not limited to, the following values:
    * - "person" - represents an actual person.
    * - "page" - represents a page.
    */
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  /** The occupation of this person. */
  var occupation: js.UndefOr[java.lang.String] = js.undefined
  /** A list of current or past organizations with which this person is associated. */
  var organizations: js.UndefOr[js.Array[gapiDotClientDotPlusdomainsLib.Anon_Name]] = js.undefined
  /** A list of places where this person has lived. */
  var placesLived: js.UndefOr[js.Array[gapiDotClientDotPlusdomainsLib.Anon_Value]] = js.undefined
  /** If a Google+ Page, the number of people who have +1'd this page. */
  var plusOneCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * The person's relationship status. Possible values include, but are not limited to, the following values:
    * - "single" - Person is single.
    * - "in_a_relationship" - Person is in a relationship.
    * - "engaged" - Person is engaged.
    * - "married" - Person is married.
    * - "its_complicated" - The relationship is complicated.
    * - "open_relationship" - Person is in an open relationship.
    * - "widowed" - Person is widowed.
    * - "in_domestic_partnership" - Person is in a domestic partnership.
    * - "in_civil_union" - Person is in a civil union.
    */
  var relationshipStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The person's skills. */
  var skills: js.UndefOr[java.lang.String] = js.undefined
  /** The brief description (tagline) of this person. */
  var tagline: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of this person's profile. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** A list of URLs for this person. */
  var urls: js.UndefOr[js.Array[gapiDotClientDotPlusdomainsLib.Anon_TypeValue]] = js.undefined
  /** Whether the person or Google+ Page has been verified. */
  var verified: js.UndefOr[scala.Boolean] = js.undefined
}


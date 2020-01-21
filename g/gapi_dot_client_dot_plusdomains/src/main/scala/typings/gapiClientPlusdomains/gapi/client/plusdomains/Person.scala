package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClientPlusdomains.AnonCoverInfo
import typings.gapiClientPlusdomains.AnonDepartment
import typings.gapiClientPlusdomains.AnonFamilyNameFormatted
import typings.gapiClientPlusdomains.AnonIsDefault
import typings.gapiClientPlusdomains.AnonLabel
import typings.gapiClientPlusdomains.AnonPrimary
import typings.gapiClientPlusdomains.AnonTypeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  /** A short biography for this person. */
  var aboutMe: js.UndefOr[String] = js.undefined
  /** The person's date of birth, represented as YYYY-MM-DD. */
  var birthday: js.UndefOr[String] = js.undefined
  /** The "bragging rights" line of this person. */
  var braggingRights: js.UndefOr[String] = js.undefined
  /** For followers who are visible, the number of people who have added this person or page to a circle. */
  var circledByCount: js.UndefOr[Double] = js.undefined
  /** The cover photo content. */
  var cover: js.UndefOr[AnonCoverInfo] = js.undefined
  /** (this field is not currently used) */
  var currentLocation: js.UndefOr[String] = js.undefined
  /** The name of this person, which is suitable for display. */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The hosted domain name for the user's Google Apps account. For instance, example.com. The plus.profile.emails.read or email scope is needed to get this
    * domain name.
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * A list of email addresses that this person has, including their Google account email address, and the public verified email addresses on their Google+
    * profile. The plus.profile.emails.read scope is needed to retrieve these email addresses, or the email scope can be used to retrieve just the Google
    * account email address.
    */
  var emails: js.UndefOr[js.Array[AnonTypeValue]] = js.undefined
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /**
    * The person's gender. Possible values include, but are not limited to, the following values:
    * - "male" - Male gender.
    * - "female" - Female gender.
    * - "other" - Other.
    */
  var gender: js.UndefOr[String] = js.undefined
  /** The ID of this person. */
  var id: js.UndefOr[String] = js.undefined
  /** The representation of the person's profile photo. */
  var image: js.UndefOr[AnonIsDefault] = js.undefined
  /** Whether this user has signed up for Google+. */
  var isPlusUser: js.UndefOr[Boolean] = js.undefined
  /** Identifies this resource as a person. Value: "plus#person". */
  var kind: js.UndefOr[String] = js.undefined
  /** An object representation of the individual components of a person's name. */
  var name: js.UndefOr[AnonFamilyNameFormatted] = js.undefined
  /** The nickname of this person. */
  var nickname: js.UndefOr[String] = js.undefined
  /**
    * Type of person within Google+. Possible values include, but are not limited to, the following values:
    * - "person" - represents an actual person.
    * - "page" - represents a page.
    */
  var objectType: js.UndefOr[String] = js.undefined
  /** The occupation of this person. */
  var occupation: js.UndefOr[String] = js.undefined
  /** A list of current or past organizations with which this person is associated. */
  var organizations: js.UndefOr[js.Array[AnonDepartment]] = js.undefined
  /** A list of places where this person has lived. */
  var placesLived: js.UndefOr[js.Array[AnonPrimary]] = js.undefined
  /** If a Google+ Page, the number of people who have +1'd this page. */
  var plusOneCount: js.UndefOr[Double] = js.undefined
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
  var relationshipStatus: js.UndefOr[String] = js.undefined
  /** The person's skills. */
  var skills: js.UndefOr[String] = js.undefined
  /** The brief description (tagline) of this person. */
  var tagline: js.UndefOr[String] = js.undefined
  /** The URL of this person's profile. */
  var url: js.UndefOr[String] = js.undefined
  /** A list of URLs for this person. */
  var urls: js.UndefOr[js.Array[AnonLabel]] = js.undefined
  /** Whether the person or Google+ Page has been verified. */
  var verified: js.UndefOr[Boolean] = js.undefined
}

object Person {
  @scala.inline
  def apply(
    aboutMe: String = null,
    birthday: String = null,
    braggingRights: String = null,
    circledByCount: Int | Double = null,
    cover: AnonCoverInfo = null,
    currentLocation: String = null,
    displayName: String = null,
    domain: String = null,
    emails: js.Array[AnonTypeValue] = null,
    etag: String = null,
    gender: String = null,
    id: String = null,
    image: AnonIsDefault = null,
    isPlusUser: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    name: AnonFamilyNameFormatted = null,
    nickname: String = null,
    objectType: String = null,
    occupation: String = null,
    organizations: js.Array[AnonDepartment] = null,
    placesLived: js.Array[AnonPrimary] = null,
    plusOneCount: Int | Double = null,
    relationshipStatus: String = null,
    skills: String = null,
    tagline: String = null,
    url: String = null,
    urls: js.Array[AnonLabel] = null,
    verified: js.UndefOr[Boolean] = js.undefined
  ): Person = {
    val __obj = js.Dynamic.literal()
    if (aboutMe != null) __obj.updateDynamic("aboutMe")(aboutMe.asInstanceOf[js.Any])
    if (birthday != null) __obj.updateDynamic("birthday")(birthday.asInstanceOf[js.Any])
    if (braggingRights != null) __obj.updateDynamic("braggingRights")(braggingRights.asInstanceOf[js.Any])
    if (circledByCount != null) __obj.updateDynamic("circledByCount")(circledByCount.asInstanceOf[js.Any])
    if (cover != null) __obj.updateDynamic("cover")(cover.asInstanceOf[js.Any])
    if (currentLocation != null) __obj.updateDynamic("currentLocation")(currentLocation.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(isPlusUser)) __obj.updateDynamic("isPlusUser")(isPlusUser.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (occupation != null) __obj.updateDynamic("occupation")(occupation.asInstanceOf[js.Any])
    if (organizations != null) __obj.updateDynamic("organizations")(organizations.asInstanceOf[js.Any])
    if (placesLived != null) __obj.updateDynamic("placesLived")(placesLived.asInstanceOf[js.Any])
    if (plusOneCount != null) __obj.updateDynamic("plusOneCount")(plusOneCount.asInstanceOf[js.Any])
    if (relationshipStatus != null) __obj.updateDynamic("relationshipStatus")(relationshipStatus.asInstanceOf[js.Any])
    if (skills != null) __obj.updateDynamic("skills")(skills.asInstanceOf[js.Any])
    if (tagline != null) __obj.updateDynamic("tagline")(tagline.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
}


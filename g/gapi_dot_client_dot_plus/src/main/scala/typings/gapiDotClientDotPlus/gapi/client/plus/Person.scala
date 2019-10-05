package typings.gapiDotClientDotPlus.gapi.client.plus

import typings.gapiDotClientDotPlus.Anon_CoverInfo
import typings.gapiDotClientDotPlus.Anon_Department
import typings.gapiDotClientDotPlus.Anon_FamilyNameFormatted
import typings.gapiDotClientDotPlus.Anon_IsDefault
import typings.gapiDotClientDotPlus.Anon_Label
import typings.gapiDotClientDotPlus.Anon_Max
import typings.gapiDotClientDotPlus.Anon_Primary
import typings.gapiDotClientDotPlus.Anon_TypeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  /** A short biography for this person. */
  var aboutMe: js.UndefOr[String] = js.undefined
  /**
    * The age range of the person. Valid ranges are 17 or younger, 18 to 20, and 21 or older. Age is determined from the user's birthday using Western age
    * reckoning.
    */
  var ageRange: js.UndefOr[Anon_Max] = js.undefined
  /** The person's date of birth, represented as YYYY-MM-DD. */
  var birthday: js.UndefOr[String] = js.undefined
  /** The "bragging rights" line of this person. */
  var braggingRights: js.UndefOr[String] = js.undefined
  /** For followers who are visible, the number of people who have added this person or page to a circle. */
  var circledByCount: js.UndefOr[Double] = js.undefined
  /** The cover photo content. */
  var cover: js.UndefOr[Anon_CoverInfo] = js.undefined
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
  var emails: js.UndefOr[js.Array[Anon_TypeValue]] = js.undefined
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
  var image: js.UndefOr[Anon_IsDefault] = js.undefined
  /** Whether this user has signed up for Google+. */
  var isPlusUser: js.UndefOr[Boolean] = js.undefined
  /** Identifies this resource as a person. Value: "plus#person". */
  var kind: js.UndefOr[String] = js.undefined
  /** The user's preferred language for rendering. */
  var language: js.UndefOr[String] = js.undefined
  /** An object representation of the individual components of a person's name. */
  var name: js.UndefOr[Anon_FamilyNameFormatted] = js.undefined
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
  var organizations: js.UndefOr[js.Array[Anon_Department]] = js.undefined
  /** A list of places where this person has lived. */
  var placesLived: js.UndefOr[js.Array[Anon_Primary]] = js.undefined
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
  var urls: js.UndefOr[js.Array[Anon_Label]] = js.undefined
  /** Whether the person or Google+ Page has been verified. */
  var verified: js.UndefOr[Boolean] = js.undefined
}

object Person {
  @scala.inline
  def apply(
    aboutMe: String = null,
    ageRange: Anon_Max = null,
    birthday: String = null,
    braggingRights: String = null,
    circledByCount: Int | Double = null,
    cover: Anon_CoverInfo = null,
    currentLocation: String = null,
    displayName: String = null,
    domain: String = null,
    emails: js.Array[Anon_TypeValue] = null,
    etag: String = null,
    gender: String = null,
    id: String = null,
    image: Anon_IsDefault = null,
    isPlusUser: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    language: String = null,
    name: Anon_FamilyNameFormatted = null,
    nickname: String = null,
    objectType: String = null,
    occupation: String = null,
    organizations: js.Array[Anon_Department] = null,
    placesLived: js.Array[Anon_Primary] = null,
    plusOneCount: Int | Double = null,
    relationshipStatus: String = null,
    skills: String = null,
    tagline: String = null,
    url: String = null,
    urls: js.Array[Anon_Label] = null,
    verified: js.UndefOr[Boolean] = js.undefined
  ): Person = {
    val __obj = js.Dynamic.literal()
    if (aboutMe != null) __obj.updateDynamic("aboutMe")(aboutMe)
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange)
    if (birthday != null) __obj.updateDynamic("birthday")(birthday)
    if (braggingRights != null) __obj.updateDynamic("braggingRights")(braggingRights)
    if (circledByCount != null) __obj.updateDynamic("circledByCount")(circledByCount.asInstanceOf[js.Any])
    if (cover != null) __obj.updateDynamic("cover")(cover)
    if (currentLocation != null) __obj.updateDynamic("currentLocation")(currentLocation)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (id != null) __obj.updateDynamic("id")(id)
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(isPlusUser)) __obj.updateDynamic("isPlusUser")(isPlusUser)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (language != null) __obj.updateDynamic("language")(language)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nickname != null) __obj.updateDynamic("nickname")(nickname)
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    if (occupation != null) __obj.updateDynamic("occupation")(occupation)
    if (organizations != null) __obj.updateDynamic("organizations")(organizations)
    if (placesLived != null) __obj.updateDynamic("placesLived")(placesLived)
    if (plusOneCount != null) __obj.updateDynamic("plusOneCount")(plusOneCount.asInstanceOf[js.Any])
    if (relationshipStatus != null) __obj.updateDynamic("relationshipStatus")(relationshipStatus)
    if (skills != null) __obj.updateDynamic("skills")(skills)
    if (tagline != null) __obj.updateDynamic("tagline")(tagline)
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[Person]
  }
}


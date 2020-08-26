package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClientPlusdomains.anon.CoverInfo
import typings.gapiClientPlusdomains.anon.Department
import typings.gapiClientPlusdomains.anon.Formatted
import typings.gapiClientPlusdomains.anon.IsDefault
import typings.gapiClientPlusdomains.anon.Label
import typings.gapiClientPlusdomains.anon.Primary
import typings.gapiClientPlusdomains.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Person extends js.Object {
  /** A short biography for this person. */
  var aboutMe: js.UndefOr[String] = js.native
  /** The person's date of birth, represented as YYYY-MM-DD. */
  var birthday: js.UndefOr[String] = js.native
  /** The "bragging rights" line of this person. */
  var braggingRights: js.UndefOr[String] = js.native
  /** For followers who are visible, the number of people who have added this person or page to a circle. */
  var circledByCount: js.UndefOr[Double] = js.native
  /** The cover photo content. */
  var cover: js.UndefOr[CoverInfo] = js.native
  /** (this field is not currently used) */
  var currentLocation: js.UndefOr[String] = js.native
  /** The name of this person, which is suitable for display. */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The hosted domain name for the user's Google Apps account. For instance, example.com. The plus.profile.emails.read or email scope is needed to get this
    * domain name.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * A list of email addresses that this person has, including their Google account email address, and the public verified email addresses on their Google+
    * profile. The plus.profile.emails.read scope is needed to retrieve these email addresses, or the email scope can be used to retrieve just the Google
    * account email address.
    */
  var emails: js.UndefOr[js.Array[Value]] = js.native
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /**
    * The person's gender. Possible values include, but are not limited to, the following values:
    * - "male" - Male gender.
    * - "female" - Female gender.
    * - "other" - Other.
    */
  var gender: js.UndefOr[String] = js.native
  /** The ID of this person. */
  var id: js.UndefOr[String] = js.native
  /** The representation of the person's profile photo. */
  var image: js.UndefOr[IsDefault] = js.native
  /** Whether this user has signed up for Google+. */
  var isPlusUser: js.UndefOr[Boolean] = js.native
  /** Identifies this resource as a person. Value: "plus#person". */
  var kind: js.UndefOr[String] = js.native
  /** An object representation of the individual components of a person's name. */
  var name: js.UndefOr[Formatted] = js.native
  /** The nickname of this person. */
  var nickname: js.UndefOr[String] = js.native
  /**
    * Type of person within Google+. Possible values include, but are not limited to, the following values:
    * - "person" - represents an actual person.
    * - "page" - represents a page.
    */
  var objectType: js.UndefOr[String] = js.native
  /** The occupation of this person. */
  var occupation: js.UndefOr[String] = js.native
  /** A list of current or past organizations with which this person is associated. */
  var organizations: js.UndefOr[js.Array[Department]] = js.native
  /** A list of places where this person has lived. */
  var placesLived: js.UndefOr[js.Array[Primary]] = js.native
  /** If a Google+ Page, the number of people who have +1'd this page. */
  var plusOneCount: js.UndefOr[Double] = js.native
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
  var relationshipStatus: js.UndefOr[String] = js.native
  /** The person's skills. */
  var skills: js.UndefOr[String] = js.native
  /** The brief description (tagline) of this person. */
  var tagline: js.UndefOr[String] = js.native
  /** The URL of this person's profile. */
  var url: js.UndefOr[String] = js.native
  /** A list of URLs for this person. */
  var urls: js.UndefOr[js.Array[Label]] = js.native
  /** Whether the person or Google+ Page has been verified. */
  var verified: js.UndefOr[Boolean] = js.native
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
    def setAboutMe(value: String): Self = this.set("aboutMe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAboutMe: Self = this.set("aboutMe", js.undefined)
    @scala.inline
    def setBirthday(value: String): Self = this.set("birthday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBirthday: Self = this.set("birthday", js.undefined)
    @scala.inline
    def setBraggingRights(value: String): Self = this.set("braggingRights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBraggingRights: Self = this.set("braggingRights", js.undefined)
    @scala.inline
    def setCircledByCount(value: Double): Self = this.set("circledByCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircledByCount: Self = this.set("circledByCount", js.undefined)
    @scala.inline
    def setCover(value: CoverInfo): Self = this.set("cover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCover: Self = this.set("cover", js.undefined)
    @scala.inline
    def setCurrentLocation(value: String): Self = this.set("currentLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentLocation: Self = this.set("currentLocation", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setEmailsVarargs(value: Value*): Self = this.set("emails", js.Array(value :_*))
    @scala.inline
    def setEmails(value: js.Array[Value]): Self = this.set("emails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmails: Self = this.set("emails", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImage(value: IsDefault): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setIsPlusUser(value: Boolean): Self = this.set("isPlusUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPlusUser: Self = this.set("isPlusUser", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: Formatted): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNickname: Self = this.set("nickname", js.undefined)
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    @scala.inline
    def setOccupation(value: String): Self = this.set("occupation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccupation: Self = this.set("occupation", js.undefined)
    @scala.inline
    def setOrganizationsVarargs(value: Department*): Self = this.set("organizations", js.Array(value :_*))
    @scala.inline
    def setOrganizations(value: js.Array[Department]): Self = this.set("organizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizations: Self = this.set("organizations", js.undefined)
    @scala.inline
    def setPlacesLivedVarargs(value: Primary*): Self = this.set("placesLived", js.Array(value :_*))
    @scala.inline
    def setPlacesLived(value: js.Array[Primary]): Self = this.set("placesLived", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacesLived: Self = this.set("placesLived", js.undefined)
    @scala.inline
    def setPlusOneCount(value: Double): Self = this.set("plusOneCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlusOneCount: Self = this.set("plusOneCount", js.undefined)
    @scala.inline
    def setRelationshipStatus(value: String): Self = this.set("relationshipStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationshipStatus: Self = this.set("relationshipStatus", js.undefined)
    @scala.inline
    def setSkills(value: String): Self = this.set("skills", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkills: Self = this.set("skills", js.undefined)
    @scala.inline
    def setTagline(value: String): Self = this.set("tagline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagline: Self = this.set("tagline", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: Label*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[Label]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerified: Self = this.set("verified", js.undefined)
  }
  
}


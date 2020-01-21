package typings.gapiPlus.gapi.client.plus.people

import typings.gapiPlus.AnonCoverInfo
import typings.gapiPlus.AnonDepartment
import typings.gapiPlus.AnonFamilyName
import typings.gapiPlus.AnonLabel
import typings.gapiPlus.AnonMax
import typings.gapiPlus.AnonPrimary
import typings.gapiPlus.AnonType
import typings.gapiPlus.AnonUrl
import typings.gapiPlus.gapiPlusStrings.plusNumbersignperson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  var aboutMe: String
  var ageRange: AnonMax
  var birthday: String
  var braggingRights: String
  var circledByCount: Double
  var cover: AnonCoverInfo
  var displayName: String
  var domain: String
  var emails: js.Array[AnonType]
  var etag: String
  var gender: String
  var id: String
  var image: AnonUrl
  var isPlusUser: Boolean
  var kind: plusNumbersignperson
  var language: String
  var name: AnonFamilyName
  var nickname: String
  var objectType: String
  var occupation: String
  var organizations: js.Array[AnonDepartment]
  var placesLived: js.Array[AnonPrimary]
  var plusOneCount: Double
  var relationshipStatus: String
  var skills: String
  var tagline: String
  var url: String
  var urls: js.Array[AnonLabel]
  var verified: Boolean
}

object Person {
  @scala.inline
  def apply(
    aboutMe: String,
    ageRange: AnonMax,
    birthday: String,
    braggingRights: String,
    circledByCount: Double,
    cover: AnonCoverInfo,
    displayName: String,
    domain: String,
    emails: js.Array[AnonType],
    etag: String,
    gender: String,
    id: String,
    image: AnonUrl,
    isPlusUser: Boolean,
    kind: plusNumbersignperson,
    language: String,
    name: AnonFamilyName,
    nickname: String,
    objectType: String,
    occupation: String,
    organizations: js.Array[AnonDepartment],
    placesLived: js.Array[AnonPrimary],
    plusOneCount: Double,
    relationshipStatus: String,
    skills: String,
    tagline: String,
    url: String,
    urls: js.Array[AnonLabel],
    verified: Boolean
  ): Person = {
    val __obj = js.Dynamic.literal(aboutMe = aboutMe.asInstanceOf[js.Any], ageRange = ageRange.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], braggingRights = braggingRights.asInstanceOf[js.Any], circledByCount = circledByCount.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], isPlusUser = isPlusUser.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], occupation = occupation.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], placesLived = placesLived.asInstanceOf[js.Any], plusOneCount = plusOneCount.asInstanceOf[js.Any], relationshipStatus = relationshipStatus.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Person]
  }
}


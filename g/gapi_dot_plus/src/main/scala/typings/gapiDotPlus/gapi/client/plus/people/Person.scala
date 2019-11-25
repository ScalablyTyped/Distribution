package typings.gapiDotPlus.gapi.client.plus.people

import typings.gapiDotPlus.Anon_CoverInfo
import typings.gapiDotPlus.Anon_Department
import typings.gapiDotPlus.Anon_FamilyName
import typings.gapiDotPlus.Anon_Label
import typings.gapiDotPlus.Anon_Max
import typings.gapiDotPlus.Anon_Primary
import typings.gapiDotPlus.Anon_Type
import typings.gapiDotPlus.Anon_Url
import typings.gapiDotPlus.gapiDotPlusStrings.`plus#person`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  var aboutMe: String
  var ageRange: Anon_Max
  var birthday: String
  var braggingRights: String
  var circledByCount: Double
  var cover: Anon_CoverInfo
  var displayName: String
  var domain: String
  var emails: js.Array[Anon_Type]
  var etag: String
  var gender: String
  var id: String
  var image: Anon_Url
  var isPlusUser: Boolean
  var kind: `plus#person`
  var language: String
  var name: Anon_FamilyName
  var nickname: String
  var objectType: String
  var occupation: String
  var organizations: js.Array[Anon_Department]
  var placesLived: js.Array[Anon_Primary]
  var plusOneCount: Double
  var relationshipStatus: String
  var skills: String
  var tagline: String
  var url: String
  var urls: js.Array[Anon_Label]
  var verified: Boolean
}

object Person {
  @scala.inline
  def apply(
    aboutMe: String,
    ageRange: Anon_Max,
    birthday: String,
    braggingRights: String,
    circledByCount: Double,
    cover: Anon_CoverInfo,
    displayName: String,
    domain: String,
    emails: js.Array[Anon_Type],
    etag: String,
    gender: String,
    id: String,
    image: Anon_Url,
    isPlusUser: Boolean,
    kind: `plus#person`,
    language: String,
    name: Anon_FamilyName,
    nickname: String,
    objectType: String,
    occupation: String,
    organizations: js.Array[Anon_Department],
    placesLived: js.Array[Anon_Primary],
    plusOneCount: Double,
    relationshipStatus: String,
    skills: String,
    tagline: String,
    url: String,
    urls: js.Array[Anon_Label],
    verified: Boolean
  ): Person = {
    val __obj = js.Dynamic.literal(aboutMe = aboutMe.asInstanceOf[js.Any], ageRange = ageRange.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], braggingRights = braggingRights.asInstanceOf[js.Any], circledByCount = circledByCount.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], isPlusUser = isPlusUser.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], occupation = occupation.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], placesLived = placesLived.asInstanceOf[js.Any], plusOneCount = plusOneCount.asInstanceOf[js.Any], relationshipStatus = relationshipStatus.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Person]
  }
}


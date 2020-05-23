package typings.gapiPlus.gapi.client.plus.people

import typings.gapiPlus.anon.CoverInfo
import typings.gapiPlus.anon.Department
import typings.gapiPlus.anon.FamilyName
import typings.gapiPlus.anon.Label
import typings.gapiPlus.anon.Max
import typings.gapiPlus.anon.Primary
import typings.gapiPlus.anon.Type
import typings.gapiPlus.anon.Url
import typings.gapiPlus.gapiPlusStrings.plusNumbersignperson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  var aboutMe: String
  var ageRange: Max
  var birthday: String
  var braggingRights: String
  var circledByCount: Double
  var cover: CoverInfo
  var displayName: String
  var domain: String
  var emails: js.Array[Type]
  var etag: String
  var gender: String
  var id: String
  var image: Url
  var isPlusUser: Boolean
  var kind: plusNumbersignperson
  var language: String
  var name: FamilyName
  var nickname: String
  var objectType: String
  var occupation: String
  var organizations: js.Array[Department]
  var placesLived: js.Array[Primary]
  var plusOneCount: Double
  var relationshipStatus: String
  var skills: String
  var tagline: String
  var url: String
  var urls: js.Array[Label]
  var verified: Boolean
}

object Person {
  @scala.inline
  def apply(
    aboutMe: String,
    ageRange: Max,
    birthday: String,
    braggingRights: String,
    circledByCount: Double,
    cover: CoverInfo,
    displayName: String,
    domain: String,
    emails: js.Array[Type],
    etag: String,
    gender: String,
    id: String,
    image: Url,
    isPlusUser: Boolean,
    kind: plusNumbersignperson,
    language: String,
    name: FamilyName,
    nickname: String,
    objectType: String,
    occupation: String,
    organizations: js.Array[Department],
    placesLived: js.Array[Primary],
    plusOneCount: Double,
    relationshipStatus: String,
    skills: String,
    tagline: String,
    url: String,
    urls: js.Array[Label],
    verified: Boolean
  ): Person = {
    val __obj = js.Dynamic.literal(aboutMe = aboutMe.asInstanceOf[js.Any], ageRange = ageRange.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], braggingRights = braggingRights.asInstanceOf[js.Any], circledByCount = circledByCount.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], isPlusUser = isPlusUser.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], occupation = occupation.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], placesLived = placesLived.asInstanceOf[js.Any], plusOneCount = plusOneCount.asInstanceOf[js.Any], relationshipStatus = relationshipStatus.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
}


package typings.gapiDotPlus.gapiNs.clientNs.plusNs.peopleNs

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
    val __obj = js.Dynamic.literal(aboutMe = aboutMe, ageRange = ageRange, birthday = birthday, braggingRights = braggingRights, circledByCount = circledByCount, cover = cover, displayName = displayName, domain = domain, emails = emails, etag = etag, gender = gender, id = id, image = image, isPlusUser = isPlusUser, kind = kind, language = language, name = name, nickname = nickname, objectType = objectType, occupation = occupation, organizations = organizations, placesLived = placesLived, plusOneCount = plusOneCount, relationshipStatus = relationshipStatus, skills = skills, tagline = tagline, url = url, urls = urls, verified = verified)
  
    __obj.asInstanceOf[Person]
  }
}


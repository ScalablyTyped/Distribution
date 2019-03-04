package typings
package gapiDotPlusLib.gapiNs.clientNs.plusNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  var aboutMe: java.lang.String
  var ageRange: gapiDotPlusLib.Anon_Max
  var birthday: java.lang.String
  var braggingRights: java.lang.String
  var circledByCount: scala.Double
  var cover: gapiDotPlusLib.Anon_CoverInfo
  var displayName: java.lang.String
  var domain: java.lang.String
  var emails: js.Array[gapiDotPlusLib.Anon_Type]
  var etag: java.lang.String
  var gender: java.lang.String
  var id: java.lang.String
  var image: gapiDotPlusLib.Anon_Url
  var isPlusUser: scala.Boolean
  var kind: gapiDotPlusLib.gapiDotPlusLibStrings.`plus#person`
  var language: java.lang.String
  var name: gapiDotPlusLib.Anon_FamilyName
  var nickname: java.lang.String
  var objectType: java.lang.String
  var occupation: java.lang.String
  var organizations: js.Array[gapiDotPlusLib.Anon_Department]
  var placesLived: js.Array[gapiDotPlusLib.Anon_Primary]
  var plusOneCount: scala.Double
  var relationshipStatus: java.lang.String
  var skills: java.lang.String
  var tagline: java.lang.String
  var url: java.lang.String
  var urls: js.Array[gapiDotPlusLib.Anon_Label]
  var verified: scala.Boolean
}

object Person {
  @scala.inline
  def apply(
    aboutMe: java.lang.String,
    ageRange: gapiDotPlusLib.Anon_Max,
    birthday: java.lang.String,
    braggingRights: java.lang.String,
    circledByCount: scala.Double,
    cover: gapiDotPlusLib.Anon_CoverInfo,
    displayName: java.lang.String,
    domain: java.lang.String,
    emails: js.Array[gapiDotPlusLib.Anon_Type],
    etag: java.lang.String,
    gender: java.lang.String,
    id: java.lang.String,
    image: gapiDotPlusLib.Anon_Url,
    isPlusUser: scala.Boolean,
    kind: gapiDotPlusLib.gapiDotPlusLibStrings.`plus#person`,
    language: java.lang.String,
    name: gapiDotPlusLib.Anon_FamilyName,
    nickname: java.lang.String,
    objectType: java.lang.String,
    occupation: java.lang.String,
    organizations: js.Array[gapiDotPlusLib.Anon_Department],
    placesLived: js.Array[gapiDotPlusLib.Anon_Primary],
    plusOneCount: scala.Double,
    relationshipStatus: java.lang.String,
    skills: java.lang.String,
    tagline: java.lang.String,
    url: java.lang.String,
    urls: js.Array[gapiDotPlusLib.Anon_Label],
    verified: scala.Boolean
  ): Person = {
    val __obj = js.Dynamic.literal(aboutMe = aboutMe, ageRange = ageRange, birthday = birthday, braggingRights = braggingRights, circledByCount = circledByCount, cover = cover, displayName = displayName, domain = domain, emails = emails, etag = etag, gender = gender, id = id, image = image, isPlusUser = isPlusUser, kind = kind, language = language, name = name, nickname = nickname, objectType = objectType, occupation = occupation, organizations = organizations, placesLived = placesLived, plusOneCount = plusOneCount, relationshipStatus = relationshipStatus, skills = skills, tagline = tagline, url = url, urls = urls, verified = verified)
  
    __obj.asInstanceOf[Person]
  }
}


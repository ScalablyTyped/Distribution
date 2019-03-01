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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aboutMe")(aboutMe)
    __obj.updateDynamic("ageRange")(ageRange)
    __obj.updateDynamic("birthday")(birthday)
    __obj.updateDynamic("braggingRights")(braggingRights)
    __obj.updateDynamic("circledByCount")(circledByCount)
    __obj.updateDynamic("cover")(cover)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("emails")(emails)
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("gender")(gender)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("isPlusUser")(isPlusUser)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nickname")(nickname)
    __obj.updateDynamic("objectType")(objectType)
    __obj.updateDynamic("occupation")(occupation)
    __obj.updateDynamic("organizations")(organizations)
    __obj.updateDynamic("placesLived")(placesLived)
    __obj.updateDynamic("plusOneCount")(plusOneCount)
    __obj.updateDynamic("relationshipStatus")(relationshipStatus)
    __obj.updateDynamic("skills")(skills)
    __obj.updateDynamic("tagline")(tagline)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("urls")(urls)
    __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[Person]
  }
}


package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var displayName: java.lang.String
  var displayNameLastFirst: java.lang.String
  var familyName: java.lang.String
  var givenName: java.lang.String
  var honorificPrefix: java.lang.String
  var honorificSuffix: java.lang.String
  var metadata: FieldMetadata
  var middleName: java.lang.String
  var phoneticFamilyName: java.lang.String
  var phoneticFullName: java.lang.String
  var phoneticGivenName: java.lang.String
  var phoneticHonorificPrefix: java.lang.String
  var phoneticHonorificSuffix: java.lang.String
  var phoneticMiddleName: java.lang.String
}

object Name {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    displayNameLastFirst: java.lang.String,
    familyName: java.lang.String,
    givenName: java.lang.String,
    honorificPrefix: java.lang.String,
    honorificSuffix: java.lang.String,
    metadata: FieldMetadata,
    middleName: java.lang.String,
    phoneticFamilyName: java.lang.String,
    phoneticFullName: java.lang.String,
    phoneticGivenName: java.lang.String,
    phoneticHonorificPrefix: java.lang.String,
    phoneticHonorificSuffix: java.lang.String,
    phoneticMiddleName: java.lang.String
  ): Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("displayNameLastFirst")(displayNameLastFirst)
    __obj.updateDynamic("familyName")(familyName)
    __obj.updateDynamic("givenName")(givenName)
    __obj.updateDynamic("honorificPrefix")(honorificPrefix)
    __obj.updateDynamic("honorificSuffix")(honorificSuffix)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("middleName")(middleName)
    __obj.updateDynamic("phoneticFamilyName")(phoneticFamilyName)
    __obj.updateDynamic("phoneticFullName")(phoneticFullName)
    __obj.updateDynamic("phoneticGivenName")(phoneticGivenName)
    __obj.updateDynamic("phoneticHonorificPrefix")(phoneticHonorificPrefix)
    __obj.updateDynamic("phoneticHonorificSuffix")(phoneticHonorificSuffix)
    __obj.updateDynamic("phoneticMiddleName")(phoneticMiddleName)
    __obj.asInstanceOf[Name]
  }
}


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
    val __obj = js.Dynamic.literal(displayName = displayName, displayNameLastFirst = displayNameLastFirst, familyName = familyName, givenName = givenName, honorificPrefix = honorificPrefix, honorificSuffix = honorificSuffix, metadata = metadata, middleName = middleName, phoneticFamilyName = phoneticFamilyName, phoneticFullName = phoneticFullName, phoneticGivenName = phoneticGivenName, phoneticHonorificPrefix = phoneticHonorificPrefix, phoneticHonorificSuffix = phoneticHonorificSuffix, phoneticMiddleName = phoneticMiddleName)
  
    __obj.asInstanceOf[Name]
  }
}


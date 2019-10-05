package typings.gapiDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var displayName: String
  var displayNameLastFirst: String
  var familyName: String
  var givenName: String
  var honorificPrefix: String
  var honorificSuffix: String
  var metadata: FieldMetadata
  var middleName: String
  var phoneticFamilyName: String
  var phoneticFullName: String
  var phoneticGivenName: String
  var phoneticHonorificPrefix: String
  var phoneticHonorificSuffix: String
  var phoneticMiddleName: String
}

object Name {
  @scala.inline
  def apply(
    displayName: String,
    displayNameLastFirst: String,
    familyName: String,
    givenName: String,
    honorificPrefix: String,
    honorificSuffix: String,
    metadata: FieldMetadata,
    middleName: String,
    phoneticFamilyName: String,
    phoneticFullName: String,
    phoneticGivenName: String,
    phoneticHonorificPrefix: String,
    phoneticHonorificSuffix: String,
    phoneticMiddleName: String
  ): Name = {
    val __obj = js.Dynamic.literal(displayName = displayName, displayNameLastFirst = displayNameLastFirst, familyName = familyName, givenName = givenName, honorificPrefix = honorificPrefix, honorificSuffix = honorificSuffix, metadata = metadata, middleName = middleName, phoneticFamilyName = phoneticFamilyName, phoneticFullName = phoneticFullName, phoneticGivenName = phoneticGivenName, phoneticHonorificPrefix = phoneticHonorificPrefix, phoneticHonorificSuffix = phoneticHonorificSuffix, phoneticMiddleName = phoneticMiddleName)
  
    __obj.asInstanceOf[Name]
  }
}


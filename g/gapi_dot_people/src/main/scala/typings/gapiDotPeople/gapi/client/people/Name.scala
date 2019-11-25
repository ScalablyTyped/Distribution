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
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], displayNameLastFirst = displayNameLastFirst.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], honorificPrefix = honorificPrefix.asInstanceOf[js.Any], honorificSuffix = honorificSuffix.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any], phoneticFamilyName = phoneticFamilyName.asInstanceOf[js.Any], phoneticFullName = phoneticFullName.asInstanceOf[js.Any], phoneticGivenName = phoneticGivenName.asInstanceOf[js.Any], phoneticHonorificPrefix = phoneticHonorificPrefix.asInstanceOf[js.Any], phoneticHonorificSuffix = phoneticHonorificSuffix.asInstanceOf[js.Any], phoneticMiddleName = phoneticMiddleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Name]
  }
}


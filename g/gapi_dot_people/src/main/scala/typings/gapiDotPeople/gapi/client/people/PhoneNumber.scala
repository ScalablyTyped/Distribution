package typings.gapiDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumber extends js.Object {
  var canonicalForm: String
  var formattedType: String
  var metadata: FieldMetadata
  var `type`: String
  var value: String
}

object PhoneNumber {
  @scala.inline
  def apply(
    canonicalForm: String,
    formattedType: String,
    metadata: FieldMetadata,
    `type`: String,
    value: String
  ): PhoneNumber = {
    val __obj = js.Dynamic.literal(canonicalForm = canonicalForm.asInstanceOf[js.Any], formattedType = formattedType.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
}


package typings.gapiDotPeople.gapiNs.clientNs.peopleNs

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
    val __obj = js.Dynamic.literal(canonicalForm = canonicalForm, formattedType = formattedType, metadata = metadata, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PhoneNumber]
  }
}


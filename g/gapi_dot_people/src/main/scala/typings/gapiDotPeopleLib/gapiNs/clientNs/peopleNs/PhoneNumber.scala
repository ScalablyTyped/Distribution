package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumber extends js.Object {
  var canonicalForm: java.lang.String
  var formattedType: java.lang.String
  var metadata: FieldMetadata
  var `type`: java.lang.String
  var value: java.lang.String
}

object PhoneNumber {
  @scala.inline
  def apply(
    canonicalForm: java.lang.String,
    formattedType: java.lang.String,
    metadata: FieldMetadata,
    `type`: java.lang.String,
    value: java.lang.String
  ): PhoneNumber = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("canonicalForm")(canonicalForm)
    __obj.updateDynamic("formattedType")(formattedType)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PhoneNumber]
  }
}


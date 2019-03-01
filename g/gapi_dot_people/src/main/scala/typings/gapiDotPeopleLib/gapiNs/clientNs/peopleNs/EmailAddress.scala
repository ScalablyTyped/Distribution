package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailAddress extends js.Object {
  var displayName: java.lang.String
  var formattedType: java.lang.String
  var metadata: FieldMetadata
  var `type`: java.lang.String
  var value: java.lang.String
}

object EmailAddress {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    formattedType: java.lang.String,
    metadata: FieldMetadata,
    `type`: java.lang.String,
    value: java.lang.String
  ): EmailAddress = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("formattedType")(formattedType)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EmailAddress]
  }
}


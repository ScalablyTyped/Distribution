package typings.gapiDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailAddress extends js.Object {
  var displayName: String
  var formattedType: String
  var metadata: FieldMetadata
  var `type`: String
  var value: String
}

object EmailAddress {
  @scala.inline
  def apply(displayName: String, formattedType: String, metadata: FieldMetadata, `type`: String, value: String): EmailAddress = {
    val __obj = js.Dynamic.literal(displayName = displayName, formattedType = formattedType, metadata = metadata, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EmailAddress]
  }
}


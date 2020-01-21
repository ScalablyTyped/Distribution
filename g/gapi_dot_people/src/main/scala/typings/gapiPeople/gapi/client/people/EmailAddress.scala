package typings.gapiPeople.gapi.client.people

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
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], formattedType = formattedType.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAddress]
  }
}


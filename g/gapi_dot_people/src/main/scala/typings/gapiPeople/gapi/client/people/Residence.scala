package typings.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Residence extends js.Object {
  var current: Boolean
  var metadata: FieldMetadata
  var value: String
}

object Residence {
  @scala.inline
  def apply(current: Boolean, metadata: FieldMetadata, value: String): Residence = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Residence]
  }
}


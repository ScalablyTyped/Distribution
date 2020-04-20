package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtocolMethodDescription extends js.Object {
  /**
    * Whether this method is required or optional.
    */
  var required: Boolean
  /**
    * Method signature.
    */
  var types: String
}

object ProtocolMethodDescription {
  @scala.inline
  def apply(required: Boolean, types: String): ProtocolMethodDescription = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolMethodDescription]
  }
}


package typings
package fridaDashGumLib.ObjCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtocolMethodDescription extends js.Object {
  /**
    * Whether this method is required or optional.
    */
  var required: scala.Boolean
  /**
    * Method signature.
    */
  var types: java.lang.String
}

object ProtocolMethodDescription {
  @scala.inline
  def apply(required: scala.Boolean, types: java.lang.String): ProtocolMethodDescription = {
    val __obj = js.Dynamic.literal(required = required, types = types)
  
    __obj.asInstanceOf[ProtocolMethodDescription]
  }
}


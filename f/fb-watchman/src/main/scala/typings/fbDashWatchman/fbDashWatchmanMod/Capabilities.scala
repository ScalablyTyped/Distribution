package typings.fbDashWatchman.fbDashWatchmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capabilities extends js.Object {
  var optional: js.Array[_]
  var required: js.Array[_]
}

object Capabilities {
  @scala.inline
  def apply(optional: js.Array[_], required: js.Array[_]): Capabilities = {
    val __obj = js.Dynamic.literal(optional = optional, required = required)
  
    __obj.asInstanceOf[Capabilities]
  }
}


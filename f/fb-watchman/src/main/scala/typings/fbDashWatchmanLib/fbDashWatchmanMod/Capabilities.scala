package typings
package fbDashWatchmanLib.fbDashWatchmanMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("optional")(optional)
    __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[Capabilities]
  }
}


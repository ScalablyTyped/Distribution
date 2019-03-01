package typings
package glLib.glMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STACKGL_destroy_context extends js.Object {
  def destroy(): scala.Unit
}

object STACKGL_destroy_context {
  @scala.inline
  def apply(destroy: js.Function0[scala.Unit]): STACKGL_destroy_context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.asInstanceOf[STACKGL_destroy_context]
  }
}


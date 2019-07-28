package typings.gl.glMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STACKGL_destroy_context extends js.Object {
  def destroy(): Unit
}

object STACKGL_destroy_context {
  @scala.inline
  def apply(destroy: () => Unit): STACKGL_destroy_context = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[STACKGL_destroy_context]
  }
}


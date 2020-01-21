package typings.gl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STACKGLDestroyContext extends js.Object {
  def destroy(): Unit
}

object STACKGLDestroyContext {
  @scala.inline
  def apply(destroy: () => Unit): STACKGLDestroyContext = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[STACKGLDestroyContext]
  }
}


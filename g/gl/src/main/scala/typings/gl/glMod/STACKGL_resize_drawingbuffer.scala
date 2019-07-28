package typings.gl.glMod

import typings.std.GLint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STACKGL_resize_drawingbuffer extends js.Object {
  def resize(width: GLint, height: GLint): Unit
}

object STACKGL_resize_drawingbuffer {
  @scala.inline
  def apply(resize: (GLint, GLint) => Unit): STACKGL_resize_drawingbuffer = {
    val __obj = js.Dynamic.literal(resize = js.Any.fromFunction2(resize))
  
    __obj.asInstanceOf[STACKGL_resize_drawingbuffer]
  }
}


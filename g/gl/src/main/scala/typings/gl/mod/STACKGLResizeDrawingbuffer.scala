package typings.gl.mod

import typings.std.GLint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STACKGLResizeDrawingbuffer extends js.Object {
  def resize(width: GLint, height: GLint): Unit
}

object STACKGLResizeDrawingbuffer {
  @scala.inline
  def apply(resize: (GLint, GLint) => Unit): STACKGLResizeDrawingbuffer = {
    val __obj = js.Dynamic.literal(resize = js.Any.fromFunction2(resize))
  
    __obj.asInstanceOf[STACKGLResizeDrawingbuffer]
  }
}


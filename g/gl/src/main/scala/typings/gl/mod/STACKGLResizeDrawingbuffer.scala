package typings.gl.mod

import typings.std.GLint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait STACKGLResizeDrawingbuffer extends js.Object {
  def resize(width: GLint, height: GLint): Unit = js.native
}

object STACKGLResizeDrawingbuffer {
  @scala.inline
  def apply(resize: (GLint, GLint) => Unit): STACKGLResizeDrawingbuffer = {
    val __obj = js.Dynamic.literal(resize = js.Any.fromFunction2(resize))
    __obj.asInstanceOf[STACKGLResizeDrawingbuffer]
  }
  @scala.inline
  implicit class STACKGLResizeDrawingbufferOps[Self <: STACKGLResizeDrawingbuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResize(value: (GLint, GLint) => Unit): Self = this.set("resize", js.Any.fromFunction2(value))
  }
  
}


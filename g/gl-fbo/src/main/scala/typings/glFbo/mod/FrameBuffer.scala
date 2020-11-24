package typings.glFbo.mod

import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameBuffer extends js.Object {
  
  def bind(): Unit = js.native
  
  var color: js.Array[Texture] = js.native
  
  var depth: Texture | Null = js.native
  
  def dispose(): Unit = js.native
  
  var gl: WebGLRenderingContext = js.native
  
  var handle: WebGLFramebuffer = js.native
  
  var shape: js.Tuple2[Double, Double] = js.native
}
object FrameBuffer {
  
  @scala.inline
  def apply(
    bind: () => Unit,
    color: js.Array[Texture],
    dispose: () => Unit,
    gl: WebGLRenderingContext,
    handle: WebGLFramebuffer,
    shape: js.Tuple2[Double, Double]
  ): FrameBuffer = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), color = color.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), gl = gl.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameBuffer]
  }
  
  @scala.inline
  implicit class FrameBufferOps[Self <: FrameBuffer] (val x: Self) extends AnyVal {
    
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
    def setBind(value: () => Unit): Self = this.set("bind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColorVarargs(value: Texture*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: js.Array[Texture]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGl(value: WebGLRenderingContext): Self = this.set("gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: WebGLFramebuffer): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: js.Tuple2[Double, Double]): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Texture): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthNull: Self = this.set("depth", null)
  }
}

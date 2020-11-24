package typings.glReact.mod

import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Framebuffer extends js.Object {
  
  def bind(): Unit = js.native
  
  var color: WebGLTexture = js.native
  
  def dispose(): Unit = js.native
  
  var handle: WebGLFramebuffer = js.native
  
  def syncSize(w: Double, h: Double): Unit = js.native
}
object Framebuffer {
  
  @scala.inline
  def apply(
    bind: () => Unit,
    color: WebGLTexture,
    dispose: () => Unit,
    handle: WebGLFramebuffer,
    syncSize: (Double, Double) => Unit
  ): Framebuffer = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), color = color.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), handle = handle.asInstanceOf[js.Any], syncSize = js.Any.fromFunction2(syncSize))
    __obj.asInstanceOf[Framebuffer]
  }
  
  @scala.inline
  implicit class FramebufferOps[Self <: Framebuffer] (val x: Self) extends AnyVal {
    
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
    def setColor(value: WebGLTexture): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandle(value: WebGLFramebuffer): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncSize(value: (Double, Double) => Unit): Self = this.set("syncSize", js.Any.fromFunction2(value))
  }
}

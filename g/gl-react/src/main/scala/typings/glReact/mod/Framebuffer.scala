package typings.glReact.mod

import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Framebuffer extends StObject {
  
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
  implicit class FramebufferMutableBuilder[Self <: Framebuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBind(value: () => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColor(value: WebGLTexture): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandle(value: WebGLFramebuffer): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncSize(value: (Double, Double) => Unit): Self = StObject.set(x, "syncSize", js.Any.fromFunction2(value))
  }
}

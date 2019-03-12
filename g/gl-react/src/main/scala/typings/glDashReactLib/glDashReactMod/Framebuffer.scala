package typings
package glDashReactLib.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Framebuffer extends js.Object {
  var color: stdLib.WebGLTexture
  var handle: stdLib.WebGLFramebuffer
  def bind(): scala.Unit
  def dispose(): scala.Unit
  def syncSize(w: scala.Double, h: scala.Double): scala.Unit
}

object Framebuffer {
  @scala.inline
  def apply(
    bind: () => scala.Unit,
    color: stdLib.WebGLTexture,
    dispose: () => scala.Unit,
    handle: stdLib.WebGLFramebuffer,
    syncSize: (scala.Double, scala.Double) => scala.Unit
  ): Framebuffer = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), color = color, dispose = js.Any.fromFunction0(dispose), handle = handle, syncSize = js.Any.fromFunction2(syncSize))
  
    __obj.asInstanceOf[Framebuffer]
  }
}


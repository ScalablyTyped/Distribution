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
    bind: js.Function0[scala.Unit],
    color: stdLib.WebGLTexture,
    dispose: js.Function0[scala.Unit],
    handle: stdLib.WebGLFramebuffer,
    syncSize: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): Framebuffer = {
    val __obj = js.Dynamic.literal(bind = bind, color = color, dispose = dispose, handle = handle, syncSize = syncSize)
  
    __obj.asInstanceOf[Framebuffer]
  }
}


package typings.glReact.mod

import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Framebuffer extends js.Object {
  var color: WebGLTexture
  var handle: WebGLFramebuffer
  def bind(): Unit
  def dispose(): Unit
  def syncSize(w: Double, h: Double): Unit
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
}


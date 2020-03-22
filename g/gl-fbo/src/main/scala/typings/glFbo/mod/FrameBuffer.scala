package typings.glFbo.mod

import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameBuffer extends js.Object {
  var color: js.Array[Texture]
  var depth: Texture | Null
  var gl: WebGLRenderingContext
  var handle: WebGLFramebuffer
  var shape: js.Tuple2[Double, Double]
  def bind(): Unit
  def dispose(): Unit
}

object FrameBuffer {
  @scala.inline
  def apply(
    bind: () => Unit,
    color: js.Array[Texture],
    dispose: () => Unit,
    gl: WebGLRenderingContext,
    handle: WebGLFramebuffer,
    shape: js.Tuple2[Double, Double],
    depth: Texture = null
  ): FrameBuffer = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), color = color.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), gl = gl.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameBuffer]
  }
}


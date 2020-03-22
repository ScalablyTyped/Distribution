package typings.glFbo.mod

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-fbo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(gl: WebGLRenderingContext, shape: js.Tuple2[Double, Double]): FrameBuffer = js.native
  def apply(gl: WebGLRenderingContext, shape: js.Tuple2[Double, Double], options: FrameBufferOptions): FrameBuffer = js.native
}


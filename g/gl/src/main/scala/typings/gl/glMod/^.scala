package typings.gl.glMod

import typings.std.WebGLContextAttributes
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(width: Double, height: Double): WebGLRenderingContext with StackGLExtension = js.native
  def apply(width: Double, height: Double, options: WebGLContextAttributes): WebGLRenderingContext with StackGLExtension = js.native
}


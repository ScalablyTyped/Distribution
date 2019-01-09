package typings
package glDashShaderLib.glDashShaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-shader", JSImport.Namespace)
@js.native
object glDashShaderModMembers extends js.Object {
  def apply(gl: stdLib.WebGLRenderingContext, options: glDashShaderLib.Anon_Attributes): Shader = js.native
  def apply(gl: stdLib.WebGLRenderingContext, vertex: java.lang.String, fragment: java.lang.String): Shader = js.native
  def apply(
    gl: stdLib.WebGLRenderingContext,
    vertex: java.lang.String,
    fragment: java.lang.String,
    uniforms: js.Array[Parameter]
  ): Shader = js.native
  def apply(
    gl: stdLib.WebGLRenderingContext,
    vertex: java.lang.String,
    fragment: java.lang.String,
    uniforms: js.Array[Parameter],
    attributes: js.Array[Parameter]
  ): Shader = js.native
}


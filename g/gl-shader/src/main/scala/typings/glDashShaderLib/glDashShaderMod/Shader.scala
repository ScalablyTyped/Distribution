package typings
package glDashShaderLib.glDashShaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shader extends js.Object {
  val attributes: org.scalablytyped.runtime.StringDictionary[Attribute with js.Array[_]] = js.native
  val fragShader: stdLib.WebGLShader = js.native
  val gl: stdLib.WebGLRenderingContext = js.native
  val program: stdLib.WebGLProgram = js.native
  var uniforms: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  val vertShader: stdLib.WebGLShader = js.native
  def bind(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def update(obj: glDashShaderLib.Anon_Fragment): scala.Unit = js.native
  def update(vertex: java.lang.String, fragment: java.lang.String): scala.Unit = js.native
  def update(vertex: java.lang.String, fragment: java.lang.String, uniforms: js.Array[Parameter]): scala.Unit = js.native
  def update(
    vertex: java.lang.String,
    fragment: java.lang.String,
    uniforms: js.Array[Parameter],
    attributes: js.Array[Parameter]
  ): scala.Unit = js.native
}


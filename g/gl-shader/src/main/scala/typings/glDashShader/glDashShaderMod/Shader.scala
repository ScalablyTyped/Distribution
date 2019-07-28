package typings.glDashShader.glDashShaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.glDashShader.Anon_AttributesFragment
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLShader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shader extends js.Object {
  val attributes: StringDictionary[Attribute with js.Array[_]] = js.native
  val fragShader: WebGLShader = js.native
  val gl: WebGLRenderingContext = js.native
  val program: WebGLProgram = js.native
  var uniforms: StringDictionary[js.Any] = js.native
  val vertShader: WebGLShader = js.native
  def bind(): Unit = js.native
  def dispose(): Unit = js.native
  def update(obj: Anon_AttributesFragment): Unit = js.native
  def update(vertex: String, fragment: String): Unit = js.native
  def update(vertex: String, fragment: String, uniforms: js.Array[Parameter]): Unit = js.native
  def update(vertex: String, fragment: String, uniforms: js.Array[Parameter], attributes: js.Array[Parameter]): Unit = js.native
}


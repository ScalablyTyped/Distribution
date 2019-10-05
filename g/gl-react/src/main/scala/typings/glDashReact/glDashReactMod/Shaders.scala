package typings.glDashReact.glDashReactMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react", "Shaders")
@js.native
object Shaders extends js.Object {
  def create(shaders: StringDictionary[ShaderDefinition]): ShadersSheet = js.native
  def get(shaderIdentifier: ShaderIdentifier): ShaderInfo = js.native
  def getName(shaderIdentifier: ShaderIdentifier): String = js.native
  def getShortName(shaderIdentifier: ShaderIdentifier): String = js.native
}


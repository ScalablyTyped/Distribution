package typings.glReact.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Shaders {
  
  @JSImport("gl-react", "Shaders.create")
  @js.native
  def create(shaders: StringDictionary[ShaderDefinition]): ShadersSheet = js.native
  
  @JSImport("gl-react", "Shaders.get")
  @js.native
  def get(shaderIdentifier: ShaderIdentifier): ShaderInfo = js.native
  
  @JSImport("gl-react", "Shaders.getName")
  @js.native
  def getName(shaderIdentifier: ShaderIdentifier): String = js.native
  
  @JSImport("gl-react", "Shaders.getShortName")
  @js.native
  def getShortName(shaderIdentifier: ShaderIdentifier): String = js.native
}

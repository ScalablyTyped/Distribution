package typings.glReact.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Shaders {
  
  @JSImport("gl-react", "Shaders")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(shaders: StringDictionary[ShaderDefinition]): ShadersSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(shaders.asInstanceOf[js.Any]).asInstanceOf[ShadersSheet]
  
  inline def get(shaderIdentifier: ShaderIdentifier): ShaderInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(shaderIdentifier.asInstanceOf[js.Any]).asInstanceOf[ShaderInfo]
  
  inline def getName(shaderIdentifier: ShaderIdentifier): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(shaderIdentifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getShortName(shaderIdentifier: ShaderIdentifier): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortName")(shaderIdentifier.asInstanceOf[js.Any]).asInstanceOf[String]
}

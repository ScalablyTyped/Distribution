package typings.expoMetroConfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildGetModulesPathsMod {
  
  @JSImport("@expo/metro-config/build/getModulesPaths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getModulesPaths(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModulesPaths")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getWorkspaceRoot(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspaceRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

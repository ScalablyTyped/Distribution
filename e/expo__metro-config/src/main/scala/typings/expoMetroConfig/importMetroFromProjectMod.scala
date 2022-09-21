package typings.expoMetroConfig

import typings.expoMetroConfig.anon.TypeofMetroConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importMetroFromProjectMod {
  
  @JSImport("@expo/metro-config/build/importMetroFromProject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def importMetroConfigFromProject(projectRoot: String): TypeofMetroConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("importMetroConfigFromProject")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[TypeofMetroConfig]
  
  inline def importMetroSourceMapFromProject(projectRoot: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("importMetroSourceMapFromProject")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Any]
}

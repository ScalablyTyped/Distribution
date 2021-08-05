package typings.globalModulesPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("global-modules-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPath(module: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(module.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def getPath(module: String, executable: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(module.asInstanceOf[js.Any], executable.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}

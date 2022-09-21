package typings.expoXcpretty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNodeModuleNameMod {
  
  @JSImport("@expo/xcpretty/build/utils/getNodeModuleName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNodeModuleName(filePath: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeModuleName")(filePath.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

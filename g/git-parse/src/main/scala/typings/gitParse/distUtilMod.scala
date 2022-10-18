package typings.gitParse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilMod {
  
  @JSImport("git-parse/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveHome(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveHome")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validatePath(resolvedPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePath")(resolvedPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

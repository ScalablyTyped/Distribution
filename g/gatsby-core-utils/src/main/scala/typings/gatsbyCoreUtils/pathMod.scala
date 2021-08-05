package typings.gatsbyCoreUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("gatsby-core-utils/dist/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNodeInternalModulePath(fileName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeInternalModulePath")(fileName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def joinPath(paths: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinPath")(paths.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def slash(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slash")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}

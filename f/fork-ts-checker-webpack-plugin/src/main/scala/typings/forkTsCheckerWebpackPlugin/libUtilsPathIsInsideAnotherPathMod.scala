package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsPathIsInsideAnotherPathMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/utils/path/is-inside-another-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isInsideAnotherPath(parent: String, directory: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInsideAnotherPath")(parent.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

package typings.faviconsWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerMod {
  
  @JSImport("favicons-webpack-plugin/src/compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPublicPath(faviconsPublicPath: js.Any, compilerPublicPath: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublicPath")(faviconsPublicPath.asInstanceOf[js.Any], compilerPublicPath.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def run(faviconOptions: js.Any, context: js.Any, compilation: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(faviconOptions.asInstanceOf[js.Any], context.asInstanceOf[js.Any], compilation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}

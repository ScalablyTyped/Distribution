package typings.devtools

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildScriptsCreateWindowMod {
  
  @JSImport("devtools/build/scripts/createWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String, features: String): Window | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[Window | Null]
}

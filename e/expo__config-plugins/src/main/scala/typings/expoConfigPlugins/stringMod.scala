package typings.expoConfigPlugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("@expo/config-plugins/build/ios/utils/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def trimQuotes(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimQuotes")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}

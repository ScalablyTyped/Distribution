package typings.firebaseAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigatorMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/core/util/navigator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUserLanguage(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_getUserLanguage")().asInstanceOf[String | Null]
  
  inline def isOnline(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isOnline")().asInstanceOf[Boolean]
}

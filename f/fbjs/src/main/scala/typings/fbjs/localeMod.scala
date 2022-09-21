package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeMod {
  
  @JSImport("fbjs/lib/Locale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isRTL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRTL")().asInstanceOf[Boolean]
}

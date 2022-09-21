package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isEventSupportedMod {
  
  inline def apply(eventNameSuffix: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(eventNameSuffix.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(eventNameSuffix: String, capture: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(eventNameSuffix.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("fbjs/lib/isEventSupported", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

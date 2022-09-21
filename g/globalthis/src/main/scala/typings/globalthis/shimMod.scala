package typings.globalthis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimMod {
  
  /**
    * Installs the `globalThis` property onto the global object.
    */
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  
  @JSImport("globalthis/shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

package typings.esrever

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object esrever {
    
    @JSGlobal("esrever")
    @js.native
    val ^ : js.Any = js.native
    
    inline def reverse(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("esrever.version")
    @js.native
    val version: String = js.native
  }
}

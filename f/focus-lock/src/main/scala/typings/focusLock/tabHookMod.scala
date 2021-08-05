package typings.focusLock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabHookMod {
  
  object default {
    
    @JSImport("focus-lock/dist/es5/tabHook", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def attach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")().asInstanceOf[Unit]
    
    inline def detach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")().asInstanceOf[Unit]
  }
}

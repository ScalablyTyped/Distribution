package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessOpts extends StObject {
  
  var autoRestart: js.UndefOr[Boolean] = js.undefined
  
  var detached: js.UndefOr[Boolean] = js.undefined
  
  var shell: js.UndefOr[Boolean] = js.undefined
}
object ProcessOpts {
  
  inline def apply(): ProcessOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessOpts]
  }
  
  extension [Self <: ProcessOpts](x: Self) {
    
    inline def setAutoRestart(value: Boolean): Self = StObject.set(x, "autoRestart", value.asInstanceOf[js.Any])
    
    inline def setAutoRestartUndefined: Self = StObject.set(x, "autoRestart", js.undefined)
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setShell(value: Boolean): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
  }
}

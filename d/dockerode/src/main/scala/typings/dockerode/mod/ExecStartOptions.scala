package typings.dockerode.mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecStartOptions extends StObject {
  
  // Detach and Tty are used by Docker's API
  var Detach: js.UndefOr[Boolean] = js.undefined
  
  var Tty: js.UndefOr[Boolean] = js.undefined
  
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
  
  // hijack and stdin are used by docker-modem
  var hijack: js.UndefOr[Boolean] = js.undefined
  
  var stdin: js.UndefOr[Boolean] = js.undefined
}
object ExecStartOptions {
  
  inline def apply(): ExecStartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecStartOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecStartOptions] (val x: Self) extends AnyVal {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setDetach(value: Boolean): Self = StObject.set(x, "Detach", value.asInstanceOf[js.Any])
    
    inline def setDetachUndefined: Self = StObject.set(x, "Detach", js.undefined)
    
    inline def setHijack(value: Boolean): Self = StObject.set(x, "hijack", value.asInstanceOf[js.Any])
    
    inline def setHijackUndefined: Self = StObject.set(x, "hijack", js.undefined)
    
    inline def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    inline def setTty(value: Boolean): Self = StObject.set(x, "Tty", value.asInstanceOf[js.Any])
    
    inline def setTtyUndefined: Self = StObject.set(x, "Tty", js.undefined)
  }
}

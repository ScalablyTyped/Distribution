package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecStartOptions extends StObject {
  
  // Detach and Tty are used by Docker's API
  var Detach: js.UndefOr[Boolean] = js.undefined
  
  var Tty: js.UndefOr[Boolean] = js.undefined
  
  // hijack and stdin are used by docker-modem
  var hijack: js.UndefOr[Boolean] = js.undefined
  
  var stdin: js.UndefOr[Boolean] = js.undefined
}
object ExecStartOptions {
  
  @scala.inline
  def apply(): ExecStartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecStartOptions]
  }
  
  @scala.inline
  implicit class ExecStartOptionsMutableBuilder[Self <: ExecStartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetach(value: Boolean): Self = StObject.set(x, "Detach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachUndefined: Self = StObject.set(x, "Detach", js.undefined)
    
    @scala.inline
    def setHijack(value: Boolean): Self = StObject.set(x, "hijack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHijackUndefined: Self = StObject.set(x, "hijack", js.undefined)
    
    @scala.inline
    def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    @scala.inline
    def setTty(value: Boolean): Self = StObject.set(x, "Tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtyUndefined: Self = StObject.set(x, "Tty", js.undefined)
  }
}

package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to register a debuggee.
  */
trait SchemaRegisterDebuggeeRequest extends StObject {
  
  /**
    * Debuggee information to register. The fields `project`, `uniquifier`,
    * `description` and `agent_version` of the debuggee must be set.
    */
  var debuggee: js.UndefOr[SchemaDebuggee] = js.undefined
}
object SchemaRegisterDebuggeeRequest {
  
  @scala.inline
  def apply(): SchemaRegisterDebuggeeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegisterDebuggeeRequest]
  }
  
  @scala.inline
  implicit class SchemaRegisterDebuggeeRequestMutableBuilder[Self <: SchemaRegisterDebuggeeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebuggee(value: SchemaDebuggee): Self = StObject.set(x, "debuggee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggeeUndefined: Self = StObject.set(x, "debuggee", js.undefined)
  }
}

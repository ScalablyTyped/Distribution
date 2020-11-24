package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to register a debuggee.
  */
@js.native
trait SchemaRegisterDebuggeeRequest extends js.Object {
  
  /**
    * Debuggee information to register. The fields `project`, `uniquifier`,
    * `description` and `agent_version` of the debuggee must be set.
    */
  var debuggee: js.UndefOr[SchemaDebuggee] = js.native
}
object SchemaRegisterDebuggeeRequest {
  
  @scala.inline
  def apply(): SchemaRegisterDebuggeeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegisterDebuggeeRequest]
  }
  
  @scala.inline
  implicit class SchemaRegisterDebuggeeRequestOps[Self <: SchemaRegisterDebuggeeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDebuggee(value: SchemaDebuggee): Self = this.set("debuggee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebuggee: Self = this.set("debuggee", js.undefined)
  }
}

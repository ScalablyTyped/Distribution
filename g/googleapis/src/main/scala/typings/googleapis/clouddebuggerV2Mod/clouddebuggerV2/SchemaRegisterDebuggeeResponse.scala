package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for registering a debuggee.
  */
@js.native
trait SchemaRegisterDebuggeeResponse extends js.Object {
  
  /**
    * Debuggee resource. The field `id` is guaranteed to be set (in addition to
    * the echoed fields). If the field `is_disabled` is set to `true`, the
    * agent should disable itself by removing all breakpoints and detaching
    * from the application. It should however continue to poll
    * `RegisterDebuggee` until reenabled.
    */
  var debuggee: js.UndefOr[SchemaDebuggee] = js.native
}
object SchemaRegisterDebuggeeResponse {
  
  @scala.inline
  def apply(): SchemaRegisterDebuggeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegisterDebuggeeResponse]
  }
  
  @scala.inline
  implicit class SchemaRegisterDebuggeeResponseOps[Self <: SchemaRegisterDebuggeeResponse] (val x: Self) extends AnyVal {
    
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

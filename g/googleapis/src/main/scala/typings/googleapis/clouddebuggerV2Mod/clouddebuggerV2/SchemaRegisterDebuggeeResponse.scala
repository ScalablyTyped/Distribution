package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for registering a debuggee.
  */
@js.native
trait SchemaRegisterDebuggeeResponse extends StObject {
  
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
  implicit class SchemaRegisterDebuggeeResponseMutableBuilder[Self <: SchemaRegisterDebuggeeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebuggee(value: SchemaDebuggee): Self = StObject.set(x, "debuggee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggeeUndefined: Self = StObject.set(x, "debuggee", js.undefined)
  }
}

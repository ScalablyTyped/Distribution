package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to update an active breakpoint.
  */
@js.native
trait SchemaUpdateActiveBreakpointRequest extends StObject {
  
  /**
    * Updated breakpoint information. The field `id` must be set. The agent
    * must echo all Breakpoint specification fields in the update.
    */
  var breakpoint: js.UndefOr[SchemaBreakpoint] = js.native
}
object SchemaUpdateActiveBreakpointRequest {
  
  @scala.inline
  def apply(): SchemaUpdateActiveBreakpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateActiveBreakpointRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateActiveBreakpointRequestMutableBuilder[Self <: SchemaUpdateActiveBreakpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpoint(value: SchemaBreakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
  }
}

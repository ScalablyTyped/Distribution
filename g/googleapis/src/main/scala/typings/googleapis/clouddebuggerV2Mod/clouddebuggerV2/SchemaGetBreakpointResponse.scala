package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for getting breakpoint information.
  */
@js.native
trait SchemaGetBreakpointResponse extends js.Object {
  
  /**
    * Complete breakpoint state. The fields `id` and `location` are guaranteed
    * to be set.
    */
  var breakpoint: js.UndefOr[SchemaBreakpoint] = js.native
}
object SchemaGetBreakpointResponse {
  
  @scala.inline
  def apply(): SchemaGetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetBreakpointResponse]
  }
  
  @scala.inline
  implicit class SchemaGetBreakpointResponseOps[Self <: SchemaGetBreakpointResponse] (val x: Self) extends AnyVal {
    
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
    def setBreakpoint(value: SchemaBreakpoint): Self = this.set("breakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakpoint: Self = this.set("breakpoint", js.undefined)
  }
}

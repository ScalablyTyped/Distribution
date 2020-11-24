package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a contextual status message. The message can indicate an error
  * or informational status, and refer to specific parts of the containing
  * object. For example, the `Breakpoint.status` field can indicate an error
  * referring to the `BREAKPOINT_SOURCE_LOCATION` with the message `Location
  * not found`.
  */
@js.native
trait SchemaStatusMessage extends js.Object {
  
  /**
    * Status message text.
    */
  var description: js.UndefOr[SchemaFormatMessage] = js.native
  
  /**
    * Distinguishes errors from informational messages.
    */
  var isError: js.UndefOr[Boolean] = js.native
  
  /**
    * Reference to which the message applies.
    */
  var refersTo: js.UndefOr[String] = js.native
}
object SchemaStatusMessage {
  
  @scala.inline
  def apply(): SchemaStatusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusMessage]
  }
  
  @scala.inline
  implicit class SchemaStatusMessageOps[Self <: SchemaStatusMessage] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: SchemaFormatMessage): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIsError(value: Boolean): Self = this.set("isError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsError: Self = this.set("isError", js.undefined)
    
    @scala.inline
    def setRefersTo(value: String): Self = this.set("refersTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefersTo: Self = this.set("refersTo", js.undefined)
  }
}

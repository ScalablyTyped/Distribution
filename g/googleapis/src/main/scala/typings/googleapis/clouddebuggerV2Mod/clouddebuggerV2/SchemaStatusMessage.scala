package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
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
trait SchemaStatusMessage extends StObject {
  
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
  implicit class SchemaStatusMessageMutableBuilder[Self <: SchemaStatusMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: SchemaFormatMessage): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsErrorUndefined: Self = StObject.set(x, "isError", js.undefined)
    
    @scala.inline
    def setRefersTo(value: String): Self = StObject.set(x, "refersTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefersToUndefined: Self = StObject.set(x, "refersTo", js.undefined)
  }
}

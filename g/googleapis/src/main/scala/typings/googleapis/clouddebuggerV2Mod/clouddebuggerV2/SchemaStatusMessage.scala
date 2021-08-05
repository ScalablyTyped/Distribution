package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a contextual status message. The message can indicate an error
  * or informational status, and refer to specific parts of the containing
  * object. For example, the `Breakpoint.status` field can indicate an error
  * referring to the `BREAKPOINT_SOURCE_LOCATION` with the message `Location
  * not found`.
  */
trait SchemaStatusMessage extends StObject {
  
  /**
    * Status message text.
    */
  var description: js.UndefOr[SchemaFormatMessage] = js.undefined
  
  /**
    * Distinguishes errors from informational messages.
    */
  var isError: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Reference to which the message applies.
    */
  var refersTo: js.UndefOr[String] = js.undefined
}
object SchemaStatusMessage {
  
  inline def apply(): SchemaStatusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusMessage]
  }
  
  extension [Self <: SchemaStatusMessage](x: Self) {
    
    inline def setDescription(value: SchemaFormatMessage): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    
    inline def setIsErrorUndefined: Self = StObject.set(x, "isError", js.undefined)
    
    inline def setRefersTo(value: String): Self = StObject.set(x, "refersTo", value.asInstanceOf[js.Any])
    
    inline def setRefersToUndefined: Self = StObject.set(x, "refersTo", js.undefined)
  }
}

package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatusMessage extends StObject {
  
  /**
    * Status message text.
    */
  var description: js.UndefOr[SchemaFormatMessage] = js.undefined
  
  /**
    * Distinguishes errors from informational messages.
    */
  var isError: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Reference to which the message applies.
    */
  var refersTo: js.UndefOr[String | Null] = js.undefined
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
    
    inline def setIsErrorNull: Self = StObject.set(x, "isError", null)
    
    inline def setIsErrorUndefined: Self = StObject.set(x, "isError", js.undefined)
    
    inline def setRefersTo(value: String): Self = StObject.set(x, "refersTo", value.asInstanceOf[js.Any])
    
    inline def setRefersToNull: Self = StObject.set(x, "refersTo", null)
    
    inline def setRefersToUndefined: Self = StObject.set(x, "refersTo", js.undefined)
  }
}

package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectAttachmentsScopedList extends StObject {
  
  /**
    * A list of interconnect attachments contained in this scope.
    */
  var interconnectAttachments: js.UndefOr[js.Array[SchemaInterconnectAttachment]] = js.undefined
  
  /**
    * Informational warning which replaces the list of addresses when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaInterconnectAttachmentsScopedList {
  
  inline def apply(): SchemaInterconnectAttachmentsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectAttachmentsScopedList]
  }
  
  extension [Self <: SchemaInterconnectAttachmentsScopedList](x: Self) {
    
    inline def setInterconnectAttachments(value: js.Array[SchemaInterconnectAttachment]): Self = StObject.set(x, "interconnectAttachments", value.asInstanceOf[js.Any])
    
    inline def setInterconnectAttachmentsUndefined: Self = StObject.set(x, "interconnectAttachments", js.undefined)
    
    inline def setInterconnectAttachmentsVarargs(value: SchemaInterconnectAttachment*): Self = StObject.set(x, "interconnectAttachments", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}

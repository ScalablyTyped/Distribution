package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceAttachmentsScopedList extends StObject {
  
  /**
    * A list of ServiceAttachments contained in this scope.
    */
  var serviceAttachments: js.UndefOr[js.Array[SchemaServiceAttachment]] = js.undefined
  
  /**
    * Informational warning which replaces the list of service attachments when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaServiceAttachmentsScopedList {
  
  inline def apply(): SchemaServiceAttachmentsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAttachmentsScopedList]
  }
  
  extension [Self <: SchemaServiceAttachmentsScopedList](x: Self) {
    
    inline def setServiceAttachments(value: js.Array[SchemaServiceAttachment]): Self = StObject.set(x, "serviceAttachments", value.asInstanceOf[js.Any])
    
    inline def setServiceAttachmentsUndefined: Self = StObject.set(x, "serviceAttachments", js.undefined)
    
    inline def setServiceAttachmentsVarargs(value: SchemaServiceAttachment*): Self = StObject.set(x, "serviceAttachments", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}

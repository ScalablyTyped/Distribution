package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModifyAttachmentsRequest extends StObject {
  
  /**
    * Attachments to add. A student submission may not have more than 20 attachments. Form attachments are not supported.
    */
  var addAttachments: js.UndefOr[js.Array[SchemaAttachment]] = js.undefined
}
object SchemaModifyAttachmentsRequest {
  
  inline def apply(): SchemaModifyAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyAttachmentsRequest]
  }
  
  extension [Self <: SchemaModifyAttachmentsRequest](x: Self) {
    
    inline def setAddAttachments(value: js.Array[SchemaAttachment]): Self = StObject.set(x, "addAttachments", value.asInstanceOf[js.Any])
    
    inline def setAddAttachmentsUndefined: Self = StObject.set(x, "addAttachments", js.undefined)
    
    inline def setAddAttachmentsVarargs(value: SchemaAttachment*): Self = StObject.set(x, "addAttachments", js.Array(value*))
  }
}

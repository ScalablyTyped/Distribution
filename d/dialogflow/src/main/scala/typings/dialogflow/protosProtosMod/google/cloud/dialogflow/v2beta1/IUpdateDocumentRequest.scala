package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.protosProtosMod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateDocumentRequest. */
trait IUpdateDocumentRequest extends StObject {
  
  /** UpdateDocumentRequest document */
  var document: js.UndefOr[IDocument | Null] = js.undefined
  
  /** UpdateDocumentRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object IUpdateDocumentRequest {
  
  inline def apply(): IUpdateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateDocumentRequest]
  }
  
  extension [Self <: IUpdateDocumentRequest](x: Self) {
    
    inline def setDocument(value: IDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentNull: Self = StObject.set(x, "document", null)
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}

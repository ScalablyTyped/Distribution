package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateDocumentRequest. */
trait IUpdateDocumentRequest extends StObject {
  
  /** UpdateDocumentRequest currentDocument */
  var currentDocument: js.UndefOr[IPrecondition | Null] = js.undefined
  
  /** UpdateDocumentRequest document */
  var document: js.UndefOr[IDocument | Null] = js.undefined
  
  /** UpdateDocumentRequest mask */
  var mask: js.UndefOr[IDocumentMask | Null] = js.undefined
  
  /** UpdateDocumentRequest updateMask */
  var updateMask: js.UndefOr[IDocumentMask | Null] = js.undefined
}
object IUpdateDocumentRequest {
  
  inline def apply(): IUpdateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateDocumentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUpdateDocumentRequest] (val x: Self) extends AnyVal {
    
    inline def setCurrentDocument(value: IPrecondition): Self = StObject.set(x, "currentDocument", value.asInstanceOf[js.Any])
    
    inline def setCurrentDocumentNull: Self = StObject.set(x, "currentDocument", null)
    
    inline def setCurrentDocumentUndefined: Self = StObject.set(x, "currentDocument", js.undefined)
    
    inline def setDocument(value: IDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentNull: Self = StObject.set(x, "document", null)
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setMask(value: IDocumentMask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskNull: Self = StObject.set(x, "mask", null)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setUpdateMask(value: IDocumentMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}

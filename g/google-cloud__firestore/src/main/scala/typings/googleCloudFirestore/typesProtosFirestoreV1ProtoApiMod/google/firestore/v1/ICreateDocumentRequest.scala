package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateDocumentRequest. */
trait ICreateDocumentRequest extends StObject {
  
  /** CreateDocumentRequest collectionId */
  var collectionId: js.UndefOr[String | Null] = js.undefined
  
  /** CreateDocumentRequest document */
  var document: js.UndefOr[IDocument | Null] = js.undefined
  
  /** CreateDocumentRequest documentId */
  var documentId: js.UndefOr[String | Null] = js.undefined
  
  /** CreateDocumentRequest mask */
  var mask: js.UndefOr[IDocumentMask | Null] = js.undefined
  
  /** CreateDocumentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object ICreateDocumentRequest {
  
  inline def apply(): ICreateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateDocumentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICreateDocumentRequest] (val x: Self) extends AnyVal {
    
    inline def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdNull: Self = StObject.set(x, "collectionId", null)
    
    inline def setCollectionIdUndefined: Self = StObject.set(x, "collectionId", js.undefined)
    
    inline def setDocument(value: IDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdNull: Self = StObject.set(x, "documentId", null)
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setDocumentNull: Self = StObject.set(x, "document", null)
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setMask(value: IDocumentMask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskNull: Self = StObject.set(x, "mask", null)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}

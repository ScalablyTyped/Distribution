package typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Write extends StObject {
  
  var currentDocument: js.UndefOr[Precondition] = js.undefined
  
  var delete: js.UndefOr[String] = js.undefined
  
  var transform: js.UndefOr[DocumentTransform] = js.undefined
  
  var update: js.UndefOr[Document] = js.undefined
  
  var updateMask: js.UndefOr[DocumentMask] = js.undefined
  
  var updateTransforms: js.UndefOr[js.Array[FieldTransform]] = js.undefined
  
  var verify: js.UndefOr[String] = js.undefined
}
object Write {
  
  inline def apply(): Write = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Write]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Write] (val x: Self) extends AnyVal {
    
    inline def setCurrentDocument(value: Precondition): Self = StObject.set(x, "currentDocument", value.asInstanceOf[js.Any])
    
    inline def setCurrentDocumentUndefined: Self = StObject.set(x, "currentDocument", js.undefined)
    
    inline def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setTransform(value: DocumentTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setUpdate(value: Document): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateMask(value: DocumentMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setUpdateTransforms(value: js.Array[FieldTransform]): Self = StObject.set(x, "updateTransforms", value.asInstanceOf[js.Any])
    
    inline def setUpdateTransformsUndefined: Self = StObject.set(x, "updateTransforms", js.undefined)
    
    inline def setUpdateTransformsVarargs(value: FieldTransform*): Self = StObject.set(x, "updateTransforms", js.Array(value*))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setVerify(value: String): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
    
    inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
  }
}

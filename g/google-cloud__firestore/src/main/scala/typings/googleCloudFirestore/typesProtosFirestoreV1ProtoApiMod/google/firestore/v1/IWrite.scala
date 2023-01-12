package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.DocumentTransform.IFieldTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Write. */
trait IWrite extends StObject {
  
  /** Write currentDocument */
  var currentDocument: js.UndefOr[IPrecondition | Null] = js.undefined
  
  /** Write delete */
  var delete: js.UndefOr[String | Null] = js.undefined
  
  /** Write transform */
  var transform: js.UndefOr[IDocumentTransform | Null] = js.undefined
  
  /** Write update */
  var update: js.UndefOr[IDocument | Null] = js.undefined
  
  /** Write updateMask */
  var updateMask: js.UndefOr[IDocumentMask | Null] = js.undefined
  
  /** Write updateTransforms */
  var updateTransforms: js.UndefOr[js.Array[IFieldTransform] | Null] = js.undefined
}
object IWrite {
  
  inline def apply(): IWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWrite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWrite] (val x: Self) extends AnyVal {
    
    inline def setCurrentDocument(value: IPrecondition): Self = StObject.set(x, "currentDocument", value.asInstanceOf[js.Any])
    
    inline def setCurrentDocumentNull: Self = StObject.set(x, "currentDocument", null)
    
    inline def setCurrentDocumentUndefined: Self = StObject.set(x, "currentDocument", js.undefined)
    
    inline def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteNull: Self = StObject.set(x, "delete", null)
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setTransform(value: IDocumentTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformNull: Self = StObject.set(x, "transform", null)
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setUpdate(value: IDocument): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateMask(value: IDocumentMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setUpdateNull: Self = StObject.set(x, "update", null)
    
    inline def setUpdateTransforms(value: js.Array[IFieldTransform]): Self = StObject.set(x, "updateTransforms", value.asInstanceOf[js.Any])
    
    inline def setUpdateTransformsNull: Self = StObject.set(x, "updateTransforms", null)
    
    inline def setUpdateTransformsUndefined: Self = StObject.set(x, "updateTransforms", js.undefined)
    
    inline def setUpdateTransformsVarargs(value: IFieldTransform*): Self = StObject.set(x, "updateTransforms", js.Array(value*))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}

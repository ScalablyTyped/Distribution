package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1.DocumentTransform.IFieldTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DocumentTransform. */
trait IDocumentTransform extends StObject {
  
  /** DocumentTransform document */
  var document: js.UndefOr[String | Null] = js.undefined
  
  /** DocumentTransform fieldTransforms */
  var fieldTransforms: js.UndefOr[js.Array[IFieldTransform] | Null] = js.undefined
}
object IDocumentTransform {
  
  inline def apply(): IDocumentTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentTransform]
  }
  
  extension [Self <: IDocumentTransform](x: Self) {
    
    inline def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentNull: Self = StObject.set(x, "document", null)
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setFieldTransforms(value: js.Array[IFieldTransform]): Self = StObject.set(x, "fieldTransforms", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformsNull: Self = StObject.set(x, "fieldTransforms", null)
    
    inline def setFieldTransformsUndefined: Self = StObject.set(x, "fieldTransforms", js.undefined)
    
    inline def setFieldTransformsVarargs(value: IFieldTransform*): Self = StObject.set(x, "fieldTransforms", js.Array(value*))
  }
}

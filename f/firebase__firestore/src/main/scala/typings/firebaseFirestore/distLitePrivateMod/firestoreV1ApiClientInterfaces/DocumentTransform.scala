package typings.firebaseFirestore.distLitePrivateMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentTransform extends StObject {
  
  var document: js.UndefOr[String] = js.undefined
  
  var fieldTransforms: js.UndefOr[js.Array[FieldTransform]] = js.undefined
}
object DocumentTransform {
  
  inline def apply(): DocumentTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTransform]
  }
  
  extension [Self <: DocumentTransform](x: Self) {
    
    inline def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setFieldTransforms(value: js.Array[FieldTransform]): Self = StObject.set(x, "fieldTransforms", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformsUndefined: Self = StObject.set(x, "fieldTransforms", js.undefined)
    
    inline def setFieldTransformsVarargs(value: FieldTransform*): Self = StObject.set(x, "fieldTransforms", js.Array(value*))
  }
}

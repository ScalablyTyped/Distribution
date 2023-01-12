package typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldTransform extends StObject {
  
  var appendMissingElements: js.UndefOr[ArrayValue] = js.undefined
  
  var fieldPath: js.UndefOr[String] = js.undefined
  
  var increment: js.UndefOr[Value] = js.undefined
  
  var removeAllFromArray: js.UndefOr[ArrayValue] = js.undefined
  
  var setToServerValue: js.UndefOr[FieldTransformSetToServerValue] = js.undefined
}
object FieldTransform {
  
  inline def apply(): FieldTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldTransform] (val x: Self) extends AnyVal {
    
    inline def setAppendMissingElements(value: ArrayValue): Self = StObject.set(x, "appendMissingElements", value.asInstanceOf[js.Any])
    
    inline def setAppendMissingElementsUndefined: Self = StObject.set(x, "appendMissingElements", js.undefined)
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    
    inline def setIncrement(value: Value): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    inline def setRemoveAllFromArray(value: ArrayValue): Self = StObject.set(x, "removeAllFromArray", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllFromArrayUndefined: Self = StObject.set(x, "removeAllFromArray", js.undefined)
    
    inline def setSetToServerValue(value: FieldTransformSetToServerValue): Self = StObject.set(x, "setToServerValue", value.asInstanceOf[js.Any])
    
    inline def setSetToServerValueUndefined: Self = StObject.set(x, "setToServerValue", js.undefined)
  }
}

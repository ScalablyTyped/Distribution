package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The result of parsing document data (e.g. for a setData call). */
trait ParsedSetData extends StObject {
  
  val data: ObjectValue
  
  val fieldMask: FieldMask | Null
  
  val fieldTransforms: js.Array[FieldTransform]
  
  def toMutation(key: DocumentKey, precondition: Precondition): Mutation
}
object ParsedSetData {
  
  inline def apply(
    data: ObjectValue,
    fieldTransforms: js.Array[FieldTransform],
    toMutation: (DocumentKey, Precondition) => Mutation
  ): ParsedSetData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fieldTransforms = fieldTransforms.asInstanceOf[js.Any], toMutation = js.Any.fromFunction2(toMutation), fieldMask = null)
    __obj.asInstanceOf[ParsedSetData]
  }
  
  extension [Self <: ParsedSetData](x: Self) {
    
    inline def setData(value: ObjectValue): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFieldMask(value: FieldMask): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    inline def setFieldMaskNull: Self = StObject.set(x, "fieldMask", null)
    
    inline def setFieldTransforms(value: js.Array[FieldTransform]): Self = StObject.set(x, "fieldTransforms", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformsVarargs(value: FieldTransform*): Self = StObject.set(x, "fieldTransforms", js.Array(value*))
    
    inline def setToMutation(value: (DocumentKey, Precondition) => Mutation): Self = StObject.set(x, "toMutation", js.Any.fromFunction2(value))
  }
}

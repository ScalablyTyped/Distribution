package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The result of parsing "update" data (i.e. for an updateData call). */
trait ParsedUpdateData extends StObject {
  
  val data: ObjectValue
  
  val fieldMask: FieldMask
  
  val fieldTransforms: js.Array[FieldTransform]
  
  def toMutation(
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any,
    precondition: Precondition
  ): Mutation
}
object ParsedUpdateData {
  
  inline def apply(
    data: ObjectValue,
    fieldMask: FieldMask,
    fieldTransforms: js.Array[FieldTransform],
    toMutation: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any, Precondition) => Mutation
  ): ParsedUpdateData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fieldMask = fieldMask.asInstanceOf[js.Any], fieldTransforms = fieldTransforms.asInstanceOf[js.Any], toMutation = js.Any.fromFunction2(toMutation))
    __obj.asInstanceOf[ParsedUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedUpdateData] (val x: Self) extends AnyVal {
    
    inline def setData(value: ObjectValue): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFieldMask(value: FieldMask): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    inline def setFieldTransforms(value: js.Array[FieldTransform]): Self = StObject.set(x, "fieldTransforms", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformsVarargs(value: FieldTransform*): Self = StObject.set(x, "fieldTransforms", js.Array(value*))
    
    inline def setToMutation(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any, Precondition) => Mutation
    ): Self = StObject.set(x, "toMutation", js.Any.fromFunction2(value))
  }
}

package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Excluded from this release type: _FieldPath */
/** A field path and the TransformOperation to perform upon it. */
trait FieldTransform extends StObject {
  
  val field: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any
  
  val transform: TransformOperation
}
object FieldTransform {
  
  inline def apply(
    field: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any,
    transform: TransformOperation
  ): FieldTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldTransform] (val x: Self) extends AnyVal {
    
    inline def setField(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any
    ): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: TransformOperation): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}

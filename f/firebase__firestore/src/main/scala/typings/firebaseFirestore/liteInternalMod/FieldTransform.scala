package typings.firebaseFirestore.liteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A field path and the TransformOperation to perform upon it. */
trait FieldTransform extends StObject {
  
  val field: FieldPath2
  
  val transform: TransformOperation
}
object FieldTransform {
  
  inline def apply(field: FieldPath2, transform: TransformOperation): FieldTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTransform]
  }
  
  extension [Self <: FieldTransform](x: Self) {
    
    inline def setField(value: FieldPath2): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: TransformOperation): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}

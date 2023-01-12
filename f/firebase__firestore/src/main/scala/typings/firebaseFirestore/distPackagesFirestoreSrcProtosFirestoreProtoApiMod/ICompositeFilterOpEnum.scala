package typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompositeFilterOpEnum extends StObject {
  
  var AND: CompositeFilterOp
  
  var OPERATOR_UNSPECIFIED: CompositeFilterOp
  
  def values(): js.Array[CompositeFilterOp]
}
object ICompositeFilterOpEnum {
  
  inline def apply(
    AND: CompositeFilterOp,
    OPERATOR_UNSPECIFIED: CompositeFilterOp,
    values: () => js.Array[CompositeFilterOp]
  ): ICompositeFilterOpEnum = {
    val __obj = js.Dynamic.literal(AND = AND.asInstanceOf[js.Any], OPERATOR_UNSPECIFIED = OPERATOR_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ICompositeFilterOpEnum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICompositeFilterOpEnum] (val x: Self) extends AnyVal {
    
    inline def setAND(value: CompositeFilterOp): Self = StObject.set(x, "AND", value.asInstanceOf[js.Any])
    
    inline def setOPERATOR_UNSPECIFIED(value: CompositeFilterOp): Self = StObject.set(x, "OPERATOR_UNSPECIFIED", value.asInstanceOf[js.Any])
    
    inline def setValues(value: () => js.Array[CompositeFilterOp]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}

package typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUnaryFilterOpEnum extends StObject {
  
  var IS_NAN: UnaryFilterOp
  
  var IS_NOT_NAN: UnaryFilterOp
  
  var IS_NOT_NULL: UnaryFilterOp
  
  var IS_NULL: UnaryFilterOp
  
  var OPERATOR_UNSPECIFIED: UnaryFilterOp
  
  def values(): js.Array[UnaryFilterOp]
}
object IUnaryFilterOpEnum {
  
  inline def apply(
    IS_NAN: UnaryFilterOp,
    IS_NOT_NAN: UnaryFilterOp,
    IS_NOT_NULL: UnaryFilterOp,
    IS_NULL: UnaryFilterOp,
    OPERATOR_UNSPECIFIED: UnaryFilterOp,
    values: () => js.Array[UnaryFilterOp]
  ): IUnaryFilterOpEnum = {
    val __obj = js.Dynamic.literal(IS_NAN = IS_NAN.asInstanceOf[js.Any], IS_NOT_NAN = IS_NOT_NAN.asInstanceOf[js.Any], IS_NOT_NULL = IS_NOT_NULL.asInstanceOf[js.Any], IS_NULL = IS_NULL.asInstanceOf[js.Any], OPERATOR_UNSPECIFIED = OPERATOR_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IUnaryFilterOpEnum]
  }
  
  extension [Self <: IUnaryFilterOpEnum](x: Self) {
    
    inline def setIS_NAN(value: UnaryFilterOp): Self = StObject.set(x, "IS_NAN", value.asInstanceOf[js.Any])
    
    inline def setIS_NOT_NAN(value: UnaryFilterOp): Self = StObject.set(x, "IS_NOT_NAN", value.asInstanceOf[js.Any])
    
    inline def setIS_NOT_NULL(value: UnaryFilterOp): Self = StObject.set(x, "IS_NOT_NULL", value.asInstanceOf[js.Any])
    
    inline def setIS_NULL(value: UnaryFilterOp): Self = StObject.set(x, "IS_NULL", value.asInstanceOf[js.Any])
    
    inline def setOPERATOR_UNSPECIFIED(value: UnaryFilterOp): Self = StObject.set(x, "OPERATOR_UNSPECIFIED", value.asInstanceOf[js.Any])
    
    inline def setValues(value: () => js.Array[UnaryFilterOp]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}

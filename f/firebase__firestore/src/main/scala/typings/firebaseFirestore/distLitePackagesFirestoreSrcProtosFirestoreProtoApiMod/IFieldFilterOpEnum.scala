package typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldFilterOpEnum extends StObject {
  
  var ARRAY_CONTAINS: FieldFilterOp
  
  var ARRAY_CONTAINS_ANY: FieldFilterOp
  
  var EQUAL: FieldFilterOp
  
  var GREATER_THAN: FieldFilterOp
  
  var GREATER_THAN_OR_EQUAL: FieldFilterOp
  
  var IN: FieldFilterOp
  
  var LESS_THAN: FieldFilterOp
  
  var LESS_THAN_OR_EQUAL: FieldFilterOp
  
  var NOT_EQUAL: FieldFilterOp
  
  var NOT_IN: FieldFilterOp
  
  var OPERATOR_UNSPECIFIED: FieldFilterOp
  
  def values(): js.Array[FieldFilterOp]
}
object IFieldFilterOpEnum {
  
  inline def apply(
    ARRAY_CONTAINS: FieldFilterOp,
    ARRAY_CONTAINS_ANY: FieldFilterOp,
    EQUAL: FieldFilterOp,
    GREATER_THAN: FieldFilterOp,
    GREATER_THAN_OR_EQUAL: FieldFilterOp,
    IN: FieldFilterOp,
    LESS_THAN: FieldFilterOp,
    LESS_THAN_OR_EQUAL: FieldFilterOp,
    NOT_EQUAL: FieldFilterOp,
    NOT_IN: FieldFilterOp,
    OPERATOR_UNSPECIFIED: FieldFilterOp,
    values: () => js.Array[FieldFilterOp]
  ): IFieldFilterOpEnum = {
    val __obj = js.Dynamic.literal(ARRAY_CONTAINS = ARRAY_CONTAINS.asInstanceOf[js.Any], ARRAY_CONTAINS_ANY = ARRAY_CONTAINS_ANY.asInstanceOf[js.Any], EQUAL = EQUAL.asInstanceOf[js.Any], GREATER_THAN = GREATER_THAN.asInstanceOf[js.Any], GREATER_THAN_OR_EQUAL = GREATER_THAN_OR_EQUAL.asInstanceOf[js.Any], IN = IN.asInstanceOf[js.Any], LESS_THAN = LESS_THAN.asInstanceOf[js.Any], LESS_THAN_OR_EQUAL = LESS_THAN_OR_EQUAL.asInstanceOf[js.Any], NOT_EQUAL = NOT_EQUAL.asInstanceOf[js.Any], NOT_IN = NOT_IN.asInstanceOf[js.Any], OPERATOR_UNSPECIFIED = OPERATOR_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IFieldFilterOpEnum]
  }
  
  extension [Self <: IFieldFilterOpEnum](x: Self) {
    
    inline def setARRAY_CONTAINS(value: FieldFilterOp): Self = StObject.set(x, "ARRAY_CONTAINS", value.asInstanceOf[js.Any])
    
    inline def setARRAY_CONTAINS_ANY(value: FieldFilterOp): Self = StObject.set(x, "ARRAY_CONTAINS_ANY", value.asInstanceOf[js.Any])
    
    inline def setEQUAL(value: FieldFilterOp): Self = StObject.set(x, "EQUAL", value.asInstanceOf[js.Any])
    
    inline def setGREATER_THAN(value: FieldFilterOp): Self = StObject.set(x, "GREATER_THAN", value.asInstanceOf[js.Any])
    
    inline def setGREATER_THAN_OR_EQUAL(value: FieldFilterOp): Self = StObject.set(x, "GREATER_THAN_OR_EQUAL", value.asInstanceOf[js.Any])
    
    inline def setIN(value: FieldFilterOp): Self = StObject.set(x, "IN", value.asInstanceOf[js.Any])
    
    inline def setLESS_THAN(value: FieldFilterOp): Self = StObject.set(x, "LESS_THAN", value.asInstanceOf[js.Any])
    
    inline def setLESS_THAN_OR_EQUAL(value: FieldFilterOp): Self = StObject.set(x, "LESS_THAN_OR_EQUAL", value.asInstanceOf[js.Any])
    
    inline def setNOT_EQUAL(value: FieldFilterOp): Self = StObject.set(x, "NOT_EQUAL", value.asInstanceOf[js.Any])
    
    inline def setNOT_IN(value: FieldFilterOp): Self = StObject.set(x, "NOT_IN", value.asInstanceOf[js.Any])
    
    inline def setOPERATOR_UNSPECIFIED(value: FieldFilterOp): Self = StObject.set(x, "OPERATOR_UNSPECIFIED", value.asInstanceOf[js.Any])
    
    inline def setValues(value: () => js.Array[FieldFilterOp]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}

package typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOrderDirectionEnum extends StObject {
  
  var ASCENDING: OrderDirection
  
  var DESCENDING: OrderDirection
  
  var DIRECTION_UNSPECIFIED: OrderDirection
  
  def values(): js.Array[OrderDirection]
}
object IOrderDirectionEnum {
  
  inline def apply(
    ASCENDING: OrderDirection,
    DESCENDING: OrderDirection,
    DIRECTION_UNSPECIFIED: OrderDirection,
    values: () => js.Array[OrderDirection]
  ): IOrderDirectionEnum = {
    val __obj = js.Dynamic.literal(ASCENDING = ASCENDING.asInstanceOf[js.Any], DESCENDING = DESCENDING.asInstanceOf[js.Any], DIRECTION_UNSPECIFIED = DIRECTION_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IOrderDirectionEnum]
  }
  
  extension [Self <: IOrderDirectionEnum](x: Self) {
    
    inline def setASCENDING(value: OrderDirection): Self = StObject.set(x, "ASCENDING", value.asInstanceOf[js.Any])
    
    inline def setDESCENDING(value: OrderDirection): Self = StObject.set(x, "DESCENDING", value.asInstanceOf[js.Any])
    
    inline def setDIRECTION_UNSPECIFIED(value: OrderDirection): Self = StObject.set(x, "DIRECTION_UNSPECIFIED", value.asInstanceOf[js.Any])
    
    inline def setValues(value: () => js.Array[OrderDirection]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}

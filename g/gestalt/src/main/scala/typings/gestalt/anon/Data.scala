package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[T] extends StObject {
  
  var data: T
  
  var isMeasuring: Boolean
  
  var itemIdx: Double
}
object Data {
  
  inline def apply[T](data: T, isMeasuring: Boolean, itemIdx: Double): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isMeasuring = isMeasuring.asInstanceOf[js.Any], itemIdx = itemIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  
  extension [Self <: Data[?], T](x: Self & Data[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIsMeasuring(value: Boolean): Self = StObject.set(x, "isMeasuring", value.asInstanceOf[js.Any])
    
    inline def setItemIdx(value: Double): Self = StObject.set(x, "itemIdx", value.asInstanceOf[js.Any])
  }
}

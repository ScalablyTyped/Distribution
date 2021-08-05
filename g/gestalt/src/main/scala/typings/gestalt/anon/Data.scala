package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[T] extends StObject {
  
  var data: T
  
  var isMeasuring: js.UndefOr[Boolean] = js.undefined
  
  var itemIdx: js.UndefOr[Double] = js.undefined
}
object Data {
  
  inline def apply[T](data: T): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  
  extension [Self <: Data[?], T](x: Self & Data[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIsMeasuring(value: Boolean): Self = StObject.set(x, "isMeasuring", value.asInstanceOf[js.Any])
    
    inline def setIsMeasuringUndefined: Self = StObject.set(x, "isMeasuring", js.undefined)
    
    inline def setItemIdx(value: Double): Self = StObject.set(x, "itemIdx", value.asInstanceOf[js.Any])
    
    inline def setItemIdxUndefined: Self = StObject.set(x, "itemIdx", js.undefined)
  }
}

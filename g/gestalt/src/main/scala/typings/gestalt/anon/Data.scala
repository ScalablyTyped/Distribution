package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data[T] extends StObject {
  
  var data: T = js.native
  
  var isMeasuring: js.UndefOr[Boolean] = js.native
  
  var itemIdx: js.UndefOr[Double] = js.native
}
object Data {
  
  @scala.inline
  def apply[T](data: T): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data[_], T] (val x: Self with Data[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMeasuring(value: Boolean): Self = StObject.set(x, "isMeasuring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMeasuringUndefined: Self = StObject.set(x, "isMeasuring", js.undefined)
    
    @scala.inline
    def setItemIdx(value: Double): Self = StObject.set(x, "itemIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdxUndefined: Self = StObject.set(x, "itemIdx", js.undefined)
  }
}

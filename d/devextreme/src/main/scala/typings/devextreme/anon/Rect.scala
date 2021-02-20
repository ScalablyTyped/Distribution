package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rect extends StObject {
  
  var items: js.UndefOr[js.Array[_]] = js.native
  
  var rect: js.UndefOr[js.Array[Double]] = js.native
  
  var sum: js.UndefOr[Double] = js.native
}
object Rect {
  
  @scala.inline
  def apply(): Rect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rect]
  }
  
  @scala.inline
  implicit class RectMutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setRect(value: js.Array[Double]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    @scala.inline
    def setRectVarargs(value: Double*): Self = StObject.set(x, "rect", js.Array(value :_*))
    
    @scala.inline
    def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}

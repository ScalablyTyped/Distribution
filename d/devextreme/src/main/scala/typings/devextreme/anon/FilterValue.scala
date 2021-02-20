package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterValue[T] extends StObject {
  
  var component: js.UndefOr[T] = js.native
  
  var filterValue: js.UndefOr[js.Any] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object FilterValue {
  
  @scala.inline
  def apply[T](): FilterValue[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterValue[T]]
  }
  
  @scala.inline
  implicit class FilterValueMutableBuilder[Self <: FilterValue[_], T] (val x: Self with FilterValue[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setFilterValue(value: js.Any): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}

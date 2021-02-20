package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearFilter extends StObject {
  
  var clearFilter: js.UndefOr[String] = js.native
  
  var createFilter: js.UndefOr[String] = js.native
  
  var filterEnabledHint: js.UndefOr[String] = js.native
}
object ClearFilter {
  
  @scala.inline
  def apply(): ClearFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearFilter]
  }
  
  @scala.inline
  implicit class ClearFilterMutableBuilder[Self <: ClearFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearFilter(value: String): Self = StObject.set(x, "clearFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFilterUndefined: Self = StObject.set(x, "clearFilter", js.undefined)
    
    @scala.inline
    def setCreateFilter(value: String): Self = StObject.set(x, "createFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFilterUndefined: Self = StObject.set(x, "createFilter", js.undefined)
    
    @scala.inline
    def setFilterEnabledHint(value: String): Self = StObject.set(x, "filterEnabledHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterEnabledHintUndefined: Self = StObject.set(x, "filterEnabledHint", js.undefined)
  }
}

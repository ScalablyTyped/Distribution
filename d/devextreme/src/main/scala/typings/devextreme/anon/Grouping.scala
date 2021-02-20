package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grouping extends StObject {
  
  var filtering: js.UndefOr[Boolean] = js.native
  
  var grouping: js.UndefOr[Boolean] = js.native
  
  var sorting: js.UndefOr[Boolean] = js.native
}
object Grouping {
  
  @scala.inline
  def apply(): Grouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grouping]
  }
  
  @scala.inline
  implicit class GroupingMutableBuilder[Self <: Grouping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiltering(value: Boolean): Self = StObject.set(x, "filtering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
    
    @scala.inline
    def setGrouping(value: Boolean): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    @scala.inline
    def setSorting(value: Boolean): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
  }
}

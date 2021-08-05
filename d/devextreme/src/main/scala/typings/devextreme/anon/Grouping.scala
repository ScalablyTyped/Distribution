package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grouping extends StObject {
  
  var filtering: js.UndefOr[Boolean] = js.undefined
  
  var grouping: js.UndefOr[Boolean] = js.undefined
  
  var sorting: js.UndefOr[Boolean] = js.undefined
}
object Grouping {
  
  inline def apply(): Grouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grouping]
  }
  
  extension [Self <: Grouping](x: Self) {
    
    inline def setFiltering(value: Boolean): Self = StObject.set(x, "filtering", value.asInstanceOf[js.Any])
    
    inline def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
    
    inline def setGrouping(value: Boolean): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    inline def setSorting(value: Boolean): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
  }
}

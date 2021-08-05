package typings.devextreme.anon

import typings.devextreme.devextremeStrings.asc
import typings.devextreme.devextremeStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupColumn extends StObject {
  
  var groupColumn: js.UndefOr[String] = js.undefined
  
  var sortOrder: js.UndefOr[asc | desc] = js.undefined
  
  var summaryItem: js.UndefOr[String | Double] = js.undefined
}
object GroupColumn {
  
  inline def apply(): GroupColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupColumn]
  }
  
  extension [Self <: GroupColumn](x: Self) {
    
    inline def setGroupColumn(value: String): Self = StObject.set(x, "groupColumn", value.asInstanceOf[js.Any])
    
    inline def setGroupColumnUndefined: Self = StObject.set(x, "groupColumn", js.undefined)
    
    inline def setSortOrder(value: asc | desc): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setSummaryItem(value: String | Double): Self = StObject.set(x, "summaryItem", value.asInstanceOf[js.Any])
    
    inline def setSummaryItemUndefined: Self = StObject.set(x, "summaryItem", js.undefined)
  }
}

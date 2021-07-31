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
  
  @scala.inline
  def apply(): GroupColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupColumn]
  }
  
  @scala.inline
  implicit class GroupColumnMutableBuilder[Self <: GroupColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupColumn(value: String): Self = StObject.set(x, "groupColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupColumnUndefined: Self = StObject.set(x, "groupColumn", js.undefined)
    
    @scala.inline
    def setSortOrder(value: asc | desc): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    @scala.inline
    def setSummaryItem(value: String | Double): Self = StObject.set(x, "summaryItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryItemUndefined: Self = StObject.set(x, "summaryItem", js.undefined)
  }
}

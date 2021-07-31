package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupByThisColumn extends StObject {
  
  var groupByThisColumn: js.UndefOr[String] = js.undefined
  
  var groupContinuedMessage: js.UndefOr[String] = js.undefined
  
  var groupContinuesMessage: js.UndefOr[String] = js.undefined
  
  var ungroup: js.UndefOr[String] = js.undefined
  
  var ungroupAll: js.UndefOr[String] = js.undefined
}
object GroupByThisColumn {
  
  @scala.inline
  def apply(): GroupByThisColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupByThisColumn]
  }
  
  @scala.inline
  implicit class GroupByThisColumnMutableBuilder[Self <: GroupByThisColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupByThisColumn(value: String): Self = StObject.set(x, "groupByThisColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByThisColumnUndefined: Self = StObject.set(x, "groupByThisColumn", js.undefined)
    
    @scala.inline
    def setGroupContinuedMessage(value: String): Self = StObject.set(x, "groupContinuedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupContinuedMessageUndefined: Self = StObject.set(x, "groupContinuedMessage", js.undefined)
    
    @scala.inline
    def setGroupContinuesMessage(value: String): Self = StObject.set(x, "groupContinuesMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupContinuesMessageUndefined: Self = StObject.set(x, "groupContinuesMessage", js.undefined)
    
    @scala.inline
    def setUngroup(value: String): Self = StObject.set(x, "ungroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUngroupAll(value: String): Self = StObject.set(x, "ungroupAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUngroupAllUndefined: Self = StObject.set(x, "ungroupAll", js.undefined)
    
    @scala.inline
    def setUngroupUndefined: Self = StObject.set(x, "ungroup", js.undefined)
  }
}

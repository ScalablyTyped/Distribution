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
  
  inline def apply(): GroupByThisColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupByThisColumn]
  }
  
  extension [Self <: GroupByThisColumn](x: Self) {
    
    inline def setGroupByThisColumn(value: String): Self = StObject.set(x, "groupByThisColumn", value.asInstanceOf[js.Any])
    
    inline def setGroupByThisColumnUndefined: Self = StObject.set(x, "groupByThisColumn", js.undefined)
    
    inline def setGroupContinuedMessage(value: String): Self = StObject.set(x, "groupContinuedMessage", value.asInstanceOf[js.Any])
    
    inline def setGroupContinuedMessageUndefined: Self = StObject.set(x, "groupContinuedMessage", js.undefined)
    
    inline def setGroupContinuesMessage(value: String): Self = StObject.set(x, "groupContinuesMessage", value.asInstanceOf[js.Any])
    
    inline def setGroupContinuesMessageUndefined: Self = StObject.set(x, "groupContinuesMessage", js.undefined)
    
    inline def setUngroup(value: String): Self = StObject.set(x, "ungroup", value.asInstanceOf[js.Any])
    
    inline def setUngroupAll(value: String): Self = StObject.set(x, "ungroupAll", value.asInstanceOf[js.Any])
    
    inline def setUngroupAllUndefined: Self = StObject.set(x, "ungroupAll", js.undefined)
    
    inline def setUngroupUndefined: Self = StObject.set(x, "ungroup", js.undefined)
  }
}

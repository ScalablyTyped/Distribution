package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information on a grid cell.
  */
trait ASPxClientGridViewCellInfo extends StObject {
  
  /**
    * Gets the data column that contains the cell currently being processed.
    */
  var column: ASPxClientGridViewColumn
  
  /**
    * Gets the row's key.
    */
  var key: Any
  
  /**
    * Gets the visible index of the row that contains the cell currently being processed.
    */
  var rowVisibleIndex: Double
}
object ASPxClientGridViewCellInfo {
  
  inline def apply(column: ASPxClientGridViewColumn, key: Any, rowVisibleIndex: Double): ASPxClientGridViewCellInfo = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowVisibleIndex = rowVisibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewCellInfo]
  }
  
  extension [Self <: ASPxClientGridViewCellInfo](x: Self) {
    
    inline def setColumn(value: ASPxClientGridViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRowVisibleIndex(value: Double): Self = StObject.set(x, "rowVisibleIndex", value.asInstanceOf[js.Any])
  }
}

package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information on a grid cell.
  */
@js.native
trait ASPxClientGridViewCellInfo extends StObject {
  
  /**
    * Gets the data column that contains the cell currently being processed.
    */
  var column: ASPxClientGridViewColumn = js.native
  
  /**
    * Gets the row's key.
    */
  var key: js.Any = js.native
  
  /**
    * Gets the visible index of the row that contains the cell currently being processed.
    */
  var rowVisibleIndex: Double = js.native
}
object ASPxClientGridViewCellInfo {
  
  @scala.inline
  def apply(column: ASPxClientGridViewColumn, key: js.Any, rowVisibleIndex: Double): ASPxClientGridViewCellInfo = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowVisibleIndex = rowVisibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewCellInfo]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewCellInfoMutableBuilder[Self <: ASPxClientGridViewCellInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ASPxClientGridViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowVisibleIndex(value: Double): Self = StObject.set(x, "rowVisibleIndex", value.asInstanceOf[js.Any])
  }
}

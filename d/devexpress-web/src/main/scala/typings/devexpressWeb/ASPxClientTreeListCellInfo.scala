package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information on a tree list cell.
  */
@js.native
trait ASPxClientTreeListCellInfo extends StObject {
  
  /**
    * Gets the data column that contains the cell currently being processed.
    */
  var column: ASPxClientTreeListColumn = js.native
  
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String = js.native
}
object ASPxClientTreeListCellInfo {
  
  @scala.inline
  def apply(column: ASPxClientTreeListColumn, nodeKey: String): ASPxClientTreeListCellInfo = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListCellInfo]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListCellInfoMutableBuilder[Self <: ASPxClientTreeListCellInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ASPxClientTreeListColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeKey(value: String): Self = StObject.set(x, "nodeKey", value.asInstanceOf[js.Any])
  }
}

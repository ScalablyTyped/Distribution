package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information on a grid cell.
  */
@js.native
trait ASPxClientCardViewCellInfo extends StObject {
  
  /**
    * Gets the visible index of the card that contains the cell currently being processed.
    */
  var cardVisibleIndex: Double = js.native
  
  /**
    * Gets the data column that contains the cell currently being processed.
    */
  var column: ASPxClientCardViewColumn = js.native
}
object ASPxClientCardViewCellInfo {
  
  @scala.inline
  def apply(cardVisibleIndex: Double, column: ASPxClientCardViewColumn): ASPxClientCardViewCellInfo = {
    val __obj = js.Dynamic.literal(cardVisibleIndex = cardVisibleIndex.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewCellInfo]
  }
  
  @scala.inline
  implicit class ASPxClientCardViewCellInfoMutableBuilder[Self <: ASPxClientCardViewCellInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardVisibleIndex(value: Double): Self = StObject.set(x, "cardVisibleIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: ASPxClientCardViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}

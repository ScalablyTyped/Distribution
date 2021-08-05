package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information on a grid cell.
  */
trait ASPxClientCardViewCellInfo extends StObject {
  
  /**
    * Gets the visible index of the card that contains the cell currently being processed.
    */
  var cardVisibleIndex: Double
  
  /**
    * Gets the data column that contains the cell currently being processed.
    */
  var column: ASPxClientCardViewColumn
}
object ASPxClientCardViewCellInfo {
  
  inline def apply(cardVisibleIndex: Double, column: ASPxClientCardViewColumn): ASPxClientCardViewCellInfo = {
    val __obj = js.Dynamic.literal(cardVisibleIndex = cardVisibleIndex.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewCellInfo]
  }
  
  extension [Self <: ASPxClientCardViewCellInfo](x: Self) {
    
    inline def setCardVisibleIndex(value: Double): Self = StObject.set(x, "cardVisibleIndex", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: ASPxClientCardViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}

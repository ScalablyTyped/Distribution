package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on a grid cell.
  */
trait ASPxClientCardViewCellInfo extends js.Object {
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
  @scala.inline
  def apply(cardVisibleIndex: Double, column: ASPxClientCardViewColumn): ASPxClientCardViewCellInfo = {
    val __obj = js.Dynamic.literal(cardVisibleIndex = cardVisibleIndex.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewCellInfo]
  }
}


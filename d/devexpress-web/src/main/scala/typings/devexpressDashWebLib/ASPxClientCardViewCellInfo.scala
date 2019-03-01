package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on a grid cell.
  */
trait ASPxClientCardViewCellInfo extends js.Object {
  /**
    * Gets the visible index of the card that contains the cell currently being processed.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the card.
    */
  var cardVisibleIndex: scala.Double
  /**
    * Gets the data column that contains the cell currently being processed.
    * Value: An <see cref="ASPxClientCardViewColumn" /> object that is the data column which contains the processed cell.
    */
  var column: ASPxClientCardViewColumn
}

object ASPxClientCardViewCellInfo {
  @scala.inline
  def apply(cardVisibleIndex: scala.Double, column: ASPxClientCardViewColumn): ASPxClientCardViewCellInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cardVisibleIndex")(cardVisibleIndex)
    __obj.updateDynamic("column")(column)
    __obj.asInstanceOf[ASPxClientCardViewCellInfo]
  }
}


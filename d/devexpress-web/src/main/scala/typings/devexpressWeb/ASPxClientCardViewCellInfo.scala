package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on a grid cell.
  */
@js.native
trait ASPxClientCardViewCellInfo extends js.Object {
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
  implicit class ASPxClientCardViewCellInfoOps[Self <: ASPxClientCardViewCellInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCardVisibleIndex(value: Double): Self = this.set("cardVisibleIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: ASPxClientCardViewColumn): Self = this.set("column", value.asInstanceOf[js.Any])
  }
  
}


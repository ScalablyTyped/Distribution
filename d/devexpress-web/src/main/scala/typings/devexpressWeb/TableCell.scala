package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a table cell in the document.
  */
@js.native
trait TableCell extends js.Object {
  /**
    * Gets the text buffer interval occupied by the current table cell element.
    */
  val interval: Interval = js.native
  /**
    * Gets the table cell's character length.
    */
  val length: Double = js.native
  /**
    * Gets the table cell's start position in the document.
    */
  val start: Double = js.native
}

object TableCell {
  @scala.inline
  def apply(interval: Interval, length: Double, start: Double): TableCell = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCell]
  }
  @scala.inline
  implicit class TableCellOps[Self <: TableCell] (val x: Self) extends AnyVal {
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
    def setInterval(value: Interval): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}


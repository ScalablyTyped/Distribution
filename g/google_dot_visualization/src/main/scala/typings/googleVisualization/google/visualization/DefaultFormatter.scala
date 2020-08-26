package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Formatter
@js.native
trait DefaultFormatter extends js.Object {
  /**
    * Reformats the data in the specified column.
    *
    * @param data - A DataTable containing the data to reformat. You cannot use a DataView here.
    * @param columnIndex - The zero-based index of the column to format. To format multiple columns, you must call this method multiple times, with different colIndex values.
    */
  def format(data: DataTable, columnIndex: Double): Unit = js.native
}

object DefaultFormatter {
  @scala.inline
  def apply(format: (DataTable, Double) => Unit): DefaultFormatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format))
    __obj.asInstanceOf[DefaultFormatter]
  }
  @scala.inline
  implicit class DefaultFormatterOps[Self <: DefaultFormatter] (val x: Self) extends AnyVal {
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
    def setFormat(value: (DataTable, Double) => Unit): Self = this.set("format", js.Any.fromFunction2(value))
  }
  
}


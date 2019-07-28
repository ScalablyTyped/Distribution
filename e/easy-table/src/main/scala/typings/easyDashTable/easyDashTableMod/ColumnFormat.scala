package typings.easyDashTable.easyDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFormat[T] extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var printer: js.UndefOr[CellPrinter[T]] = js.undefined
}

object ColumnFormat {
  @scala.inline
  def apply[T](name: String = null, printer: CellPrinter[T] = null): ColumnFormat[T] = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (printer != null) __obj.updateDynamic("printer")(printer)
    __obj.asInstanceOf[ColumnFormat[T]]
  }
}


package typings.easyDashTable.easyDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintColumnOptions[T] extends js.Object {
  /**
    * Printer to format column names
    */
  var namePrinter: js.UndefOr[CellPrinter[T]] = js.undefined
  /**
    * Column separation string
    */
  var separator: js.UndefOr[String] = js.undefined
}

object PrintColumnOptions {
  @scala.inline
  def apply[T](namePrinter: (T, /* width */ Double) => String = null, separator: String = null): PrintColumnOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (namePrinter != null) __obj.updateDynamic("namePrinter")(js.Any.fromFunction2(namePrinter))
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[PrintColumnOptions[T]]
  }
}


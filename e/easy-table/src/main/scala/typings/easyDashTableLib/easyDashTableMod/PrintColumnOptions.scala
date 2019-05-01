package typings
package easyDashTableLib.easyDashTableMod

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
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object PrintColumnOptions {
  @scala.inline
  def apply[T](namePrinter: CellPrinter[T] = null, separator: java.lang.String = null): PrintColumnOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (namePrinter != null) __obj.updateDynamic("namePrinter")(namePrinter)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[PrintColumnOptions[T]]
  }
}


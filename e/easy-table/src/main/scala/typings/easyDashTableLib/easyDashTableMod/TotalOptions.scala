package typings
package easyDashTableLib.easyDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TotalOptions[T] extends js.Object {
  /**
    * Initial value for reduction
    */
  var init: js.UndefOr[T] = js.undefined
  /**
    * Printer to format the total cell
    */
  var printer: js.UndefOr[easyDashTableLib.CellPrinter[T]] = js.undefined
  /**
    * reduce(acc, val, idx, length) function to compute the total value
    */
  var reduce: js.UndefOr[easyDashTableLib.ReduceFunction[T]] = js.undefined
}

object TotalOptions {
  @scala.inline
  def apply[T](
    init: T = null,
    printer: easyDashTableLib.CellPrinter[T] = null,
    reduce: easyDashTableLib.ReduceFunction[T] = null
  ): TotalOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (printer != null) __obj.updateDynamic("printer")(printer)
    if (reduce != null) __obj.updateDynamic("reduce")(reduce)
    __obj.asInstanceOf[TotalOptions[T]]
  }
}


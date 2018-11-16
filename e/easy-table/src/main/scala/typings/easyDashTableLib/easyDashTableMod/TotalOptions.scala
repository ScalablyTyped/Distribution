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


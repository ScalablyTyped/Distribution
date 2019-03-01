package typings
package easyDashTableLib.easyDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregators extends js.Object {
  /**
    * Average reduction
    */
  var avg: js.Any
  /**
    * Sum reduction
    */
  var sum: js.Any
  /**
    * Create a printer which formats the value with `printer`,
    * adds the `prefix` to it and right aligns the whole thing
    *
    * @param {String} prefix
    * @param {Function} printer
    * @returns {printer}
    */
  def printer[T](prefix: java.lang.String, printer: easyDashTableLib.CellPrinter[T]): easyDashTableLib.CellPrinter[T]
}

object Aggregators {
  @scala.inline
  def apply(
    avg: js.Any,
    printer: js.Function2[
      java.lang.String, 
      easyDashTableLib.CellPrinter[js.Any], 
      easyDashTableLib.CellPrinter[js.Any]
    ],
    sum: js.Any
  ): Aggregators = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avg")(avg)
    __obj.updateDynamic("printer")(printer)
    __obj.updateDynamic("sum")(sum)
    __obj.asInstanceOf[Aggregators]
  }
}


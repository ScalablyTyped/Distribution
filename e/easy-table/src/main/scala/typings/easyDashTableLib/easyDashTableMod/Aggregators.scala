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


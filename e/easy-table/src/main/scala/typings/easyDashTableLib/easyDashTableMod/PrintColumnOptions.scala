package typings
package easyDashTableLib.easyDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PrintColumnOptions[T] extends js.Object {
  /**
       * Printer to format column names
       */
  var namePrinter: js.UndefOr[easyDashTableLib.CellPrinter[T]] = js.undefined
  /**
       * Column separation string
       */
  var separator: js.UndefOr[java.lang.String] = js.undefined
}


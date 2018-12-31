package typings
package easyDashTableLib.easyDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFormat[T] extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var printer: js.UndefOr[easyDashTableLib.CellPrinter[T]] = js.undefined
}


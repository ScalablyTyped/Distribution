package typings
package easyDashTableLib.easyDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFormat[T] extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var printer: js.UndefOr[easyDashTableLib.CellPrinter[T]] = js.undefined
}

object ColumnFormat {
  @scala.inline
  def apply[T](name: java.lang.String = null, printer: easyDashTableLib.CellPrinter[T] = null): ColumnFormat[T] = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (printer != null) __obj.updateDynamic("printer")(printer)
    __obj.asInstanceOf[ColumnFormat[T]]
  }
}


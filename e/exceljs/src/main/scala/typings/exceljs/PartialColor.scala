package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Color> */
trait PartialColor extends js.Object {
  var argb: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[Double] = js.undefined
}

object PartialColor {
  @scala.inline
  def apply(argb: String = null, theme: Int | Double = null): PartialColor = {
    val __obj = js.Dynamic.literal()
    if (argb != null) __obj.updateDynamic("argb")(argb.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialColor]
  }
}


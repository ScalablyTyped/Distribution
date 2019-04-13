package typings
package flexmonsterLib.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalFormat extends js.Object {
  var column: js.UndefOr[scala.Double] = js.undefined
  var format: js.UndefOr[Style] = js.undefined
  var formatCSS: js.UndefOr[java.lang.String] = js.undefined
  var formula: js.UndefOr[java.lang.String] = js.undefined
  var hierarchy: js.UndefOr[java.lang.String] = js.undefined
  var isTotal: js.UndefOr[scala.Double] = js.undefined
  var measureName: js.UndefOr[java.lang.String] = js.undefined
  var member: js.UndefOr[java.lang.String] = js.undefined
  var row: js.UndefOr[scala.Double] = js.undefined
}

object ConditionalFormat {
  @scala.inline
  def apply(
    column: scala.Int | scala.Double = null,
    format: Style = null,
    formatCSS: java.lang.String = null,
    formula: java.lang.String = null,
    hierarchy: java.lang.String = null,
    isTotal: scala.Int | scala.Double = null,
    measureName: java.lang.String = null,
    member: java.lang.String = null,
    row: scala.Int | scala.Double = null
  ): ConditionalFormat = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatCSS != null) __obj.updateDynamic("formatCSS")(formatCSS)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy)
    if (isTotal != null) __obj.updateDynamic("isTotal")(isTotal.asInstanceOf[js.Any])
    if (measureName != null) __obj.updateDynamic("measureName")(measureName)
    if (member != null) __obj.updateDynamic("member")(member)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormat]
  }
}


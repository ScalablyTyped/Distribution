package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalFormat extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[Style] = js.undefined
  var formatCSS: js.UndefOr[String] = js.undefined
  var formula: js.UndefOr[String] = js.undefined
  var hierarchy: js.UndefOr[String] = js.undefined
  var isTotal: js.UndefOr[Double] = js.undefined
  var measureName: js.UndefOr[String] = js.undefined
  var member: js.UndefOr[String] = js.undefined
  var row: js.UndefOr[Double] = js.undefined
}

object ConditionalFormat {
  @scala.inline
  def apply(
    column: Int | Double = null,
    format: Style = null,
    formatCSS: String = null,
    formula: String = null,
    hierarchy: String = null,
    isTotal: Int | Double = null,
    measureName: String = null,
    member: String = null,
    row: Int | Double = null
  ): ConditionalFormat = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatCSS != null) __obj.updateDynamic("formatCSS")(formatCSS.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy.asInstanceOf[js.Any])
    if (isTotal != null) __obj.updateDynamic("isTotal")(isTotal.asInstanceOf[js.Any])
    if (measureName != null) __obj.updateDynamic("measureName")(measureName.asInstanceOf[js.Any])
    if (member != null) __obj.updateDynamic("member")(member.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormat]
  }
}


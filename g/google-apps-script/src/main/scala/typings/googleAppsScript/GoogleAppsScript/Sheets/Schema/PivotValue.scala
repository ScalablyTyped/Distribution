package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotValue extends js.Object {
  var calculatedDisplayType: js.UndefOr[String] = js.undefined
  var formula: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var sourceColumnOffset: js.UndefOr[Double] = js.undefined
  var summarizeFunction: js.UndefOr[String] = js.undefined
}

object PivotValue {
  @scala.inline
  def apply(
    calculatedDisplayType: String = null,
    formula: String = null,
    name: String = null,
    sourceColumnOffset: Int | Double = null,
    summarizeFunction: String = null
  ): PivotValue = {
    val __obj = js.Dynamic.literal()
    if (calculatedDisplayType != null) __obj.updateDynamic("calculatedDisplayType")(calculatedDisplayType.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sourceColumnOffset != null) __obj.updateDynamic("sourceColumnOffset")(sourceColumnOffset.asInstanceOf[js.Any])
    if (summarizeFunction != null) __obj.updateDynamic("summarizeFunction")(summarizeFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotValue]
  }
}


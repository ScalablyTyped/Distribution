package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotValue extends js.Object {
  var calculatedDisplayType: js.UndefOr[java.lang.String] = js.undefined
  var formula: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var sourceColumnOffset: js.UndefOr[scala.Double] = js.undefined
  var summarizeFunction: js.UndefOr[java.lang.String] = js.undefined
}

object PivotValue {
  @scala.inline
  def apply(
    calculatedDisplayType: java.lang.String = null,
    formula: java.lang.String = null,
    name: java.lang.String = null,
    sourceColumnOffset: scala.Int | scala.Double = null,
    summarizeFunction: java.lang.String = null
  ): PivotValue = {
    val __obj = js.Dynamic.literal()
    if (calculatedDisplayType != null) __obj.updateDynamic("calculatedDisplayType")(calculatedDisplayType)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sourceColumnOffset != null) __obj.updateDynamic("sourceColumnOffset")(sourceColumnOffset.asInstanceOf[js.Any])
    if (summarizeFunction != null) __obj.updateDynamic("summarizeFunction")(summarizeFunction)
    __obj.asInstanceOf[PivotValue]
  }
}


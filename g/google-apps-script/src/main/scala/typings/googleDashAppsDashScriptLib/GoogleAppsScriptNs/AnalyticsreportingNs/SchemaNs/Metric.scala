package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  var alias: js.UndefOr[java.lang.String] = js.undefined
  var expression: js.UndefOr[java.lang.String] = js.undefined
  var formattingType: js.UndefOr[java.lang.String] = js.undefined
}

object Metric {
  @scala.inline
  def apply(
    alias: java.lang.String = null,
    expression: java.lang.String = null,
    formattingType: java.lang.String = null
  ): Metric = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (formattingType != null) __obj.updateDynamic("formattingType")(formattingType)
    __obj.asInstanceOf[Metric]
  }
}


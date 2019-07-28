package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var expression: js.UndefOr[String] = js.undefined
  var formattingType: js.UndefOr[String] = js.undefined
}

object Metric {
  @scala.inline
  def apply(alias: String = null, expression: String = null, formattingType: String = null): Metric = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (formattingType != null) __obj.updateDynamic("formattingType")(formattingType)
    __obj.asInstanceOf[Metric]
  }
}


package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

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
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (formattingType != null) __obj.updateDynamic("formattingType")(formattingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
}


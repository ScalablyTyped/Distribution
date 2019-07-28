package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicChartDomain extends js.Object {
  var domain: js.UndefOr[ChartData] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object BasicChartDomain {
  @scala.inline
  def apply(domain: ChartData = null, reversed: js.UndefOr[Boolean] = js.undefined): BasicChartDomain = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[BasicChartDomain]
  }
}


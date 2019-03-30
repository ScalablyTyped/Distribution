package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicChartDomain extends js.Object {
  var domain: js.UndefOr[ChartData] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
}

object BasicChartDomain {
  @scala.inline
  def apply(domain: ChartData = null, reversed: js.UndefOr[scala.Boolean] = js.undefined): BasicChartDomain = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[BasicChartDomain]
  }
}


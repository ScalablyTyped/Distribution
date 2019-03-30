package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandlestickDomain extends js.Object {
  var data: js.UndefOr[ChartData] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
}

object CandlestickDomain {
  @scala.inline
  def apply(data: ChartData = null, reversed: js.UndefOr[scala.Boolean] = js.undefined): CandlestickDomain = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[CandlestickDomain]
  }
}


package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandlestickChartSpec extends js.Object {
  var data: js.UndefOr[js.Array[CandlestickData]] = js.undefined
  var domain: js.UndefOr[CandlestickDomain] = js.undefined
}

object CandlestickChartSpec {
  @scala.inline
  def apply(data: js.Array[CandlestickData] = null, domain: CandlestickDomain = null): CandlestickChartSpec = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    __obj.asInstanceOf[CandlestickChartSpec]
  }
}


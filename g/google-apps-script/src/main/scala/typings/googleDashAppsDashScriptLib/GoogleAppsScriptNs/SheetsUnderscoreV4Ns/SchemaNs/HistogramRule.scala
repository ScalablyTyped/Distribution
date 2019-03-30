package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramRule extends js.Object {
  var end: js.UndefOr[stdLib.Number] = js.undefined
  var interval: js.UndefOr[stdLib.Number] = js.undefined
  var start: js.UndefOr[stdLib.Number] = js.undefined
}

object HistogramRule {
  @scala.inline
  def apply(end: stdLib.Number = null, interval: stdLib.Number = null, start: stdLib.Number = null): HistogramRule = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[HistogramRule]
  }
}


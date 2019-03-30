package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  var end: js.UndefOr[Date] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[Date] = js.undefined
}

object DateRange {
  @scala.inline
  def apply(end: Date = null, kind: java.lang.String = null, start: Date = null): DateRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[DateRange]
  }
}


package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsGetSupportedHolidaysResponse extends js.Object {
  var holidays: js.UndefOr[js.Array[HolidaysHoliday]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ShippingsettingsGetSupportedHolidaysResponse {
  @scala.inline
  def apply(holidays: js.Array[HolidaysHoliday] = null, kind: java.lang.String = null): ShippingsettingsGetSupportedHolidaysResponse = {
    val __obj = js.Dynamic.literal()
    if (holidays != null) __obj.updateDynamic("holidays")(holidays)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ShippingsettingsGetSupportedHolidaysResponse]
  }
}


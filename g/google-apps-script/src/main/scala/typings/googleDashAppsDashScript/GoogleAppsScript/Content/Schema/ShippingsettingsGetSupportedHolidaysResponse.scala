package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsGetSupportedHolidaysResponse extends js.Object {
  var holidays: js.UndefOr[js.Array[HolidaysHoliday]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object ShippingsettingsGetSupportedHolidaysResponse {
  @scala.inline
  def apply(holidays: js.Array[HolidaysHoliday] = null, kind: String = null): ShippingsettingsGetSupportedHolidaysResponse = {
    val __obj = js.Dynamic.literal()
    if (holidays != null) __obj.updateDynamic("holidays")(holidays.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingsettingsGetSupportedHolidaysResponse]
  }
}


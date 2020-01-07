package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ShippingsettingsGetSupportedHolidaysResponse extends js.Object {
  /**
    * A list of holidays applicable for delivery guarantees. May be empty.
    */
  var holidays: js.UndefOr[js.Array[Schema$HolidaysHoliday]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#shippingsettingsGetSupportedHolidaysResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ShippingsettingsGetSupportedHolidaysResponse {
  @scala.inline
  def apply(holidays: js.Array[Schema$HolidaysHoliday] = null, kind: String = null): Schema$ShippingsettingsGetSupportedHolidaysResponse = {
    val __obj = js.Dynamic.literal()
    if (holidays != null) __obj.updateDynamic("holidays")(holidays.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ShippingsettingsGetSupportedHolidaysResponse]
  }
}


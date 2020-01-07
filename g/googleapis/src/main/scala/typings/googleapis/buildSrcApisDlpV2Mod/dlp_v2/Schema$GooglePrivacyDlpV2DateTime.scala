package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for a date time object. e.g. 2018-01-01, 5th August.
  */
@js.native
trait Schema$GooglePrivacyDlpV2DateTime extends js.Object {
  /**
    * One or more of the following must be set. All fields are optional, but
    * when set must be valid date or time values.
    */
  var date: js.UndefOr[Schema$GoogleTypeDate] = js.native
  var dayOfWeek: js.UndefOr[String] = js.native
  var time: js.UndefOr[Schema$GoogleTypeTimeOfDay] = js.native
  var timeZone: js.UndefOr[Schema$GooglePrivacyDlpV2TimeZone] = js.native
}

object Schema$GooglePrivacyDlpV2DateTime {
  @scala.inline
  def apply(
    date: Schema$GoogleTypeDate = null,
    dayOfWeek: String = null,
    time: Schema$GoogleTypeTimeOfDay = null,
    timeZone: Schema$GooglePrivacyDlpV2TimeZone = null
  ): Schema$GooglePrivacyDlpV2DateTime = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2DateTime]
  }
}


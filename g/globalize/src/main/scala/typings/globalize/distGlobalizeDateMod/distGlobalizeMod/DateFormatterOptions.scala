package typings.globalize.distGlobalizeDateMod.distGlobalizeMod

import typings.globalize.globalizeStrings.full
import typings.globalize.globalizeStrings.long
import typings.globalize.globalizeStrings.medium
import typings.globalize.globalizeStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFormatterOptions extends js.Object {
  /**
  		 * One of the following String values: full, long, medium, or short, eg. { date: "full" }.
  		 */
  var date: js.UndefOr[full | long | medium | short] = js.undefined
  /**
  		 * One of the following String values: full, long, medium, or short, eg. { datetime: "full" }
  		 */
  var datetime: js.UndefOr[full | long | medium | short] = js.undefined
  /**
  		 * String value indicating a machine raw pattern (anything in the "Sym." column) eg. { raw: "dd/mm" }.
  		 * Note this is NOT recommended for i18n in general. Use skeleton instead.
  		 */
  var raw: js.UndefOr[String] = js.undefined
  /**
  		 * String value indicating a skeleton (see description above), eg. { skeleton: "GyMMMd" }.
  		 * Skeleton provides a more flexible formatting mechanism than the predefined list full, long, medium, or short represented by date, time, or datetime.
  		 * Instead, they are an open-ended list of patterns containing only date field information, and in a canonical order.
  		 */
  var skeleton: js.UndefOr[String] = js.undefined
  /**
  		 * One of the following String values: full, long, medium, or short, eg. { time: "full" }.
  		 */
  var time: js.UndefOr[full | long | medium | short] = js.undefined
  /**
  		 * String based on the time zone names of the IANA time zone database,
  		 * such as "Asia/Shanghai", "Asia/Kolkata", "America/New_York".
  		 */
  var timeZone: js.UndefOr[String] = js.undefined
}

object DateFormatterOptions {
  @scala.inline
  def apply(
    date: full | long | medium | short = null,
    datetime: full | long | medium | short = null,
    raw: String = null,
    skeleton: String = null,
    time: full | long | medium | short = null,
    timeZone: String = null
  ): DateFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (datetime != null) __obj.updateDynamic("datetime")(datetime.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (skeleton != null) __obj.updateDynamic("skeleton")(skeleton.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormatterOptions]
  }
}


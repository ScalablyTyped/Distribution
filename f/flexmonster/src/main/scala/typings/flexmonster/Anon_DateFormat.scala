package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateFormat extends js.Object {
  var dateFormat: js.UndefOr[String] = js.undefined
  var timezoneOffset: js.UndefOr[Double] = js.undefined
  var weekOffset: js.UndefOr[Double] = js.undefined
}

object Anon_DateFormat {
  @scala.inline
  def apply(dateFormat: String = null, timezoneOffset: Int | Double = null, weekOffset: Int | Double = null): Anon_DateFormat = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (timezoneOffset != null) __obj.updateDynamic("timezoneOffset")(timezoneOffset.asInstanceOf[js.Any])
    if (weekOffset != null) __obj.updateDynamic("weekOffset")(weekOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateFormat]
  }
}


package typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setting extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The id of the user setting. */
  var id: js.UndefOr[String] = js.undefined
  /** Type of the resource ("calendar#setting"). */
  var kind: js.UndefOr[String] = js.undefined
  /** Value of the user setting. The format of the value depends on the ID of the setting. It must always be a UTF-8 string of length up to 1024 characters. */
  var value: js.UndefOr[String] = js.undefined
}

object Setting {
  @scala.inline
  def apply(etag: String = null, id: String = null, kind: String = null, value: String = null): Setting = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Setting]
  }
}


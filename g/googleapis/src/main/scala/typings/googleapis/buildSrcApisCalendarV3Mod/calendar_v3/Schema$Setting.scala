package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Setting extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The id of the user setting.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of the resource (&quot;calendar#setting&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Value of the user setting. The format of the value depends on the ID of
    * the setting. It must always be a UTF-8 string of length up to 1024
    * characters.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$Setting {
  @scala.inline
  def apply(etag: String = null, id: String = null, kind: String = null, value: String = null): Schema$Setting = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Setting]
  }
}


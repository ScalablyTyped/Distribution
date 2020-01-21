package typings.gapiClientPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  /** The placeholder key for this arg, as a string. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The screen rectangles being referred to, with dimensions measured in CSS pixels. This is only ever used for SNAPSHOT_RECT arguments. If this is absent
    * for a SNAPSHOT_RECT argument, it means that that argument refers to the entire snapshot.
    */
  var rects: js.UndefOr[js.Array[AnonHeight]] = js.undefined
  /** Secondary screen rectangles being referred to, with dimensions measured in CSS pixels. This is only ever used for SNAPSHOT_RECT arguments. */
  var secondary_rects: js.UndefOr[js.Array[AnonHeight]] = js.undefined
  /** Type of argument. One of URL, STRING_LITERAL, INT_LITERAL, BYTES, DURATION, VERBATIM_STRING, PERCENTAGE, HYPERLINK, or SNAPSHOT_RECT. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Argument value, as a localized string. */
  var value: js.UndefOr[String] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply(
    key: String = null,
    rects: js.Array[AnonHeight] = null,
    secondary_rects: js.Array[AnonHeight] = null,
    `type`: String = null,
    value: String = null
  ): AnonKey = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (rects != null) __obj.updateDynamic("rects")(rects.asInstanceOf[js.Any])
    if (secondary_rects != null) __obj.updateDynamic("secondary_rects")(secondary_rects.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}


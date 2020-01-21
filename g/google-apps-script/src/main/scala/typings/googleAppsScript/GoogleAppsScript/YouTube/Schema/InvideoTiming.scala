package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvideoTiming extends js.Object {
  var durationMs: js.UndefOr[String] = js.undefined
  var offsetMs: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object InvideoTiming {
  @scala.inline
  def apply(durationMs: String = null, offsetMs: String = null, `type`: String = null): InvideoTiming = {
    val __obj = js.Dynamic.literal()
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs.asInstanceOf[js.Any])
    if (offsetMs != null) __obj.updateDynamic("offsetMs")(offsetMs.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvideoTiming]
  }
}


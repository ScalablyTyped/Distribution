package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvideoTiming extends js.Object {
  var durationMs: js.UndefOr[java.lang.String] = js.undefined
  var offsetMs: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object InvideoTiming {
  @scala.inline
  def apply(
    durationMs: java.lang.String = null,
    offsetMs: java.lang.String = null,
    `type`: java.lang.String = null
  ): InvideoTiming = {
    val __obj = js.Dynamic.literal()
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs)
    if (offsetMs != null) __obj.updateDynamic("offsetMs")(offsetMs)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InvideoTiming]
  }
}


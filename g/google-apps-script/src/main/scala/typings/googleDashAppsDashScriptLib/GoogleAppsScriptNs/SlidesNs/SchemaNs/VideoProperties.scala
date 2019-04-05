package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProperties extends js.Object {
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var mute: js.UndefOr[scala.Boolean] = js.undefined
  var outline: js.UndefOr[Outline] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
}

object VideoProperties {
  @scala.inline
  def apply(
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    mute: js.UndefOr[scala.Boolean] = js.undefined,
    outline: Outline = null,
    start: scala.Int | scala.Double = null
  ): VideoProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProperties]
  }
}


package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdBreak extends js.Object {
  var midrollSeconds: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var slot: js.UndefOr[js.Array[AdSlot]] = js.undefined
}

object AdBreak {
  @scala.inline
  def apply(
    midrollSeconds: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    slot: js.Array[AdSlot] = null
  ): AdBreak = {
    val __obj = js.Dynamic.literal()
    if (midrollSeconds != null) __obj.updateDynamic("midrollSeconds")(midrollSeconds.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    __obj.asInstanceOf[AdBreak]
  }
}


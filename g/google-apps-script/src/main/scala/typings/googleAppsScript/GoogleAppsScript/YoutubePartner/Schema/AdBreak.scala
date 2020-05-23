package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdBreak extends js.Object {
  var midrollSeconds: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[js.Array[AdSlot]] = js.undefined
}

object AdBreak {
  @scala.inline
  def apply(
    midrollSeconds: js.UndefOr[Double] = js.undefined,
    position: String = null,
    slot: js.Array[AdSlot] = null
  ): AdBreak = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(midrollSeconds)) __obj.updateDynamic("midrollSeconds")(midrollSeconds.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdBreak]
  }
}


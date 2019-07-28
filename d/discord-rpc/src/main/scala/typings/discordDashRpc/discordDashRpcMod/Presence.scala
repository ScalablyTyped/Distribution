package typings.discordDashRpc.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Presence extends js.Object {
  var details: js.UndefOr[String] = js.undefined
  var endTimestamp: js.UndefOr[Double] = js.undefined
  var instance: js.UndefOr[Boolean] = js.undefined
  var largeImageKey: js.UndefOr[String] = js.undefined
  var largeImageText: js.UndefOr[String] = js.undefined
  var smallImageKey: js.UndefOr[String] = js.undefined
  var smallImageText: js.UndefOr[String] = js.undefined
  var startTimestamp: js.UndefOr[Double] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object Presence {
  @scala.inline
  def apply(
    details: String = null,
    endTimestamp: Int | Double = null,
    instance: js.UndefOr[Boolean] = js.undefined,
    largeImageKey: String = null,
    largeImageText: String = null,
    smallImageKey: String = null,
    smallImageText: String = null,
    startTimestamp: Int | Double = null,
    state: String = null
  ): Presence = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    if (endTimestamp != null) __obj.updateDynamic("endTimestamp")(endTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(instance)) __obj.updateDynamic("instance")(instance)
    if (largeImageKey != null) __obj.updateDynamic("largeImageKey")(largeImageKey)
    if (largeImageText != null) __obj.updateDynamic("largeImageText")(largeImageText)
    if (smallImageKey != null) __obj.updateDynamic("smallImageKey")(smallImageKey)
    if (smallImageText != null) __obj.updateDynamic("smallImageText")(smallImageText)
    if (startTimestamp != null) __obj.updateDynamic("startTimestamp")(startTimestamp.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Presence]
  }
}


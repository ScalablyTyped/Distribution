package typings
package discordDashRpcLib.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Presence extends js.Object {
  var details: js.UndefOr[java.lang.String] = js.undefined
  var endTimestamp: js.UndefOr[scala.Double] = js.undefined
  var instance: js.UndefOr[scala.Boolean] = js.undefined
  var largeImageKey: js.UndefOr[java.lang.String] = js.undefined
  var largeImageText: js.UndefOr[java.lang.String] = js.undefined
  var smallImageKey: js.UndefOr[java.lang.String] = js.undefined
  var smallImageText: js.UndefOr[java.lang.String] = js.undefined
  var startTimestamp: js.UndefOr[scala.Double] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object Presence {
  @scala.inline
  def apply(
    details: java.lang.String = null,
    endTimestamp: scala.Int | scala.Double = null,
    instance: js.UndefOr[scala.Boolean] = js.undefined,
    largeImageKey: java.lang.String = null,
    largeImageText: java.lang.String = null,
    smallImageKey: java.lang.String = null,
    smallImageText: java.lang.String = null,
    startTimestamp: scala.Int | scala.Double = null,
    state: java.lang.String = null
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


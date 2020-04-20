package typings.discordRpc.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Presence extends js.Object {
  var details: js.UndefOr[String] = js.undefined
  var endTimestamp: js.UndefOr[Double | Date] = js.undefined
  var instance: js.UndefOr[Boolean] = js.undefined
  var joinSecret: js.UndefOr[String] = js.undefined
  var largeImageKey: js.UndefOr[String] = js.undefined
  var largeImageText: js.UndefOr[String] = js.undefined
  var matchSecret: js.UndefOr[String] = js.undefined
  var partyMax: js.UndefOr[Double] = js.undefined
  var partySize: js.UndefOr[Double] = js.undefined
  var smallImageKey: js.UndefOr[String] = js.undefined
  var smallImageText: js.UndefOr[String] = js.undefined
  var spectateSecret: js.UndefOr[String] = js.undefined
  var startTimestamp: js.UndefOr[Double | Date] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object Presence {
  @scala.inline
  def apply(
    details: String = null,
    endTimestamp: Double | Date = null,
    instance: js.UndefOr[Boolean] = js.undefined,
    joinSecret: String = null,
    largeImageKey: String = null,
    largeImageText: String = null,
    matchSecret: String = null,
    partyMax: Int | Double = null,
    partySize: Int | Double = null,
    smallImageKey: String = null,
    smallImageText: String = null,
    spectateSecret: String = null,
    startTimestamp: Double | Date = null,
    state: String = null
  ): Presence = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (endTimestamp != null) __obj.updateDynamic("endTimestamp")(endTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(instance)) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (joinSecret != null) __obj.updateDynamic("joinSecret")(joinSecret.asInstanceOf[js.Any])
    if (largeImageKey != null) __obj.updateDynamic("largeImageKey")(largeImageKey.asInstanceOf[js.Any])
    if (largeImageText != null) __obj.updateDynamic("largeImageText")(largeImageText.asInstanceOf[js.Any])
    if (matchSecret != null) __obj.updateDynamic("matchSecret")(matchSecret.asInstanceOf[js.Any])
    if (partyMax != null) __obj.updateDynamic("partyMax")(partyMax.asInstanceOf[js.Any])
    if (partySize != null) __obj.updateDynamic("partySize")(partySize.asInstanceOf[js.Any])
    if (smallImageKey != null) __obj.updateDynamic("smallImageKey")(smallImageKey.asInstanceOf[js.Any])
    if (smallImageText != null) __obj.updateDynamic("smallImageText")(smallImageText.asInstanceOf[js.Any])
    if (spectateSecret != null) __obj.updateDynamic("spectateSecret")(spectateSecret.asInstanceOf[js.Any])
    if (startTimestamp != null) __obj.updateDynamic("startTimestamp")(startTimestamp.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Presence]
  }
}


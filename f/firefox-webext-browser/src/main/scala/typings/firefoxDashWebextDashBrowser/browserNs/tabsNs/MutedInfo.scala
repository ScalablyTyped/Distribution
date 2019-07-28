package typings.firefoxDashWebextDashBrowser.browserNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tab muted state and the reason for the last state change. */
trait MutedInfo extends js.Object {
  /**
    * The ID of the extension that changed the muted state. Not set if an extension was not the reason the muted
    * state last changed.
    */
  var extensionId: js.UndefOr[String] = js.undefined
  /**
    * Whether the tab is prevented from playing sound (but hasn't necessarily recently produced sound). Equivalent
    * to whether the muted audio indicator is showing.
    */
  var muted: Boolean
  /** The reason the tab was muted or unmuted. Not set if the tab's mute state has never been changed. */
  var reason: js.UndefOr[MutedInfoReason] = js.undefined
}

object MutedInfo {
  @scala.inline
  def apply(muted: Boolean, extensionId: String = null, reason: MutedInfoReason = null): MutedInfo = {
    val __obj = js.Dynamic.literal(muted = muted)
    if (extensionId != null) __obj.updateDynamic("extensionId")(extensionId)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[MutedInfo]
  }
}


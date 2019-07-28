package typings.gapiDotClientDotFirebasedynamiclinks.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsInfo extends js.Object {
  /** Google Play Campaign Measurements. */
  var googlePlayAnalytics: js.UndefOr[GooglePlayAnalytics] = js.undefined
  /** iTunes Connect App Analytics. */
  var itunesConnectAnalytics: js.UndefOr[ITunesConnectAnalytics] = js.undefined
}

object AnalyticsInfo {
  @scala.inline
  def apply(
    googlePlayAnalytics: GooglePlayAnalytics = null,
    itunesConnectAnalytics: ITunesConnectAnalytics = null
  ): AnalyticsInfo = {
    val __obj = js.Dynamic.literal()
    if (googlePlayAnalytics != null) __obj.updateDynamic("googlePlayAnalytics")(googlePlayAnalytics)
    if (itunesConnectAnalytics != null) __obj.updateDynamic("itunesConnectAnalytics")(itunesConnectAnalytics)
    __obj.asInstanceOf[AnalyticsInfo]
  }
}


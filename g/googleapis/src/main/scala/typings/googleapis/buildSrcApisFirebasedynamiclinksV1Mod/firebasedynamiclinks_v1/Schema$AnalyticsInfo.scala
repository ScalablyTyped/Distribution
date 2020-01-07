package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracking parameters supported by Dynamic Link.
  */
@js.native
trait Schema$AnalyticsInfo extends js.Object {
  /**
    * Google Play Campaign Measurements.
    */
  var googlePlayAnalytics: js.UndefOr[Schema$GooglePlayAnalytics] = js.native
  /**
    * iTunes Connect App Analytics.
    */
  var itunesConnectAnalytics: js.UndefOr[Schema$ITunesConnectAnalytics] = js.native
}

object Schema$AnalyticsInfo {
  @scala.inline
  def apply(
    googlePlayAnalytics: Schema$GooglePlayAnalytics = null,
    itunesConnectAnalytics: Schema$ITunesConnectAnalytics = null
  ): Schema$AnalyticsInfo = {
    val __obj = js.Dynamic.literal()
    if (googlePlayAnalytics != null) __obj.updateDynamic("googlePlayAnalytics")(googlePlayAnalytics.asInstanceOf[js.Any])
    if (itunesConnectAnalytics != null) __obj.updateDynamic("itunesConnectAnalytics")(itunesConnectAnalytics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnalyticsInfo]
  }
}


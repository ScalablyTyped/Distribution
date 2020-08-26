package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsInfo extends js.Object {
  /** Google Play Campaign Measurements. */
  var googlePlayAnalytics: js.UndefOr[GooglePlayAnalytics] = js.native
  /** iTunes Connect App Analytics. */
  var itunesConnectAnalytics: js.UndefOr[ITunesConnectAnalytics] = js.native
}

object AnalyticsInfo {
  @scala.inline
  def apply(): AnalyticsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsInfo]
  }
  @scala.inline
  implicit class AnalyticsInfoOps[Self <: AnalyticsInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGooglePlayAnalytics(value: GooglePlayAnalytics): Self = this.set("googlePlayAnalytics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGooglePlayAnalytics: Self = this.set("googlePlayAnalytics", js.undefined)
    @scala.inline
    def setItunesConnectAnalytics(value: ITunesConnectAnalytics): Self = this.set("itunesConnectAnalytics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItunesConnectAnalytics: Self = this.set("itunesConnectAnalytics", js.undefined)
  }
  
}


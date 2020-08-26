package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITunesConnectAnalytics extends js.Object {
  /** Affiliate token used to create affiliate-coded links. */
  var at: js.UndefOr[String] = js.native
  /**
    * Campaign text that developers can optionally add to any link in order to
    * track sales from a specific marketing campaign.
    */
  var ct: js.UndefOr[String] = js.native
  /** iTune media types, including music, podcasts, audiobooks and so on. */
  var mt: js.UndefOr[String] = js.native
  /**
    * Provider token that enables analytics for Dynamic Links from within iTunes
    * Connect.
    */
  var pt: js.UndefOr[String] = js.native
}

object ITunesConnectAnalytics {
  @scala.inline
  def apply(): ITunesConnectAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITunesConnectAnalytics]
  }
  @scala.inline
  implicit class ITunesConnectAnalyticsOps[Self <: ITunesConnectAnalytics] (val x: Self) extends AnyVal {
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
    def setAt(value: String): Self = this.set("at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAt: Self = this.set("at", js.undefined)
    @scala.inline
    def setCt(value: String): Self = this.set("ct", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCt: Self = this.set("ct", js.undefined)
    @scala.inline
    def setMt(value: String): Self = this.set("mt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMt: Self = this.set("mt", js.undefined)
    @scala.inline
    def setPt(value: String): Self = this.set("pt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePt: Self = this.set("pt", js.undefined)
  }
  
}


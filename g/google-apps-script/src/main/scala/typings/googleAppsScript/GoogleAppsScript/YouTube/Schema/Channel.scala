package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  var auditDetails: js.UndefOr[ChannelAuditDetails] = js.native
  var brandingSettings: js.UndefOr[ChannelBrandingSettings] = js.native
  var contentDetails: js.UndefOr[ChannelContentDetails] = js.native
  var contentOwnerDetails: js.UndefOr[ChannelContentOwnerDetails] = js.native
  var conversionPings: js.UndefOr[ChannelConversionPings] = js.native
  var etag: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var invideoPromotion: js.UndefOr[InvideoPromotion] = js.native
  var kind: js.UndefOr[String] = js.native
  var localizations: js.UndefOr[js.Object] = js.native
  var snippet: js.UndefOr[ChannelSnippet] = js.native
  var statistics: js.UndefOr[ChannelStatistics] = js.native
  var status: js.UndefOr[ChannelStatus] = js.native
  var topicDetails: js.UndefOr[ChannelTopicDetails] = js.native
}

object Channel {
  @scala.inline
  def apply(): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
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
    def setAuditDetails(value: ChannelAuditDetails): Self = this.set("auditDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditDetails: Self = this.set("auditDetails", js.undefined)
    @scala.inline
    def setBrandingSettings(value: ChannelBrandingSettings): Self = this.set("brandingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrandingSettings: Self = this.set("brandingSettings", js.undefined)
    @scala.inline
    def setContentDetails(value: ChannelContentDetails): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDetails: Self = this.set("contentDetails", js.undefined)
    @scala.inline
    def setContentOwnerDetails(value: ChannelContentOwnerDetails): Self = this.set("contentOwnerDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentOwnerDetails: Self = this.set("contentOwnerDetails", js.undefined)
    @scala.inline
    def setConversionPings(value: ChannelConversionPings): Self = this.set("conversionPings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversionPings: Self = this.set("conversionPings", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInvideoPromotion(value: InvideoPromotion): Self = this.set("invideoPromotion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvideoPromotion: Self = this.set("invideoPromotion", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLocalizations(value: js.Object): Self = this.set("localizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizations: Self = this.set("localizations", js.undefined)
    @scala.inline
    def setSnippet(value: ChannelSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    @scala.inline
    def setStatistics(value: ChannelStatistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    @scala.inline
    def setStatus(value: ChannelStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTopicDetails(value: ChannelTopicDetails): Self = this.set("topicDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicDetails: Self = this.set("topicDetails", js.undefined)
  }
  
}


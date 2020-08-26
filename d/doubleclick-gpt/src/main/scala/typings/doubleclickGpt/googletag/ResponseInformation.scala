package typings.doubleclickGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseInformation extends js.Object {
  var advertiserId: String = js.native
  var campaignId: String = js.native
  var creativeId: js.UndefOr[Double] = js.native
  var creativeTemplateId: js.UndefOr[Double] = js.native
  var lineItemId: js.UndefOr[Double] = js.native
}

object ResponseInformation {
  @scala.inline
  def apply(advertiserId: String, campaignId: String): ResponseInformation = {
    val __obj = js.Dynamic.literal(advertiserId = advertiserId.asInstanceOf[js.Any], campaignId = campaignId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInformation]
  }
  @scala.inline
  implicit class ResponseInformationOps[Self <: ResponseInformation] (val x: Self) extends AnyVal {
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreativeId(value: Double): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    @scala.inline
    def setCreativeTemplateId(value: Double): Self = this.set("creativeTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeTemplateId: Self = this.set("creativeTemplateId", js.undefined)
    @scala.inline
    def setLineItemId(value: Double): Self = this.set("lineItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineItemId: Self = this.set("lineItemId", js.undefined)
  }
  
}


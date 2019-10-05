package typings.doubleclickDashGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseInformation extends js.Object {
  var advertiserId: String
  var campaignId: String
  var creativeId: js.UndefOr[Double] = js.undefined
  var creativeTemplateId: js.UndefOr[Double] = js.undefined
  var lineItemId: js.UndefOr[Double] = js.undefined
}

object ResponseInformation {
  @scala.inline
  def apply(
    advertiserId: String,
    campaignId: String,
    creativeId: Int | Double = null,
    creativeTemplateId: Int | Double = null,
    lineItemId: Int | Double = null
  ): ResponseInformation = {
    val __obj = js.Dynamic.literal(advertiserId = advertiserId, campaignId = campaignId)
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (creativeTemplateId != null) __obj.updateDynamic("creativeTemplateId")(creativeTemplateId.asInstanceOf[js.Any])
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInformation]
  }
}


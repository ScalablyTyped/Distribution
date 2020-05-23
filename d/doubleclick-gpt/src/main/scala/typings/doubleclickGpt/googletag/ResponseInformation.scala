package typings.doubleclickGpt.googletag

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
    creativeId: js.UndefOr[Double] = js.undefined,
    creativeTemplateId: js.UndefOr[Double] = js.undefined,
    lineItemId: js.UndefOr[Double] = js.undefined
  ): ResponseInformation = {
    val __obj = js.Dynamic.literal(advertiserId = advertiserId.asInstanceOf[js.Any], campaignId = campaignId.asInstanceOf[js.Any])
    if (!js.isUndefined(creativeId)) __obj.updateDynamic("creativeId")(creativeId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(creativeTemplateId)) __obj.updateDynamic("creativeTemplateId")(creativeTemplateId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineItemId)) __obj.updateDynamic("lineItemId")(lineItemId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInformation]
  }
}


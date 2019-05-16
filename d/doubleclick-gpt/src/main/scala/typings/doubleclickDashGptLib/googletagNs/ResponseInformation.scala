package typings
package doubleclickDashGptLib.googletagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseInformation extends js.Object {
  var advertiserId: java.lang.String
  var campaignId: java.lang.String
  var creativeId: js.UndefOr[scala.Double] = js.undefined
  var creativeTemplateId: js.UndefOr[scala.Double] = js.undefined
  var lineItemId: js.UndefOr[scala.Double] = js.undefined
}

object ResponseInformation {
  @scala.inline
  def apply(
    advertiserId: java.lang.String,
    campaignId: java.lang.String,
    creativeId: scala.Int | scala.Double = null,
    creativeTemplateId: scala.Int | scala.Double = null,
    lineItemId: scala.Int | scala.Double = null
  ): ResponseInformation = {
    val __obj = js.Dynamic.literal(advertiserId = advertiserId, campaignId = campaignId)
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (creativeTemplateId != null) __obj.updateDynamic("creativeTemplateId")(creativeTemplateId.asInstanceOf[js.Any])
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInformation]
  }
}


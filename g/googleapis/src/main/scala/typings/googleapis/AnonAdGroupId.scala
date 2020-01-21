package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdGroupId extends js.Object {
  var adGroupId: js.UndefOr[String] = js.native
  var adId: js.UndefOr[String] = js.native
  var advertiserId: js.UndefOr[String] = js.native
  var agencyId: js.UndefOr[String] = js.native
  var campaignId: js.UndefOr[String] = js.native
  var engineAccountId: js.UndefOr[String] = js.native
  var keywordId: js.UndefOr[String] = js.native
}

object AnonAdGroupId {
  @scala.inline
  def apply(
    adGroupId: String = null,
    adId: String = null,
    advertiserId: String = null,
    agencyId: String = null,
    campaignId: String = null,
    engineAccountId: String = null,
    keywordId: String = null
  ): AnonAdGroupId = {
    val __obj = js.Dynamic.literal()
    if (adGroupId != null) __obj.updateDynamic("adGroupId")(adGroupId.asInstanceOf[js.Any])
    if (adId != null) __obj.updateDynamic("adId")(adId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (agencyId != null) __obj.updateDynamic("agencyId")(agencyId.asInstanceOf[js.Any])
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId.asInstanceOf[js.Any])
    if (engineAccountId != null) __obj.updateDynamic("engineAccountId")(engineAccountId.asInstanceOf[js.Any])
    if (keywordId != null) __obj.updateDynamic("keywordId")(keywordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdGroupId]
  }
}


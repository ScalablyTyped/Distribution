package typings.gapiClientDoubleclicksearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdGroupId extends js.Object {
  /** DS ad group ID. */
  var adGroupId: js.UndefOr[String] = js.undefined
  /** DS ad ID. */
  var adId: js.UndefOr[String] = js.undefined
  /** DS advertiser ID. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** DS agency ID. */
  var agencyId: js.UndefOr[String] = js.undefined
  /** DS campaign ID. */
  var campaignId: js.UndefOr[String] = js.undefined
  /** DS engine account ID. */
  var engineAccountId: js.UndefOr[String] = js.undefined
  /** DS keyword ID. */
  var keywordId: js.UndefOr[String] = js.undefined
}

object AdGroupId {
  @scala.inline
  def apply(
    adGroupId: String = null,
    adId: String = null,
    advertiserId: String = null,
    agencyId: String = null,
    campaignId: String = null,
    engineAccountId: String = null,
    keywordId: String = null
  ): AdGroupId = {
    val __obj = js.Dynamic.literal()
    if (adGroupId != null) __obj.updateDynamic("adGroupId")(adGroupId.asInstanceOf[js.Any])
    if (adId != null) __obj.updateDynamic("adId")(adId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (agencyId != null) __obj.updateDynamic("agencyId")(agencyId.asInstanceOf[js.Any])
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId.asInstanceOf[js.Any])
    if (engineAccountId != null) __obj.updateDynamic("engineAccountId")(engineAccountId.asInstanceOf[js.Any])
    if (keywordId != null) __obj.updateDynamic("keywordId")(keywordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdGroupId]
  }
}


package typings.gapiDotClientDotDoubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdGroupId extends js.Object {
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

object Anon_AdGroupId {
  @scala.inline
  def apply(
    adGroupId: String = null,
    adId: String = null,
    advertiserId: String = null,
    agencyId: String = null,
    campaignId: String = null,
    engineAccountId: String = null,
    keywordId: String = null
  ): Anon_AdGroupId = {
    val __obj = js.Dynamic.literal()
    if (adGroupId != null) __obj.updateDynamic("adGroupId")(adGroupId)
    if (adId != null) __obj.updateDynamic("adId")(adId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (agencyId != null) __obj.updateDynamic("agencyId")(agencyId)
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId)
    if (engineAccountId != null) __obj.updateDynamic("engineAccountId")(engineAccountId)
    if (keywordId != null) __obj.updateDynamic("keywordId")(keywordId)
    __obj.asInstanceOf[Anon_AdGroupId]
  }
}


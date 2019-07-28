package typings.gapiDotClientDotAdexchangebuyer2.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Creative extends js.Object {
  /**
    * The account that this creative belongs to.
    * Can be used to filter the response of the
    * creatives.list
    * method.
    */
  var accountId: js.UndefOr[String] = js.undefined
  /** The link to AdChoices destination page. */
  var adChoicesDestinationUrl: js.UndefOr[String] = js.undefined
  /** The name of the company being advertised in the creative. */
  var advertiserName: js.UndefOr[String] = js.undefined
  /** The agency ID for this creative. */
  var agencyId: js.UndefOr[String] = js.undefined
  /** @OutputOnly The last update timestamp of the creative via API. */
  var apiUpdateTime: js.UndefOr[String] = js.undefined
  /**
    * All attributes for the ads that may be shown from this creative.
    * Can be used to filter the response of the
    * creatives.list
    * method.
    */
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  /** The set of destination URLs for the creative. */
  var clickThroughUrls: js.UndefOr[js.Array[String]] = js.undefined
  /** @OutputOnly Shows any corrections that were applied to this creative. */
  var corrections: js.UndefOr[js.Array[Correction]] = js.undefined
  /**
    * The buyer-defined creative ID of this creative.
    * Can be used to filter the response of the
    * creatives.list
    * method.
    */
  var creativeId: js.UndefOr[String] = js.undefined
  /**
    * @OutputOnly The top-level deals status of this creative.
    * If disapproved, an entry for 'auctionType=DIRECT_DEALS' (or 'ALL') in
    * serving_restrictions will also exist. Note
    * that this may be nuanced with other contextual restrictions, in which case,
    * it may be preferable to read from serving_restrictions directly.
    * Can be used to filter the response of the
    * creatives.list
    * method.
    */
  var dealsStatus: js.UndefOr[String] = js.undefined
  /** @OutputOnly Detected advertiser IDs, if any. */
  var detectedAdvertiserIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @OutputOnly
    * The detected domains for this creative.
    */
  var detectedDomains: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @OutputOnly
    * The detected languages for this creative. The order is arbitrary. The codes
    * are 2 or 5 characters and are documented at
    * https://developers.google.com/adwords/api/docs/appendix/languagecodes.
    */
  var detectedLanguages: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @OutputOnly Detected product categories, if any.
    * See the ad-product-categories.txt file in the technical documentation
    * for a list of IDs.
    */
  var detectedProductCategories: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * @OutputOnly Detected sensitive categories, if any.
    * See the ad-sensitive-categories.txt file in the technical documentation for
    * a list of IDs. You should use these IDs along with the
    * excluded-sensitive-category field in the bid request to filter your bids.
    */
  var detectedSensitiveCategories: js.UndefOr[js.Array[Double]] = js.undefined
  /** @OutputOnly The filtering stats for this creative. */
  var filteringStats: js.UndefOr[FilteringStats] = js.undefined
  /** An HTML creative. */
  var html: js.UndefOr[HtmlContent] = js.undefined
  /** The set of URLs to be called to record an impression. */
  var impressionTrackingUrls: js.UndefOr[js.Array[String]] = js.undefined
  /** A native creative. */
  var native: js.UndefOr[NativeContent] = js.undefined
  /**
    * @OutputOnly The top-level open auction status of this creative.
    * If disapproved, an entry for 'auctionType = OPEN_AUCTION' (or 'ALL') in
    * serving_restrictions will also exist. Note
    * that this may be nuanced with other contextual restrictions, in which case,
    * it may be preferable to read from serving_restrictions directly.
    * Can be used to filter the response of the
    * creatives.list
    * method.
    */
  var openAuctionStatus: js.UndefOr[String] = js.undefined
  /** All restricted categories for the ads that may be shown from this creative. */
  var restrictedCategories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @OutputOnly The granular status of this ad in specific contexts.
    * A context here relates to where something ultimately serves (for example,
    * a physical location, a platform, an HTTPS vs HTTP request, or the type
    * of auction).
    */
  var servingRestrictions: js.UndefOr[js.Array[ServingRestriction]] = js.undefined
  /**
    * All vendor IDs for the ads that may be shown from this creative.
    * See https://storage.googleapis.com/adx-rtb-dictionaries/vendors.txt
    * for possible values.
    */
  var vendorIds: js.UndefOr[js.Array[Double]] = js.undefined
  /** @OutputOnly The version of this creative. */
  var version: js.UndefOr[Double] = js.undefined
  /** A video creative. */
  var video: js.UndefOr[VideoContent] = js.undefined
}

object Creative {
  @scala.inline
  def apply(
    accountId: String = null,
    adChoicesDestinationUrl: String = null,
    advertiserName: String = null,
    agencyId: String = null,
    apiUpdateTime: String = null,
    attributes: js.Array[String] = null,
    clickThroughUrls: js.Array[String] = null,
    corrections: js.Array[Correction] = null,
    creativeId: String = null,
    dealsStatus: String = null,
    detectedAdvertiserIds: js.Array[String] = null,
    detectedDomains: js.Array[String] = null,
    detectedLanguages: js.Array[String] = null,
    detectedProductCategories: js.Array[Double] = null,
    detectedSensitiveCategories: js.Array[Double] = null,
    filteringStats: FilteringStats = null,
    html: HtmlContent = null,
    impressionTrackingUrls: js.Array[String] = null,
    native: NativeContent = null,
    openAuctionStatus: String = null,
    restrictedCategories: js.Array[String] = null,
    servingRestrictions: js.Array[ServingRestriction] = null,
    vendorIds: js.Array[Double] = null,
    version: Int | Double = null,
    video: VideoContent = null
  ): Creative = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (adChoicesDestinationUrl != null) __obj.updateDynamic("adChoicesDestinationUrl")(adChoicesDestinationUrl)
    if (advertiserName != null) __obj.updateDynamic("advertiserName")(advertiserName)
    if (agencyId != null) __obj.updateDynamic("agencyId")(agencyId)
    if (apiUpdateTime != null) __obj.updateDynamic("apiUpdateTime")(apiUpdateTime)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (clickThroughUrls != null) __obj.updateDynamic("clickThroughUrls")(clickThroughUrls)
    if (corrections != null) __obj.updateDynamic("corrections")(corrections)
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId)
    if (dealsStatus != null) __obj.updateDynamic("dealsStatus")(dealsStatus)
    if (detectedAdvertiserIds != null) __obj.updateDynamic("detectedAdvertiserIds")(detectedAdvertiserIds)
    if (detectedDomains != null) __obj.updateDynamic("detectedDomains")(detectedDomains)
    if (detectedLanguages != null) __obj.updateDynamic("detectedLanguages")(detectedLanguages)
    if (detectedProductCategories != null) __obj.updateDynamic("detectedProductCategories")(detectedProductCategories)
    if (detectedSensitiveCategories != null) __obj.updateDynamic("detectedSensitiveCategories")(detectedSensitiveCategories)
    if (filteringStats != null) __obj.updateDynamic("filteringStats")(filteringStats)
    if (html != null) __obj.updateDynamic("html")(html)
    if (impressionTrackingUrls != null) __obj.updateDynamic("impressionTrackingUrls")(impressionTrackingUrls)
    if (native != null) __obj.updateDynamic("native")(native)
    if (openAuctionStatus != null) __obj.updateDynamic("openAuctionStatus")(openAuctionStatus)
    if (restrictedCategories != null) __obj.updateDynamic("restrictedCategories")(restrictedCategories)
    if (servingRestrictions != null) __obj.updateDynamic("servingRestrictions")(servingRestrictions)
    if (vendorIds != null) __obj.updateDynamic("vendorIds")(vendorIds)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[Creative]
  }
}


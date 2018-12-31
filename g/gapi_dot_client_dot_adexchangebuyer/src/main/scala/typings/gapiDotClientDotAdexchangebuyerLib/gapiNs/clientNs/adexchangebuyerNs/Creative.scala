package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Creative extends js.Object {
  /** The HTML snippet that displays the ad when inserted in the web page. If set, videoURL should not be set. */
  var HTMLSnippet: js.UndefOr[java.lang.String] = js.undefined
  /** Account id. */
  var accountId: js.UndefOr[scala.Double] = js.undefined
  /** The link to the Ad Preferences page. This is only supported for native ads. */
  var adChoicesDestinationUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Detected advertiser id, if any. Read-only. This field should not be set in requests. */
  var advertiserId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The name of the company being advertised in the creative. The value provided must exist in the advertisers.txt file. */
  var advertiserName: js.UndefOr[java.lang.String] = js.undefined
  /** The agency id for this creative. */
  var agencyId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The last upload timestamp of this creative if it was uploaded via API. Read-only. The value of this field is generated, and will be ignored for
    * uploads. (formatted RFC 3339 timestamp).
    */
  var apiUploadTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of buyer selectable attributes for the ads that may be shown from this snippet. Each attribute is represented by an integer as defined in
    * buyer-declarable-creative-attributes.txt.
    */
  var attribute: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** A buyer-specific id identifying the creative in this ad. */
  var buyerCreativeId: js.UndefOr[java.lang.String] = js.undefined
  /** The set of destination urls for the snippet. */
  var clickThroughUrl: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Shows any corrections that were applied to this creative. Read-only. This field should not be set in requests. */
  var corrections: js.UndefOr[js.Array[gapiDotClientDotAdexchangebuyerLib.Anon_Contexts]] = js.undefined
  /**
    * Top-level deals status. Read-only. This field should not be set in requests. If disapproved, an entry for auctionType=DIRECT_DEALS (or ALL) in
    * servingRestrictions will also exist. Note that this may be nuanced with other contextual restrictions, in which case it may be preferable to read from
    * servingRestrictions directly.
    */
  var dealsStatus: js.UndefOr[java.lang.String] = js.undefined
  /** Detected domains for this creative. Read-only. This field should not be set in requests. */
  var detectedDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The filtering reasons for the creative. Read-only. This field should not be set in requests. */
  var filteringReasons: js.UndefOr[gapiDotClientDotAdexchangebuyerLib.Anon_Date] = js.undefined
  /** Ad height. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The set of urls to be called to record an impression. */
  var impressionTrackingUrl: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Detected languages for this creative. Read-only. This field should not be set in requests. */
  var languages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** If nativeAd is set, HTMLSnippet and the videoURL outside of nativeAd should not be set. (The videoURL inside nativeAd can be set.) */
  var nativeAd: js.UndefOr[gapiDotClientDotAdexchangebuyerLib.Anon_Headline] = js.undefined
  /**
    * Top-level open auction status. Read-only. This field should not be set in requests. If disapproved, an entry for auctionType=OPEN_AUCTION (or ALL) in
    * servingRestrictions will also exist. Note that this may be nuanced with other contextual restrictions, in which case it may be preferable to read from
    * ServingRestrictions directly.
    */
  var openAuctionStatus: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Detected product categories, if any. Each category is represented by an integer as defined in  ad-product-categories.txt. Read-only. This field should
    * not be set in requests.
    */
  var productCategories: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * All restricted categories for the ads that may be shown from this snippet. Each category is represented by an integer as defined in the
    * ad-restricted-categories.txt.
    */
  var restrictedCategories: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Detected sensitive categories, if any. Each category is represented by an integer as defined in  ad-sensitive-categories.txt. Read-only. This field
    * should not be set in requests.
    */
  var sensitiveCategories: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The granular status of this ad in specific contexts. A context here relates to where something ultimately serves (for example, a physical location, a
    * platform, an HTTPS vs HTTP request, or the type of auction). Read-only. This field should not be set in requests. See the examples in the Creatives
    * guide for more details.
    */
  var servingRestrictions: js.UndefOr[js.Array[gapiDotClientDotAdexchangebuyerLib.Anon_DisapprovalReasons]] = js.undefined
  /** List of vendor types for the ads that may be shown from this snippet. Each vendor type is represented by an integer as defined in vendors.txt. */
  var vendorType: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** The version for this creative. Read-only. This field should not be set in requests. */
  var version: js.UndefOr[scala.Double] = js.undefined
  /** The URL to fetch a video ad. If set, HTMLSnippet and the nativeAd should not be set. Note, this is different from resource.native_ad.video_url above. */
  var videoURL: js.UndefOr[java.lang.String] = js.undefined
  /** Ad width. */
  var width: js.UndefOr[scala.Double] = js.undefined
}


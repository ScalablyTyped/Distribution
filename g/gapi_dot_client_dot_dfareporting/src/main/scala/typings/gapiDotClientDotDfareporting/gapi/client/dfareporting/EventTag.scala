package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTag extends js.Object {
  /** Account ID of this event tag. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Advertiser ID of this event tag. This field or the campaignId field is required on insertion. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Campaign ID of this event tag. This field or the advertiserId field is required on insertion. */
  var campaignId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the campaign. This is a read-only, auto-generated field. */
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether this event tag should be automatically enabled for all of the advertiser's campaigns and ads. */
  var enabledByDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to remove this event tag from ads that are trafficked through DoubleClick Bid Manager to Ad Exchange. This may be useful if the event tag uses
    * a pixel that is unapproved for Ad Exchange bids on one or more networks, such as the Google Display Network.
    */
  var excludeFromAdxRequests: js.UndefOr[Boolean] = js.undefined
  /** ID of this event tag. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#eventTag". */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this event tag. This is a required field and must be less than 256 characters long. */
  var name: js.UndefOr[String] = js.undefined
  /** Site filter type for this event tag. If no type is specified then the event tag will be applied to all sites. */
  var siteFilterType: js.UndefOr[String] = js.undefined
  /** Filter list of site IDs associated with this event tag. The siteFilterType determines whether this is a whitelist or blacklist filter. */
  var siteIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Whether this tag is SSL-compliant or not. This is a read-only field. */
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  /** Status of this event tag. Must be ENABLED for this event tag to fire. This is a required field. */
  var status: js.UndefOr[String] = js.undefined
  /** Subaccount ID of this event tag. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
  /**
    * Event tag type. Can be used to specify whether to use a third-party pixel, a third-party JavaScript URL, or a third-party click-through URL for either
    * impression or click tracking. This is a required field.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Payload URL for this event tag. The URL on a click-through event tag should have a landing page URL appended to the end of it. This field is required
    * on insertion.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Number of times the landing page URL should be URL-escaped before being appended to the click-through event tag URL. Only applies to click-through
    * event tags as specified by the event tag type.
    */
  var urlEscapeLevels: js.UndefOr[Double] = js.undefined
}

object EventTag {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    campaignId: String = null,
    campaignIdDimensionValue: DimensionValue = null,
    enabledByDefault: js.UndefOr[Boolean] = js.undefined,
    excludeFromAdxRequests: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    name: String = null,
    siteFilterType: String = null,
    siteIds: js.Array[String] = null,
    sslCompliant: js.UndefOr[Boolean] = js.undefined,
    status: String = null,
    subaccountId: String = null,
    `type`: String = null,
    url: String = null,
    urlEscapeLevels: Int | Double = null
  ): EventTag = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId)
    if (campaignIdDimensionValue != null) __obj.updateDynamic("campaignIdDimensionValue")(campaignIdDimensionValue)
    if (!js.isUndefined(enabledByDefault)) __obj.updateDynamic("enabledByDefault")(enabledByDefault)
    if (!js.isUndefined(excludeFromAdxRequests)) __obj.updateDynamic("excludeFromAdxRequests")(excludeFromAdxRequests)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (siteFilterType != null) __obj.updateDynamic("siteFilterType")(siteFilterType)
    if (siteIds != null) __obj.updateDynamic("siteIds")(siteIds)
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (urlEscapeLevels != null) __obj.updateDynamic("urlEscapeLevels")(urlEscapeLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTag]
  }
}


package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTag extends js.Object {
  /** Account ID of this event tag. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Advertiser ID of this event tag. This field or the campaignId field is required on insertion. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Campaign ID of this event tag. This field or the advertiserId field is required on insertion. */
  var campaignId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the campaign. This is a read-only, auto-generated field. */
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether this event tag should be automatically enabled for all of the advertiser's campaigns and ads. */
  var enabledByDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to remove this event tag from ads that are trafficked through DoubleClick Bid Manager to Ad Exchange. This may be useful if the event tag uses
    * a pixel that is unapproved for Ad Exchange bids on one or more networks, such as the Google Display Network.
    */
  var excludeFromAdxRequests: js.UndefOr[scala.Boolean] = js.undefined
  /** ID of this event tag. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#eventTag". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this event tag. This is a required field and must be less than 256 characters long. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Site filter type for this event tag. If no type is specified then the event tag will be applied to all sites. */
  var siteFilterType: js.UndefOr[java.lang.String] = js.undefined
  /** Filter list of site IDs associated with this event tag. The siteFilterType determines whether this is a whitelist or blacklist filter. */
  var siteIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether this tag is SSL-compliant or not. This is a read-only field. */
  var sslCompliant: js.UndefOr[scala.Boolean] = js.undefined
  /** Status of this event tag. Must be ENABLED for this event tag to fire. This is a required field. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Subaccount ID of this event tag. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Event tag type. Can be used to specify whether to use a third-party pixel, a third-party JavaScript URL, or a third-party click-through URL for either
    * impression or click tracking. This is a required field.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Payload URL for this event tag. The URL on a click-through event tag should have a landing page URL appended to the end of it. This field is required
    * on insertion.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of times the landing page URL should be URL-escaped before being appended to the click-through event tag URL. Only applies to click-through
    * event tags as specified by the event tag type.
    */
  var urlEscapeLevels: js.UndefOr[scala.Double] = js.undefined
}


package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PretargetingConfig extends js.Object {
  /** The id for billing purposes, provided for reference. Leave this field blank for insert requests; the id will be generated automatically. */
  var billingId: js.UndefOr[java.lang.String] = js.undefined
  /** The config id; generated automatically. Leave this field blank for insert requests. */
  var configId: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the config. Must be unique. Required for all requests. */
  var configName: js.UndefOr[java.lang.String] = js.undefined
  /** List must contain exactly one of PRETARGETING_CREATIVE_TYPE_HTML or PRETARGETING_CREATIVE_TYPE_VIDEO. */
  var creativeType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Requests which allow one of these (width, height) pairs will match. All pairs must be supported ad dimensions. */
  var dimensions: js.UndefOr[js.Array[gapiDotClientDotAdexchangebuyerLib.Anon_HeightWidth]] = js.undefined
  /** Requests with any of these content labels will not match. Values are from content-labels.txt in the downloadable files section. */
  var excludedContentLabels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Requests containing any of these geo criteria ids will not match. */
  var excludedGeoCriteriaIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Requests containing any of these placements will not match. */
  var excludedPlacements: js.UndefOr[js.Array[gapiDotClientDotAdexchangebuyerLib.Anon_Token]] = js.undefined
  /** Requests containing any of these users list ids will not match. */
  var excludedUserLists: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Requests containing any of these vertical ids will not match. Values are from the publisher-verticals.txt file in the downloadable files section. */
  var excludedVerticals: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Requests containing any of these geo criteria ids will match. */
  var geoCriteriaIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether this config is active. Required for all requests. */
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  /** The kind of the resource, i.e. "adexchangebuyer#pretargetingConfig". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Request containing any of these language codes will match. */
  var languages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Requests where the predicted viewability is below the specified decile will not match. E.g. if the buyer sets this value to 5, requests from slots
    * where the predicted viewability is below 50% will not match. If the predicted viewability is unknown this field will be ignored.
    */
  var minimumViewabilityDecile: js.UndefOr[scala.Double] = js.undefined
  /** Requests containing any of these mobile carrier ids will match. Values are from mobile-carriers.csv in the downloadable files section. */
  var mobileCarriers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Requests containing any of these mobile device ids will match. Values are from mobile-devices.csv in the downloadable files section. */
  var mobileDevices: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Requests containing any of these mobile operating system version ids will match. Values are from mobile-os.csv in the downloadable files section. */
  var mobileOperatingSystemVersions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Requests containing any of these placements will match. */
  var placements: js.UndefOr[js.Array[gapiDotClientDotAdexchangebuyerLib.Anon_Token]] = js.undefined
  /**
    * Requests matching any of these platforms will match. Possible values are PRETARGETING_PLATFORM_MOBILE, PRETARGETING_PLATFORM_DESKTOP, and
    * PRETARGETING_PLATFORM_TABLET.
    */
  var platforms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Creative attributes should be declared here if all creatives corresponding to this pretargeting configuration have that creative attribute. Values are
    * from pretargetable-creative-attributes.txt in the downloadable files section.
    */
  var supportedCreativeAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Requests containing the specified type of user data will match. Possible values are HOSTED_MATCH_DATA, which means the request is cookie-targetable and
    * has a match in the buyer's hosted match table, and COOKIE_OR_IDFA, which means the request has either a targetable cookie or an iOS IDFA.
    */
  var userIdentifierDataRequired: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Requests containing any of these user list ids will match. */
  var userLists: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Requests that allow any of these vendor ids will match. Values are from vendors.txt in the downloadable files section. */
  var vendorTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Requests containing any of these vertical ids will match. */
  var verticals: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Video requests satisfying any of these player size constraints will match. */
  var videoPlayerSizes: js.UndefOr[js.Array[gapiDotClientDotAdexchangebuyerLib.Anon_AspectRatio]] = js.undefined
}


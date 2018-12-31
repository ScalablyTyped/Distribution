package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MinEndDate extends js.Object {
  /** Select only placements that belong to these advertisers. */
  var advertiserIds: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Select only archived placements. Don't set this field to select both archived and non-archived placements. */
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only placements that belong to these campaigns. */
  var campaignIds: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Select only placements that are associated with these compatibilities. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on
    * mobile devices for regular or interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to
    * rendering in in-stream video ads developed with the VAST standard.
    */
  var compatibilities: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements that are associated with these content categories. */
  var contentCategoryIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements that are associated with these directory sites. */
  var directorySiteIds: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements that belong to these placement groups. */
  var groupIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements with these IDs. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as "yyyy-MM-dd". */
  var maxEndDate: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as "yyyy-MM-dd". */
  var maxStartDate: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as "yyyy-MM-dd". */
  var minEndDate: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as "yyyy-MM-dd". */
  var minStartDate: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements with this payment source. */
  var paymentSource: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements that are associated with these placement strategies. */
  var placementStrategyIds: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only placements with these pricing types. */
  var pricingTypes: js.UndefOr[java.lang.String] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows searching for placements by name or ID. Wildcards (&#42;) are allowed. For example, "placement&#42;2015" will return placements with names like
    * "placement June 2015", "placement May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the start and the end
    * of the search string. For example, a search string of "placement" will match placements with name "my placement", "placement 2015", or simply
    * "placement".
    */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements that are associated with these sites. */
  var siteIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placements that are associated with these sizes. */
  var sizeIds: js.UndefOr[java.lang.String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}


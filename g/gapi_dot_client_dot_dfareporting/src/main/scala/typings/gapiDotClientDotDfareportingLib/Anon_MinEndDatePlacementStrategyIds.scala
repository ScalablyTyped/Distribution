package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_MinEndDatePlacementStrategyIds extends js.Object {
  /** Select only placement groups that belong to these advertisers. */
  var advertiserIds: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Select only archived placements. Don't set this field to select both archived and non-archived placements. */
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only placement groups that belong to these campaigns. */
  var campaignIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placement groups that are associated with these content categories. */
  var contentCategoryIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placement groups that are associated with these directory sites. */
  var directorySiteIds: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placement groups with these IDs. */
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
  /**
                   * Select only placement groups belonging with this group type. A package is a simple group of placements that acts as a single pricing point for a group
                   * of tags. A roadblock is a group of placements that not only acts as a single pricing point but also assumes that all the tags in it will be served at
                   * the same time. A roadblock requires one of its assigned placements to be marked as primary for reporting.
                   */
  var placementGroupType: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placement groups that are associated with these placement strategies. */
  var placementStrategyIds: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only placement groups with these pricing types. */
  var pricingTypes: js.UndefOr[java.lang.String] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: java.lang.String
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Allows searching for placement groups by name or ID. Wildcards (&#42;) are allowed. For example, "placement&#42;2015" will return placement groups with names
                   * like "placement group June 2015", "placement group May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the
                   * start and the end of the search string. For example, a search string of "placementgroup" will match placement groups with name "my placementgroup",
                   * "placementgroup 2015", or simply "placementgroup".
                   */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Select only placement groups that are associated with these sites. */
  var siteIds: js.UndefOr[java.lang.String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}


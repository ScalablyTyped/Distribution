package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_AdvertiserGroupIds extends js.Object {
  /** Select only advertisers with these advertiser group IDs. */
  var advertiserGroupIds: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only advertisers with these floodlight configuration IDs. */
  var floodlightConfigurationIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only advertisers with these IDs. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** Select only advertisers which do not belong to any advertiser group. */
  var includeAdvertisersWithoutGroupsOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Select only advertisers which use another advertiser's floodlight configuration. */
  var onlyParent: js.UndefOr[scala.Boolean] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: java.lang.String
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "advertiser&#42;2015" will return objects with names like "advertiser
                   * June 2015", "advertiser April 2015", or simply "advertiser 2015". Most of the searches also add wildcards implicitly at the start and the end of the
                   * search string. For example, a search string of "advertiser" will match objects with name "my advertiser", "advertiser 2015", or simply "advertiser".
                   */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** Select only advertisers with the specified status. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Select only advertisers with these subaccount IDs. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}


package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ProfileIdSortFieldMaxResultsPrettyPrintPageTokenAcceptsInterstitialPlacements extends js.Object {
  /** This search filter is no longer supported and will have no effect on the results returned. */
  var acceptsInStreamVideoPlacements: js.UndefOr[scala.Boolean] = js.undefined
  /** This search filter is no longer supported and will have no effect on the results returned. */
  var acceptsInterstitialPlacements: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only directory sites that accept publisher paid placements. This field can be left blank. */
  var acceptsPublisherPaidPlacements: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only active directory sites. Leave blank to retrieve both active and inactive directory sites. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Select only directory sites with this country ID. */
  var countryId: js.UndefOr[java.lang.String] = js.undefined
  /** Select only directory sites with this DFP network code. */
  var dfpNetworkCode: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only directory sites with these IDs. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Select only directory sites with this parent ID. */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
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
                   * Allows searching for objects by name, ID or URL. Wildcards (&#42;) are allowed. For example, "directory site&#42;2015" will return objects with names like
                   * "directory site June 2015", "directory site April 2015", or simply "directory site 2015". Most of the searches also add wildcards implicitly at the
                   * start and the end of the search string. For example, a search string of "directory site" will match objects with name "my directory site", "directory
                   * site 2015" or simply, "directory site".
                   */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}


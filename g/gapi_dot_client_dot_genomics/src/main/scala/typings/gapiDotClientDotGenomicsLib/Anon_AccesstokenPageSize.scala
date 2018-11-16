package typings
package gapiDotClientDotGenomicsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_AccesstokenPageSize extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The end position of the range on the reference, 0-based exclusive. If
                   * specified, `referenceName` must also be specified. If unset or 0, defaults
                   * to the length of the reference.
                   */
  var end: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The maximum number of results to return in a single page. If unspecified,
                   * defaults to 1024. The maximum value is 2048.
                   */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
                   * The continuation token, which is used to page through large result sets.
                   * To get the next page of results, set this parameter to the value of
                   * `nextPageToken` from the previous response.
                   */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The ID of the read group set over which coverage is requested. */
  var readGroupSetId: java.lang.String
  /**
                   * The name of the reference to query, within the reference set associated
                   * with this query. Optional.
                   */
  var referenceName: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The start position of the range on the reference, 0-based inclusive. If
                   * specified, `referenceName` must also be specified. Defaults to 0.
                   */
  var start: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The desired width of each reported coverage bucket in base pairs. This
                   * will be rounded down to the nearest precomputed bucket width; the value
                   * of which is returned as `bucketWidth` in the response. Defaults
                   * to infinity (each bucket spans an entire reference sequence) or the length
                   * of the target range, if specified. The smallest precomputed
                   * `bucketWidth` is currently 2048 base pairs; this is subject to
                   * change.
                   */
  var targetBucketWidth: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}


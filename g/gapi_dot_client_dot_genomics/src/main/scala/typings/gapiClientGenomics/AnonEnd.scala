package typings.gapiClientGenomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnd extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /**
    * The end position of the range on the reference, 0-based exclusive. If
    * specified, `referenceName` must also be specified. If unset or 0, defaults
    * to the length of the reference.
    */
  var end: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return in a single page. If unspecified,
    * defaults to 1024. The maximum value is 2048.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Required. The ID of the read group set over which coverage is requested. */
  var readGroupSetId: String = js.native
  /**
    * The name of the reference to query, within the reference set associated
    * with this query. Optional.
    */
  var referenceName: js.UndefOr[String] = js.native
  /**
    * The start position of the range on the reference, 0-based inclusive. If
    * specified, `referenceName` must also be specified. Defaults to 0.
    */
  var start: js.UndefOr[String] = js.native
  /**
    * The desired width of each reported coverage bucket in base pairs. This
    * will be rounded down to the nearest precomputed bucket width; the value
    * of which is returned as `bucketWidth` in the response. Defaults
    * to infinity (each bucket spans an entire reference sequence) or the length
    * of the target range, if specified. The smallest precomputed
    * `bucketWidth` is currently 2048 base pairs; this is subject to
    * change.
    */
  var targetBucketWidth: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}


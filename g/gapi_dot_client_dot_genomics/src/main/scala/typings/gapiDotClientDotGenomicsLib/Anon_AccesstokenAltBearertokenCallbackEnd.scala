package typings
package gapiDotClientDotGenomicsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAltBearertokenCallbackEnd extends js.Object {
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

object Anon_AccesstokenAltBearertokenCallbackEnd {
  @scala.inline
  def apply(
    readGroupSetId: java.lang.String,
    `$.xgafv`: java.lang.String = null,
    access_token: java.lang.String = null,
    alt: java.lang.String = null,
    bearer_token: java.lang.String = null,
    callback: java.lang.String = null,
    end: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    pp: js.UndefOr[scala.Boolean] = js.undefined,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    referenceName: java.lang.String = null,
    start: java.lang.String = null,
    targetBucketWidth: java.lang.String = null,
    uploadType: java.lang.String = null,
    upload_protocol: java.lang.String = null
  ): Anon_AccesstokenAltBearertokenCallbackEnd = {
    val __obj = js.Dynamic.literal(readGroupSetId = readGroupSetId)
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (end != null) __obj.updateDynamic("end")(end)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName)
    if (start != null) __obj.updateDynamic("start")(start)
    if (targetBucketWidth != null) __obj.updateDynamic("targetBucketWidth")(targetBucketWidth)
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol)
    __obj.asInstanceOf[Anon_AccesstokenAltBearertokenCallbackEnd]
  }
}


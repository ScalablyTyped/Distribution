package typings
package gapiDotClientDotDataflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_AccesstokenStartTimeLocationPageSize extends js.Object {
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
                   * Return only messages with timestamps < end_time. The default is now
                   * (i.e. return up to the latest messages available).
                   */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The job to get messages about. */
  var jobId: java.lang.String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The location which contains the job specified by job_id. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** Filter to only get messages with importance >= level */
  var minimumImportance: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * If specified, determines the maximum number of messages to
                   * return.  If unspecified, the service may choose an appropriate
                   * default, or may return an arbitrarily large number of results.
                   */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
                   * If supplied, this should be the value of next_page_token returned
                   * by an earlier call. This will cause the next page of results to
                   * be returned.
                   */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** A project id. */
  var projectId: java.lang.String
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * If specified, return only messages with timestamps >= start_time.
                   * The default is the job creation time (i.e. beginning of messages).
                   */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}


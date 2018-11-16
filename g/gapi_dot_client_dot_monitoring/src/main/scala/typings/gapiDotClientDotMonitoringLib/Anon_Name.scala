package typings
package gapiDotClientDotMonitoringLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Name extends js.Object {
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
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * An optional list filter describing the members to be returned. The filter may reference the type, labels, and metadata of monitored resources that
                   * comprise the group. For example, to return only resources representing Compute Engine VM instances, use this filter:
                   * resource.type = "gce_instance"
                   */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The end of the time interval. */
  var `interval.endTime`: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time. */
  var `interval.startTime`: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The group whose members are listed. The format is "projects/{project_id_or_number}/groups/{group_id}". */
  var name: java.lang.String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** A positive number that is the maximum number of results to return. */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
                   * If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method
                   * to return additional results from the previous method call.
                   */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}


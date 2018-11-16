package typings
package gapiDotClientDotCloudtasksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ParentAccesstoken extends js.Object {
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
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Sort order used for the query. The fields supported for sorting
                   * are Task.schedule_time and PullMessage.tag. All results will be
                   * returned in ascending order. The default ordering is by
                   * Task.schedule_time.
                   */
  var orderBy: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Requested page size. Fewer tasks than requested might be returned.
                   *
                   * The maximum page size is 1000. If unspecified, the page size will
                   * be the maximum. Fewer tasks than requested might be returned,
                   * even if more tasks exist; use
                   * ListTasksResponse.next_page_token to determine if more tasks
                   * exist.
                   */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
                   * A token identifying the page of results to return.
                   *
                   * To request the first page results, page_token must be empty. To
                   * request the next page of results, page_token must be the value of
                   * ListTasksResponse.next_page_token returned from the previous
                   * call to CloudTasks.ListTasks method.
                   *
                   * The page token is valid for only 2 hours.
                   */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Required.
                   *
                   * The queue name. For example:
                   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
                   */
  var parent: java.lang.String
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The response_view specifies which subset of the Task will be
                   * returned.
                   *
                   * By default response_view is Task.View.BASIC; not all
                   * information is retrieved by default because some data, such as
                   * payloads, might be desirable to return only when needed because
                   * of its large size or because of the sensitivity of data that it
                   * contains.
                   *
                   * Authorization for Task.View.FULL requires `cloudtasks.tasks.fullView`
                   * [Google IAM](/iam/) permission on the
                   * Task.name resource.
                   */
  var responseView: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}


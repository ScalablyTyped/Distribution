package typings.gapiDotClientDotCloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenAltBearertokenCallback extends js.Object {
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
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * Sort order used for the query. The fields supported for sorting
    * are Task.schedule_time and PullMessage.tag. All results will be
    * returned in ascending order. The default ordering is by
    * Task.schedule_time.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Requested page size. Fewer tasks than requested might be returned.
    *
    * The maximum page size is 1000. If unspecified, the page size will
    * be the maximum. Fewer tasks than requested might be returned,
    * even if more tasks exist; use
    * ListTasksResponse.next_page_token to determine if more tasks
    * exist.
    */
  var pageSize: js.UndefOr[Double] = js.native
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
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required.
    *
    * The queue name. For example:
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    */
  var parent: String = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
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
  var responseView: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}


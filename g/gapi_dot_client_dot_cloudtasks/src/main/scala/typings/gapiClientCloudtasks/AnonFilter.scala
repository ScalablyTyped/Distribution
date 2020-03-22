package typings.gapiClientCloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilter extends js.Object {
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
  /**
    * `filter` can be used to specify a subset of queues. Any Queue
    * field can be used as a filter and several operators as supported.
    * For example: `<=, <, >=, >, !=, =, :`. The filter syntax is the same as
    * described in
    * [Stackdriver's Advanced Logs Filters](/logging/docs/view/advanced_filters).
    *
    * Sample filter "app_engine_http_target: &#42;".
    *
    * Note that using filters might cause fewer queues than the
    * requested_page size to be returned.
    */
  var filter: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * Requested page size.
    *
    * The maximum page size is 9800. If unspecified, the page size will
    * be the maximum. Fewer queues than requested might be returned,
    * even if more queues exist; use
    * ListQueuesResponse.next_page_token to determine if more
    * queues exist.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying the page of results to return.
    *
    * To request the first page results, page_token must be empty. To
    * request the next page of results, page_token must be the value of
    * ListQueuesResponse.next_page_token returned from the previous
    * call to CloudTasks.ListQueues method. It is an error to
    * switch the value of ListQueuesRequest.filter while iterating
    * through pages.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required.
    *
    * The location name.
    * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
    */
  var parent: String = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}


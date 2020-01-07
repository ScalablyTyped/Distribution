package typings.googleapis.buildSrcApisCloudtasksV2beta3Mod.cloudtasks_v2beta3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * `filter` can be used to specify a subset of queues. Any Queue field can
    * be used as a filter and several operators as supported. For example: `<=,
    * <, >=, >, !=, =, :`. The filter syntax is the same as described in
    * [Stackdriver's Advanced Logs
    * Filters](https://cloud.google.com/logging/docs/view/advanced_filters).
    * Sample filter "state: PAUSED".  Note that using filters might cause fewer
    * queues than the requested page_size to be returned.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Requested page size.  The maximum page size is 9800. If unspecified, the
    * page size will be the maximum. Fewer queues than requested might be
    * returned, even if more queues exist; use the next_page_token in the
    * response to determine if more queues exist.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying the page of results to return.  To request the first
    * page results, page_token must be empty. To request the next page of
    * results, page_token must be the value of next_page_token returned from
    * the previous call to ListQueues method. It is an error to switch the
    * value of the filter while iterating through pages.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required.  The location name. For example:
    * `projects/PROJECT_ID/locations/LOCATION_ID`
    */
  var parent: js.UndefOr[String] = js.native
}


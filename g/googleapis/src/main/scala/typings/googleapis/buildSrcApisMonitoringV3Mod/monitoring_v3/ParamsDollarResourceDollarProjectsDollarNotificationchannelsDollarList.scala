package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarNotificationchannelsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If provided, this field specifies the criteria that must be met by
    * notification channels to be included in the response.For more details,
    * see sorting and filtering.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The project on which to execute the request. The format is
    * projects/[PROJECT_ID]. That is, this names the container in which to look
    * for the notification channels; it does not name a specific channel. To
    * query a specific channel by REST resource name, use the
    * GetNotificationChannel operation.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of fields by which to sort the result. Supports
    * the same set of fields as in filter. Entries can be prefixed with a minus
    * sign to sort in descending rather than ascending order.For more details,
    * see sorting and filtering.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return in a single response. If not set
    * to a positive number, a reasonable value will be chosen by the service.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If non-empty, page_token must contain a value returned as the
    * next_page_token in a previous response to request the next set of
    * results.
    */
  var pageToken: js.UndefOr[String] = js.native
}


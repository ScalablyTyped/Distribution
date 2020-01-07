package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAlertsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. The unique identifier of the G Suite organization account of
    * the customer the alerts are associated with. Inferred from the caller
    * identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Optional. A query string for filtering alert results. For more details,
    * see [Query filters](/admin-sdk/alertcenter/guides/query-filters) and
    * [Supported query filter
    * fields](/admin-sdk/alertcenter/reference/filter-fields#alerts.list).
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional. The sort order of the list results. If not specified results
    * may be returned in arbitrary order. You can sort the results in
    * descending order based on the creation timestamp using
    * `order_by="create_time desc"`. Currently, only sorting by `create_time
    * desc` is supported.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Optional. The requested page size. Server may return fewer items than
    * requested. If unspecified, server picks an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional. A token identifying a page of results the server should return.
    * If empty, a new iteration is started. To continue an iteration, pass in
    * the value from the previous ListAlertsResponse's next_page_token field.
    */
  var pageToken: js.UndefOr[String] = js.native
}


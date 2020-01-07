package typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarTransferoperationsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A list of query parameters specified as JSON text in the form of
    * {\"project_id\" : \"my_project_id\", \"job_names\" : [\"jobid1\",
    * \"jobid2\",...], \"operation_names\" : [\"opid1\", \"opid2\",...],
    * \"transfer_statuses\":[\"status1\", \"status2\",...]}. Since `job_names`,
    * `operation_names`, and `transfer_statuses` support multiple values, they
    * must be specified with array notation. `job_names`, `operation_names`,
    * and `transfer_statuses` are optional.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The value `transferOperations`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The list page size. The max allowed value is 256.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The list page token.
    */
  var pageToken: js.UndefOr[String] = js.native
}


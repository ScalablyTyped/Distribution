package typings.googleapis.buildSrcApisServicebrokerV1beta1Mod.servicebroker_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarBindingsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Specifies the number of results to return per page. If there are fewer
    * elements than the specified number, returns all elements. Optional.
    * Acceptable values are 0 to 200, inclusive. (Default: 100)
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Specifies a page token to use. Set `pageToken` to a `nextPageToken`
    * returned by a previous list request to get the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/` +
    * `v2/service_instances/[INSTANCE_ID]` or
    * `projects/[PROJECT_ID]/brokers/[BROKER_ID]/instances/[INSTANCE_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
}


package typings.googleapis.buildSrcApisServicebrokerV1alpha1Mod.servicebroker_v1alpha1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarService_bindingsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Specifies the number of results to return per page. If there are fewer
    * elements than the specified number, returns all elements. Optional. If
    * unset or 0, all the results will be returned.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Specifies a page token to use. Set `pageToken` to a `nextPageToken`
    * returned by a previous list request to get the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Parent must match
    * `projects/[PROJECT_ID]/brokers/[BROKER_ID]/instances/[INSTANCE_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
}


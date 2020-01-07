package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The cluster name.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * Optional. Specifying the cluster_uuid means the RPC should fail (with
    * error NOT_FOUND) if cluster with specified UUID does not exist.
    */
  var clusterUuid: js.UndefOr[String] = js.native
  /**
    * Required. The ID of the Google Cloud Platform project that the cluster
    * belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Required. The Cloud Dataproc region in which to handle the request.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Optional. A unique id used to identify the request. If the server
    * receives two DeleteClusterRequest requests with the same id, then the
    * second request will be ignored and the first google.longrunning.Operation
    * created and stored in the backend is returned.It is recommended to always
    * set this value to a UUID
    * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must
    * contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and
    * hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.native
}


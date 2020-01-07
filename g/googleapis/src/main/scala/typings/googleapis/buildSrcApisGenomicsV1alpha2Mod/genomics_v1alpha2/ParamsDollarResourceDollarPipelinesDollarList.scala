package typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPipelinesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Pipelines with names that match this prefix should be returned.  If
    * unspecified, all pipelines in the project, up to `pageSize`, will be
    * returned.
    */
  var namePrefix: js.UndefOr[String] = js.native
  /**
    * Number of pipelines to return at once. Defaults to 256, and max is 2048.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Token to use to indicate where to start getting results. If unspecified,
    * returns the first page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The name of the project to search for pipelines. Caller must
    * have READ access to this project.
    */
  var projectId: js.UndefOr[String] = js.native
}


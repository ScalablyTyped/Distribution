package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarTemplatesDollarLaunch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Path to dynamic template spec file on GCS. The file must be a Json
    * serialized DynamicTemplateFieSpec object.
    */
  @JSName("dynamicTemplate.gcsPath")
  var dynamicTemplateDotgcsPath: js.UndefOr[String] = js.native
  /**
    * Cloud Storage path for staging dependencies. Must be a valid Cloud
    * Storage URL, beginning with `gs://`.
    */
  @JSName("dynamicTemplate.stagingLocation")
  var dynamicTemplateDotstagingLocation: js.UndefOr[String] = js.native
  /**
    * A Cloud Storage path to the template from which to create the job. Must
    * be valid Cloud Storage URL, beginning with 'gs://'.
    */
  var gcsPath: js.UndefOr[String] = js.native
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
    * which to direct the request.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Required. The ID of the Cloud Platform project that the job belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$LaunchTemplateParameters] = js.native
  /**
    * If true, the request is validated but not actually executed. Defaults to
    * false.
    */
  var validateOnly: js.UndefOr[Boolean] = js.native
}


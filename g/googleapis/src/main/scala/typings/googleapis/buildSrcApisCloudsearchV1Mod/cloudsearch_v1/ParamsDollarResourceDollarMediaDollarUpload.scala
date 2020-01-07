package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import typings.googleapis.Anon_Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarMediaDollarUpload extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Media metadata
    */
  var media: js.UndefOr[Anon_Body] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Media] = js.native
  /**
    * Name of the media that is being downloaded.  See
    * ReadRequest.resource_name.
    */
  var resourceName: js.UndefOr[String] = js.native
}


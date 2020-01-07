package typings.googleapis.buildSrcApisOsloginV1betaMod.oslogin_v1beta

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarUsersDollarGetloginprofile extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The unique ID for the user in format `users/{user}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The project ID of the Google Cloud Platform project.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * A system ID for filtering the results of the request.
    */
  var systemId: js.UndefOr[String] = js.native
}


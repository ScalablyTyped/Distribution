package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarDebug extends StandardParameters {
  /**
    * Part of `name`. Name of the resource requested. Example:
    * apps/myapp/services/default/versions/v1/instances/instance-1.
    */
  var appsId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var instancesId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$DebugInstanceRequest] = js.native
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var servicesId: js.UndefOr[String] = js.native
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var versionsId: js.UndefOr[String] = js.native
}


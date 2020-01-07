package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarPatch extends StandardParameters {
  /**
    * Part of `name`. Name of the resource to update. Example:
    * apps/myapp/services/default/versions/1.
    */
  var appsId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Version] = js.native
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var servicesId: js.UndefOr[String] = js.native
  /**
    * Standard field mask for the set of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.native
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var versionsId: js.UndefOr[String] = js.native
}


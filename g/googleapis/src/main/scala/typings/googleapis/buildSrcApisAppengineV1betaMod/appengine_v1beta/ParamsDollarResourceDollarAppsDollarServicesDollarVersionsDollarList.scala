package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarList extends StandardParameters {
  /**
    * Part of `parent`. Name of the parent Service resource. Example:
    * apps/myapp/services/default.
    */
  var appsId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Maximum results to return per page.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Part of `parent`. See documentation of `appsId`.
    */
  var servicesId: js.UndefOr[String] = js.native
  /**
    * Controls the set of fields returned in the List response.
    */
  var view: js.UndefOr[String] = js.native
}


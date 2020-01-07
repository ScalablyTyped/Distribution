package typings.googleapis.buildSrcApisServiceusageV1beta1Mod.serviceusage_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarServicesDollarEnable extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name of the consumer and service to enable the service on.  The
    * `EnableService` and `DisableService` methods currently only support
    * projects.  Enabling a service requires that the service is public or is
    * shared with the user enabling the service.  An example name would be:
    * `projects/123/services/serviceusage.googleapis.com` where `123` is the
    * project number (not project ID).
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$EnableServiceRequest] = js.native
}


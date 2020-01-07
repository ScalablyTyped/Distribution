package typings.googleapis.buildSrcApisRuntimeconfigV1beta1Mod.runtimeconfig_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarConfigsDollarWaitersDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The path to the configuration that will own the waiter. The configuration
    * must exist beforehand; the path must be in the format:
    * `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Waiter] = js.native
  /**
    * An optional but recommended unique `request_id`. If the server receives
    * two `create()` requests  with the same `request_id`, then the second
    * request will be ignored and the first resource created and stored in the
    * backend is returned. Empty `request_id` fields are ignored.  It is
    * responsibility of the client to ensure uniqueness of the `request_id`
    * strings.  `request_id` strings are limited to 64 characters.
    */
  var requestId: js.UndefOr[String] = js.native
}


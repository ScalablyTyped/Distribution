package typings.googleapis.buildSrcApisRedisV1beta1Mod.redis_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The logical name of the Redis instance in the customer project
    * with the following restrictions:  * Must contain only lowercase letters,
    * numbers, and hyphens. * Must start with a letter. * Must be between 1-40
    * characters. * Must end with a number or a letter. * Must be unique within
    * the customer project / location
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the instance location using the form:
    * `projects/{project_id}/locations/{location_id}` where `location_id`
    * refers to a GCP region
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Instance] = js.native
}


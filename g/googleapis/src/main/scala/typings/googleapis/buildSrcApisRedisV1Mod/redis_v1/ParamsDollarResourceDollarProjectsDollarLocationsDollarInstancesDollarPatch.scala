package typings.googleapis.buildSrcApisRedisV1Mod.redis_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. Unique name of the resource in this scope including project and
    * location using the form:
    * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
    * Note: Redis instances are managed and addressed at regional level so
    * location_id here refers to a GCP region; however, users may choose which
    * specific zone (or collection of zones for cross-zone instances) an
    * instance should be provisioned in. Refer to [location_id] and
    * [alternative_location_id] fields for more details.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Instance] = js.native
  /**
    * Required. Mask of fields to update. At least one path must be supplied in
    * this field. The elements of the repeated paths field may only include
    * these fields from Instance:   *   `displayName`  *   `labels`  *
    * `memorySizeGb`  *   `redisConfig`
    */
  var updateMask: js.UndefOr[String] = js.native
}


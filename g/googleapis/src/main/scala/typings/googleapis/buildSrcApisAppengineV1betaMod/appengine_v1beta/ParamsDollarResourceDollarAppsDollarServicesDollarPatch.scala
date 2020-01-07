package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAppsDollarServicesDollarPatch extends StandardParameters {
  /**
    * Part of `name`. Name of the resource to update. Example:
    * apps/myapp/services/default.
    */
  var appsId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Set to true to gradually shift traffic to one or more versions that you
    * specify. By default, traffic is shifted immediately. For gradual traffic
    * migration, the target versions must be located within instances that are
    * configured for both warmup requests
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#InboundServiceType)
    * and automatic scaling
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#AutomaticScaling).
    * You must specify the shardBy
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services#ShardBy)
    * field in the Service resource. Gradual traffic migration is not supported
    * in the App Engine flexible environment. For examples, see Migrating and
    * Splitting Traffic
    * (https://cloud.google.com/appengine/docs/admin-api/migrating-splitting-traffic).
    */
  var migrateTraffic: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Service] = js.native
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var servicesId: js.UndefOr[String] = js.native
  /**
    * Standard field mask for the set of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}


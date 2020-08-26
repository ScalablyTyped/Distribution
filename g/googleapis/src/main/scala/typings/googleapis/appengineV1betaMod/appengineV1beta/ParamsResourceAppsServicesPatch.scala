package typings.googleapis.appengineV1betaMod.appengineV1beta

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAppsServicesPatch extends StandardParameters {
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
  var requestBody: js.UndefOr[SchemaService] = js.native
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var servicesId: js.UndefOr[String] = js.native
  /**
    * Standard field mask for the set of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object ParamsResourceAppsServicesPatch {
  @scala.inline
  def apply(): ParamsResourceAppsServicesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsServicesPatch]
  }
  @scala.inline
  implicit class ParamsResourceAppsServicesPatchOps[Self <: ParamsResourceAppsServicesPatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppsId(value: String): Self = this.set("appsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsId: Self = this.set("appsId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setMigrateTraffic(value: Boolean): Self = this.set("migrateTraffic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMigrateTraffic: Self = this.set("migrateTraffic", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaService): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setServicesId(value: String): Self = this.set("servicesId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServicesId: Self = this.set("servicesId", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}


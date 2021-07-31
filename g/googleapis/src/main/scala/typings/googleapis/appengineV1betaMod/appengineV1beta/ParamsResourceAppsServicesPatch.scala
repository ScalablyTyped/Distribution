package typings.googleapis.appengineV1betaMod.appengineV1beta

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsServicesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Name of the resource to update. Example:
    * apps/myapp/services/default.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
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
  var migrateTraffic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaService] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var servicesId: js.UndefOr[String] = js.undefined
  
  /**
    * Standard field mask for the set of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsServicesPatch {
  
  @scala.inline
  def apply(): ParamsResourceAppsServicesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsServicesPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceAppsServicesPatchMutableBuilder[Self <: ParamsResourceAppsServicesPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMigrateTraffic(value: Boolean): Self = StObject.set(x, "migrateTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrateTrafficUndefined: Self = StObject.set(x, "migrateTraffic", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaService): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setServicesId(value: String): Self = StObject.set(x, "servicesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesIdUndefined: Self = StObject.set(x, "servicesId", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}

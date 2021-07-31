package typings.googleapis.cloudiotV1Mod.cloudiotV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistriesDevicesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The fields of the `Device` resource to be returned in the response. If
    * the field mask is unset or empty, all fields are returned.
    */
  var fieldMask: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the device. For example,
    * `projects/p0/locations/us-central1/registries/registry0/devices/device0`
    * or
    * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRegistriesDevicesGet {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsRegistriesDevicesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesDevicesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsRegistriesDevicesGetMutableBuilder[Self <: ParamsResourceProjectsLocationsRegistriesDevicesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFieldMask(value: String): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

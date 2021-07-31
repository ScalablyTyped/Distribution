package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKeyringsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. It must be unique within a location and match the regular
    * expression `[a-zA-Z0-9_-]{1,63}`
    */
  var keyRingId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the location associated with the KeyRings,
    * in the format `projects/x/locations/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaKeyRing] = js.undefined
}
object ParamsResourceProjectsLocationsKeyringsCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsKeyringsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeyringsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsKeyringsCreateMutableBuilder[Self <: ParamsResourceProjectsLocationsKeyringsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setKeyRingId(value: String): Self = StObject.set(x, "keyRingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyRingIdUndefined: Self = StObject.set(x, "keyRingId", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaKeyRing): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

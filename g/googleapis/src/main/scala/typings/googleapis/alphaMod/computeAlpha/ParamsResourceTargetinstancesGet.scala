package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTargetinstancesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the TargetInstance resource to return.
    */
  var targetInstance: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the zone scoping this request.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceTargetinstancesGet {
  
  @scala.inline
  def apply(): ParamsResourceTargetinstancesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTargetinstancesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceTargetinstancesGetMutableBuilder[Self <: ParamsResourceTargetinstancesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setTargetInstance(value: String): Self = StObject.set(x, "targetInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetInstanceUndefined: Self = StObject.set(x, "targetInstance", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}

package typings.googleapis.betaMod.computeBeta

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAutoscalersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Name of the autoscaler to return.
    */
  var autoscaler: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the zone for this request.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceAutoscalersGet {
  
  @scala.inline
  def apply(): ParamsResourceAutoscalersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAutoscalersGet]
  }
  
  @scala.inline
  implicit class ParamsResourceAutoscalersGetMutableBuilder[Self <: ParamsResourceAutoscalersGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setAutoscaler(value: String): Self = StObject.set(x, "autoscaler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalerUndefined: Self = StObject.set(x, "autoscaler", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}

package typings.googleapis.betaMod.computeBeta

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceNetworkendpointgroupsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The name of the network endpoint group. It should comply with RFC1035.
    */
  var networkEndpointGroup: js.UndefOr[String] = js.native
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * The name of the zone where the network endpoint group is located. It
    * should comply with RFC1035.
    */
  var zone: js.UndefOr[String] = js.native
}
object ParamsResourceNetworkendpointgroupsGet {
  
  @scala.inline
  def apply(): ParamsResourceNetworkendpointgroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNetworkendpointgroupsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceNetworkendpointgroupsGetMutableBuilder[Self <: ParamsResourceNetworkendpointgroupsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setNetworkEndpointGroup(value: String): Self = StObject.set(x, "networkEndpointGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEndpointGroupUndefined: Self = StObject.set(x, "networkEndpointGroup", js.undefined)
    
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

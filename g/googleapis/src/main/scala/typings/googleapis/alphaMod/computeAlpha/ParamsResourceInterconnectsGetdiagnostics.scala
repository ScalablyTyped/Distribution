package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceInterconnectsGetdiagnostics extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Name of the interconnect resource to query.
    */
  var interconnect: js.UndefOr[String] = js.native
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
}
object ParamsResourceInterconnectsGetdiagnostics {
  
  @scala.inline
  def apply(): ParamsResourceInterconnectsGetdiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInterconnectsGetdiagnostics]
  }
  
  @scala.inline
  implicit class ParamsResourceInterconnectsGetdiagnosticsMutableBuilder[Self <: ParamsResourceInterconnectsGetdiagnostics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setInterconnect(value: String): Self = StObject.set(x, "interconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterconnectUndefined: Self = StObject.set(x, "interconnect", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}

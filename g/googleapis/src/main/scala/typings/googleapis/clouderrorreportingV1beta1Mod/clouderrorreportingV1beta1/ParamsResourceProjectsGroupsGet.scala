package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGroupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * [Required] The group resource name. Written as
    * <code>projects/<var>projectID</var>/groups/<var>group_name</var></code>.
    * Call <a
    * href="/error-reporting/reference/rest/v1beta1/projects.groupStats/list">
    * <code>groupStats.list</code></a> to return a list of groups belonging to
    * this project.  Example:
    * <code>projects/my-project-123/groups/my-group</code>
    */
  var groupName: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGroupsGet {
  
  inline def apply(): ParamsResourceProjectsGroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGroupsGet]
  }
  
  extension [Self <: ParamsResourceProjectsGroupsGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
  }
}

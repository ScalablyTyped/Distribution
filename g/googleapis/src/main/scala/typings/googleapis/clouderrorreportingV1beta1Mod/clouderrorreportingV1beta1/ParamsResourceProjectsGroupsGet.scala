package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGroupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The group resource name. Written as `projects/{projectID\}/groups/{group_name\}`. Call groupStats.list to return a list of groups belonging to this project. Example: `projects/my-project-123/groups/my-group`
    */
  var groupName: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGroupsGet {
  
  inline def apply(): ParamsResourceProjectsGroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGroupsGet]
  }
  
  extension [Self <: ParamsResourceProjectsGroupsGet](x: Self) {
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
  }
}

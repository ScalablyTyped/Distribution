package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesAppprofilesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. If true, ignore safety checks when deleting the app profile.
    */
  var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The unique name of the app profile to be deleted. Values are of the form `projects/{project\}/instances/{instance\}/appProfiles/{app_profile\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesAppprofilesDelete {
  
  inline def apply(): ParamsResourceProjectsInstancesAppprofilesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesAppprofilesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesAppprofilesDelete](x: Self) {
    
    inline def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

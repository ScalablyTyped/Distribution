package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesAppprofilesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The unique name of the requested app profile. Values are of the form `projects/{project\}/instances/{instance\}/appProfiles/{app_profile\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesAppprofilesGet {
  
  inline def apply(): ParamsResourceProjectsInstancesAppprofilesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesAppprofilesGet]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesAppprofilesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

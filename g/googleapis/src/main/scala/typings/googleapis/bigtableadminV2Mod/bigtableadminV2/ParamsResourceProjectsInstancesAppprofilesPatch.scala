package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesAppprofilesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * If true, ignore safety checks when updating the app profile.
    */
  var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The unique name of the app profile. Values are of the form `projects/{project\}/instances/{instance\}/appProfiles/_a-zA-Z0-9*`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAppProfile] = js.undefined
  
  /**
    * Required. The subset of app profile fields which should be replaced. If unset, all fields will be replaced.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesAppprofilesPatch {
  
  inline def apply(): ParamsResourceProjectsInstancesAppprofilesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesAppprofilesPatch]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesAppprofilesPatch](x: Self) {
    
    inline def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaAppProfile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}

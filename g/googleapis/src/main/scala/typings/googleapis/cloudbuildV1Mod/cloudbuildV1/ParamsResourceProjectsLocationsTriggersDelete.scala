package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTriggersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the `Trigger` to delete. Format: `projects/{project\}/locations/{location\}/triggers/{trigger\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. ID of the project that owns the trigger.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. ID of the `BuildTrigger` to delete.
    */
  var triggerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTriggersDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsTriggersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTriggersDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTriggersDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
  }
}

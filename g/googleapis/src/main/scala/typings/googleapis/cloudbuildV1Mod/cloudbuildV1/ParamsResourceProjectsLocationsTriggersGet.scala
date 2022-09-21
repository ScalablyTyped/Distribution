package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTriggersGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the `Trigger` to retrieve. Format: `projects/{project\}/locations/{location\}/triggers/{trigger\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. ID of the project that owns the trigger.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Identifier (`id` or `name`) of the `BuildTrigger` to get.
    */
  var triggerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTriggersGet {
  
  inline def apply(): ParamsResourceProjectsLocationsTriggersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTriggersGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTriggersGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
  }
}

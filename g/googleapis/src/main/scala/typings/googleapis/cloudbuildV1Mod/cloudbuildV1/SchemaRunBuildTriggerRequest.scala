package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunBuildTriggerRequest extends StObject {
  
  /**
    * Required. ID of the project.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Source to build against this trigger. Branch and tag names cannot consist of regular expressions.
    */
  var source: js.UndefOr[SchemaRepoSource] = js.undefined
  
  /**
    * Required. ID of the trigger.
    */
  var triggerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRunBuildTriggerRequest {
  
  inline def apply(): SchemaRunBuildTriggerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunBuildTriggerRequest]
  }
  
  extension [Self <: SchemaRunBuildTriggerRequest](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSource(value: SchemaRepoSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerIdNull: Self = StObject.set(x, "triggerId", null)
    
    inline def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
  }
}

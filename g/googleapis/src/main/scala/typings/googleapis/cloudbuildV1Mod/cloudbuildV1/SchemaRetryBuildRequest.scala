package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRetryBuildRequest extends StObject {
  
  /**
    * Required. Build ID of the original build.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the `Build` to retry. Format: `projects/{project\}/locations/{location\}/builds/{build\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. ID of the project.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRetryBuildRequest {
  
  inline def apply(): SchemaRetryBuildRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRetryBuildRequest]
  }
  
  extension [Self <: SchemaRetryBuildRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}

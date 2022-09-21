package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsUpdateprojectsettings
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the project's settings. Always of the form: projects/{project-id\}/projectSettings In update request: never set In response: always set
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProjectSettings] = js.undefined
  
  /**
    * Field mask to support partial updates.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsUpdateprojectsettings {
  
  inline def apply(): ParamsResourceProjectsUpdateprojectsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsUpdateprojectsettings]
  }
  
  extension [Self <: ParamsResourceProjectsUpdateprojectsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaProjectSettings): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}

package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLiensCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLien] = js.undefined
}
object ParamsResourceLiensCreate {
  
  inline def apply(): ParamsResourceLiensCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLiensCreate]
  }
  
  extension [Self <: ParamsResourceLiensCreate](x: Self) {
    
    inline def setRequestBody(value: SchemaLien): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

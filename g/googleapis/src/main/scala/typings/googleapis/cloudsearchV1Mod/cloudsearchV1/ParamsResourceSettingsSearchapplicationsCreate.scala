package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSettingsSearchapplicationsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSearchApplication] = js.undefined
}
object ParamsResourceSettingsSearchapplicationsCreate {
  
  inline def apply(): ParamsResourceSettingsSearchapplicationsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSettingsSearchapplicationsCreate]
  }
  
  extension [Self <: ParamsResourceSettingsSearchapplicationsCreate](x: Self) {
    
    inline def setRequestBody(value: SchemaSearchApplication): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

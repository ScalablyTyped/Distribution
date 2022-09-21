package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSettingsSearchapplicationsReset
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the search application to be reset. Format: applications/{application_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResetSearchApplicationRequest] = js.undefined
}
object ParamsResourceSettingsSearchapplicationsReset {
  
  inline def apply(): ParamsResourceSettingsSearchapplicationsReset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSettingsSearchapplicationsReset]
  }
  
  extension [Self <: ParamsResourceSettingsSearchapplicationsReset](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaResetSearchApplicationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSettingsDatasourcesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDataSource] = js.undefined
}
object ParamsResourceSettingsDatasourcesCreate {
  
  inline def apply(): ParamsResourceSettingsDatasourcesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSettingsDatasourcesCreate]
  }
  
  extension [Self <: ParamsResourceSettingsDatasourcesCreate](x: Self) {
    
    inline def setRequestBody(value: SchemaDataSource): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

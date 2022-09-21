package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceWebappsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWebApp] = js.undefined
  
  /**
    * The ID of the web app.
    */
  var webAppId: js.UndefOr[String] = js.undefined
}
object ParamsResourceWebappsUpdate {
  
  inline def apply(): ParamsResourceWebappsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceWebappsUpdate]
  }
  
  extension [Self <: ParamsResourceWebappsUpdate](x: Self) {
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    inline def setRequestBody(value: SchemaWebApp): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWebAppId(value: String): Self = StObject.set(x, "webAppId", value.asInstanceOf[js.Any])
    
    inline def setWebAppIdUndefined: Self = StObject.set(x, "webAppId", js.undefined)
  }
}

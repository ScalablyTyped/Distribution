package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceWebappsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the web app.
    */
  var webAppId: js.UndefOr[String] = js.undefined
}
object ParamsResourceWebappsDelete {
  
  inline def apply(): ParamsResourceWebappsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceWebappsDelete]
  }
  
  extension [Self <: ParamsResourceWebappsDelete](x: Self) {
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    inline def setWebAppId(value: String): Self = StObject.set(x, "webAppId", value.asInstanceOf[js.Any])
    
    inline def setWebAppIdUndefined: Self = StObject.set(x, "webAppId", js.undefined)
  }
}

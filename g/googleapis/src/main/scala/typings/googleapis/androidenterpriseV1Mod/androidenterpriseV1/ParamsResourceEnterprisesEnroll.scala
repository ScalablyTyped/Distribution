package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesEnroll
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEnterprise] = js.undefined
  
  /**
    * Required. The token provided by the enterprise to register the EMM.
    */
  var token: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesEnroll {
  
  inline def apply(): ParamsResourceEnterprisesEnroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesEnroll]
  }
  
  extension [Self <: ParamsResourceEnterprisesEnroll](x: Self) {
    
    inline def setRequestBody(value: SchemaEnterprise): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}

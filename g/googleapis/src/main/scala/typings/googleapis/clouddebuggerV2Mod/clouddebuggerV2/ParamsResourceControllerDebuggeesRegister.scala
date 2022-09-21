package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceControllerDebuggeesRegister
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRegisterDebuggeeRequest] = js.undefined
}
object ParamsResourceControllerDebuggeesRegister {
  
  inline def apply(): ParamsResourceControllerDebuggeesRegister = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceControllerDebuggeesRegister]
  }
  
  extension [Self <: ParamsResourceControllerDebuggeesRegister](x: Self) {
    
    inline def setRequestBody(value: SchemaRegisterDebuggeeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

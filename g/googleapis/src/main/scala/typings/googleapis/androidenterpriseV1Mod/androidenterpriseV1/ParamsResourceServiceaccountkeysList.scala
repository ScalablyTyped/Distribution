package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServiceaccountkeysList
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.undefined
}
object ParamsResourceServiceaccountkeysList {
  
  inline def apply(): ParamsResourceServiceaccountkeysList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServiceaccountkeysList]
  }
  
  extension [Self <: ParamsResourceServiceaccountkeysList](x: Self) {
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
  }
}

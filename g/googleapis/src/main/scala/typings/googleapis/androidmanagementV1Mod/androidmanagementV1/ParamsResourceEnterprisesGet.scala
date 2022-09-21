package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the enterprise in the form enterprises/{enterpriseId\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesGet {
  
  inline def apply(): ParamsResourceEnterprisesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesGet]
  }
  
  extension [Self <: ParamsResourceEnterprisesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

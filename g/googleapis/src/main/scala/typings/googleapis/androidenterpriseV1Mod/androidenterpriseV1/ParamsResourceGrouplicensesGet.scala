package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGrouplicensesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the product the group license is for, e.g. "app:com.google.android.gm".
    */
  var groupLicenseId: js.UndefOr[String] = js.undefined
}
object ParamsResourceGrouplicensesGet {
  
  inline def apply(): ParamsResourceGrouplicensesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGrouplicensesGet]
  }
  
  extension [Self <: ParamsResourceGrouplicensesGet](x: Self) {
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    inline def setGroupLicenseId(value: String): Self = StObject.set(x, "groupLicenseId", value.asInstanceOf[js.Any])
    
    inline def setGroupLicenseIdUndefined: Self = StObject.set(x, "groupLicenseId", js.undefined)
  }
}

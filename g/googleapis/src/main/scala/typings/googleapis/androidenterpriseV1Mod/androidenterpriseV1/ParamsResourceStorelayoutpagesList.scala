package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceStorelayoutpagesList
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.undefined
}
object ParamsResourceStorelayoutpagesList {
  
  inline def apply(): ParamsResourceStorelayoutpagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceStorelayoutpagesList]
  }
  
  extension [Self <: ParamsResourceStorelayoutpagesList](x: Self) {
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
  }
}

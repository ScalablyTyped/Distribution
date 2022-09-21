package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceStorelayoutclustersList
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the page.
    */
  var pageId: js.UndefOr[String] = js.undefined
}
object ParamsResourceStorelayoutclustersList {
  
  inline def apply(): ParamsResourceStorelayoutclustersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceStorelayoutclustersList]
  }
  
  extension [Self <: ParamsResourceStorelayoutclustersList](x: Self) {
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    inline def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    
    inline def setPageIdUndefined: Self = StObject.set(x, "pageId", js.undefined)
  }
}

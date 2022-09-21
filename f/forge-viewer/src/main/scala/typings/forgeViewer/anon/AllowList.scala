package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowList extends StObject {
  
  var allowList: js.UndefOr[js.Array[Double]] = js.undefined
  
  var center: js.UndefOr[Double] = js.undefined
  
  var ignoreTransform: js.UndefOr[Boolean] = js.undefined
  
  var quantil: js.UndefOr[Double] = js.undefined
}
object AllowList {
  
  inline def apply(): AllowList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowList]
  }
  
  extension [Self <: AllowList](x: Self) {
    
    inline def setAllowList(value: js.Array[Double]): Self = StObject.set(x, "allowList", value.asInstanceOf[js.Any])
    
    inline def setAllowListUndefined: Self = StObject.set(x, "allowList", js.undefined)
    
    inline def setAllowListVarargs(value: Double*): Self = StObject.set(x, "allowList", js.Array(value*))
    
    inline def setCenter(value: Double): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setIgnoreTransform(value: Boolean): Self = StObject.set(x, "ignoreTransform", value.asInstanceOf[js.Any])
    
    inline def setIgnoreTransformUndefined: Self = StObject.set(x, "ignoreTransform", js.undefined)
    
    inline def setQuantil(value: Double): Self = StObject.set(x, "quantil", value.asInstanceOf[js.Any])
    
    inline def setQuantilUndefined: Self = StObject.set(x, "quantil", js.undefined)
  }
}

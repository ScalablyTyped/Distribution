package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryFilter extends StObject {
  
  var categoryFilter: js.UndefOr[js.Array[String]] = js.undefined
  
  var ignoreHidden: js.UndefOr[Boolean] = js.undefined
  
  var needExternalId: js.UndefOr[Boolean] = js.undefined
  
  var propFilter: js.UndefOr[js.Array[String]] = js.undefined
}
object CategoryFilter {
  
  inline def apply(): CategoryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryFilter]
  }
  
  extension [Self <: CategoryFilter](x: Self) {
    
    inline def setCategoryFilter(value: js.Array[String]): Self = StObject.set(x, "categoryFilter", value.asInstanceOf[js.Any])
    
    inline def setCategoryFilterUndefined: Self = StObject.set(x, "categoryFilter", js.undefined)
    
    inline def setCategoryFilterVarargs(value: String*): Self = StObject.set(x, "categoryFilter", js.Array(value*))
    
    inline def setIgnoreHidden(value: Boolean): Self = StObject.set(x, "ignoreHidden", value.asInstanceOf[js.Any])
    
    inline def setIgnoreHiddenUndefined: Self = StObject.set(x, "ignoreHidden", js.undefined)
    
    inline def setNeedExternalId(value: Boolean): Self = StObject.set(x, "needExternalId", value.asInstanceOf[js.Any])
    
    inline def setNeedExternalIdUndefined: Self = StObject.set(x, "needExternalId", js.undefined)
    
    inline def setPropFilter(value: js.Array[String]): Self = StObject.set(x, "propFilter", value.asInstanceOf[js.Any])
    
    inline def setPropFilterUndefined: Self = StObject.set(x, "propFilter", js.undefined)
    
    inline def setPropFilterVarargs(value: String*): Self = StObject.set(x, "propFilter", js.Array(value*))
  }
}

package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterExtensionType extends StObject {
  
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.undefined
  
  var filterId: js.UndefOr[js.Array[String]] = js.undefined
  
  var filterType: js.UndefOr[js.Array[String]] = js.undefined
  
  var pageLimit: js.UndefOr[Double] = js.undefined
  
  var pageNumber: js.UndefOr[Double] = js.undefined
}
object FilterExtensionType {
  
  inline def apply(): FilterExtensionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterExtensionType]
  }
  
  extension [Self <: FilterExtensionType](x: Self) {
    
    inline def setFilterExtensionType(value: js.Array[String]): Self = StObject.set(x, "filterExtensionType", value.asInstanceOf[js.Any])
    
    inline def setFilterExtensionTypeUndefined: Self = StObject.set(x, "filterExtensionType", js.undefined)
    
    inline def setFilterExtensionTypeVarargs(value: String*): Self = StObject.set(x, "filterExtensionType", js.Array(value :_*))
    
    inline def setFilterId(value: js.Array[String]): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    inline def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
    
    inline def setFilterIdVarargs(value: String*): Self = StObject.set(x, "filterId", js.Array(value :_*))
    
    inline def setFilterType(value: js.Array[String]): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    inline def setFilterTypeVarargs(value: String*): Self = StObject.set(x, "filterType", js.Array(value :_*))
    
    inline def setPageLimit(value: Double): Self = StObject.set(x, "pageLimit", value.asInstanceOf[js.Any])
    
    inline def setPageLimitUndefined: Self = StObject.set(x, "pageLimit", js.undefined)
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
  }
}

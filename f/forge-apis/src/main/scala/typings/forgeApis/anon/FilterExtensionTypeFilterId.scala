package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterExtensionTypeFilterId extends StObject {
  
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.undefined
  
  var filterId: js.UndefOr[js.Array[String]] = js.undefined
}
object FilterExtensionTypeFilterId {
  
  inline def apply(): FilterExtensionTypeFilterId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterExtensionTypeFilterId]
  }
  
  extension [Self <: FilterExtensionTypeFilterId](x: Self) {
    
    inline def setFilterExtensionType(value: js.Array[String]): Self = StObject.set(x, "filterExtensionType", value.asInstanceOf[js.Any])
    
    inline def setFilterExtensionTypeUndefined: Self = StObject.set(x, "filterExtensionType", js.undefined)
    
    inline def setFilterExtensionTypeVarargs(value: String*): Self = StObject.set(x, "filterExtensionType", js.Array(value*))
    
    inline def setFilterId(value: js.Array[String]): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    inline def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
    
    inline def setFilterIdVarargs(value: String*): Self = StObject.set(x, "filterId", js.Array(value*))
  }
}

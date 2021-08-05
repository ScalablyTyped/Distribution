package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompositeFilter extends StObject {
  
  /**
    * The logic operator of the sub filter.
    */
  var logicOperator: js.UndefOr[String] = js.undefined
  
  /**
    * Sub filters.
    */
  var subFilters: js.UndefOr[js.Array[SchemaFilter]] = js.undefined
}
object SchemaCompositeFilter {
  
  inline def apply(): SchemaCompositeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompositeFilter]
  }
  
  extension [Self <: SchemaCompositeFilter](x: Self) {
    
    inline def setLogicOperator(value: String): Self = StObject.set(x, "logicOperator", value.asInstanceOf[js.Any])
    
    inline def setLogicOperatorUndefined: Self = StObject.set(x, "logicOperator", js.undefined)
    
    inline def setSubFilters(value: js.Array[SchemaFilter]): Self = StObject.set(x, "subFilters", value.asInstanceOf[js.Any])
    
    inline def setSubFiltersUndefined: Self = StObject.set(x, "subFilters", js.undefined)
    
    inline def setSubFiltersVarargs(value: SchemaFilter*): Self = StObject.set(x, "subFilters", js.Array(value :_*))
  }
}

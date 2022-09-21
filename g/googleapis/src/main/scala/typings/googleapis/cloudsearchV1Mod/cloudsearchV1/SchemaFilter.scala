package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFilter extends StObject {
  
  var compositeFilter: js.UndefOr[SchemaCompositeFilter] = js.undefined
  
  var valueFilter: js.UndefOr[SchemaValueFilter] = js.undefined
}
object SchemaFilter {
  
  inline def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  
  extension [Self <: SchemaFilter](x: Self) {
    
    inline def setCompositeFilter(value: SchemaCompositeFilter): Self = StObject.set(x, "compositeFilter", value.asInstanceOf[js.Any])
    
    inline def setCompositeFilterUndefined: Self = StObject.set(x, "compositeFilter", js.undefined)
    
    inline def setValueFilter(value: SchemaValueFilter): Self = StObject.set(x, "valueFilter", value.asInstanceOf[js.Any])
    
    inline def setValueFilterUndefined: Self = StObject.set(x, "valueFilter", js.undefined)
  }
}

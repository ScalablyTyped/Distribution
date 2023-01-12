package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingRangePropertyBase
  extends StObject
     with MappingDocValuesPropertyBase {
  
  var boost: js.UndefOr[double] = js.undefined
  
  var coerce: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
}
object MappingRangePropertyBase {
  
  inline def apply(): MappingRangePropertyBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingRangePropertyBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingRangePropertyBase] (val x: Self) extends AnyVal {
    
    inline def setBoost(value: double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}

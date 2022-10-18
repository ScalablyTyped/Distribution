package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingCorePropertyBase
  extends StObject
     with MappingPropertyBase {
  
  var copy_to: js.UndefOr[Fields] = js.undefined
  
  var similarity: js.UndefOr[String] = js.undefined
  
  var store: js.UndefOr[Boolean] = js.undefined
}
object MappingCorePropertyBase {
  
  inline def apply(): MappingCorePropertyBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingCorePropertyBase]
  }
  
  extension [Self <: MappingCorePropertyBase](x: Self) {
    
    inline def setCopy_to(value: Fields): Self = StObject.set(x, "copy_to", value.asInstanceOf[js.Any])
    
    inline def setCopy_toUndefined: Self = StObject.set(x, "copy_to", js.undefined)
    
    inline def setCopy_toVarargs(value: Field*): Self = StObject.set(x, "copy_to", js.Array(value*))
    
    inline def setSimilarity(value: String): Self = StObject.set(x, "similarity", value.asInstanceOf[js.Any])
    
    inline def setSimilarityUndefined: Self = StObject.set(x, "similarity", js.undefined)
    
    inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}

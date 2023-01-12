package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslDecayPlacement[TOrigin, TScale] extends StObject {
  
  var decay: js.UndefOr[double] = js.undefined
  
  var offset: js.UndefOr[TScale] = js.undefined
  
  var origin: js.UndefOr[TOrigin] = js.undefined
  
  var scale: js.UndefOr[TScale] = js.undefined
}
object QueryDslDecayPlacement {
  
  inline def apply[TOrigin, TScale](): QueryDslDecayPlacement[TOrigin, TScale] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslDecayPlacement[TOrigin, TScale]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslDecayPlacement[?, ?], TOrigin, TScale] (val x: Self & (QueryDslDecayPlacement[TOrigin, TScale])) extends AnyVal {
    
    inline def setDecay(value: double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
    
    inline def setDecayUndefined: Self = StObject.set(x, "decay", js.undefined)
    
    inline def setOffset(value: TScale): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrigin(value: TOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setScale(value: TScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}

package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformContainer extends StObject {
  
  var chain: js.UndefOr[js.Array[TransformContainer]] = js.undefined
  
  var script: js.UndefOr[ScriptTransform] = js.undefined
  
  var search: js.UndefOr[SearchTransform] = js.undefined
}
object TransformContainer {
  
  inline def apply(): TransformContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformContainer]
  }
  
  extension [Self <: TransformContainer](x: Self) {
    
    inline def setChain(value: js.Array[TransformContainer]): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
    
    inline def setChainVarargs(value: TransformContainer*): Self = StObject.set(x, "chain", js.Array(value*))
    
    inline def setScript(value: ScriptTransform): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setSearch(value: SearchTransform): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}

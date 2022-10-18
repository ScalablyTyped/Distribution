package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesUpdateAliasesRemoveIndexAction extends StObject {
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var indices: js.UndefOr[Indices] = js.undefined
  
  var must_exist: js.UndefOr[Boolean] = js.undefined
}
object IndicesUpdateAliasesRemoveIndexAction {
  
  inline def apply(): IndicesUpdateAliasesRemoveIndexAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesUpdateAliasesRemoveIndexAction]
  }
  
  extension [Self <: IndicesUpdateAliasesRemoveIndexAction](x: Self) {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndices(value: Indices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setMust_exist(value: Boolean): Self = StObject.set(x, "must_exist", value.asInstanceOf[js.Any])
    
    inline def setMust_existUndefined: Self = StObject.set(x, "must_exist", js.undefined)
  }
}

package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesUpdateAliasesRemoveAction extends StObject {
  
  var alias: js.UndefOr[IndexAlias] = js.undefined
  
  var aliases: js.UndefOr[IndexAlias | js.Array[IndexAlias]] = js.undefined
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var indices: js.UndefOr[Indices] = js.undefined
  
  var must_exist: js.UndefOr[Boolean] = js.undefined
}
object IndicesUpdateAliasesRemoveAction {
  
  inline def apply(): IndicesUpdateAliasesRemoveAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesUpdateAliasesRemoveAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesUpdateAliasesRemoveAction] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: IndexAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAliases(value: IndexAlias | js.Array[IndexAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: IndexAlias*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndices(value: Indices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setMust_exist(value: Boolean): Self = StObject.set(x, "must_exist", value.asInstanceOf[js.Any])
    
    inline def setMust_existUndefined: Self = StObject.set(x, "must_exist", js.undefined)
  }
}

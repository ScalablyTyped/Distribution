package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesUpdateAliasesAction extends StObject {
  
  var add: js.UndefOr[IndicesUpdateAliasesAddAction] = js.undefined
  
  var remove: js.UndefOr[IndicesUpdateAliasesRemoveAction] = js.undefined
  
  var remove_index: js.UndefOr[IndicesUpdateAliasesRemoveIndexAction] = js.undefined
}
object IndicesUpdateAliasesAction {
  
  inline def apply(): IndicesUpdateAliasesAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesUpdateAliasesAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesUpdateAliasesAction] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: IndicesUpdateAliasesAddAction): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setRemove(value: IndicesUpdateAliasesRemoveAction): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRemove_index(value: IndicesUpdateAliasesRemoveIndexAction): Self = StObject.set(x, "remove_index", value.asInstanceOf[js.Any])
    
    inline def setRemove_indexUndefined: Self = StObject.set(x, "remove_index", js.undefined)
  }
}

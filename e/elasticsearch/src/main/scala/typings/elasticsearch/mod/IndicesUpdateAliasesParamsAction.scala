package typings.elasticsearch.mod

import typings.elasticsearch.anon.Alias
import typings.elasticsearch.anon.IndexString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesUpdateAliasesParamsAction extends StObject {
  
  var add: js.UndefOr[Alias] = js.undefined
  
  var remove: js.UndefOr[typings.elasticsearch.anon.Indices] = js.undefined
  
  var remove_index: js.UndefOr[IndexString] = js.undefined
}
object IndicesUpdateAliasesParamsAction {
  
  inline def apply(): IndicesUpdateAliasesParamsAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesUpdateAliasesParamsAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesUpdateAliasesParamsAction] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Alias): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setRemove(value: typings.elasticsearch.anon.Indices): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRemove_index(value: IndexString): Self = StObject.set(x, "remove_index", value.asInstanceOf[js.Any])
    
    inline def setRemove_indexUndefined: Self = StObject.set(x, "remove_index", js.undefined)
  }
}

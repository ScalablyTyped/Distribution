package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherIndexAction extends StObject {
  
  var doc_id: js.UndefOr[Id] = js.undefined
  
  var execution_time_field: js.UndefOr[Field] = js.undefined
  
  var index: IndexName
  
  var op_type: js.UndefOr[OpType] = js.undefined
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object WatcherIndexAction {
  
  inline def apply(index: IndexName): WatcherIndexAction = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherIndexAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherIndexAction] (val x: Self) extends AnyVal {
    
    inline def setDoc_id(value: Id): Self = StObject.set(x, "doc_id", value.asInstanceOf[js.Any])
    
    inline def setDoc_idUndefined: Self = StObject.set(x, "doc_id", js.undefined)
    
    inline def setExecution_time_field(value: Field): Self = StObject.set(x, "execution_time_field", value.asInstanceOf[js.Any])
    
    inline def setExecution_time_fieldUndefined: Self = StObject.set(x, "execution_time_field", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOp_type(value: OpType): Self = StObject.set(x, "op_type", value.asInstanceOf[js.Any])
    
    inline def setOp_typeUndefined: Self = StObject.set(x, "op_type", js.undefined)
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}

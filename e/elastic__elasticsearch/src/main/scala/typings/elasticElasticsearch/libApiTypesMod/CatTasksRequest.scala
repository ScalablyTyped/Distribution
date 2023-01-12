package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatTasksRequest
  extends StObject
     with CatCatRequestBase {
  
  var actions: js.UndefOr[js.Array[String]] = js.undefined
  
  var detailed: js.UndefOr[Boolean] = js.undefined
  
  var node_id: js.UndefOr[js.Array[String]] = js.undefined
  
  var parent_task: js.UndefOr[long] = js.undefined
}
object CatTasksRequest {
  
  inline def apply(): CatTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatTasksRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatTasksRequest] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    
    inline def setNode_id(value: js.Array[String]): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setNode_idVarargs(value: String*): Self = StObject.set(x, "node_id", js.Array(value*))
    
    inline def setParent_task(value: long): Self = StObject.set(x, "parent_task", value.asInstanceOf[js.Any])
    
    inline def setParent_taskUndefined: Self = StObject.set(x, "parent_task", js.undefined)
  }
}

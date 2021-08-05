package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatTasksParams
  extends StObject
     with GenericParams {
  
  var actions: js.UndefOr[NameList] = js.undefined
  
  var detailed: js.UndefOr[Boolean] = js.undefined
  
  var format: String
  
  var h: js.UndefOr[NameList] = js.undefined
  
  var help: js.UndefOr[Boolean] = js.undefined
  
  var nodeId: js.UndefOr[NameList] = js.undefined
  
  var parentNode: js.UndefOr[String] = js.undefined
  
  var parentTask: js.UndefOr[Double] = js.undefined
  
  var v: js.UndefOr[Boolean] = js.undefined
}
object CatTasksParams {
  
  inline def apply(format: String): CatTasksParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatTasksParams]
  }
  
  extension [Self <: CatTasksParams](x: Self) {
    
    inline def setActions(value: NameList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setH(value: NameList): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHVarargs(value: String*): Self = StObject.set(x, "h", js.Array(value :_*))
    
    inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setNodeId(value: NameList): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setNodeIdVarargs(value: String*): Self = StObject.set(x, "nodeId", js.Array(value :_*))
    
    inline def setParentNode(value: String): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    inline def setParentTask(value: Double): Self = StObject.set(x, "parentTask", value.asInstanceOf[js.Any])
    
    inline def setParentTaskUndefined: Self = StObject.set(x, "parentTask", js.undefined)
    
    inline def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}

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
  
  @scala.inline
  def apply(format: String): CatTasksParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatTasksParams]
  }
  
  @scala.inline
  implicit class CatTasksParamsMutableBuilder[Self <: CatTasksParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: NameList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH(value: NameList): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    @scala.inline
    def setHVarargs(value: String*): Self = StObject.set(x, "h", js.Array(value :_*))
    
    @scala.inline
    def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    @scala.inline
    def setNodeId(value: NameList): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    @scala.inline
    def setNodeIdVarargs(value: String*): Self = StObject.set(x, "nodeId", js.Array(value :_*))
    
    @scala.inline
    def setParentNode(value: String): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    @scala.inline
    def setParentTask(value: Double): Self = StObject.set(x, "parentTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTaskUndefined: Self = StObject.set(x, "parentTask", js.undefined)
    
    @scala.inline
    def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}

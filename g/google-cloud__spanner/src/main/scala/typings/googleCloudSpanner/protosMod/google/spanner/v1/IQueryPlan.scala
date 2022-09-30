package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a QueryPlan. */
trait IQueryPlan extends StObject {
  
  /** QueryPlan planNodes */
  var planNodes: js.UndefOr[js.Array[IPlanNode] | Null] = js.undefined
}
object IQueryPlan {
  
  inline def apply(): IQueryPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryPlan]
  }
  
  extension [Self <: IQueryPlan](x: Self) {
    
    inline def setPlanNodes(value: js.Array[IPlanNode]): Self = StObject.set(x, "planNodes", value.asInstanceOf[js.Any])
    
    inline def setPlanNodesNull: Self = StObject.set(x, "planNodes", null)
    
    inline def setPlanNodesUndefined: Self = StObject.set(x, "planNodes", js.undefined)
    
    inline def setPlanNodesVarargs(value: IPlanNode*): Self = StObject.set(x, "planNodes", js.Array(value*))
  }
}

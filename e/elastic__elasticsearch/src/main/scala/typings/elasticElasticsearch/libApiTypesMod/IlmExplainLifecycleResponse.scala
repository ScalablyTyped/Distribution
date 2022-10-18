package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmExplainLifecycleResponse extends StObject {
  
  var indices: Record[IndexName, IlmExplainLifecycleLifecycleExplain]
}
object IlmExplainLifecycleResponse {
  
  inline def apply(indices: Record[IndexName, IlmExplainLifecycleLifecycleExplain]): IlmExplainLifecycleResponse = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmExplainLifecycleResponse]
  }
  
  extension [Self <: IlmExplainLifecycleResponse](x: Self) {
    
    inline def setIndices(value: Record[IndexName, IlmExplainLifecycleLifecycleExplain]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
  }
}

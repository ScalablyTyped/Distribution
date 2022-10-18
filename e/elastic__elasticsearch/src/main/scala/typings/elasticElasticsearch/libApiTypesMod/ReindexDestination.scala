package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReindexDestination extends StObject {
  
  var index: IndexName
  
  var op_type: js.UndefOr[OpType] = js.undefined
  
  var pipeline: js.UndefOr[String] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var version_type: js.UndefOr[VersionType] = js.undefined
}
object ReindexDestination {
  
  inline def apply(index: IndexName): ReindexDestination = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexDestination]
  }
  
  extension [Self <: ReindexDestination](x: Self) {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOp_type(value: OpType): Self = StObject.set(x, "op_type", value.asInstanceOf[js.Any])
    
    inline def setOp_typeUndefined: Self = StObject.set(x, "op_type", js.undefined)
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setVersion_type(value: VersionType): Self = StObject.set(x, "version_type", value.asInstanceOf[js.Any])
    
    inline def setVersion_typeUndefined: Self = StObject.set(x, "version_type", js.undefined)
  }
}

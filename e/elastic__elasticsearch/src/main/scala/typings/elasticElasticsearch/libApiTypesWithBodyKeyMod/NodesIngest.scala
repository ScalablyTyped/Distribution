package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesIngest extends StObject {
  
  var pipelines: js.UndefOr[Record[String, NodesIngestTotal]] = js.undefined
  
  var total: js.UndefOr[NodesIngestTotal] = js.undefined
}
object NodesIngest {
  
  inline def apply(): NodesIngest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesIngest]
  }
  
  extension [Self <: NodesIngest](x: Self) {
    
    inline def setPipelines(value: Record[String, NodesIngestTotal]): Self = StObject.set(x, "pipelines", value.asInstanceOf[js.Any])
    
    inline def setPipelinesUndefined: Self = StObject.set(x, "pipelines", js.undefined)
    
    inline def setTotal(value: NodesIngestTotal): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}

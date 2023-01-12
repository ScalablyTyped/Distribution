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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesIngest] (val x: Self) extends AnyVal {
    
    inline def setPipelines(value: Record[String, NodesIngestTotal]): Self = StObject.set(x, "pipelines", value.asInstanceOf[js.Any])
    
    inline def setPipelinesUndefined: Self = StObject.set(x, "pipelines", js.undefined)
    
    inline def setTotal(value: NodesIngestTotal): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}

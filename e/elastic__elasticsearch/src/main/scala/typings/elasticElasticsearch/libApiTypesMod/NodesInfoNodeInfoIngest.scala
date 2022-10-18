package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoIngest extends StObject {
  
  var processors: js.Array[NodesInfoNodeInfoIngestProcessor]
}
object NodesInfoNodeInfoIngest {
  
  inline def apply(processors: js.Array[NodesInfoNodeInfoIngestProcessor]): NodesInfoNodeInfoIngest = {
    val __obj = js.Dynamic.literal(processors = processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoIngest]
  }
  
  extension [Self <: NodesInfoNodeInfoIngest](x: Self) {
    
    inline def setProcessors(value: js.Array[NodesInfoNodeInfoIngestProcessor]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsVarargs(value: NodesInfoNodeInfoIngestProcessor*): Self = StObject.set(x, "processors", js.Array(value*))
  }
}

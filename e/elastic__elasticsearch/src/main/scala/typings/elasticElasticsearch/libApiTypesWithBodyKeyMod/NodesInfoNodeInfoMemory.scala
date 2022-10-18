package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoMemory extends StObject {
  
  var total: String
  
  var total_in_bytes: long
}
object NodesInfoNodeInfoMemory {
  
  inline def apply(total: String, total_in_bytes: long): NodesInfoNodeInfoMemory = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any], total_in_bytes = total_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoMemory]
  }
  
  extension [Self <: NodesInfoNodeInfoMemory](x: Self) {
    
    inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotal_in_bytes(value: long): Self = StObject.set(x, "total_in_bytes", value.asInstanceOf[js.Any])
  }
}

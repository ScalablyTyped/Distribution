package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoBootstrap extends StObject {
  
  var memory_lock: String
}
object NodesInfoNodeInfoBootstrap {
  
  inline def apply(memory_lock: String): NodesInfoNodeInfoBootstrap = {
    val __obj = js.Dynamic.literal(memory_lock = memory_lock.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoBootstrap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoBootstrap] (val x: Self) extends AnyVal {
    
    inline def setMemory_lock(value: String): Self = StObject.set(x, "memory_lock", value.asInstanceOf[js.Any])
  }
}

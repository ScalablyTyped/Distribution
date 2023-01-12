package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeThreadPoolInfo extends StObject {
  
  var core: js.UndefOr[integer] = js.undefined
  
  var keep_alive: js.UndefOr[Duration] = js.undefined
  
  var max: js.UndefOr[integer] = js.undefined
  
  var queue_size: integer
  
  var size: js.UndefOr[integer] = js.undefined
  
  var `type`: String
}
object NodesInfoNodeThreadPoolInfo {
  
  inline def apply(queue_size: integer, `type`: String): NodesInfoNodeThreadPoolInfo = {
    val __obj = js.Dynamic.literal(queue_size = queue_size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeThreadPoolInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeThreadPoolInfo] (val x: Self) extends AnyVal {
    
    inline def setCore(value: integer): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
    
    inline def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
    
    inline def setKeep_alive(value: Duration): Self = StObject.set(x, "keep_alive", value.asInstanceOf[js.Any])
    
    inline def setKeep_aliveUndefined: Self = StObject.set(x, "keep_alive", js.undefined)
    
    inline def setMax(value: integer): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setQueue_size(value: integer): Self = StObject.set(x, "queue_size", value.asInstanceOf[js.Any])
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

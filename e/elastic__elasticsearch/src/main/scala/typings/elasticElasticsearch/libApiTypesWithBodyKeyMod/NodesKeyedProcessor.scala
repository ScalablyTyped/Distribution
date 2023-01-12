package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesKeyedProcessor extends StObject {
  
  var stats: js.UndefOr[NodesProcessor] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object NodesKeyedProcessor {
  
  inline def apply(): NodesKeyedProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesKeyedProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesKeyedProcessor] (val x: Self) extends AnyVal {
    
    inline def setStats(value: NodesProcessor): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

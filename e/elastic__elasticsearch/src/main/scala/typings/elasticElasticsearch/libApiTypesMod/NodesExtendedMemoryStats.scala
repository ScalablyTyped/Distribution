package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesExtendedMemoryStats
  extends StObject
     with NodesMemoryStats {
  
  var free_percent: js.UndefOr[integer] = js.undefined
  
  var used_percent: js.UndefOr[integer] = js.undefined
}
object NodesExtendedMemoryStats {
  
  inline def apply(): NodesExtendedMemoryStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesExtendedMemoryStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesExtendedMemoryStats] (val x: Self) extends AnyVal {
    
    inline def setFree_percent(value: integer): Self = StObject.set(x, "free_percent", value.asInstanceOf[js.Any])
    
    inline def setFree_percentUndefined: Self = StObject.set(x, "free_percent", js.undefined)
    
    inline def setUsed_percent(value: integer): Self = StObject.set(x, "used_percent", value.asInstanceOf[js.Any])
    
    inline def setUsed_percentUndefined: Self = StObject.set(x, "used_percent", js.undefined)
  }
}

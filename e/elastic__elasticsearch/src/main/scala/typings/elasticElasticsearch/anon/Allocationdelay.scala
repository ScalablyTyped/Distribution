package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ShutdownType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allocationdelay extends StObject {
  
  var allocation_delay: js.UndefOr[String] = js.undefined
  
  var reason: String
  
  var target_node_name: js.UndefOr[String] = js.undefined
  
  var `type`: ShutdownType
}
object Allocationdelay {
  
  inline def apply(reason: String, `type`: ShutdownType): Allocationdelay = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allocationdelay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Allocationdelay] (val x: Self) extends AnyVal {
    
    inline def setAllocation_delay(value: String): Self = StObject.set(x, "allocation_delay", value.asInstanceOf[js.Any])
    
    inline def setAllocation_delayUndefined: Self = StObject.set(x, "allocation_delay", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setTarget_node_name(value: String): Self = StObject.set(x, "target_node_name", value.asInstanceOf[js.Any])
    
    inline def setTarget_node_nameUndefined: Self = StObject.set(x, "target_node_name", js.undefined)
    
    inline def setType(value: ShutdownType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

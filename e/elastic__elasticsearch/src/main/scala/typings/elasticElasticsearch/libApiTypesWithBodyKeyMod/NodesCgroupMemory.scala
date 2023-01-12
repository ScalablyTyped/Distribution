package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesCgroupMemory extends StObject {
  
  var control_group: js.UndefOr[String] = js.undefined
  
  var limit_in_bytes: js.UndefOr[String] = js.undefined
  
  var usage_in_bytes: js.UndefOr[String] = js.undefined
}
object NodesCgroupMemory {
  
  inline def apply(): NodesCgroupMemory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesCgroupMemory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesCgroupMemory] (val x: Self) extends AnyVal {
    
    inline def setControl_group(value: String): Self = StObject.set(x, "control_group", value.asInstanceOf[js.Any])
    
    inline def setControl_groupUndefined: Self = StObject.set(x, "control_group", js.undefined)
    
    inline def setLimit_in_bytes(value: String): Self = StObject.set(x, "limit_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setLimit_in_bytesUndefined: Self = StObject.set(x, "limit_in_bytes", js.undefined)
    
    inline def setUsage_in_bytes(value: String): Self = StObject.set(x, "usage_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setUsage_in_bytesUndefined: Self = StObject.set(x, "usage_in_bytes", js.undefined)
  }
}

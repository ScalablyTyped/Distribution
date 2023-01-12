package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageSecurityRolesDlsBitSetCache extends StObject {
  
  var count: integer
  
  var memory: js.UndefOr[ByteSize] = js.undefined
  
  var memory_in_bytes: ulong
}
object XpackUsageSecurityRolesDlsBitSetCache {
  
  inline def apply(count: integer, memory_in_bytes: ulong): XpackUsageSecurityRolesDlsBitSetCache = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], memory_in_bytes = memory_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageSecurityRolesDlsBitSetCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageSecurityRolesDlsBitSetCache] (val x: Self) extends AnyVal {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setMemory(value: ByteSize): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setMemory_in_bytes(value: ulong): Self = StObject.set(x, "memory_in_bytes", value.asInstanceOf[js.Any])
  }
}

package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageSecurityRolesDls extends StObject {
  
  var bit_set_cache: XpackUsageSecurityRolesDlsBitSetCache
}
object XpackUsageSecurityRolesDls {
  
  inline def apply(bit_set_cache: XpackUsageSecurityRolesDlsBitSetCache): XpackUsageSecurityRolesDls = {
    val __obj = js.Dynamic.literal(bit_set_cache = bit_set_cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageSecurityRolesDls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageSecurityRolesDls] (val x: Self) extends AnyVal {
    
    inline def setBit_set_cache(value: XpackUsageSecurityRolesDlsBitSetCache): Self = StObject.set(x, "bit_set_cache", value.asInstanceOf[js.Any])
  }
}

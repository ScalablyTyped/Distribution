package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageRoleMapping extends StObject {
  
  var enabled: integer
  
  var size: integer
}
object XpackUsageRoleMapping {
  
  inline def apply(enabled: integer, size: integer): XpackUsageRoleMapping = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageRoleMapping]
  }
  
  extension [Self <: XpackUsageRoleMapping](x: Self) {
    
    inline def setEnabled(value: integer): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}

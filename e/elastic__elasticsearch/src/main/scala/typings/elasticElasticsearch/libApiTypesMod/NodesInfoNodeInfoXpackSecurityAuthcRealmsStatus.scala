package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoXpackSecurityAuthcRealmsStatus extends StObject {
  
  var enabled: js.UndefOr[String] = js.undefined
  
  var order: String
}
object NodesInfoNodeInfoXpackSecurityAuthcRealmsStatus {
  
  inline def apply(order: String): NodesInfoNodeInfoXpackSecurityAuthcRealmsStatus = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoXpackSecurityAuthcRealmsStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoXpackSecurityAuthcRealmsStatus] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}

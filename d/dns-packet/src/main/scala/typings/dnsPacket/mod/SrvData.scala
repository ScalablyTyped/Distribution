package typings.dnsPacket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SrvData extends StObject {
  
  var port: Double
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var target: String
  
  var weight: js.UndefOr[Double] = js.undefined
}
object SrvData {
  
  inline def apply(port: Double, target: String): SrvData = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SrvData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SrvData] (val x: Self) extends AnyVal {
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}

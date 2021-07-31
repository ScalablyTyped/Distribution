package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyData
  extends StObject
     with InstanceData {
  
  /**
    * This proxy's target object.
    */
  var target: Object
}
object ProxyData {
  
  @scala.inline
  def apply(target: Object): ProxyData = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyData]
  }
  
  @scala.inline
  implicit class ProxyDataMutableBuilder[Self <: ProxyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}

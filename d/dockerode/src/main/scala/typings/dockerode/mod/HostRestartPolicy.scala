package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostRestartPolicy extends StObject {
  
  var MaximumRetryCount: js.UndefOr[Double] = js.undefined
  
  var Name: String
}
object HostRestartPolicy {
  
  inline def apply(Name: String): HostRestartPolicy = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostRestartPolicy]
  }
  
  extension [Self <: HostRestartPolicy](x: Self) {
    
    inline def setMaximumRetryCount(value: Double): Self = StObject.set(x, "MaximumRetryCount", value.asInstanceOf[js.Any])
    
    inline def setMaximumRetryCountUndefined: Self = StObject.set(x, "MaximumRetryCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

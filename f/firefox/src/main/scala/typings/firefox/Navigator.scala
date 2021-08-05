package typings.firefox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  var mozApps: Apps
}
object Navigator {
  
  inline def apply(mozApps: Apps): Navigator = {
    val __obj = js.Dynamic.literal(mozApps = mozApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setMozApps(value: Apps): Self = StObject.set(x, "mozApps", value.asInstanceOf[js.Any])
  }
}

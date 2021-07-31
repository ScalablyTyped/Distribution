package typings.firefox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  var mozApps: Apps
}
object Navigator {
  
  @scala.inline
  def apply(mozApps: Apps): Navigator = {
    val __obj = js.Dynamic.literal(mozApps = mozApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMozApps(value: Apps): Self = StObject.set(x, "mozApps", value.asInstanceOf[js.Any])
  }
}

package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDetachedDetachInfo extends StObject {
  
  var oldPosition: Double
  
  var oldWindowId: Double
}
object OnDetachedDetachInfo {
  
  inline def apply(oldPosition: Double, oldWindowId: Double): OnDetachedDetachInfo = {
    val __obj = js.Dynamic.literal(oldPosition = oldPosition.asInstanceOf[js.Any], oldWindowId = oldWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDetachedDetachInfo]
  }
  
  extension [Self <: OnDetachedDetachInfo](x: Self) {
    
    inline def setOldPosition(value: Double): Self = StObject.set(x, "oldPosition", value.asInstanceOf[js.Any])
    
    inline def setOldWindowId(value: Double): Self = StObject.set(x, "oldWindowId", value.asInstanceOf[js.Any])
  }
}

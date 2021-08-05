package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnMovedMoveInfo extends StObject {
  
  var fromIndex: Double
  
  var toIndex: Double
  
  var windowId: Double
}
object OnMovedMoveInfo {
  
  inline def apply(fromIndex: Double, toIndex: Double, windowId: Double): OnMovedMoveInfo = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMovedMoveInfo]
  }
  
  extension [Self <: OnMovedMoveInfo](x: Self) {
    
    inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}

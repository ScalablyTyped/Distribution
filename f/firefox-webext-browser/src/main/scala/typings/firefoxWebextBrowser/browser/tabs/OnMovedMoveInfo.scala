package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMovedMoveInfo extends StObject {
  
  var fromIndex: Double = js.native
  
  var toIndex: Double = js.native
  
  var windowId: Double = js.native
}
object OnMovedMoveInfo {
  
  @scala.inline
  def apply(fromIndex: Double, toIndex: Double, windowId: Double): OnMovedMoveInfo = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMovedMoveInfo]
  }
  
  @scala.inline
  implicit class OnMovedMoveInfoMutableBuilder[Self <: OnMovedMoveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}

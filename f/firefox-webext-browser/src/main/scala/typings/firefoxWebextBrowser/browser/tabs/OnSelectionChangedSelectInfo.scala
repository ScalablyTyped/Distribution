package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSelectionChangedSelectInfo extends StObject {
  
  /** The ID of the window the selected tab changed inside of. */
  var windowId: Double
}
object OnSelectionChangedSelectInfo {
  
  @scala.inline
  def apply(windowId: Double): OnSelectionChangedSelectInfo = {
    val __obj = js.Dynamic.literal(windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSelectionChangedSelectInfo]
  }
  
  @scala.inline
  implicit class OnSelectionChangedSelectInfoMutableBuilder[Self <: OnSelectionChangedSelectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}

package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSelectionChangedSelectInfo extends StObject {
  
  /** The ID of the window the selected tab changed inside of. */
  var windowId: Double
}
object OnSelectionChangedSelectInfo {
  
  inline def apply(windowId: Double): OnSelectionChangedSelectInfo = {
    val __obj = js.Dynamic.literal(windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSelectionChangedSelectInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnSelectionChangedSelectInfo] (val x: Self) extends AnyVal {
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}

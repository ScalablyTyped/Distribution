package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnActiveChangedSelectInfo extends StObject {
  
  /** The ID of the window the selected tab changed inside of. */
  var windowId: Double
}
object OnActiveChangedSelectInfo {
  
  inline def apply(windowId: Double): OnActiveChangedSelectInfo = {
    val __obj = js.Dynamic.literal(windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnActiveChangedSelectInfo]
  }
  
  extension [Self <: OnActiveChangedSelectInfo](x: Self) {
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}

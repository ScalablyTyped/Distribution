package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnHighlightedHighlightInfo extends StObject {
  
  /** All highlighted tabs in the window. */
  var tabIds: js.Array[Double]
  
  /** The window whose tabs changed. */
  var windowId: Double
}
object OnHighlightedHighlightInfo {
  
  inline def apply(tabIds: js.Array[Double], windowId: Double): OnHighlightedHighlightInfo = {
    val __obj = js.Dynamic.literal(tabIds = tabIds.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHighlightedHighlightInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnHighlightedHighlightInfo] (val x: Self) extends AnyVal {
    
    inline def setTabIds(value: js.Array[Double]): Self = StObject.set(x, "tabIds", value.asInstanceOf[js.Any])
    
    inline def setTabIdsVarargs(value: Double*): Self = StObject.set(x, "tabIds", js.Array(value*))
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}

package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnHighlightedHighlightInfo extends StObject {
  
  /** All highlighted tabs in the window. */
  var tabIds: js.Array[Double] = js.native
  
  /** The window whose tabs changed. */
  var windowId: Double = js.native
}
object OnHighlightedHighlightInfo {
  
  @scala.inline
  def apply(tabIds: js.Array[Double], windowId: Double): OnHighlightedHighlightInfo = {
    val __obj = js.Dynamic.literal(tabIds = tabIds.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHighlightedHighlightInfo]
  }
  
  @scala.inline
  implicit class OnHighlightedHighlightInfoMutableBuilder[Self <: OnHighlightedHighlightInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTabIds(value: js.Array[Double]): Self = StObject.set(x, "tabIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIdsVarargs(value: Double*): Self = StObject.set(x, "tabIds", js.Array(value :_*))
    
    @scala.inline
    def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}

package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnZoomChangeZoomChangeInfo extends StObject {
  
  var newZoomFactor: Double = js.native
  
  var oldZoomFactor: Double = js.native
  
  var tabId: Double = js.native
  
  var zoomSettings: ZoomSettings = js.native
}
object OnZoomChangeZoomChangeInfo {
  
  @scala.inline
  def apply(newZoomFactor: Double, oldZoomFactor: Double, tabId: Double, zoomSettings: ZoomSettings): OnZoomChangeZoomChangeInfo = {
    val __obj = js.Dynamic.literal(newZoomFactor = newZoomFactor.asInstanceOf[js.Any], oldZoomFactor = oldZoomFactor.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], zoomSettings = zoomSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnZoomChangeZoomChangeInfo]
  }
  
  @scala.inline
  implicit class OnZoomChangeZoomChangeInfoMutableBuilder[Self <: OnZoomChangeZoomChangeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewZoomFactor(value: Double): Self = StObject.set(x, "newZoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldZoomFactor(value: Double): Self = StObject.set(x, "oldZoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomSettings(value: ZoomSettings): Self = StObject.set(x, "zoomSettings", value.asInstanceOf[js.Any])
  }
}

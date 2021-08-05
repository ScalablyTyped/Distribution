package typings.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the frame to retrieve information about. */
trait GetFrameDetails extends StObject {
  
  /** The ID of the frame in the given tab. */
  var frameId: Double
  
  /** The ID of the process runs the renderer for this tab. */
  var processId: js.UndefOr[Double] = js.undefined
  
  /** The ID of the tab in which the frame is. */
  var tabId: Double
}
object GetFrameDetails {
  
  inline def apply(frameId: Double, tabId: Double): GetFrameDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFrameDetails]
  }
  
  extension [Self <: GetFrameDetails](x: Self) {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    inline def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
  }
}

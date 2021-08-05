package typings.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the tab to retrieve all frames from. */
trait GetAllFramesDetails extends StObject {
  
  /** The ID of the tab. */
  var tabId: Double
}
object GetAllFramesDetails {
  
  inline def apply(tabId: Double): GetAllFramesDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllFramesDetails]
  }
  
  extension [Self <: GetAllFramesDetails](x: Self) {
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
  }
}

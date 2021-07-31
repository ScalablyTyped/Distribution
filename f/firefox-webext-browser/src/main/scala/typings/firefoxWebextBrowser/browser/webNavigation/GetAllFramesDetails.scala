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
  
  @scala.inline
  def apply(tabId: Double): GetAllFramesDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllFramesDetails]
  }
  
  @scala.inline
  implicit class GetAllFramesDetailsMutableBuilder[Self <: GetAllFramesDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
  }
}

package typings.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the requested frame, null if the specified frame ID and/or tab ID are invalid. */
@js.native
trait GetFrameReturnDetails extends StObject {
  
  /**
    * True if the last navigation in this frame was interrupted by an error, i.e. the onErrorOccurred event fired.
    */
  var errorOccurred: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the frame. 0 indicates that this is the main frame; a positive value indicates the ID of a subframe.
    */
  var frameId: Double = js.native
  
  /** ID of frame that wraps the frame. Set to -1 of no parent frame exists. */
  var parentFrameId: Double = js.native
  
  /** The ID of the tab in which the frame is. */
  var tabId: Double = js.native
  
  /**
    * The URL currently associated with this frame, if the frame identified by the frameId existed at one point in the given tab. The fact that an URL is associated with a given frameId does not imply that the corresponding frame still exists.
    */
  var url: String = js.native
}
object GetFrameReturnDetails {
  
  @scala.inline
  def apply(frameId: Double, parentFrameId: Double, tabId: Double, url: String): GetFrameReturnDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFrameReturnDetails]
  }
  
  @scala.inline
  implicit class GetFrameReturnDetailsMutableBuilder[Self <: GetFrameReturnDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorOccurred(value: Boolean): Self = StObject.set(x, "errorOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorOccurredUndefined: Self = StObject.set(x, "errorOccurred", js.undefined)
    
    @scala.inline
    def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFrameId(value: Double): Self = StObject.set(x, "parentFrameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageOptions extends StObject {
  
  /** Send a message to a specific frame identified by `frameId` instead of all frames in the tab. */
  var frameId: js.UndefOr[Double] = js.undefined
}
object SendMessageOptions {
  
  @scala.inline
  def apply(): SendMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageOptions]
  }
  
  @scala.inline
  implicit class SendMessageOptionsMutableBuilder[Self <: SendMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
  }
}

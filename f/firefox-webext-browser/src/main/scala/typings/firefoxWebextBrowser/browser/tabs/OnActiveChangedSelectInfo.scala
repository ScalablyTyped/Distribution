package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnActiveChangedSelectInfo extends StObject {
  
  /** The ID of the window the selected tab changed inside of. */
  var windowId: Double = js.native
}
object OnActiveChangedSelectInfo {
  
  @scala.inline
  def apply(windowId: Double): OnActiveChangedSelectInfo = {
    val __obj = js.Dynamic.literal(windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnActiveChangedSelectInfo]
  }
  
  @scala.inline
  implicit class OnActiveChangedSelectInfoMutableBuilder[Self <: OnActiveChangedSelectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}

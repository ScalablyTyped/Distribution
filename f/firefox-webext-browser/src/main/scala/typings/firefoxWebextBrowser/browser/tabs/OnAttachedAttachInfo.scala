package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnAttachedAttachInfo extends StObject {
  
  var newPosition: Double = js.native
  
  var newWindowId: Double = js.native
}
object OnAttachedAttachInfo {
  
  @scala.inline
  def apply(newPosition: Double, newWindowId: Double): OnAttachedAttachInfo = {
    val __obj = js.Dynamic.literal(newPosition = newPosition.asInstanceOf[js.Any], newWindowId = newWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAttachedAttachInfo]
  }
  
  @scala.inline
  implicit class OnAttachedAttachInfoMutableBuilder[Self <: OnAttachedAttachInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewPosition(value: Double): Self = StObject.set(x, "newPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWindowId(value: Double): Self = StObject.set(x, "newWindowId", value.asInstanceOf[js.Any])
  }
}

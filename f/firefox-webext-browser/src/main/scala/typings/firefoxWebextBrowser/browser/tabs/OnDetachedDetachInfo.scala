package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDetachedDetachInfo extends StObject {
  
  var oldPosition: Double = js.native
  
  var oldWindowId: Double = js.native
}
object OnDetachedDetachInfo {
  
  @scala.inline
  def apply(oldPosition: Double, oldWindowId: Double): OnDetachedDetachInfo = {
    val __obj = js.Dynamic.literal(oldPosition = oldPosition.asInstanceOf[js.Any], oldWindowId = oldWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDetachedDetachInfo]
  }
  
  @scala.inline
  implicit class OnDetachedDetachInfoMutableBuilder[Self <: OnDetachedDetachInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldPosition(value: Double): Self = StObject.set(x, "oldPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldWindowId(value: Double): Self = StObject.set(x, "oldWindowId", value.asInstanceOf[js.Any])
  }
}

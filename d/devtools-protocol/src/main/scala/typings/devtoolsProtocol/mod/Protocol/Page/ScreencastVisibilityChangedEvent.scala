package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreencastVisibilityChangedEvent extends StObject {
  
  /**
    * True if the page is visible.
    */
  var visible: Boolean = js.native
}
object ScreencastVisibilityChangedEvent {
  
  @scala.inline
  def apply(visible: Boolean): ScreencastVisibilityChangedEvent = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreencastVisibilityChangedEvent]
  }
  
  @scala.inline
  implicit class ScreencastVisibilityChangedEventMutableBuilder[Self <: ScreencastVisibilityChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}

package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreencastVisibilityChangedEvent extends StObject {
  
  /**
    * True if the page is visible.
    */
  var visible: Boolean
}
object ScreencastVisibilityChangedEvent {
  
  inline def apply(visible: Boolean): ScreencastVisibilityChangedEvent = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreencastVisibilityChangedEvent]
  }
  
  extension [Self <: ScreencastVisibilityChangedEvent](x: Self) {
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}

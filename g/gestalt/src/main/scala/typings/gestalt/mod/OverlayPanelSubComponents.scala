package typings.gestalt.mod

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayPanelSubComponents extends StObject {
  
  var DismissingElement: FunctionComponent[OverlayPanelDismissingElementProps]
}
object OverlayPanelSubComponents {
  
  inline def apply(DismissingElement: FunctionComponent[OverlayPanelDismissingElementProps]): OverlayPanelSubComponents = {
    val __obj = js.Dynamic.literal(DismissingElement = DismissingElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayPanelSubComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverlayPanelSubComponents] (val x: Self) extends AnyVal {
    
    inline def setDismissingElement(value: FunctionComponent[OverlayPanelDismissingElementProps]): Self = StObject.set(x, "DismissingElement", value.asInstanceOf[js.Any])
  }
}

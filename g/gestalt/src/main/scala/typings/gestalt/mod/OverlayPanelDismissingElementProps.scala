package typings.gestalt.mod

import typings.gestalt.anon.OnDismissStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayPanelDismissingElementProps extends StObject {
  
  var children: DismissingElementChildrenType
}
object OverlayPanelDismissingElementProps {
  
  inline def apply(children: /* arg */ OnDismissStart => Node): OverlayPanelDismissingElementProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[OverlayPanelDismissingElementProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverlayPanelDismissingElementProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: /* arg */ OnDismissStart => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}

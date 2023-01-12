package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.gestalt.gestaltStrings.gray
import typings.gestalt.gestaltStrings.none
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRowExpandableProps extends StObject {
  
  var accessibilityCollapseLabel: String
  
  var accessibilityExpandLabel: String
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var expandedContents: ReactNode
  
  var hoverStyle: js.UndefOr[none | gray] = js.undefined
  
  var id: String
  
  var onExpand: js.UndefOr[
    AbstractEventHandler[
      (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement]), 
      js.Object
    ]
  ] = js.undefined
}
object TableRowExpandableProps {
  
  inline def apply(accessibilityCollapseLabel: String, accessibilityExpandLabel: String, id: String): TableRowExpandableProps = {
    val __obj = js.Dynamic.literal(accessibilityCollapseLabel = accessibilityCollapseLabel.asInstanceOf[js.Any], accessibilityExpandLabel = accessibilityExpandLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowExpandableProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableRowExpandableProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityCollapseLabel(value: String): Self = StObject.set(x, "accessibilityCollapseLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityExpandLabel(value: String): Self = StObject.set(x, "accessibilityExpandLabel", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setExpandedContents(value: ReactNode): Self = StObject.set(x, "expandedContents", value.asInstanceOf[js.Any])
    
    inline def setExpandedContentsUndefined: Self = StObject.set(x, "expandedContents", js.undefined)
    
    inline def setHoverStyle(value: none | gray): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnExpand(
      value: /* arg */ js.Object & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
        ]) => Unit
    ): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
    
    inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
  }
}

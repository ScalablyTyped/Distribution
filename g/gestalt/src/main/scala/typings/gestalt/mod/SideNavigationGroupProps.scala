package typings.gestalt.mod

import typings.gestalt.anon.Number
import typings.gestalt.gestaltStrings.expandable
import typings.gestalt.gestaltStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNavigationGroupProps extends StObject {
  
  var badge: js.UndefOr[BadgeProps] = js.undefined
  
  var children: Node
  
  var counter: js.UndefOr[Number] = js.undefined
  
  var display: js.UndefOr[expandable | static] = js.undefined
  
  var icon: js.UndefOr[Icons] = js.undefined
  
  var label: String
  
  var notificationAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var primaryAction: js.UndefOr[PrimaryActionType] = js.undefined
}
object SideNavigationGroupProps {
  
  inline def apply(label: String): SideNavigationGroupProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavigationGroupProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SideNavigationGroupProps] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: BadgeProps): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCounter(value: Number): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setDisplay(value: expandable | static): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setIcon(value: Icons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNotificationAccessibilityLabel(value: String): Self = StObject.set(x, "notificationAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setNotificationAccessibilityLabelUndefined: Self = StObject.set(x, "notificationAccessibilityLabel", js.undefined)
    
    inline def setPrimaryAction(value: PrimaryActionType): Self = StObject.set(x, "primaryAction", value.asInstanceOf[js.Any])
    
    inline def setPrimaryActionUndefined: Self = StObject.set(x, "primaryAction", js.undefined)
  }
}

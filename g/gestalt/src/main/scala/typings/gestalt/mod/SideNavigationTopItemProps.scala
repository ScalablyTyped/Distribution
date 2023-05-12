package typings.gestalt.mod

import typings.gestalt.anon.DangerouslyDisableOnNavigation
import typings.gestalt.anon.Event
import typings.gestalt.anon.Number
import typings.gestalt.anon.Path
import typings.gestalt.anon.Type
import typings.gestalt.gestaltStrings.page
import typings.gestalt.gestaltStrings.section
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNavigationTopItemProps extends StObject {
  
  var active: js.UndefOr[page | section] = js.undefined
  
  var badge: js.UndefOr[Type] = js.undefined
  
  var counter: js.UndefOr[Number] = js.undefined
  
  var href: String
  
  var icon: js.UndefOr[Icons | Path] = js.undefined
  
  var label: String
  
  var notificationAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[ButtonEventHandlerType] = js.undefined
  
  var primaryAction: js.UndefOr[PrimaryActionType] = js.undefined
}
object SideNavigationTopItemProps {
  
  inline def apply(href: String, label: String): SideNavigationTopItemProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavigationTopItemProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SideNavigationTopItemProps] (val x: Self) extends AnyVal {
    
    inline def setActive(value: page | section): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setBadge(value: Type): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setCounter(value: Number): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Icons | Path): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNotificationAccessibilityLabel(value: String): Self = StObject.set(x, "notificationAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setNotificationAccessibilityLabelUndefined: Self = StObject.set(x, "notificationAccessibilityLabel", js.undefined)
    
    inline def setOnClick(
      value: /* arg */ DangerouslyDisableOnNavigation & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setPrimaryAction(value: PrimaryActionType): Self = StObject.set(x, "primaryAction", value.asInstanceOf[js.Any])
    
    inline def setPrimaryActionUndefined: Self = StObject.set(x, "primaryAction", js.undefined)
  }
}

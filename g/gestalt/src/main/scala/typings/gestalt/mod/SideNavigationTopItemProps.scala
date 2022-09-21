package typings.gestalt.mod

import typings.gestalt.anon.DangerouslyDisableOnNavigation
import typings.gestalt.anon.Event
import typings.gestalt.anon.Number
import typings.gestalt.anon.Path
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
  
  /**
    * When set to 'page' or 'section', it displays the item in "active" state.
    * See the [Accessibility](https://gestalt.pinterest.systems/SideNavigation#Accessibility) guidelines to learn more.
    */
  var active: js.UndefOr[page | section] = js.undefined
  
  /**
    * When supplied, will display a
    * [Badge](https://gestalt.pinterest.systems/badge) next to the item's label.
    * See the [Badges](https://gestalt.pinterest.systems/SideNavigation#Badge) variant to learn more.
    */
  var badge: js.UndefOr[typings.gestalt.anon.Text] = js.undefined
  
  /**
    * When supplied, will display a counter. See the [Counter](https://gestalt.pinterest.systems/SideNavigation#Counter) variant to learn more.
    */
  var counter: js.UndefOr[Number] = js.undefined
  
  /**
    * Directs users to the url when item is selected.
    */
  var href: String
  
  /**
    * When supplied, will display Icon. See the [Icon](https://gestalt.pinterest.systems/SideNavigation#Icon) variant to learn more.
    */
  var icon: js.UndefOr[Icons | Path] = js.undefined
  
  /**
    * Label for the item.
    */
  var label: String
  
  /**
    *  When supplied, will display a notification dot. See the [Notification](https://gestalt.pinterest.systems/SideNavigation#Notification) variant to learn more.
    */
  var notificationAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Callback when the user selects an item using the mouse or keyboard.
    */
  var onClick: js.UndefOr[
    AbstractEventHandler[
      (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement]), 
      DangerouslyDisableOnNavigation
    ]
  ] = js.undefined
}
object SideNavigationTopItemProps {
  
  inline def apply(href: String, label: String): SideNavigationTopItemProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavigationTopItemProps]
  }
  
  extension [Self <: SideNavigationTopItemProps](x: Self) {
    
    inline def setActive(value: page | section): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setBadge(value: typings.gestalt.anon.Text): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
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
  }
}

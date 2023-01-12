package typings.gestalt.mod

import typings.gestalt.anon.Number
import typings.gestalt.gestaltStrings.expandable
import typings.gestalt.gestaltStrings.static
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNavigationNestedGroupProps extends StObject {
  
  /**
    * When supplied, will display a
    * [Badge](https://gestalt.pinterest.systems/badge) next to the item's label.
    * See the [Badges](https://gestalt.pinterest.systems/SideNavigation#Badge) variant to learn more.
    */
  var badge: js.UndefOr[FunctionComponent[BadgeProps]] = js.undefined
  
  /**
    * Content of the group. See [nested directory](#Nested-directory) variant for more information.
    */
  var children: ReactNode
  
  /**
    * When supplied, will display a counter. See the [Counter](https://gestalt.pinterest.systems/SideNavigation#Counter) variant to learn more.
    */
  var counter: js.UndefOr[Number] = js.undefined
  
  /**
    * Nested directories can be static or expandable. See [nested directory](#Nested-directory) variant for more information.
    */
  var display: js.UndefOr[expandable | static] = js.undefined
  
  /**
    * When supplied, will display Icon. See the [Icon](https://gestalt.pinterest.systems/SideNavigation#Icon) variant to learn more.
    */
  var icon: js.UndefOr[Icons] = js.undefined
  
  /**
    * Label for the group. See [nested directory](#Nested-directory) variant for more information.
    */
  var label: String
  
  /**
    *  When supplied, will display a notification dot. See the [Notification](https://gestalt.pinterest.systems/SideNavigation#Notification) variant to learn more.
    */
  var notificationAccessibilityLabel: js.UndefOr[String] = js.undefined
}
object SideNavigationNestedGroupProps {
  
  inline def apply(label: String): SideNavigationNestedGroupProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavigationNestedGroupProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SideNavigationNestedGroupProps] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: FunctionComponent[BadgeProps]): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
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
  }
}

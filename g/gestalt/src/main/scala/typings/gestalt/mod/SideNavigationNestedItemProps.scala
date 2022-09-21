package typings.gestalt.mod

import typings.gestalt.anon.DangerouslyDisableOnNavigation
import typings.gestalt.anon.Event
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

trait SideNavigationNestedItemProps extends StObject {
  
  /**
    * When set to 'page' or 'section', it displays the item in "active" state. See the [Accessibility](https://gestalt.pinterest.systems/SideNavigation#Accessibility) guidelines to learn more.
    */
  var active: js.UndefOr[page | section] = js.undefined
  
  /**
    * Directs users to the url when item is selected.
    */
  var href: String
  
  /**
    * Label for the item.
    */
  var label: String
  
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
object SideNavigationNestedItemProps {
  
  inline def apply(href: String, label: String): SideNavigationNestedItemProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavigationNestedItemProps]
  }
  
  extension [Self <: SideNavigationNestedItemProps](x: Self) {
    
    inline def setActive(value: page | section): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnClick(
      value: /* arg */ DangerouslyDisableOnNavigation & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}

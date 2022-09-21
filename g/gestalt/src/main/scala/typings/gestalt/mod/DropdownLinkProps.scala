package typings.gestalt.mod

import typings.gestalt.anon.DangerouslyDisableOnNavigation
import typings.gestalt.anon.Event
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownLinkProps extends StObject {
  
  /**
    * When supplied, will display a Badge next to the item's label.
    */
  var badge: js.UndefOr[BadgeObject] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * When supplied, will add a data-test-id prop to the dom element.
    */
  var dataTestId: js.UndefOr[String] = js.undefined
  
  /**
    * Directs users to the url when item is selected. See the Types of items variant to learn more.
    */
  var href: String
  
  /**
    * When true, adds an arrow icon to the end of the item to signal this item takes users to an external source
    * and opens the link in a new tab.
    * Do not add if the item navigates users within the app. See the Best practices for more info.
    */
  var isExternal: js.UndefOr[Boolean] = js.undefined
  
  var onClick: js.UndefOr[
    AbstractEventHandler[
      (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement]), 
      DangerouslyDisableOnNavigation
    ]
  ] = js.undefined
  
  var option: DropdownOption
}
object DropdownLinkProps {
  
  inline def apply(href: String, option: DropdownOption): DropdownLinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownLinkProps]
  }
  
  extension [Self <: DropdownLinkProps](x: Self) {
    
    inline def setBadge(value: BadgeObject): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDataTestId(value: String): Self = StObject.set(x, "dataTestId", value.asInstanceOf[js.Any])
    
    inline def setDataTestIdUndefined: Self = StObject.set(x, "dataTestId", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
    
    inline def setIsExternalUndefined: Self = StObject.set(x, "isExternal", js.undefined)
    
    inline def setOnClick(
      value: /* arg */ DangerouslyDisableOnNavigation & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOption(value: DropdownOption): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}

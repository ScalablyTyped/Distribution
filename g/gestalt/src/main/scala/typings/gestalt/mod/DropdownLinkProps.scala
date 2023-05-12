package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.gestalt.anon.MobileOnDismissStart
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownLinkProps extends StObject {
  
  var badge: js.UndefOr[BadgeObject] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var dataTestId: js.UndefOr[String] = js.undefined
  
  var href: String
  
  var isExternal: js.UndefOr[Boolean] = js.undefined
  
  var onClick: js.UndefOr[
    AbstractEventHandler[
      (MouseEvent[HTMLAnchorElement, NativeMouseEvent]) | KeyboardEvent[HTMLAnchorElement], 
      MobileOnDismissStart
    ]
  ] = js.undefined
  
  var option: DropdownOption
}
object DropdownLinkProps {
  
  inline def apply(href: String, option: DropdownOption): DropdownLinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownLinkProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropdownLinkProps] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: BadgeObject): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDataTestId(value: String): Self = StObject.set(x, "dataTestId", value.asInstanceOf[js.Any])
    
    inline def setDataTestIdUndefined: Self = StObject.set(x, "dataTestId", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
    
    inline def setIsExternalUndefined: Self = StObject.set(x, "isExternal", js.undefined)
    
    inline def setOnClick(
      value: /* arg */ MobileOnDismissStart & (Event[
          (MouseEvent[HTMLAnchorElement, NativeMouseEvent]) | KeyboardEvent[HTMLAnchorElement]
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOption(value: DropdownOption): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}

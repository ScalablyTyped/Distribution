package typings.gestalt.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNaviationProps extends StObject {
  
  /**
    * String that clients such as VoiceOver will read to describe the element.
    */
  var accessibilityLabel: String
  
  /**
    * The content shown in SideNavigation.
    * See [subcomponents](https://gestalt.pinterest.systems/sidenavigation#Subcomponents).
    */
  var children: ReactNode
  
  /**
    * Content to display at the bottom of SideNavigation.
    * Open slot available to display other functionality required in the page.
    * See the [Footer variant](https://gestalt.pinterest.systems/sidenavigation#Header) to learn more.
    */
  var footer: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Content to display at the top of SideNavigation.
    * Open slot used for controlling the display of navigation items.
    * See the [Header variant](https://gestalt.pinterest.systems/sidenavigation#Header) to learn more.
    */
  var header: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Displays a border in SideNavigation.
    * See the [Border](https://gestalt.pinterest.systems/sidenavigation#Border) variant for more info.
    */
  var showBorder: js.UndefOr[Boolean] = js.undefined
}
object SideNaviationProps {
  
  inline def apply(accessibilityLabel: String): SideNaviationProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNaviationProps]
  }
  
  extension [Self <: SideNaviationProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setShowBorder(value: Boolean): Self = StObject.set(x, "showBorder", value.asInstanceOf[js.Any])
    
    inline def setShowBorderUndefined: Self = StObject.set(x, "showBorder", js.undefined)
  }
}

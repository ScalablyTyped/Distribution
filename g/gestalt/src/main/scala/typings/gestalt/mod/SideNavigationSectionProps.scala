package typings.gestalt.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNavigationSectionProps extends StObject {
  
  /**
    * Any [SideNavigation.TopItem](https://gestalt.pinterest.systems/sidenavigation#SideNavigation.TopItem) to be rendered
    */
  var children: ReactNode
  
  /**
    * Label for the section. See the [Sections](https://gestalt.pinterest.systems/sidenavigation#Sections) variant for more info.
    */
  var label: String
}
object SideNavigationSectionProps {
  
  inline def apply(label: String): SideNavigationSectionProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavigationSectionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SideNavigationSectionProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

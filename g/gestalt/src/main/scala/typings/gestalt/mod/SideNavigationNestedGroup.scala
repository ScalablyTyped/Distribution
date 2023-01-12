package typings.gestalt.mod

import typings.gestalt.gestaltStrings.expandable
import typings.gestalt.gestaltStrings.static
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNavigationNestedGroup extends StObject {
  
  /**
    * Content of the group. See [nested directory](#Nested-directory) variant for more information.
    */
  var children: ReactNode
  
  /**
    * Nested directories can be static or expandable. See [nested directory](#Nested-directory) variant for more information.
    */
  var display: js.UndefOr[expandable | static] = js.undefined
  
  /**
    * Label for the group. See [nested directory](#Nested-directory) variant for more information.
    */
  var label: String
}
object SideNavigationNestedGroup {
  
  inline def apply(label: String): SideNavigationNestedGroup = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavigationNestedGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SideNavigationNestedGroup] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisplay(value: expandable | static): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

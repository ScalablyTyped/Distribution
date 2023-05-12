package typings.gestalt.mod

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownSubComponents extends StObject {
  
  var Item: FunctionComponent[DropdownItemProps]
  
  var Link: FunctionComponent[DropdownLinkProps]
  
  var Section: FunctionComponent[DropdownSectionProps]
}
object DropdownSubComponents {
  
  inline def apply(
    Item: FunctionComponent[DropdownItemProps],
    Link: FunctionComponent[DropdownLinkProps],
    Section: FunctionComponent[DropdownSectionProps]
  ): DropdownSubComponents = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Section = Section.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownSubComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropdownSubComponents] (val x: Self) extends AnyVal {
    
    inline def setItem(value: FunctionComponent[DropdownItemProps]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setLink(value: FunctionComponent[DropdownLinkProps]): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setSection(value: FunctionComponent[DropdownSectionProps]): Self = StObject.set(x, "Section", value.asInstanceOf[js.Any])
  }
}

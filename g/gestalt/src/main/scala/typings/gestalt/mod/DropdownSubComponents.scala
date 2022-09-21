package typings.gestalt.mod

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownSubComponents extends StObject {
  
  var Item: FC[DropdownItemProps]
  
  var Link: FC[DropdownLinkProps]
  
  var Section: FC[DropdownSectionProps]
}
object DropdownSubComponents {
  
  inline def apply(Item: FC[DropdownItemProps], Link: FC[DropdownLinkProps], Section: FC[DropdownSectionProps]): DropdownSubComponents = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Section = Section.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownSubComponents]
  }
  
  extension [Self <: DropdownSubComponents](x: Self) {
    
    inline def setItem(value: FC[DropdownItemProps]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setLink(value: FC[DropdownLinkProps]): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setSection(value: FC[DropdownSectionProps]): Self = StObject.set(x, "Section", value.asInstanceOf[js.Any])
  }
}

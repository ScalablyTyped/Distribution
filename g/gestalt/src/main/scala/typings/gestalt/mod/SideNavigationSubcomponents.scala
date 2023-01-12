package typings.gestalt.mod

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNavigationSubcomponents extends StObject {
  
  var Group: FC[SideNavigationNestedGroupProps]
  
  var NestedGroup: FC[SideNavigationNestedGroupProps]
  
  var NestedItem: FC[SideNavigationNestedItemProps]
  
  var Section: FC[SideNavigationSectionProps]
  
  var TopItem: FC[SideNavigationTopItemProps]
}
object SideNavigationSubcomponents {
  
  inline def apply(
    Group: FC[SideNavigationNestedGroupProps],
    NestedGroup: FC[SideNavigationNestedGroupProps],
    NestedItem: FC[SideNavigationNestedItemProps],
    Section: FC[SideNavigationSectionProps],
    TopItem: FC[SideNavigationTopItemProps]
  ): SideNavigationSubcomponents = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], NestedGroup = NestedGroup.asInstanceOf[js.Any], NestedItem = NestedItem.asInstanceOf[js.Any], Section = Section.asInstanceOf[js.Any], TopItem = TopItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavigationSubcomponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SideNavigationSubcomponents] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: FC[SideNavigationNestedGroupProps]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setNestedGroup(value: FC[SideNavigationNestedGroupProps]): Self = StObject.set(x, "NestedGroup", value.asInstanceOf[js.Any])
    
    inline def setNestedItem(value: FC[SideNavigationNestedItemProps]): Self = StObject.set(x, "NestedItem", value.asInstanceOf[js.Any])
    
    inline def setSection(value: FC[SideNavigationSectionProps]): Self = StObject.set(x, "Section", value.asInstanceOf[js.Any])
    
    inline def setTopItem(value: FC[SideNavigationTopItemProps]): Self = StObject.set(x, "TopItem", value.asInstanceOf[js.Any])
  }
}

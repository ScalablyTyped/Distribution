package typings.gestalt.mod

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideNavigationSubcomponents extends StObject {
  
  var Group: FunctionComponent[SideNavigationGroupProps]
  
  var NestedGroup: FunctionComponent[SideNavigationNestedGroupProps]
  
  var NestedItem: FunctionComponent[SideNavigationNestedItemProps]
  
  var Section: FunctionComponent[SideNavigationSectionProps]
  
  var TopItem: FunctionComponent[SideNavigationTopItemProps]
}
object SideNavigationSubcomponents {
  
  inline def apply(
    Group: FunctionComponent[SideNavigationGroupProps],
    NestedGroup: FunctionComponent[SideNavigationNestedGroupProps],
    NestedItem: FunctionComponent[SideNavigationNestedItemProps],
    Section: FunctionComponent[SideNavigationSectionProps],
    TopItem: FunctionComponent[SideNavigationTopItemProps]
  ): SideNavigationSubcomponents = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], NestedGroup = NestedGroup.asInstanceOf[js.Any], NestedItem = NestedItem.asInstanceOf[js.Any], Section = Section.asInstanceOf[js.Any], TopItem = TopItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavigationSubcomponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SideNavigationSubcomponents] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: FunctionComponent[SideNavigationGroupProps]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setNestedGroup(value: FunctionComponent[SideNavigationNestedGroupProps]): Self = StObject.set(x, "NestedGroup", value.asInstanceOf[js.Any])
    
    inline def setNestedItem(value: FunctionComponent[SideNavigationNestedItemProps]): Self = StObject.set(x, "NestedItem", value.asInstanceOf[js.Any])
    
    inline def setSection(value: FunctionComponent[SideNavigationSectionProps]): Self = StObject.set(x, "Section", value.asInstanceOf[js.Any])
    
    inline def setTopItem(value: FunctionComponent[SideNavigationTopItemProps]): Self = StObject.set(x, "TopItem", value.asInstanceOf[js.Any])
  }
}

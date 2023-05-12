package typings.gestalt.mod

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectListSubComponents extends StObject {
  
  var Group: FunctionComponent[SelectListGroupProps]
  
  var Option: FunctionComponent[SelectListOptionProps]
}
object SelectListSubComponents {
  
  inline def apply(Group: FunctionComponent[SelectListGroupProps], Option: FunctionComponent[SelectListOptionProps]): SelectListSubComponents = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectListSubComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectListSubComponents] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: FunctionComponent[SelectListGroupProps]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setOption(value: FunctionComponent[SelectListOptionProps]): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
  }
}

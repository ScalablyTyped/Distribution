package typings.gestalt.mod

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleSubComponents extends StObject {
  
  var Expandable: FunctionComponent[ModuleExpandableProps]
}
object ModuleSubComponents {
  
  inline def apply(Expandable: FunctionComponent[ModuleExpandableProps]): ModuleSubComponents = {
    val __obj = js.Dynamic.literal(Expandable = Expandable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSubComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleSubComponents] (val x: Self) extends AnyVal {
    
    inline def setExpandable(value: FunctionComponent[ModuleExpandableProps]): Self = StObject.set(x, "Expandable", value.asInstanceOf[js.Any])
  }
}

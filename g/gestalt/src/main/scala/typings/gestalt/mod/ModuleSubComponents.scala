package typings.gestalt.mod

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleSubComponents extends StObject {
  
  var Expandable: FC[ModuleExpandableProps]
}
object ModuleSubComponents {
  
  inline def apply(Expandable: FC[ModuleExpandableProps]): ModuleSubComponents = {
    val __obj = js.Dynamic.literal(Expandable = Expandable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSubComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleSubComponents] (val x: Self) extends AnyVal {
    
    inline def setExpandable(value: FC[ModuleExpandableProps]): Self = StObject.set(x, "Expandable", value.asInstanceOf[js.Any])
  }
}

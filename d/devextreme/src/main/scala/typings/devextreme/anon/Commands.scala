package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commands extends StObject {
  
  /**
    * Lists commands in the context menu.
    */
  var commands: js.UndefOr[js.Array[DiagramCommand]] = js.undefined
  
  /**
    * Specifies whether the context menu is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object Commands {
  
  inline def apply(): Commands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Commands]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Commands] (val x: Self) extends AnyVal {
    
    inline def setCommands(value: js.Array[DiagramCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setCommandsVarargs(value: DiagramCommand*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}

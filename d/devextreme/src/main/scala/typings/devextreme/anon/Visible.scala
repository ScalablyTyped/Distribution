package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visible extends StObject {
  
  /**
    * Lists commands in the toolbar.
    */
  var commands: js.UndefOr[js.Array[DiagramCommand]] = js.undefined
  
  /**
    * Specifies the view toolbar&apos;s visibility.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Visible {
  
  inline def apply(): Visible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visible]
  }
  
  extension [Self <: Visible](x: Self) {
    
    inline def setCommands(value: js.Array[DiagramCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setCommandsVarargs(value: DiagramCommand*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

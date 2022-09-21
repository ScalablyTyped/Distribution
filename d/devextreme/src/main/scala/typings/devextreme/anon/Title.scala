package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  /**
    * Lists commands in a group.
    */
  var commands: js.UndefOr[js.Array[DiagramCommand]] = js.undefined
  
  /**
    * Specifies a title of the group.
    */
  var title: js.UndefOr[String] = js.undefined
}
object Title {
  
  inline def apply(): Title = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Title]
  }
  
  extension [Self <: Title](x: Self) {
    
    inline def setCommands(value: js.Array[DiagramCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setCommandsVarargs(value: DiagramCommand*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientChartDesignerCustomizeMenuActionsEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  var actions: js.Array[ASPxClientChartDesignerMenuAction]
}
object ASPxClientChartDesignerCustomizeMenuActionsEventArgs {
  
  inline def apply(actions: js.Array[ASPxClientChartDesignerMenuAction]): ASPxClientChartDesignerCustomizeMenuActionsEventArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientChartDesignerCustomizeMenuActionsEventArgs]
  }
  
  extension [Self <: ASPxClientChartDesignerCustomizeMenuActionsEventArgs](x: Self) {
    
    inline def setActions(value: js.Array[ASPxClientChartDesignerMenuAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: ASPxClientChartDesignerMenuAction*): Self = StObject.set(x, "actions", js.Array(value*))
  }
}

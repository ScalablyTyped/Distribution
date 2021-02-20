package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxClientChartDesignerCustomizeMenuActionsEventArgs extends ASPxClientEventArgs {
  
  var actions: js.Array[ASPxClientChartDesignerMenuAction] = js.native
}
object ASPxClientChartDesignerCustomizeMenuActionsEventArgs {
  
  @scala.inline
  def apply(actions: js.Array[ASPxClientChartDesignerMenuAction]): ASPxClientChartDesignerCustomizeMenuActionsEventArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientChartDesignerCustomizeMenuActionsEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientChartDesignerCustomizeMenuActionsEventArgsMutableBuilder[Self <: ASPxClientChartDesignerCustomizeMenuActionsEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[ASPxClientChartDesignerMenuAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: ASPxClientChartDesignerMenuAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
  }
}

package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for a chart control's CustomizeMenuActions event on the client side.
  */
trait ASPxClientChartDesignerCustomizeMenuActionsEventArgs extends ASPxClientEventArgs {
  /**
    * Returns an array of the Client Chart Designer's menu actions.
    * Value: An array of the ASPxClientChartDesignerMenuAction objects.
    */
  var actions: js.Array[ASPxClientChartDesignerMenuAction]
}

object ASPxClientChartDesignerCustomizeMenuActionsEventArgs {
  @scala.inline
  def apply(actions: js.Array[ASPxClientChartDesignerMenuAction]): ASPxClientChartDesignerCustomizeMenuActionsEventArgs = {
    val __obj = js.Dynamic.literal(actions = actions)
  
    __obj.asInstanceOf[ASPxClientChartDesignerCustomizeMenuActionsEventArgs]
  }
}


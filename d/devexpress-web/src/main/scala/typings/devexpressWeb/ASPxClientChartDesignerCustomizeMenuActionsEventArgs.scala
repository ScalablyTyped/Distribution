package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientChartDesignerCustomizeMenuActionsEventArgs extends ASPxClientEventArgs {
  var actions: js.Array[ASPxClientChartDesignerMenuAction]
}

object ASPxClientChartDesignerCustomizeMenuActionsEventArgs {
  @scala.inline
  def apply(actions: js.Array[ASPxClientChartDesignerMenuAction]): ASPxClientChartDesignerCustomizeMenuActionsEventArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientChartDesignerCustomizeMenuActionsEventArgs]
  }
}


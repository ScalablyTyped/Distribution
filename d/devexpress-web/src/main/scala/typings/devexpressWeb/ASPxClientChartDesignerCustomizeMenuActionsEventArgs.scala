package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ASPxClientChartDesignerCustomizeMenuActionsEventArgsOps[Self <: ASPxClientChartDesignerCustomizeMenuActionsEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsVarargs(value: ASPxClientChartDesignerMenuAction*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[ASPxClientChartDesignerMenuAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
  }
  
}


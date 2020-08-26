package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragTooltip extends js.Object {
  /** Specifies whether to show tooltip while dragging a row.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Option to add field names whose corresponding values in the dragged row needs to be shown in the preview tooltip.
    * @Default {[]}
    */
  var tooltipItems: js.UndefOr[js.Array[_]] = js.native
  /** Custom template for that tooltip that is shown while dragging a row.
    * @Default {null}
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
}

object DragTooltip {
  @scala.inline
  def apply(): DragTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragTooltip]
  }
  @scala.inline
  implicit class DragTooltipOps[Self <: DragTooltip] (val x: Self) extends AnyVal {
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
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    @scala.inline
    def setTooltipItemsVarargs(value: js.Any*): Self = this.set("tooltipItems", js.Array(value :_*))
    @scala.inline
    def setTooltipItems(value: js.Array[_]): Self = this.set("tooltipItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipItems: Self = this.set("tooltipItems", js.undefined)
    @scala.inline
    def setTooltipTemplate(value: String): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
  }
  
}


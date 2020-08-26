package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.BarGaugeBarInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemText extends js.Object {
  var item: js.UndefOr[BarGaugeBarInfo] = js.native
  var text: js.UndefOr[String] = js.native
}

object ItemText {
  @scala.inline
  def apply(): ItemText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemText]
  }
  @scala.inline
  implicit class ItemTextOps[Self <: ItemText] (val x: Self) extends AnyVal {
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
    def setItem(value: BarGaugeBarInfo): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}


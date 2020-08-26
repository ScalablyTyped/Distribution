package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseLegendItem extends js.Object {
  /** @name BaseLegendItem.marker */
  var marker: js.UndefOr[Fill] = js.native
  /** @name BaseLegendItem.text */
  var text: js.UndefOr[String] = js.native
  /** @name BaseLegendItem.visible */
  var visible: js.UndefOr[Boolean] = js.native
}

object BaseLegendItem {
  @scala.inline
  def apply(): BaseLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLegendItem]
  }
  @scala.inline
  implicit class BaseLegendItemOps[Self <: BaseLegendItem] (val x: Self) extends AnyVal {
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
    def setMarker(value: Fill): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}


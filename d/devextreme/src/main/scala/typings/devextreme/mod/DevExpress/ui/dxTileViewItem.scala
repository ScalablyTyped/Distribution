package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTileViewItem extends CollectionWidgetItem {
  /** @name dxTileViewItem.heightRatio */
  var heightRatio: js.UndefOr[Double] = js.native
  /** @name dxTileViewItem.widthRatio */
  var widthRatio: js.UndefOr[Double] = js.native
}

object dxTileViewItem {
  @scala.inline
  def apply(): dxTileViewItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTileViewItem]
  }
  @scala.inline
  implicit class dxTileViewItemOps[Self <: dxTileViewItem] (val x: Self) extends AnyVal {
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
    def setHeightRatio(value: Double): Self = this.set("heightRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightRatio: Self = this.set("heightRatio", js.undefined)
    @scala.inline
    def setWidthRatio(value: Double): Self = this.set("widthRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthRatio: Self = this.set("widthRatio", js.undefined)
  }
  
}


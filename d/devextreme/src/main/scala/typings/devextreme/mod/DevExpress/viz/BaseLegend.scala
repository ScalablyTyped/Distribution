package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Bottom
import typings.devextreme.anon.CornerRadius
import typings.devextreme.anon.HorizontalAlignment
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.devextremeStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseLegend extends js.Object {
  /** @name BaseLegend.backgroundColor */
  var backgroundColor: js.UndefOr[String] = js.native
  /** @name BaseLegend.border */
  var border: js.UndefOr[CornerRadius] = js.native
  /** @name BaseLegend.columnCount */
  var columnCount: js.UndefOr[Double] = js.native
  /** @name BaseLegend.columnItemSpacing */
  var columnItemSpacing: js.UndefOr[Double] = js.native
  /** @name BaseLegend.font */
  var font: js.UndefOr[Font] = js.native
  /** @name BaseLegend.horizontalAlignment */
  var horizontalAlignment: js.UndefOr[center | left | right] = js.native
  /** @name BaseLegend.itemTextPosition */
  var itemTextPosition: js.UndefOr[bottom | left | right | top] = js.native
  /** @name BaseLegend.itemsAlignment */
  var itemsAlignment: js.UndefOr[center | left | right] = js.native
  /** @name BaseLegend.margin */
  var margin: js.UndefOr[Double | Bottom] = js.native
  /** @name BaseLegend.markerSize */
  var markerSize: js.UndefOr[Double] = js.native
  /** @name BaseLegend.orientation */
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  /** @name BaseLegend.paddingLeftRight */
  var paddingLeftRight: js.UndefOr[Double] = js.native
  /** @name BaseLegend.paddingTopBottom */
  var paddingTopBottom: js.UndefOr[Double] = js.native
  /** @name BaseLegend.rowCount */
  var rowCount: js.UndefOr[Double] = js.native
  /** @name BaseLegend.rowItemSpacing */
  var rowItemSpacing: js.UndefOr[Double] = js.native
  /** @name BaseLegend.title */
  var title: js.UndefOr[HorizontalAlignment | String] = js.native
  /** @name BaseLegend.verticalAlignment */
  var verticalAlignment: js.UndefOr[bottom | top] = js.native
  /** @name BaseLegend.visible */
  var visible: js.UndefOr[Boolean] = js.native
}

object BaseLegend {
  @scala.inline
  def apply(): BaseLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLegend]
  }
  @scala.inline
  implicit class BaseLegendOps[Self <: BaseLegend] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorder(value: CornerRadius): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    @scala.inline
    def setColumnItemSpacing(value: Double): Self = this.set("columnItemSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnItemSpacing: Self = this.set("columnItemSpacing", js.undefined)
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: center | left | right): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setItemTextPosition(value: bottom | left | right | top): Self = this.set("itemTextPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTextPosition: Self = this.set("itemTextPosition", js.undefined)
    @scala.inline
    def setItemsAlignment(value: center | left | right): Self = this.set("itemsAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsAlignment: Self = this.set("itemsAlignment", js.undefined)
    @scala.inline
    def setMargin(value: Double | Bottom): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMarkerSize(value: Double): Self = this.set("markerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerSize: Self = this.set("markerSize", js.undefined)
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPaddingLeftRight(value: Double): Self = this.set("paddingLeftRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeftRight: Self = this.set("paddingLeftRight", js.undefined)
    @scala.inline
    def setPaddingTopBottom(value: Double): Self = this.set("paddingTopBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTopBottom: Self = this.set("paddingTopBottom", js.undefined)
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    @scala.inline
    def setRowItemSpacing(value: Double): Self = this.set("rowItemSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowItemSpacing: Self = this.set("rowItemSpacing", js.undefined)
    @scala.inline
    def setTitle(value: HorizontalAlignment | String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: bottom | top): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}


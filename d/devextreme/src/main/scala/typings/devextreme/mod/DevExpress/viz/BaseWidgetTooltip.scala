package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Blur
import typings.devextreme.anon.DashStyleOpacity
import typings.devextreme.mod.DevExpress.ui.format
import typings.devextreme.mod.global.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseWidget.Options.tooltip */
@js.native
trait BaseWidgetTooltip extends js.Object {
  /** @name BaseWidget.Options.tooltip.arrowLength */
  var arrowLength: js.UndefOr[Double] = js.native
  /** @name BaseWidget.Options.tooltip.border */
  var border: js.UndefOr[DashStyleOpacity] = js.native
  /** @name BaseWidget.Options.tooltip.color */
  var color: js.UndefOr[String] = js.native
  /** @name BaseWidget.Options.tooltip.container */
  var container: js.UndefOr[String | Element | JQuery] = js.native
  /** @name BaseWidget.Options.tooltip.cornerRadius */
  var cornerRadius: js.UndefOr[Double] = js.native
  /** @name BaseWidget.Options.tooltip.enabled */
  var enabled: js.UndefOr[Boolean] = js.native
  /** @name BaseWidget.Options.tooltip.font */
  var font: js.UndefOr[Font] = js.native
  /** @name BaseWidget.Options.tooltip.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  /** @name BaseWidget.Options.tooltip.opacity */
  var opacity: js.UndefOr[Double] = js.native
  /** @name BaseWidget.Options.tooltip.paddingLeftRight */
  var paddingLeftRight: js.UndefOr[Double] = js.native
  /** @name BaseWidget.Options.tooltip.paddingTopBottom */
  var paddingTopBottom: js.UndefOr[Double] = js.native
  /** @name BaseWidget.Options.tooltip.shadow */
  var shadow: js.UndefOr[Blur] = js.native
  /** @name BaseWidget.Options.tooltip.zIndex */
  var zIndex: js.UndefOr[Double] = js.native
}

object BaseWidgetTooltip {
  @scala.inline
  def apply(): BaseWidgetTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetTooltip]
  }
  @scala.inline
  implicit class BaseWidgetTooltipOps[Self <: BaseWidgetTooltip] (val x: Self) extends AnyVal {
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
    def setArrowLength(value: Double): Self = this.set("arrowLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowLength: Self = this.set("arrowLength", js.undefined)
    @scala.inline
    def setBorder(value: DashStyleOpacity): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContainer(value: String | Element | JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: format): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPaddingLeftRight(value: Double): Self = this.set("paddingLeftRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeftRight: Self = this.set("paddingLeftRight", js.undefined)
    @scala.inline
    def setPaddingTopBottom(value: Double): Self = this.set("paddingTopBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTopBottom: Self = this.set("paddingTopBottom", js.undefined)
    @scala.inline
    def setShadow(value: Blur): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}


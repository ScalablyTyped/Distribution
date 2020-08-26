package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.`left bottom`
import typings.devextreme.devextremeStrings.`left top`
import typings.devextreme.devextremeStrings.`right bottom`
import typings.devextreme.devextremeStrings.`right top`
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.positionConfig
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxLoadPanelOptions extends dxOverlayOptions[dxLoadPanel] {
  /** @name dxLoadPanel.Options.animation */
  @JSName("animation")
  var animation_dxLoadPanelOptions: js.UndefOr[dxLoadPanelAnimation] = js.native
  /** @name dxLoadPanel.Options.container */
  var container: js.UndefOr[String | Element | JQuery] = js.native
  /** @name dxLoadPanel.Options.delay */
  var delay: js.UndefOr[Double] = js.native
  /** @name dxLoadPanel.Options.indicatorSrc */
  var indicatorSrc: js.UndefOr[String] = js.native
  /** @name dxLoadPanel.Options.message */
  var message: js.UndefOr[String] = js.native
  /** @name dxLoadPanel.Options.position */
  @JSName("position")
  var position_dxLoadPanelOptions: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function
  ] = js.native
  /** @name dxLoadPanel.Options.showIndicator */
  var showIndicator: js.UndefOr[Boolean] = js.native
  /** @name dxLoadPanel.Options.showPane */
  var showPane: js.UndefOr[Boolean] = js.native
}

object dxLoadPanelOptions {
  @scala.inline
  def apply(): dxLoadPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLoadPanelOptions]
  }
  @scala.inline
  implicit class dxLoadPanelOptionsOps[Self <: dxLoadPanelOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: dxLoadPanelAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setContainer(value: String | Element | JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setIndicatorSrc(value: String): Self = this.set("indicatorSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorSrc: Self = this.set("indicatorSrc", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setPosition(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowIndicator(value: Boolean): Self = this.set("showIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIndicator: Self = this.set("showIndicator", js.undefined)
    @scala.inline
    def setShowPane(value: Boolean): Self = this.set("showPane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPane: Self = this.set("showPane", js.undefined)
  }
  
}


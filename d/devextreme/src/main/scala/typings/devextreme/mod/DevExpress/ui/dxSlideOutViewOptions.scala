package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.inverted
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSlideOutViewOptions extends WidgetOptions[dxSlideOutView] {
  /** @name dxSlideOutView.Options.contentTemplate */
  var contentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, _])
  ] = js.native
  /** @name dxSlideOutView.Options.menuPosition */
  var menuPosition: js.UndefOr[inverted | normal] = js.native
  /** @name dxSlideOutView.Options.menuTemplate */
  var menuTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* menuElement */ dxElement, _])
  ] = js.native
  /** @name dxSlideOutView.Options.menuVisible */
  var menuVisible: js.UndefOr[Boolean] = js.native
  /** @name dxSlideOutView.Options.swipeEnabled */
  var swipeEnabled: js.UndefOr[Boolean] = js.native
}

object dxSlideOutViewOptions {
  @scala.inline
  def apply(): dxSlideOutViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSlideOutViewOptions]
  }
  @scala.inline
  implicit class dxSlideOutViewOptionsOps[Self <: dxSlideOutViewOptions] (val x: Self) extends AnyVal {
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
    def setContentTemplateFunction1(value: /* contentElement */ dxElement => _): Self = this.set("contentTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def setContentTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, _])
    ): Self = this.set("contentTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentTemplate: Self = this.set("contentTemplate", js.undefined)
    @scala.inline
    def setMenuPosition(value: inverted | normal): Self = this.set("menuPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuPosition: Self = this.set("menuPosition", js.undefined)
    @scala.inline
    def setMenuTemplateFunction1(value: /* menuElement */ dxElement => _): Self = this.set("menuTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def setMenuTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* menuElement */ dxElement, _])
    ): Self = this.set("menuTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuTemplate: Self = this.set("menuTemplate", js.undefined)
    @scala.inline
    def setMenuVisible(value: Boolean): Self = this.set("menuVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuVisible: Self = this.set("menuVisible", js.undefined)
    @scala.inline
    def setSwipeEnabled(value: Boolean): Self = this.set("swipeEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeEnabled: Self = this.set("swipeEnabled", js.undefined)
  }
  
}


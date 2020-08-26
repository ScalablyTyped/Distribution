package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentElement
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetOptions[T] extends DOMComponentOptions[T] {
  /** @name Widget.Options.accessKey */
  var accessKey: js.UndefOr[String] = js.native
  /** @name Widget.Options.activeStateEnabled */
  var activeStateEnabled: js.UndefOr[Boolean] = js.native
  /** @name Widget.Options.disabled */
  var disabled: js.UndefOr[Boolean] = js.native
  /** @name Widget.Options.focusStateEnabled */
  var focusStateEnabled: js.UndefOr[Boolean] = js.native
  /** @name Widget.Options.hint */
  var hint: js.UndefOr[String] = js.native
  /** @name Widget.Options.hoverStateEnabled */
  var hoverStateEnabled: js.UndefOr[Boolean] = js.native
  /** @name Widget.Options.onContentReady */
  var onContentReady: js.UndefOr[js.Function1[/* e */ ComponentElement[T], _]] = js.native
  /** @name Widget.Options.tabIndex */
  var tabIndex: js.UndefOr[Double] = js.native
  /** @name Widget.Options.visible */
  var visible: js.UndefOr[Boolean] = js.native
}

object WidgetOptions {
  @scala.inline
  def apply[T](): WidgetOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetOptions[T]]
  }
  @scala.inline
  implicit class WidgetOptionsOps[Self <: WidgetOptions[_], T] (val x: Self with WidgetOptions[T]) extends AnyVal {
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
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setActiveStateEnabled(value: Boolean): Self = this.set("activeStateEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveStateEnabled: Self = this.set("activeStateEnabled", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFocusStateEnabled(value: Boolean): Self = this.set("focusStateEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusStateEnabled: Self = this.set("focusStateEnabled", js.undefined)
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setHoverStateEnabled(value: Boolean): Self = this.set("hoverStateEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverStateEnabled: Self = this.set("hoverStateEnabled", js.undefined)
    @scala.inline
    def setOnContentReady(value: /* e */ ComponentElement[T] => _): Self = this.set("onContentReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContentReady: Self = this.set("onContentReady", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}


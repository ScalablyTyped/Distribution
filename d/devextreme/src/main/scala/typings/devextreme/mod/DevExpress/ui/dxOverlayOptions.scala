package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.CancelComponentElementModel
import typings.devextreme.anon.`6`
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxOverlayOptions[T] extends WidgetOptions[T] {
  /** @name dxOverlay.Options.animation */
  var animation: js.UndefOr[dxOverlayAnimation] = js.native
  /** @name dxOverlay.Options.closeOnOutsideClick */
  var closeOnOutsideClick: js.UndefOr[Boolean | (js.Function1[/* event */ event, Boolean])] = js.native
  /** @name dxOverlay.Options.contentTemplate */
  var contentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** @name dxOverlay.Options.deferRendering */
  var deferRendering: js.UndefOr[Boolean] = js.native
  /** @name dxOverlay.Options.dragEnabled */
  var dragEnabled: js.UndefOr[Boolean] = js.native
  /** @name dxOverlay.Options.maxHeight */
  var maxHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  /** @name dxOverlay.Options.maxWidth */
  var maxWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  /** @name dxOverlay.Options.minHeight */
  var minHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  /** @name dxOverlay.Options.minWidth */
  var minWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  /** @name dxOverlay.Options.onHidden */
  var onHidden: js.UndefOr[js.Function1[/* e */ `6`[T], _]] = js.native
  /** @name dxOverlay.Options.onHiding */
  var onHiding: js.UndefOr[js.Function1[/* e */ CancelComponentElementModel[T], _]] = js.native
  /** @name dxOverlay.Options.onShowing */
  var onShowing: js.UndefOr[js.Function1[/* e */ `6`[T], _]] = js.native
  /** @name dxOverlay.Options.onShown */
  var onShown: js.UndefOr[js.Function1[/* e */ `6`[T], _]] = js.native
  /** @name dxOverlay.Options.position */
  var position: js.UndefOr[js.Any] = js.native
  /** @name dxOverlay.Options.shading */
  var shading: js.UndefOr[Boolean] = js.native
  /** @name dxOverlay.Options.shadingColor */
  var shadingColor: js.UndefOr[String] = js.native
}

object dxOverlayOptions {
  @scala.inline
  def apply[T](): dxOverlayOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxOverlayOptions[T]]
  }
  @scala.inline
  implicit class dxOverlayOptionsOps[Self <: dxOverlayOptions[_], T] (val x: Self with dxOverlayOptions[T]) extends AnyVal {
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
    def setAnimation(value: dxOverlayAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setCloseOnOutsideClickFunction1(value: /* event */ event => Boolean): Self = this.set("closeOnOutsideClick", js.Any.fromFunction1(value))
    @scala.inline
    def setCloseOnOutsideClick(value: Boolean | (js.Function1[/* event */ event, Boolean])): Self = this.set("closeOnOutsideClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnOutsideClick: Self = this.set("closeOnOutsideClick", js.undefined)
    @scala.inline
    def setContentTemplateFunction1(value: /* contentElement */ dxElement => String | Element | JQuery): Self = this.set("contentTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def setContentTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, String | Element | JQuery])
    ): Self = this.set("contentTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentTemplate: Self = this.set("contentTemplate", js.undefined)
    @scala.inline
    def setDeferRendering(value: Boolean): Self = this.set("deferRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferRendering: Self = this.set("deferRendering", js.undefined)
    @scala.inline
    def setDragEnabled(value: Boolean): Self = this.set("dragEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragEnabled: Self = this.set("dragEnabled", js.undefined)
    @scala.inline
    def setMaxHeightFunction0(value: () => Double | String): Self = this.set("maxHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setMaxHeight(value: Double | String | (js.Function0[Double | String])): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidthFunction0(value: () => Double | String): Self = this.set("maxWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setMaxWidth(value: Double | String | (js.Function0[Double | String])): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeightFunction0(value: () => Double | String): Self = this.set("minHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setMinHeight(value: Double | String | (js.Function0[Double | String])): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidthFunction0(value: () => Double | String): Self = this.set("minWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setMinWidth(value: Double | String | (js.Function0[Double | String])): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOnHidden(value: /* e */ `6`[T] => _): Self = this.set("onHidden", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHidden: Self = this.set("onHidden", js.undefined)
    @scala.inline
    def setOnHiding(value: /* e */ CancelComponentElementModel[T] => _): Self = this.set("onHiding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHiding: Self = this.set("onHiding", js.undefined)
    @scala.inline
    def setOnShowing(value: /* e */ `6`[T] => _): Self = this.set("onShowing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShowing: Self = this.set("onShowing", js.undefined)
    @scala.inline
    def setOnShown(value: /* e */ `6`[T] => _): Self = this.set("onShown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShown: Self = this.set("onShown", js.undefined)
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShading(value: Boolean): Self = this.set("shading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShading: Self = this.set("shading", js.undefined)
    @scala.inline
    def setShadingColor(value: String): Self = this.set("shadingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadingColor: Self = this.set("shadingColor", js.undefined)
  }
  
}


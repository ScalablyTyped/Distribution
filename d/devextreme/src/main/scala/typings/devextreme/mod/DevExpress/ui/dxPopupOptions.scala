package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ModelTitleElement
import typings.devextreme.anon.`10`
import typings.devextreme.devextremeStrings.`left bottom`
import typings.devextreme.devextremeStrings.`left top`
import typings.devextreme.devextremeStrings.`right bottom`
import typings.devextreme.devextremeStrings.`right top`
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.positionConfig
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPopupOptions[T] extends dxOverlayOptions[T] {
  
  /**
    * [descr:dxPopup.Options.animation]
    */
  @JSName("animation")
  var animation_dxPopupOptions: js.UndefOr[dxPopupAnimation] = js.native
  
  /**
    * [descr:dxPopup.Options.container]
    */
  var container: js.UndefOr[String | Element | JQuery] = js.native
  
  /**
    * [descr:dxPopup.Options.fullScreen]
    */
  var fullScreen: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPopup.Options.onResize]
    */
  var onResize: js.UndefOr[js.Function1[/* e */ `10`[T], _]] = js.native
  
  /**
    * [descr:dxPopup.Options.onResizeEnd]
    */
  var onResizeEnd: js.UndefOr[js.Function1[/* e */ `10`[T], _]] = js.native
  
  /**
    * [descr:dxPopup.Options.onResizeStart]
    */
  var onResizeStart: js.UndefOr[js.Function1[/* e */ `10`[T], _]] = js.native
  
  /**
    * [descr:dxPopup.Options.onTitleRendered]
    */
  var onTitleRendered: js.UndefOr[js.Function1[/* e */ ModelTitleElement[T], _]] = js.native
  
  /**
    * [descr:dxPopup.Options.position]
    */
  @JSName("position")
  var position_dxPopupOptions: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function
  ] = js.native
  
  /**
    * [descr:dxPopup.Options.resizeEnabled]
    */
  var resizeEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPopup.Options.showCloseButton]
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPopup.Options.showTitle]
    */
  var showTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPopup.Options.title]
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxPopup.Options.titleTemplate]
    */
  var titleTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* titleElement */ dxElement, String | Element | JQuery])
  ] = js.native
  
  /**
    * [descr:dxPopup.Options.toolbarItems]
    */
  var toolbarItems: js.UndefOr[js.Array[dxPopupToolbarItem]] = js.native
}
object dxPopupOptions {
  
  @scala.inline
  def apply[T](): dxPopupOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPopupOptions[T]]
  }
  
  @scala.inline
  implicit class dxPopupOptionsOps[Self <: dxPopupOptions[_], T] (val x: Self with dxPopupOptions[T]) extends AnyVal {
    
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
    def setAnimation(value: dxPopupAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setContainer(value: String | Element | JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setFullScreen(value: Boolean): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    
    @scala.inline
    def setOnResize(value: /* e */ `10`[T] => _): Self = this.set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setOnResizeEnd(value: /* e */ `10`[T] => _): Self = this.set("onResizeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResizeEnd: Self = this.set("onResizeEnd", js.undefined)
    
    @scala.inline
    def setOnResizeStart(value: /* e */ `10`[T] => _): Self = this.set("onResizeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResizeStart: Self = this.set("onResizeStart", js.undefined)
    
    @scala.inline
    def setOnTitleRendered(value: /* e */ ModelTitleElement[T] => _): Self = this.set("onTitleRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTitleRendered: Self = this.set("onTitleRendered", js.undefined)
    
    @scala.inline
    def setPosition(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setResizeEnabled(value: Boolean): Self = this.set("resizeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeEnabled: Self = this.set("resizeEnabled", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleTemplateFunction1(value: /* titleElement */ dxElement => String | Element | JQuery): Self = this.set("titleTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* titleElement */ dxElement, String | Element | JQuery])
    ): Self = this.set("titleTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTemplate: Self = this.set("titleTemplate", js.undefined)
    
    @scala.inline
    def setToolbarItemsVarargs(value: dxPopupToolbarItem*): Self = this.set("toolbarItems", js.Array(value :_*))
    
    @scala.inline
    def setToolbarItems(value: js.Array[dxPopupToolbarItem]): Self = this.set("toolbarItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarItems: Self = this.set("toolbarItems", js.undefined)
  }
}

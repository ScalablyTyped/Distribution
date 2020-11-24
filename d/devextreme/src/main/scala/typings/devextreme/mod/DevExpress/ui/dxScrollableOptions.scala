package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ReachedRight
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.never
import typings.devextreme.devextremeStrings.onHover
import typings.devextreme.devextremeStrings.onScroll
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxScrollableOptions[T] extends DOMComponentOptions[T] {
  
  /**
    * [descr:dxScrollable.Options.bounceEnabled]
    */
  var bounceEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxScrollable.Options.direction]
    */
  var direction: js.UndefOr[both | horizontal | vertical] = js.native
  
  /**
    * [descr:dxScrollable.Options.disabled]
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxScrollable.Options.onScroll]
    */
  var onScroll: js.UndefOr[js.Function1[/* e */ ReachedRight[T], _]] = js.native
  
  /**
    * [descr:dxScrollable.Options.onUpdated]
    */
  var onUpdated: js.UndefOr[js.Function1[/* e */ ReachedRight[T], _]] = js.native
  
  /**
    * [descr:dxScrollable.Options.scrollByContent]
    */
  var scrollByContent: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxScrollable.Options.scrollByThumb]
    */
  var scrollByThumb: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxScrollable.Options.showScrollbar]
    */
  var showScrollbar: js.UndefOr[onScroll | onHover | always | never] = js.native
  
  /**
    * [descr:dxScrollable.Options.useNative]
    */
  var useNative: js.UndefOr[Boolean] = js.native
}
object dxScrollableOptions {
  
  @scala.inline
  def apply[T](): dxScrollableOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxScrollableOptions[T]]
  }
  
  @scala.inline
  implicit class dxScrollableOptionsOps[Self <: dxScrollableOptions[_], T] (val x: Self with dxScrollableOptions[T]) extends AnyVal {
    
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
    def setBounceEnabled(value: Boolean): Self = this.set("bounceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceEnabled: Self = this.set("bounceEnabled", js.undefined)
    
    @scala.inline
    def setDirection(value: both | horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* e */ ReachedRight[T] => _): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnUpdated(value: /* e */ ReachedRight[T] => _): Self = this.set("onUpdated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdated: Self = this.set("onUpdated", js.undefined)
    
    @scala.inline
    def setScrollByContent(value: Boolean): Self = this.set("scrollByContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollByContent: Self = this.set("scrollByContent", js.undefined)
    
    @scala.inline
    def setScrollByThumb(value: Boolean): Self = this.set("scrollByThumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollByThumb: Self = this.set("scrollByThumb", js.undefined)
    
    @scala.inline
    def setShowScrollbar(value: onScroll | onHover | always | never): Self = this.set("showScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowScrollbar: Self = this.set("showScrollbar", js.undefined)
    
    @scala.inline
    def setUseNative(value: Boolean): Self = this.set("useNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNative: Self = this.set("useNative", js.undefined)
  }
}

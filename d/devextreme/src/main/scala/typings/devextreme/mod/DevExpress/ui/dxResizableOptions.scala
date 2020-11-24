package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.EventHeight
import typings.devextreme.devextremeStrings.all
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxResizableOptions extends DOMComponentOptions[dxResizable] {
  
  /**
    * [descr:dxResizable.Options.handles]
    */
  var handles: js.UndefOr[bottom | left | right | top | all | String] = js.native
  
  /**
    * [descr:dxResizable.Options.maxHeight]
    */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxResizable.Options.maxWidth]
    */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxResizable.Options.minHeight]
    */
  var minHeight: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxResizable.Options.minWidth]
    */
  var minWidth: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxResizable.Options.onResize]
    */
  var onResize: js.UndefOr[js.Function1[/* e */ EventHeight, _]] = js.native
  
  /**
    * [descr:dxResizable.Options.onResizeEnd]
    */
  var onResizeEnd: js.UndefOr[js.Function1[/* e */ EventHeight, _]] = js.native
  
  /**
    * [descr:dxResizable.Options.onResizeStart]
    */
  var onResizeStart: js.UndefOr[js.Function1[/* e */ EventHeight, _]] = js.native
}
object dxResizableOptions {
  
  @scala.inline
  def apply(): dxResizableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxResizableOptions]
  }
  
  @scala.inline
  implicit class dxResizableOptionsOps[Self <: dxResizableOptions] (val x: Self) extends AnyVal {
    
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
    def setHandles(value: bottom | left | right | top | all | String): Self = this.set("handles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandles: Self = this.set("handles", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setOnResize(value: /* e */ EventHeight => _): Self = this.set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setOnResizeEnd(value: /* e */ EventHeight => _): Self = this.set("onResizeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResizeEnd: Self = this.set("onResizeEnd", js.undefined)
    
    @scala.inline
    def setOnResizeStart(value: /* e */ EventHeight => _): Self = this.set("onResizeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResizeStart: Self = this.set("onResizeStart", js.undefined)
  }
}

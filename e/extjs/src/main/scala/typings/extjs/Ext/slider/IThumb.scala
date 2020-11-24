package typings.extjs.Ext.slider

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThumb extends IBase {
  
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.native
  
  /** [Method] Disables the thumb if it is currently enabled */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Enables the thumb if it is currently disabled */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets up an Ext dd DragTracker for this thumb */
  var initEvents: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Renders the thumb into a slider */
  var render: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Ext.slider.MultiSlider) */
  var slider: js.UndefOr[IMultiSlider] = js.native
}
object IThumb {
  
  @scala.inline
  def apply(): IThumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThumb]
  }
  
  @scala.inline
  implicit class IThumbOps[Self <: IThumb] (val x: Self) extends AnyVal {
    
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
    def setConstrain(value: Boolean): Self = this.set("constrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrain: Self = this.set("constrain", js.undefined)
    
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setInitEvents(value: () => Unit): Self = this.set("initEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitEvents: Self = this.set("initEvents", js.undefined)
    
    @scala.inline
    def setRender(value: () => Unit): Self = this.set("render", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setSlider(value: IMultiSlider): Self = this.set("slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlider: Self = this.set("slider", js.undefined)
  }
}

package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.FormatPosition
import typings.devextreme.anon.ShowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSliderBaseOptions[T] extends dxTrackBarOptions[T] {
  
  /**
    * [descr:dxSliderBase.Options.keyStep]
    */
  var keyStep: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxSliderBase.Options.label]
    */
  var label: js.UndefOr[FormatPosition] = js.native
  
  /**
    * [descr:dxSliderBase.Options.name]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSliderBase.Options.showRange]
    */
  var showRange: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxSliderBase.Options.step]
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxSliderBase.Options.tooltip]
    */
  var tooltip: js.UndefOr[ShowMode] = js.native
}
object dxSliderBaseOptions {
  
  @scala.inline
  def apply[T](): dxSliderBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSliderBaseOptions[T]]
  }
  
  @scala.inline
  implicit class dxSliderBaseOptionsOps[Self <: dxSliderBaseOptions[_], T] (val x: Self with dxSliderBaseOptions[T]) extends AnyVal {
    
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
    def setKeyStep(value: Double): Self = this.set("keyStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyStep: Self = this.set("keyStep", js.undefined)
    
    @scala.inline
    def setLabel(value: FormatPosition): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setShowRange(value: Boolean): Self = this.set("showRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRange: Self = this.set("showRange", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setTooltip(value: ShowMode): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}

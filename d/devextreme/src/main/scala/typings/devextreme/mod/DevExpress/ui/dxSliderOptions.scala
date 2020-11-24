package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSliderOptions extends dxSliderBaseOptions[dxSlider] {
  
  /**
    * [descr:dxSlider.Options.value]
    */
  @JSName("value")
  var value_dxSliderOptions: js.UndefOr[Double] = js.native
}
object dxSliderOptions {
  
  @scala.inline
  def apply(): dxSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSliderOptions]
  }
  
  @scala.inline
  implicit class dxSliderOptionsOps[Self <: dxSliderOptions] (val x: Self) extends AnyVal {
    
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
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}

package typings.ejWebAll.ej.RadialMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsSliderSettings extends js.Object {
  
  /** Specifies the value of sliderSettings labelSpace .
    */
  var labelSpace: js.UndefOr[Double] = js.native
  
  /** Specifies the sliderSettings stroke Width value.
    */
  var strokeWidth: js.UndefOr[Double] = js.native
  
  /** Specifies the sliderSettings ticks values of nested radial menu items.
    */
  var ticks: js.UndefOr[js.Array[_]] = js.native
}
object ItemsSliderSettings {
  
  @scala.inline
  def apply(): ItemsSliderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsSliderSettings]
  }
  
  @scala.inline
  implicit class ItemsSliderSettingsOps[Self <: ItemsSliderSettings] (val x: Self) extends AnyVal {
    
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
    def setLabelSpace(value: Double): Self = this.set("labelSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSpace: Self = this.set("labelSpace", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: js.Any*): Self = this.set("ticks", js.Array(value :_*))
    
    @scala.inline
    def setTicks(value: js.Array[_]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
  }
}

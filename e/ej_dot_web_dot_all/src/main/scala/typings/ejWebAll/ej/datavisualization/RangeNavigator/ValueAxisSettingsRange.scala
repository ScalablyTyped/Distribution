package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueAxisSettingsRange extends js.Object {
  
  /** Default Value
    * @Default {null}
    */
  var interval: js.UndefOr[Double] = js.native
  
  /** Default Value
    * @Default {null}
    */
  var max: js.UndefOr[Double] = js.native
  
  /** Default Value
    * @Default {null}
    */
  var min: js.UndefOr[Double] = js.native
}
object ValueAxisSettingsRange {
  
  @scala.inline
  def apply(): ValueAxisSettingsRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueAxisSettingsRange]
  }
  
  @scala.inline
  implicit class ValueAxisSettingsRangeOps[Self <: ValueAxisSettingsRange] (val x: Self) extends AnyVal {
    
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
}

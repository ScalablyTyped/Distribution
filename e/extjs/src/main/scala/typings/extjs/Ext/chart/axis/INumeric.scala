package typings.extjs.Ext.chart.axis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INumeric extends IAxis {
  
  /** [Config Option] (Boolean) */
  var adjustMaximumByMajorUnit: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var adjustMinimumByMajorUnit: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var decimals: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var maximum: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minimum: js.UndefOr[Double] = js.native
}
object INumeric {
  
  @scala.inline
  def apply(): INumeric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumeric]
  }
  
  @scala.inline
  implicit class INumericOps[Self <: INumeric] (val x: Self) extends AnyVal {
    
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
    def setAdjustMaximumByMajorUnit(value: Boolean): Self = this.set("adjustMaximumByMajorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustMaximumByMajorUnit: Self = this.set("adjustMaximumByMajorUnit", js.undefined)
    
    @scala.inline
    def setAdjustMinimumByMajorUnit(value: Boolean): Self = this.set("adjustMinimumByMajorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustMinimumByMajorUnit: Self = this.set("adjustMinimumByMajorUnit", js.undefined)
    
    @scala.inline
    def setConstrain(value: Boolean): Self = this.set("constrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrain: Self = this.set("constrain", js.undefined)
    
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimals: Self = this.set("decimals", js.undefined)
    
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
  }
}

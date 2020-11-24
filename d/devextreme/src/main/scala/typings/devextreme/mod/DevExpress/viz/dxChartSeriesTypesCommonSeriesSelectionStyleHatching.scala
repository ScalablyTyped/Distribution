package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.CommonSeries.selectionStyle.hatching]
  */
@js.native
trait dxChartSeriesTypesCommonSeriesSelectionStyleHatching extends js.Object {
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.selectionStyle.hatching.direction]
    */
  var direction: js.UndefOr[left | none | right] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.selectionStyle.hatching.opacity]
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.selectionStyle.hatching.step]
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.selectionStyle.hatching.width]
    */
  var width: js.UndefOr[Double] = js.native
}
object dxChartSeriesTypesCommonSeriesSelectionStyleHatching {
  
  @scala.inline
  def apply(): dxChartSeriesTypesCommonSeriesSelectionStyleHatching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesSelectionStyleHatching]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesCommonSeriesSelectionStyleHatchingOps[Self <: dxChartSeriesTypesCommonSeriesSelectionStyleHatching] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: left | none | right): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

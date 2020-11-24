package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:BaseGauge.Options.scale]
  */
@js.native
trait BaseGaugeScale extends js.Object {
  
  /**
    * [descr:BaseGauge.Options.scale.allowDecimals]
    */
  var allowDecimals: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:BaseGauge.Options.scale.customMinorTicks]
    */
  var customMinorTicks: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * [descr:BaseGauge.Options.scale.customTicks]
    */
  var customTicks: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * [descr:BaseGauge.Options.scale.endValue]
    */
  var endValue: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseGauge.Options.scale.label]
    */
  var label: js.UndefOr[BaseGaugeScaleLabel] = js.native
  
  /**
    * [descr:BaseGauge.Options.scale.minorTick]
    */
  var minorTick: js.UndefOr[ColorLength] = js.native
  
  /**
    * [descr:BaseGauge.Options.scale.minorTickInterval]
    */
  var minorTickInterval: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseGauge.Options.scale.scaleDivisionFactor]
    */
  var scaleDivisionFactor: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseGauge.Options.scale.startValue]
    */
  var startValue: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseGauge.Options.scale.tick]
    */
  var tick: js.UndefOr[ColorLength] = js.native
  
  /**
    * [descr:BaseGauge.Options.scale.tickInterval]
    */
  var tickInterval: js.UndefOr[Double] = js.native
}
object BaseGaugeScale {
  
  @scala.inline
  def apply(): BaseGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeScale]
  }
  
  @scala.inline
  implicit class BaseGaugeScaleOps[Self <: BaseGaugeScale] (val x: Self) extends AnyVal {
    
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
    def setAllowDecimals(value: Boolean): Self = this.set("allowDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDecimals: Self = this.set("allowDecimals", js.undefined)
    
    @scala.inline
    def setCustomMinorTicksVarargs(value: Double*): Self = this.set("customMinorTicks", js.Array(value :_*))
    
    @scala.inline
    def setCustomMinorTicks(value: js.Array[Double]): Self = this.set("customMinorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMinorTicks: Self = this.set("customMinorTicks", js.undefined)
    
    @scala.inline
    def setCustomTicksVarargs(value: Double*): Self = this.set("customTicks", js.Array(value :_*))
    
    @scala.inline
    def setCustomTicks(value: js.Array[Double]): Self = this.set("customTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTicks: Self = this.set("customTicks", js.undefined)
    
    @scala.inline
    def setEndValue(value: Double): Self = this.set("endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    
    @scala.inline
    def setLabel(value: BaseGaugeScaleLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMinorTick(value: ColorLength): Self = this.set("minorTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTick: Self = this.set("minorTick", js.undefined)
    
    @scala.inline
    def setMinorTickInterval(value: Double): Self = this.set("minorTickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickInterval: Self = this.set("minorTickInterval", js.undefined)
    
    @scala.inline
    def setScaleDivisionFactor(value: Double): Self = this.set("scaleDivisionFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleDivisionFactor: Self = this.set("scaleDivisionFactor", js.undefined)
    
    @scala.inline
    def setStartValue(value: Double): Self = this.set("startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
    
    @scala.inline
    def setTick(value: ColorLength): Self = this.set("tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    
    @scala.inline
    def setTickInterval(value: Double): Self = this.set("tickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickInterval: Self = this.set("tickInterval", js.undefined)
  }
}

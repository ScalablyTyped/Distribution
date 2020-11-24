package typings.extjs.Ext.chart.series

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGauge extends ISeries {
  
  /** [Config Option] (String) */
  var angleField: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.native
  
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Number) */
  var highlightDuration: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var needle: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets the Gauge chart to the current specified value
    * @param value Object
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
}
object IGauge {
  
  @scala.inline
  def apply(): IGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGauge]
  }
  
  @scala.inline
  implicit class IGaugeOps[Self <: IGauge] (val x: Self) extends AnyVal {
    
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
    def setAngleField(value: String): Self = this.set("angleField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleField: Self = this.set("angleField", js.undefined)
    
    @scala.inline
    def setDonut(value: js.Any): Self = this.set("donut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDonut: Self = this.set("donut", js.undefined)
    
    @scala.inline
    def setDrawSeries(value: () => Unit): Self = this.set("drawSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDrawSeries: Self = this.set("drawSeries", js.undefined)
    
    @scala.inline
    def setHighlightDuration(value: Double): Self = this.set("highlightDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightDuration: Self = this.set("highlightDuration", js.undefined)
    
    @scala.inline
    def setNeedle(value: Boolean): Self = this.set("needle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedle: Self = this.set("needle", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}

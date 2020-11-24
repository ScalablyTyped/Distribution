package typings.extjs.Ext.chart

import typings.extjs.Ext.chart.series.ICartesian
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILineSeries extends ICartesian {
  
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var fill: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var markerConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var selectionTolerance: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var showMarkers: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean/Number) */
  var smooth: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
}
object ILineSeries {
  
  @scala.inline
  def apply(): ILineSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILineSeries]
  }
  
  @scala.inline
  implicit class ILineSeriesOps[Self <: ILineSeries] (val x: Self) extends AnyVal {
    
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
    def setDrawSeries(value: () => Unit): Self = this.set("drawSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDrawSeries: Self = this.set("drawSeries", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setMarkerConfig(value: js.Any): Self = this.set("markerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerConfig: Self = this.set("markerConfig", js.undefined)
    
    @scala.inline
    def setSelectionTolerance(value: Double): Self = this.set("selectionTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionTolerance: Self = this.set("selectionTolerance", js.undefined)
    
    @scala.inline
    def setShowMarkers(value: Boolean): Self = this.set("showMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMarkers: Self = this.set("showMarkers", js.undefined)
    
    @scala.inline
    def setSmooth(value: js.Any): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}

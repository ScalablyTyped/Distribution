package typings.extjs.Ext.chart

import typings.extjs.Ext.chart.series.ICartesian
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILineChart extends ICartesian {
  
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
object ILineChart {
  
  @scala.inline
  def apply(): ILineChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILineChart]
  }
  
  @scala.inline
  implicit class ILineChartMutableBuilder[Self <: ILineChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setMarkerConfig(value: js.Any): Self = StObject.set(x, "markerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerConfigUndefined: Self = StObject.set(x, "markerConfig", js.undefined)
    
    @scala.inline
    def setSelectionTolerance(value: Double): Self = StObject.set(x, "selectionTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionToleranceUndefined: Self = StObject.set(x, "selectionTolerance", js.undefined)
    
    @scala.inline
    def setShowMarkers(value: Boolean): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMarkersUndefined: Self = StObject.set(x, "showMarkers", js.undefined)
    
    @scala.inline
    def setSmooth(value: js.Any): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}

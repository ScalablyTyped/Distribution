package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseChart[TProperties]
  extends StObject
     with BaseWidget[TProperties] {
  
  /**
    * Deselects the chart&apos;s selected series. The series is displayed in an initial style.
    */
  def clearSelection(): Unit = js.native
  
  /**
    * Gets all the series.
    */
  def getAllSeries(): js.Array[baseSeriesObject] = js.native
  
  def getDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Gets a series with a specific name.
    */
  def getSeriesByName(seriesName: Any): chartSeriesObject = js.native
  
  /**
    * Gets a series with a specific index.
    */
  def getSeriesByPos(seriesIndex: Double): chartSeriesObject = js.native
  
  /**
    * Hides all UI component tooltips.
    */
  def hideTooltip(): Unit = js.native
  
  /**
    * Reloads data and repaints the UI component.
    */
  def refresh(): Unit = js.native
  
  /**
    * Redraws the UI component.
    */
  def render(renderOptions: Any): Unit = js.native
}
object BaseChart {
  
  trait PointInteractionInfo extends StObject {
    
    val target: basePointObject
  }
  object PointInteractionInfo {
    
    inline def apply(target: basePointObject): PointInteractionInfo = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointInteractionInfo]
    }
    
    extension [Self <: PointInteractionInfo](x: Self) {
      
      inline def setTarget(value: basePointObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait TooltipInfo extends StObject {
    
    var target: js.UndefOr[basePointObject | dxChartAnnotationConfig | Any] = js.undefined
  }
  object TooltipInfo {
    
    inline def apply(): TooltipInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipInfo]
    }
    
    extension [Self <: TooltipInfo](x: Self) {
      
      inline def setTarget(value: basePointObject | dxChartAnnotationConfig | Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}

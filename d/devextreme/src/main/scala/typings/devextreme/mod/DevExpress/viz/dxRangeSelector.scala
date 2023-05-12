package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.ExportInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.IncidentInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxRangeSelector
  extends StObject
     with BaseWidget[dxRangeSelectorOptions] {
  
  def getDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Gets the currently selected range.
    */
  def getValue(): js.Array[Double | String | js.Date] = js.native
  
  /**
    * Redraws the UI component.
    */
  def render(skipChartAnimation: Boolean): Unit = js.native
  
  /**
    * Sets the selected range.
    */
  def setValue(value: js.Array[Double | String | js.Date]): Unit = js.native
  def setValue(value: typings.devextreme.mod.DevExpress.common.charts.VisualRange): Unit = js.native
}
object dxRangeSelector {
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.continuous
    - typings.devextreme.devextremeStrings.discrete
    - typings.devextreme.devextremeStrings.logarithmic
    - typings.devextreme.devextremeStrings.semidiscrete
  */
  trait AxisScale extends StObject
  object AxisScale {
    
    inline def continuous: typings.devextreme.devextremeStrings.continuous = "continuous".asInstanceOf[typings.devextreme.devextremeStrings.continuous]
    
    inline def discrete: typings.devextreme.devextremeStrings.discrete = "discrete".asInstanceOf[typings.devextreme.devextremeStrings.discrete]
    
    inline def logarithmic: typings.devextreme.devextremeStrings.logarithmic = "logarithmic".asInstanceOf[typings.devextreme.devextremeStrings.logarithmic]
    
    inline def semidiscrete: typings.devextreme.devextremeStrings.semidiscrete = "semidiscrete".asInstanceOf[typings.devextreme.devextremeStrings.semidiscrete]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.center
    - typings.devextreme.devextremeStrings.centerBottom
    - typings.devextreme.devextremeStrings.centerTop
    - typings.devextreme.devextremeStrings.full
    - typings.devextreme.devextremeStrings.leftBottom
    - typings.devextreme.devextremeStrings.leftCenter
    - typings.devextreme.devextremeStrings.leftTop
    - typings.devextreme.devextremeStrings.rightBottom
    - typings.devextreme.devextremeStrings.rightCenter
    - typings.devextreme.devextremeStrings.rightTop
  */
  trait BackgroundImageLocation extends StObject
  object BackgroundImageLocation {
    
    inline def center: typings.devextreme.devextremeStrings.center = "center".asInstanceOf[typings.devextreme.devextremeStrings.center]
    
    inline def centerBottom: typings.devextreme.devextremeStrings.centerBottom = "centerBottom".asInstanceOf[typings.devextreme.devextremeStrings.centerBottom]
    
    inline def centerTop: typings.devextreme.devextremeStrings.centerTop = "centerTop".asInstanceOf[typings.devextreme.devextremeStrings.centerTop]
    
    inline def full: typings.devextreme.devextremeStrings.full = "full".asInstanceOf[typings.devextreme.devextremeStrings.full]
    
    inline def leftBottom: typings.devextreme.devextremeStrings.leftBottom = "leftBottom".asInstanceOf[typings.devextreme.devextremeStrings.leftBottom]
    
    inline def leftCenter: typings.devextreme.devextremeStrings.leftCenter = "leftCenter".asInstanceOf[typings.devextreme.devextremeStrings.leftCenter]
    
    inline def leftTop: typings.devextreme.devextremeStrings.leftTop = "leftTop".asInstanceOf[typings.devextreme.devextremeStrings.leftTop]
    
    inline def rightBottom: typings.devextreme.devextremeStrings.rightBottom = "rightBottom".asInstanceOf[typings.devextreme.devextremeStrings.rightBottom]
    
    inline def rightCenter: typings.devextreme.devextremeStrings.rightCenter = "rightCenter".asInstanceOf[typings.devextreme.devextremeStrings.rightCenter]
    
    inline def rightTop: typings.devextreme.devextremeStrings.rightTop = "rightTop".asInstanceOf[typings.devextreme.devextremeStrings.rightTop]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.continuous
    - typings.devextreme.devextremeStrings.logarithmic
  */
  trait ChartAxisScale extends StObject
  object ChartAxisScale {
    
    inline def continuous: typings.devextreme.devextremeStrings.continuous = "continuous".asInstanceOf[typings.devextreme.devextremeStrings.continuous]
    
    inline def logarithmic: typings.devextreme.devextremeStrings.logarithmic = "logarithmic".asInstanceOf[typings.devextreme.devextremeStrings.logarithmic]
  }
  
  type DisposingEvent = EventInfo[dxRangeSelector]
  
  type DrawnEvent = EventInfo[dxRangeSelector]
  
  type ExportedEvent = EventInfo[dxRangeSelector]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxRangeSelector]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxRangeSelector, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxRangeSelector]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxRangeSelector]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxRangeSelector, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxRangeSelector]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxRangeSelector]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxRangeSelector, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxRangeSelectorOptions
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.onMoving
    - typings.devextreme.devextremeStrings.onMovingComplete
  */
  trait ValueChangedCallMode extends StObject
  object ValueChangedCallMode {
    
    inline def onMoving: typings.devextreme.devextremeStrings.onMoving = "onMoving".asInstanceOf[typings.devextreme.devextremeStrings.onMoving]
    
    inline def onMovingComplete: typings.devextreme.devextremeStrings.onMovingComplete = "onMovingComplete".asInstanceOf[typings.devextreme.devextremeStrings.onMovingComplete]
  }
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxRangeSelector, MouseEvent | TouchEvent] {
    
    val previousValue: js.Array[Double | String | js.Date]
    
    val value: js.Array[Double | String | js.Date]
  }
  object ValueChangedEvent {
    
    inline def apply(
      component: dxRangeSelector,
      element: DxElement_[HTMLElement],
      previousValue: js.Array[Double | String | js.Date],
      value: js.Array[Double | String | js.Date]
    ): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueChangedEvent] (val x: Self) extends AnyVal {
      
      inline def setPreviousValue(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousValueVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "previousValue", js.Array(value*))
      
      inline def setValue(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}

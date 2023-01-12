package typings.googleVisualization.anon

import typings.googleVisualization.google.visualization.ChartStrokeOpacity
import typings.googleVisualization.google.visualization.ChartTextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellColor extends StObject {
  
  var cellColor: js.UndefOr[ChartStrokeOpacity] = js.undefined
  
  var cellSize: js.UndefOr[Double] = js.undefined
  
  var dayOfWeekLabel: js.UndefOr[ChartTextStyle] = js.undefined
  
  var dayOfWeekRightSpace: js.UndefOr[Double] = js.undefined
  
  var daysOfWeek: js.UndefOr[String] = js.undefined
  
  var focusedCellColor: js.UndefOr[ChartStrokeOpacity] = js.undefined
  
  var monthLabel: js.UndefOr[ChartTextStyle] = js.undefined
  
  var monthOutlineColor: js.UndefOr[ChartStrokeOpacity] = js.undefined
  
  var underMonthSpace: js.UndefOr[Double] = js.undefined
  
  var underYearSpace: js.UndefOr[Double] = js.undefined
  
  var unusedMonthOutlineColor: js.UndefOr[ChartStrokeOpacity] = js.undefined
  
  var yearLabel: js.UndefOr[ChartTextStyle] = js.undefined
}
object CellColor {
  
  inline def apply(): CellColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellColor] (val x: Self) extends AnyVal {
    
    inline def setCellColor(value: ChartStrokeOpacity): Self = StObject.set(x, "cellColor", value.asInstanceOf[js.Any])
    
    inline def setCellColorUndefined: Self = StObject.set(x, "cellColor", js.undefined)
    
    inline def setCellSize(value: Double): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
    
    inline def setCellSizeUndefined: Self = StObject.set(x, "cellSize", js.undefined)
    
    inline def setDayOfWeekLabel(value: ChartTextStyle): Self = StObject.set(x, "dayOfWeekLabel", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekLabelUndefined: Self = StObject.set(x, "dayOfWeekLabel", js.undefined)
    
    inline def setDayOfWeekRightSpace(value: Double): Self = StObject.set(x, "dayOfWeekRightSpace", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekRightSpaceUndefined: Self = StObject.set(x, "dayOfWeekRightSpace", js.undefined)
    
    inline def setDaysOfWeek(value: String): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
    
    inline def setFocusedCellColor(value: ChartStrokeOpacity): Self = StObject.set(x, "focusedCellColor", value.asInstanceOf[js.Any])
    
    inline def setFocusedCellColorUndefined: Self = StObject.set(x, "focusedCellColor", js.undefined)
    
    inline def setMonthLabel(value: ChartTextStyle): Self = StObject.set(x, "monthLabel", value.asInstanceOf[js.Any])
    
    inline def setMonthLabelUndefined: Self = StObject.set(x, "monthLabel", js.undefined)
    
    inline def setMonthOutlineColor(value: ChartStrokeOpacity): Self = StObject.set(x, "monthOutlineColor", value.asInstanceOf[js.Any])
    
    inline def setMonthOutlineColorUndefined: Self = StObject.set(x, "monthOutlineColor", js.undefined)
    
    inline def setUnderMonthSpace(value: Double): Self = StObject.set(x, "underMonthSpace", value.asInstanceOf[js.Any])
    
    inline def setUnderMonthSpaceUndefined: Self = StObject.set(x, "underMonthSpace", js.undefined)
    
    inline def setUnderYearSpace(value: Double): Self = StObject.set(x, "underYearSpace", value.asInstanceOf[js.Any])
    
    inline def setUnderYearSpaceUndefined: Self = StObject.set(x, "underYearSpace", js.undefined)
    
    inline def setUnusedMonthOutlineColor(value: ChartStrokeOpacity): Self = StObject.set(x, "unusedMonthOutlineColor", value.asInstanceOf[js.Any])
    
    inline def setUnusedMonthOutlineColorUndefined: Self = StObject.set(x, "unusedMonthOutlineColor", js.undefined)
    
    inline def setYearLabel(value: ChartTextStyle): Self = StObject.set(x, "yearLabel", value.asInstanceOf[js.Any])
    
    inline def setYearLabelUndefined: Self = StObject.set(x, "yearLabel", js.undefined)
  }
}

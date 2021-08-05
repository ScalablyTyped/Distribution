package typings.googleVisualization

import typings.googleVisualization.google.visualization.LabelStyle
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BarLabelStyle extends StObject {
    
    var barLabelStyle: js.UndefOr[LabelStyle] = js.undefined
    
    var colorByRowLabel: js.UndefOr[Boolean] = js.undefined
    
    var groupByRowLabel: js.UndefOr[Boolean] = js.undefined
    
    var rowLabelStyle: js.UndefOr[LabelStyle] = js.undefined
    
    var showRowLabels: js.UndefOr[Boolean] = js.undefined
    
    var singleColor: js.UndefOr[String] = js.undefined
  }
  object BarLabelStyle {
    
    inline def apply(): BarLabelStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarLabelStyle]
    }
    
    extension [Self <: BarLabelStyle](x: Self) {
      
      inline def setBarLabelStyle(value: LabelStyle): Self = StObject.set(x, "barLabelStyle", value.asInstanceOf[js.Any])
      
      inline def setBarLabelStyleUndefined: Self = StObject.set(x, "barLabelStyle", js.undefined)
      
      inline def setColorByRowLabel(value: Boolean): Self = StObject.set(x, "colorByRowLabel", value.asInstanceOf[js.Any])
      
      inline def setColorByRowLabelUndefined: Self = StObject.set(x, "colorByRowLabel", js.undefined)
      
      inline def setGroupByRowLabel(value: Boolean): Self = StObject.set(x, "groupByRowLabel", value.asInstanceOf[js.Any])
      
      inline def setGroupByRowLabelUndefined: Self = StObject.set(x, "groupByRowLabel", js.undefined)
      
      inline def setRowLabelStyle(value: LabelStyle): Self = StObject.set(x, "rowLabelStyle", value.asInstanceOf[js.Any])
      
      inline def setRowLabelStyleUndefined: Self = StObject.set(x, "rowLabelStyle", js.undefined)
      
      inline def setShowRowLabels(value: Boolean): Self = StObject.set(x, "showRowLabels", value.asInstanceOf[js.Any])
      
      inline def setShowRowLabelsUndefined: Self = StObject.set(x, "showRowLabels", js.undefined)
      
      inline def setSingleColor(value: String): Self = StObject.set(x, "singleColor", value.asInstanceOf[js.Any])
      
      inline def setSingleColorUndefined: Self = StObject.set(x, "singleColor", js.undefined)
    }
  }
  
  trait CellColor extends StObject {
    
    var cellColor: js.Object
    
    var cellSize: Double
    
    var dayOfWeekLabel: js.Object
    
    var dayOfWeekRightSpace: Double
    
    var daysOfWeek: String
    
    var focusedCellColor: js.Object
    
    var monthLabel: js.Object
    
    var monthOutlineColor: js.Object
    
    var underMonthSpace: Double
    
    var underYearSpace: Double
    
    var unusedMonthOutlineColor: js.Object
  }
  object CellColor {
    
    inline def apply(
      cellColor: js.Object,
      cellSize: Double,
      dayOfWeekLabel: js.Object,
      dayOfWeekRightSpace: Double,
      daysOfWeek: String,
      focusedCellColor: js.Object,
      monthLabel: js.Object,
      monthOutlineColor: js.Object,
      underMonthSpace: Double,
      underYearSpace: Double,
      unusedMonthOutlineColor: js.Object
    ): CellColor = {
      val __obj = js.Dynamic.literal(cellColor = cellColor.asInstanceOf[js.Any], cellSize = cellSize.asInstanceOf[js.Any], dayOfWeekLabel = dayOfWeekLabel.asInstanceOf[js.Any], dayOfWeekRightSpace = dayOfWeekRightSpace.asInstanceOf[js.Any], daysOfWeek = daysOfWeek.asInstanceOf[js.Any], focusedCellColor = focusedCellColor.asInstanceOf[js.Any], monthLabel = monthLabel.asInstanceOf[js.Any], monthOutlineColor = monthOutlineColor.asInstanceOf[js.Any], underMonthSpace = underMonthSpace.asInstanceOf[js.Any], underYearSpace = underYearSpace.asInstanceOf[js.Any], unusedMonthOutlineColor = unusedMonthOutlineColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellColor]
    }
    
    extension [Self <: CellColor](x: Self) {
      
      inline def setCellColor(value: js.Object): Self = StObject.set(x, "cellColor", value.asInstanceOf[js.Any])
      
      inline def setCellSize(value: Double): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
      
      inline def setDayOfWeekLabel(value: js.Object): Self = StObject.set(x, "dayOfWeekLabel", value.asInstanceOf[js.Any])
      
      inline def setDayOfWeekRightSpace(value: Double): Self = StObject.set(x, "dayOfWeekRightSpace", value.asInstanceOf[js.Any])
      
      inline def setDaysOfWeek(value: String): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFocusedCellColor(value: js.Object): Self = StObject.set(x, "focusedCellColor", value.asInstanceOf[js.Any])
      
      inline def setMonthLabel(value: js.Object): Self = StObject.set(x, "monthLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthOutlineColor(value: js.Object): Self = StObject.set(x, "monthOutlineColor", value.asInstanceOf[js.Any])
      
      inline def setUnderMonthSpace(value: Double): Self = StObject.set(x, "underMonthSpace", value.asInstanceOf[js.Any])
      
      inline def setUnderYearSpace(value: Double): Self = StObject.set(x, "underYearSpace", value.asInstanceOf[js.Any])
      
      inline def setUnusedMonthOutlineColor(value: js.Object): Self = StObject.set(x, "unusedMonthOutlineColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object Color {
    
    inline def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait Color1 extends StObject {
    
    var color1: String
    
    var color2: String
    
    var useObjectBoundingBoxUnits: js.UndefOr[Boolean] = js.undefined
    
    var x1: String
    
    var x2: String
    
    var y1: String
    
    var y2: String
  }
  object Color1 {
    
    inline def apply(color1: String, color2: String, x1: String, x2: String, y1: String, y2: String): Color1 = {
      val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], color2 = color2.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color1]
    }
    
    extension [Self <: Color1](x: Self) {
      
      inline def setColor1(value: String): Self = StObject.set(x, "color1", value.asInstanceOf[js.Any])
      
      inline def setColor2(value: String): Self = StObject.set(x, "color2", value.asInstanceOf[js.Any])
      
      inline def setUseObjectBoundingBoxUnits(value: Boolean): Self = StObject.set(x, "useObjectBoundingBoxUnits", value.asInstanceOf[js.Any])
      
      inline def setUseObjectBoundingBoxUnitsUndefined: Self = StObject.set(x, "useObjectBoundingBoxUnits", js.undefined)
      
      inline def setX1(value: String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY1(value: String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Colors extends StObject {
    
    var colors: js.Array[String]
    
    var maxValue: Double
    
    var minValue: Double
    
    var values: js.Array[Double]
  }
  object Colors {
    
    inline def apply(colors: js.Array[String], maxValue: Double, minValue: Double, values: js.Array[Double]): Colors = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    extension [Self <: Colors](x: Self) {
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait End extends StObject {
    
    var end: Date
    
    var start: Date
  }
  object End {
    
    inline def apply(end: Date, start: Date): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsHtml extends StObject {
    
    var isHtml: Boolean
  }
  object IsHtml {
    
    inline def apply(isHtml: Boolean): IsHtml = {
      val __obj = js.Dynamic.literal(isHtml = isHtml.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsHtml]
    }
    
    extension [Self <: IsHtml](x: Self) {
      
      inline def setIsHtml(value: Boolean): Self = StObject.set(x, "isHtml", value.asInstanceOf[js.Any])
    }
  }
  
  trait MapTypeId extends StObject {
    
    var mapTypeId: Name
  }
  object MapTypeId {
    
    inline def apply(mapTypeId: Name): MapTypeId = {
      val __obj = js.Dynamic.literal(mapTypeId = mapTypeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapTypeId]
    }
    
    extension [Self <: MapTypeId](x: Self) {
      
      inline def setMapTypeId(value: Name): Self = StObject.set(x, "mapTypeId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max extends StObject {
    
    var max: js.Any
    
    var min: js.Any
  }
  object Max {
    
    inline def apply(max: js.Any, min: js.Any): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var styles: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStyles(value: js.Array[js.Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setStylesVarargs(value: js.Any*): Self = StObject.set(x, "styles", js.Array(value :_*))
    }
  }
  
  trait Style extends StObject {
    
    var style: String
  }
  object Style {
    
    inline def apply(style: String): Style = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: String
  }
  object Type {
    
    inline def apply(`type`: String): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

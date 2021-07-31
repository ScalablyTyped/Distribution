package typings.googleVisualization.global.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.visualization.ColorFormat")
@js.native
class ColorFormat ()
  extends StObject
     with typings.googleVisualization.google.visualization.ColorFormat {
  
  /**
    * Assigns a background color from a range, according to the cell value. The color is scaled to match the cell's value within a range from a lower boundary color to an upper boundary color. Note that this method cannot compare string values, as addRange() can. Tip: Color ranges are often hard for viewers to gauge accurately; the simplest and easiest to read range is from a fully saturated color to white (e.g., #FF0000—FFFFFF).
    *
    * @param from - [Number, Date, DateTime, or TimeOfDay] The lower boundary (inclusive) of the range, or null. If null, it will match -∞.
    * @param to - [Number, Date, DateTime, or TimeOfDay] The higher boundary (non-inclusive) of the range, or null. If null, it will match +∞.
    * @param color - The color to apply to text in matching cells. This color is the same for all cells, no matter what their value.
    * @param fromBgColor - The background color for cells holding values at the low end of the gradient. Values can be either '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
    * @param toBgColor - The background color for cells holding values at the high end of the gradient. Values can be either '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
    */
  /* CompleteClass */
  override def addGradientRange(from: js.Any, to: js.Any, color: String, fromBgColor: String, toBgColor: String): Unit = js.native
  
  /**
    * Specifies a foreground color and/or background color to a cell, depending on the cell value. Any cell with a value in the specified from—to range will be assigned color and bgcolor. It is important to realize that the range is non-inclusive, because creating a range from 1—1,000 and a second from 1,000— 2,000 will not cover the value 1,000!
    *
    * @param from - [String, Number, Date, DateTime, or TimeOfDay] The lower boundary (inclusive) of the range, or null. If null, it will match -∞. String boundaries are compared alphabetically against string values.
    * @param to - [String, Number, Date, DateTime, or TimeOfDay] The high boundary (non-inclusive) of the range, or null. If null, it will match +∞. String boundaries are compared alphabetically against string values.
    * @param color - The color to apply to text in matching cells. Values can be either '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
    * @param bgcolor - The color to apply to the background of matching cells. Values can be either '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
    */
  /* CompleteClass */
  override def addRange(from: js.Any, to: js.Any, color: String, bgcolor: String): Unit = js.native
  
  /**
    * Reformats the data in the specified column.
    *
    * @param data - A DataTable containing the data to reformat. You cannot use a DataView here.
    * @param columnIndex - The zero-based index of the column to format. To format multiple columns, you must call this method multiple times, with different colIndex values.
    */
  /* CompleteClass */
  override def format(data: typings.googleVisualization.google.visualization.DataTable, columnIndex: Double): Unit = js.native
}

package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorFormat extends DefaultFormatter {
  /**
    * Assigns a background color from a range, according to the cell value. The color is scaled to match the cell's value within a range from a lower boundary color to an upper boundary color. Note that this method cannot compare string values, as addRange() can. Tip: Color ranges are often hard for viewers to gauge accurately; the simplest and easiest to read range is from a fully saturated color to white (e.g., #FF0000—FFFFFF).
    *
    * @param from - [Number, Date, DateTime, or TimeOfDay] The lower boundary (inclusive) of the range, or null. If null, it will match -∞.
    * @param to - [Number, Date, DateTime, or TimeOfDay] The higher boundary (non-inclusive) of the range, or null. If null, it will match +∞.
    * @param color - The color to apply to text in matching cells. This color is the same for all cells, no matter what their value.
    * @param fromBgColor - The background color for cells holding values at the low end of the gradient. Values can be either '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
    * @param toBgColor - The background color for cells holding values at the high end of the gradient. Values can be either '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
    */
  def addGradientRange(from: js.Any, to: js.Any, color: String, fromBgColor: String, toBgColor: String): Unit = js.native
  /**
    * Specifies a foreground color and/or background color to a cell, depending on the cell value. Any cell with a value in the specified from—to range will be assigned color and bgcolor. It is important to realize that the range is non-inclusive, because creating a range from 1—1,000 and a second from 1,000— 2,000 will not cover the value 1,000!
    *
    * @param from - [String, Number, Date, DateTime, or TimeOfDay] The lower boundary (inclusive) of the range, or null. If null, it will match -∞. String boundaries are compared alphabetically against string values.
    * @param to - [String, Number, Date, DateTime, or TimeOfDay] The high boundary (non-inclusive) of the range, or null. If null, it will match +∞. String boundaries are compared alphabetically against string values.
    * @param color - The color to apply to text in matching cells. Values can be either '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
    * @param bgcolor - The color to apply to the background of matching cells. Values can be either '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
    */
  def addRange(from: js.Any, to: js.Any, color: String, bgcolor: String): Unit = js.native
}

object ColorFormat {
  @scala.inline
  def apply(
    addGradientRange: (js.Any, js.Any, String, String, String) => Unit,
    addRange: (js.Any, js.Any, String, String) => Unit,
    format: (DataTable, Double) => Unit
  ): ColorFormat = {
    val __obj = js.Dynamic.literal(addGradientRange = js.Any.fromFunction5(addGradientRange), addRange = js.Any.fromFunction4(addRange), format = js.Any.fromFunction2(format))
    __obj.asInstanceOf[ColorFormat]
  }
  @scala.inline
  implicit class ColorFormatOps[Self <: ColorFormat] (val x: Self) extends AnyVal {
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
    def setAddGradientRange(value: (js.Any, js.Any, String, String, String) => Unit): Self = this.set("addGradientRange", js.Any.fromFunction5(value))
    @scala.inline
    def setAddRange(value: (js.Any, js.Any, String, String) => Unit): Self = this.set("addRange", js.Any.fromFunction4(value))
  }
  
}


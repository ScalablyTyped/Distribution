package typings.expoLinearGradient.anon

import typings.expoLinearGradient.mod.LinearGradientPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Colors extends js.Object {
  
  /**
    * An array of colors that represent stops in the gradient. At least two colors are required
    * (for a single-color background, use the `style.backgroundColor` prop on a `View` component).
    */
  var colors: js.Array[String] = js.native
  
  /**
    * An object `{ x: number; y: number }` or array `[x, y]` that represents the point
    * at which the gradient ends, as a fraction of the overall size of the gradient ranging from 0 to 1, inclusive.
    *
    * For example, `{ x: 0.1, y: 0.2 }` means that the gradient will end `10%` from the left and `20%` from the bottom.
    *
    * **On web**, this only changes the angle of the gradient because CSS gradients don't support changing the end position.
    */
  var end: js.UndefOr[LinearGradientPoint | Null] = js.native
  
  /**
    * An array that contains `number`s ranging from 0 to 1, inclusive, and is the same length as the `colors` property.
    * Each number indicates a color-stop location where each respective color should be located.
    *
    * For example, `[0.5, 0.8]` would render:
    * - the first color, solid, from the beginning of the gradient view to 50% through (the middle);
    * - a gradient from the first color to the second from the 50% point to the 80% point; and
    * - the second color, solid, from the 80% point to the end of the gradient view.
    *
    * The color-stop locations must be ascending from least to greatest.
    */
  var locations: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /**
    * An object `{ x: number; y: number }` or array `[x, y]` that represents the point
    * at which the gradient starts, as a fraction of the overall size of the gradient ranging from 0 to 1, inclusive.
    *
    * For example, `{ x: 0.1, y: 0.2 }` means that the gradient will start `10%` from the left and `20%` from the top.
    *
    * **On web**, this only changes the angle of the gradient because CSS gradients don't support changing the starting position.
    */
  var start: js.UndefOr[LinearGradientPoint | Null] = js.native
}
object Colors {
  
  @scala.inline
  def apply(colors: js.Array[String]): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit class ColorsOps[Self <: Colors] (val x: Self) extends AnyVal {
    
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
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: LinearGradientPoint): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setEndNull: Self = this.set("end", null)
    
    @scala.inline
    def setLocationsVarargs(value: Double*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[Double]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setLocationsNull: Self = this.set("locations", null)
    
    @scala.inline
    def setStart(value: LinearGradientPoint): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStartNull: Self = this.set("start", null)
  }
}

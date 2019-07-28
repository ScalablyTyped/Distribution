package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowFormatOptions extends js.Object {
  /**
    * A number indicating the base value, used to compare against the cell value. If the cell value is higher, the cell will include a green up arrow; if the cell value is lower, it will include a red down arrow; if the same, no arrow.
    */
  var base: js.UndefOr[Double] = js.undefined
}

object ArrowFormatOptions {
  @scala.inline
  def apply(base: Int | Double = null): ArrowFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowFormatOptions]
  }
}


package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendSize extends js.Object {
  /** Specify the height of the legend. Height can be specified in pixel.
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Specify the width of the legend. Width can be specified in pixel.
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.undefined
}

object LegendSize {
  @scala.inline
  def apply(height: String = null, width: String = null): LegendSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[LegendSize]
  }
}


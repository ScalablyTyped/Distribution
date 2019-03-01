package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendSize extends js.Object {
  /** Height of the legend. Height can be specified in either pixel or percentage.
    * @Default {null}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the legend. Width can be specified in either pixel or percentage.
    * @Default {null}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object LegendSize {
  @scala.inline
  def apply(height: java.lang.String = null, width: java.lang.String = null): LegendSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[LegendSize]
  }
}


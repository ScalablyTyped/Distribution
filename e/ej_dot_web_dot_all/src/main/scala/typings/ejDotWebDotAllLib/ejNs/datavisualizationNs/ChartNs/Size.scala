package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  /** Height of the Chart. Height can be specified in either pixel or percentage.
    * @Default {'450'}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the Chart. Width can be specified in either pixel or percentage.
    * @Default {'450'}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Size {
  @scala.inline
  def apply(height: java.lang.String = null, width: java.lang.String = null): Size = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Size]
  }
}


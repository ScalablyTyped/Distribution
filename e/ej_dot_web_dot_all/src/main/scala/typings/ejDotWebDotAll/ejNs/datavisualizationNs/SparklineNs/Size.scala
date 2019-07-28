package typings.ejDotWebDotAll.ejNs.datavisualizationNs.SparklineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  /** Height of the Sparkline. Height can be specified in either pixel or percentage.
    * @Default {''}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Width of the Sparkline. Width can be specified in either pixel or percentage.
    * @Default {''}
    */
  var width: js.UndefOr[String] = js.undefined
}

object Size {
  @scala.inline
  def apply(height: String = null, width: String = null): Size = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Size]
  }
}


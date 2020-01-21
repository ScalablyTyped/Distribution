package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  /** Height of the Chart. Height can be specified in either pixel or percentage.
    * @Default {'450'}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Width of the Chart. Width can be specified in either pixel or percentage.
    * @Default {'450'}
    */
  var width: js.UndefOr[String] = js.undefined
}

object Size {
  @scala.inline
  def apply(height: String = null, width: String = null): Size = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}


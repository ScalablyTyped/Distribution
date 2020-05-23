package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesOutlierSettingsSize extends js.Object {
  /** Height of the outlier shape.
    * @Default {6}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Width of the outlier shape.
    * @Default {6}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SeriesOutlierSettingsSize {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): SeriesOutlierSettingsSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesOutlierSettingsSize]
  }
}


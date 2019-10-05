package typings.ejDotWebDotAll.ej.datavisualization.Chart

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
  def apply(height: Int | Double = null, width: Int | Double = null): SeriesOutlierSettingsSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesOutlierSettingsSize]
  }
}


package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsOutlierSettings extends js.Object {
  /** Specifies the shape of the outlier.
    * @Default {circle. See Shape}
    */
  var shape: js.UndefOr[Shape | java.lang.String] = js.undefined
  /** Options for customizing the size of the outlier shape.
    */
  var size: js.UndefOr[CommonSeriesOptionsOutlierSettingsSize] = js.undefined
}

object CommonSeriesOptionsOutlierSettings {
  @scala.inline
  def apply(shape: Shape | java.lang.String = null, size: CommonSeriesOptionsOutlierSettingsSize = null): CommonSeriesOptionsOutlierSettings = {
    val __obj = js.Dynamic.literal()
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[CommonSeriesOptionsOutlierSettings]
  }
}


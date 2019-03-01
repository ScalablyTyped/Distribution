package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersSubLayersLabelSettings extends js.Object {
  /** enable or disable the enableSmartLabel property
    * @Default {false}
    */
  var enableSmartLabel: js.UndefOr[scala.Boolean] = js.undefined
  /** set the labelLength property
    * @Default {'2'}
    */
  var labelLength: js.UndefOr[scala.Double] = js.undefined
  /** set the labelPath property
    * @Default {null}
    */
  var labelPath: js.UndefOr[java.lang.String] = js.undefined
  /** The property specifies whether to show labels or not.
    * @Default {false}
    */
  var showLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** set the smartLabelSize property
    * @Default {fixed}
    */
  var smartLabelSize: js.UndefOr[LabelSize | java.lang.String] = js.undefined
}

object LayersSubLayersLabelSettings {
  @scala.inline
  def apply(
    enableSmartLabel: js.UndefOr[scala.Boolean] = js.undefined,
    labelLength: scala.Int | scala.Double = null,
    labelPath: java.lang.String = null,
    showLabels: js.UndefOr[scala.Boolean] = js.undefined,
    smartLabelSize: LabelSize | java.lang.String = null
  ): LayersSubLayersLabelSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableSmartLabel)) __obj.updateDynamic("enableSmartLabel")(enableSmartLabel)
    if (labelLength != null) __obj.updateDynamic("labelLength")(labelLength.asInstanceOf[js.Any])
    if (labelPath != null) __obj.updateDynamic("labelPath")(labelPath)
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels)
    if (smartLabelSize != null) __obj.updateDynamic("smartLabelSize")(smartLabelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersSubLayersLabelSettings]
  }
}


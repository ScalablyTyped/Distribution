package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersLabelSettings extends js.Object {
  /** enable or disable the enableSmartLabel property
    * @Default {false}
    */
  var enableSmartLabel: js.UndefOr[Boolean] = js.undefined
  /** Options for customizing the data label font.
    */
  var font: js.UndefOr[LayersLabelSettingsFont] = js.undefined
  /** set the labelLength property
    * @Default {'2'}
    */
  var labelLength: js.UndefOr[Double] = js.undefined
  /** set the labelPath property
    * @Default {null}
    */
  var labelPath: js.UndefOr[String] = js.undefined
  /** The property specifies whether to show labels or not.
    * @Default {false}
    */
  var showLabels: js.UndefOr[Boolean] = js.undefined
  /** set the smartLabelSize property
    * @Default {fixed}
    */
  var smartLabelSize: js.UndefOr[LabelSize | String] = js.undefined
}

object LayersLabelSettings {
  @scala.inline
  def apply(
    enableSmartLabel: js.UndefOr[Boolean] = js.undefined,
    font: LayersLabelSettingsFont = null,
    labelLength: Int | Double = null,
    labelPath: String = null,
    showLabels: js.UndefOr[Boolean] = js.undefined,
    smartLabelSize: LabelSize | String = null
  ): LayersLabelSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableSmartLabel)) __obj.updateDynamic("enableSmartLabel")(enableSmartLabel.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (labelLength != null) __obj.updateDynamic("labelLength")(labelLength.asInstanceOf[js.Any])
    if (labelPath != null) __obj.updateDynamic("labelPath")(labelPath.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels.asInstanceOf[js.Any])
    if (smartLabelSize != null) __obj.updateDynamic("smartLabelSize")(smartLabelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersLabelSettings]
  }
}


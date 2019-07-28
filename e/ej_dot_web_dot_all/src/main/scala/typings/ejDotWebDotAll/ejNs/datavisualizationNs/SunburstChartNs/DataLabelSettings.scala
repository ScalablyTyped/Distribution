package typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstChartNs

import typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstLabelOverflowMode
import typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstLabelRotationMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLabelSettings extends js.Object {
  /** Fill color for the datalabel
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Options for customizing the data label font.
    */
  var font: js.UndefOr[DataLabelSettingsFont] = js.undefined
  /** Datalabel overflow mode
    * @Default {Trim. See LabelOverflowMode}
    */
  var labelOverflowMode: js.UndefOr[SunburstLabelOverflowMode | String] = js.undefined
  /** Alignment of sunburst datalabel
    * @Default {Angle. See DatalabelAlignment}
    */
  var labelRotationMode: js.UndefOr[SunburstLabelRotationMode | String] = js.undefined
  /** Custom template for datalabel
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
  /** Datalabel visibility of the Sunburst.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object DataLabelSettings {
  @scala.inline
  def apply(
    fill: String = null,
    font: DataLabelSettingsFont = null,
    labelOverflowMode: SunburstLabelOverflowMode | String = null,
    labelRotationMode: SunburstLabelRotationMode | String = null,
    template: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DataLabelSettings = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (labelOverflowMode != null) __obj.updateDynamic("labelOverflowMode")(labelOverflowMode.asInstanceOf[js.Any])
    if (labelRotationMode != null) __obj.updateDynamic("labelRotationMode")(labelRotationMode.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[DataLabelSettings]
  }
}


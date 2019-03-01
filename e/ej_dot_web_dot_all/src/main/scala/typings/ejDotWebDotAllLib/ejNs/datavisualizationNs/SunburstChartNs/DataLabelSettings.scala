package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLabelSettings extends js.Object {
  /** Fill color for the datalabel
    * @Default {null}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the data label font.
    */
  var font: js.UndefOr[DataLabelSettingsFont] = js.undefined
  /** Datalabel overflow mode
    * @Default {Trim. See LabelOverflowMode}
    */
  var labelOverflowMode: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLabelOverflowMode | java.lang.String
  ] = js.undefined
  /** Alignment of sunburst datalabel
    * @Default {Angle. See DatalabelAlignment}
    */
  var labelRotationMode: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLabelRotationMode | java.lang.String
  ] = js.undefined
  /** Custom template for datalabel
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** Datalabel visibility of the Sunburst.
    * @Default {false}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object DataLabelSettings {
  @scala.inline
  def apply(
    fill: java.lang.String = null,
    font: DataLabelSettingsFont = null,
    labelOverflowMode: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLabelOverflowMode | java.lang.String = null,
    labelRotationMode: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLabelRotationMode | java.lang.String = null,
    template: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
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


package typings
package ejDotWebDotAllLib.ejNs.SunburstChartNs

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


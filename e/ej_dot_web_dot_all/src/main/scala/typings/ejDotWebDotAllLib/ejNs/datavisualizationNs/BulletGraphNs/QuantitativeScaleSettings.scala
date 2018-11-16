package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QuantitativeScaleSettings extends js.Object {
  /** Contains property to customize the comparative measure.
               */
  var comparativeMeasureSettings: js.UndefOr[QuantitativeScaleSettingsComparativeMeasureSettings] = js.undefined
  /** Contains property to customize the featured measure.
               */
  var featureMeasures: js.UndefOr[js.Array[QuantitativeScaleSettingsFeatureMeasure]] = js.undefined
  /** Contains property to customize the featured measure.
               */
  var featuredMeasureSettings: js.UndefOr[QuantitativeScaleSettingsFeaturedMeasureSettings] = js.undefined
  /** Contains property to customize the fields.
               */
  var fields: js.UndefOr[QuantitativeScaleSettingsFields] = js.undefined
  /** Specifies the interval for the Graph.
               * @Default {1}
               */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** Contains property to customize the labels.
               */
  var labelSettings: js.UndefOr[QuantitativeScaleSettingsLabelSettings] = js.undefined
  /** Contains property to customize the position of the quantitative scale
               */
  var location: js.UndefOr[QuantitativeScaleSettingsLocation] = js.undefined
  /** Contains property to customize the major tick lines.
               */
  var majorTickSettings: js.UndefOr[QuantitativeScaleSettingsMajorTickSettings] = js.undefined
  /** Specifies the maximum value of the Graph.
               * @Default {10}
               */
  var maximum: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the minimum value of the Graph.
               * @Default {0}
               */
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /** Contains property to customize the minor ticks.
               */
  var minorTickSettings: js.UndefOr[QuantitativeScaleSettingsMinorTickSettings] = js.undefined
  /** The specified number of minor ticks will be rendered per interval.
               * @Default {4}
               */
  var minorTicksPerInterval: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the placement of ticks to render either inside or outside the scale.
               * @Default {ej.datavisualization.BulletGraph.TickPlacement.Outside}
               */
  var tickPlacement: js.UndefOr[TickPlacement | java.lang.String] = js.undefined
  /** Specifies the position of the ticks to render either above,below or inside
               * @Default {ej.datavisualization.BulletGraph.TickPosition.Far}
               */
  var tickPosition: js.UndefOr[TickPosition | java.lang.String] = js.undefined
}


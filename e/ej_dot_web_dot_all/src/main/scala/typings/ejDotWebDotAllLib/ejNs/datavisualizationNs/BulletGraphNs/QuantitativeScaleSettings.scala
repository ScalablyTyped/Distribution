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

object QuantitativeScaleSettings {
  @scala.inline
  def apply(
    comparativeMeasureSettings: QuantitativeScaleSettingsComparativeMeasureSettings = null,
    featureMeasures: js.Array[QuantitativeScaleSettingsFeatureMeasure] = null,
    featuredMeasureSettings: QuantitativeScaleSettingsFeaturedMeasureSettings = null,
    fields: QuantitativeScaleSettingsFields = null,
    interval: scala.Int | scala.Double = null,
    labelSettings: QuantitativeScaleSettingsLabelSettings = null,
    location: QuantitativeScaleSettingsLocation = null,
    majorTickSettings: QuantitativeScaleSettingsMajorTickSettings = null,
    maximum: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    minorTickSettings: QuantitativeScaleSettingsMinorTickSettings = null,
    minorTicksPerInterval: scala.Int | scala.Double = null,
    tickPlacement: TickPlacement | java.lang.String = null,
    tickPosition: TickPosition | java.lang.String = null
  ): QuantitativeScaleSettings = {
    val __obj = js.Dynamic.literal()
    if (comparativeMeasureSettings != null) __obj.updateDynamic("comparativeMeasureSettings")(comparativeMeasureSettings)
    if (featureMeasures != null) __obj.updateDynamic("featureMeasures")(featureMeasures)
    if (featuredMeasureSettings != null) __obj.updateDynamic("featuredMeasureSettings")(featuredMeasureSettings)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (labelSettings != null) __obj.updateDynamic("labelSettings")(labelSettings)
    if (location != null) __obj.updateDynamic("location")(location)
    if (majorTickSettings != null) __obj.updateDynamic("majorTickSettings")(majorTickSettings)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (minorTickSettings != null) __obj.updateDynamic("minorTickSettings")(minorTickSettings)
    if (minorTicksPerInterval != null) __obj.updateDynamic("minorTicksPerInterval")(minorTicksPerInterval.asInstanceOf[js.Any])
    if (tickPlacement != null) __obj.updateDynamic("tickPlacement")(tickPlacement.asInstanceOf[js.Any])
    if (tickPosition != null) __obj.updateDynamic("tickPosition")(tickPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettings]
  }
}


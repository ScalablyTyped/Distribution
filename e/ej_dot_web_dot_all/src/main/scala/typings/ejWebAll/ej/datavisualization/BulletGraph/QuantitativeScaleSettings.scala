package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuantitativeScaleSettings extends js.Object {
  /** Contains property to customize the comparative measure.
    */
  var comparativeMeasureSettings: js.UndefOr[QuantitativeScaleSettingsComparativeMeasureSettings] = js.native
  /** Contains property to customize the featured measure.
    */
  var featureMeasures: js.UndefOr[js.Array[QuantitativeScaleSettingsFeatureMeasure]] = js.native
  /** Contains property to customize the featured measure.
    */
  var featuredMeasureSettings: js.UndefOr[QuantitativeScaleSettingsFeaturedMeasureSettings] = js.native
  /** Contains property to customize the fields.
    */
  var fields: js.UndefOr[QuantitativeScaleSettingsFields] = js.native
  /** Specifies the interval for the Graph.
    * @Default {1}
    */
  var interval: js.UndefOr[Double] = js.native
  /** Contains property to customize the labels.
    */
  var labelSettings: js.UndefOr[QuantitativeScaleSettingsLabelSettings] = js.native
  /** Contains property to customize the position of the quantitative scale
    */
  var location: js.UndefOr[QuantitativeScaleSettingsLocation] = js.native
  /** Contains property to customize the major tick lines.
    */
  var majorTickSettings: js.UndefOr[QuantitativeScaleSettingsMajorTickSettings] = js.native
  /** Specifies the maximum value of the Graph.
    * @Default {10}
    */
  var maximum: js.UndefOr[Double] = js.native
  /** Specifies the minimum value of the Graph.
    * @Default {0}
    */
  var minimum: js.UndefOr[Double] = js.native
  /** Contains property to customize the minor ticks.
    */
  var minorTickSettings: js.UndefOr[QuantitativeScaleSettingsMinorTickSettings] = js.native
  /** The specified number of minor ticks will be rendered per interval.
    * @Default {4}
    */
  var minorTicksPerInterval: js.UndefOr[Double] = js.native
  /** Specifies the placement of ticks to render either inside or outside the scale.
    * @Default {ej.datavisualization.BulletGraph.TickPlacement.Outside}
    */
  var tickPlacement: js.UndefOr[TickPlacement | String] = js.native
  /** Specifies the position of the ticks to render either above,below or inside
    * @Default {ej.datavisualization.BulletGraph.TickPosition.Far}
    */
  var tickPosition: js.UndefOr[TickPosition | String] = js.native
}

object QuantitativeScaleSettings {
  @scala.inline
  def apply(): QuantitativeScaleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuantitativeScaleSettings]
  }
  @scala.inline
  implicit class QuantitativeScaleSettingsOps[Self <: QuantitativeScaleSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComparativeMeasureSettings(value: QuantitativeScaleSettingsComparativeMeasureSettings): Self = this.set("comparativeMeasureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparativeMeasureSettings: Self = this.set("comparativeMeasureSettings", js.undefined)
    @scala.inline
    def setFeatureMeasuresVarargs(value: QuantitativeScaleSettingsFeatureMeasure*): Self = this.set("featureMeasures", js.Array(value :_*))
    @scala.inline
    def setFeatureMeasures(value: js.Array[QuantitativeScaleSettingsFeatureMeasure]): Self = this.set("featureMeasures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureMeasures: Self = this.set("featureMeasures", js.undefined)
    @scala.inline
    def setFeaturedMeasureSettings(value: QuantitativeScaleSettingsFeaturedMeasureSettings): Self = this.set("featuredMeasureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedMeasureSettings: Self = this.set("featuredMeasureSettings", js.undefined)
    @scala.inline
    def setFields(value: QuantitativeScaleSettingsFields): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setLabelSettings(value: QuantitativeScaleSettingsLabelSettings): Self = this.set("labelSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelSettings: Self = this.set("labelSettings", js.undefined)
    @scala.inline
    def setLocation(value: QuantitativeScaleSettingsLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMajorTickSettings(value: QuantitativeScaleSettingsMajorTickSettings): Self = this.set("majorTickSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorTickSettings: Self = this.set("majorTickSettings", js.undefined)
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setMinorTickSettings(value: QuantitativeScaleSettingsMinorTickSettings): Self = this.set("minorTickSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTickSettings: Self = this.set("minorTickSettings", js.undefined)
    @scala.inline
    def setMinorTicksPerInterval(value: Double): Self = this.set("minorTicksPerInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTicksPerInterval: Self = this.set("minorTicksPerInterval", js.undefined)
    @scala.inline
    def setTickPlacement(value: TickPlacement | String): Self = this.set("tickPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickPlacement: Self = this.set("tickPlacement", js.undefined)
    @scala.inline
    def setTickPosition(value: TickPosition | String): Self = this.set("tickPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickPosition: Self = this.set("tickPosition", js.undefined)
  }
  
}


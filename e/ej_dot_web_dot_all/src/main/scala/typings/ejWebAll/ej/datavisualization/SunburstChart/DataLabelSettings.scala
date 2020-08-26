package typings.ejWebAll.ej.datavisualization.SunburstChart

import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstLabelOverflowMode
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstLabelRotationMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLabelSettings extends js.Object {
  /** Fill color for the datalabel
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  /** Options for customizing the data label font.
    */
  var font: js.UndefOr[DataLabelSettingsFont] = js.native
  /** Datalabel overflow mode
    * @Default {Trim. See LabelOverflowMode}
    */
  var labelOverflowMode: js.UndefOr[SunburstLabelOverflowMode | String] = js.native
  /** Alignment of sunburst datalabel
    * @Default {Angle. See DatalabelAlignment}
    */
  var labelRotationMode: js.UndefOr[SunburstLabelRotationMode | String] = js.native
  /** Custom template for datalabel
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Datalabel visibility of the Sunburst.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object DataLabelSettings {
  @scala.inline
  def apply(): DataLabelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLabelSettings]
  }
  @scala.inline
  implicit class DataLabelSettingsOps[Self <: DataLabelSettings] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFont(value: DataLabelSettingsFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setLabelOverflowMode(value: SunburstLabelOverflowMode | String): Self = this.set("labelOverflowMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOverflowMode: Self = this.set("labelOverflowMode", js.undefined)
    @scala.inline
    def setLabelRotationMode(value: SunburstLabelRotationMode | String): Self = this.set("labelRotationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelRotationMode: Self = this.set("labelRotationMode", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}


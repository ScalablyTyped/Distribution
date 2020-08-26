package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorStyleSettings extends js.Object {
  /** Specifies the background color of range navigator.
    * @Default {#dddddd}
    */
  var background: js.UndefOr[String] = js.native
  /** Options for customizing the border color and width of range navigator.
    */
  var border: js.UndefOr[NavigatorStyleSettingsBorder] = js.native
  /** Contains the options for highlighting the range navigator on mouse over.
    */
  var highlightSettings: js.UndefOr[NavigatorStyleSettingsHighlightSettings] = js.native
  /** Specifies the left side thumb template in range navigator we can give either div id or HTML string
    * @Default {null}
    */
  var leftThumbTemplate: js.UndefOr[String] = js.native
  /** Options for customizing the major grid lines.
    */
  var majorGridLineStyle: js.UndefOr[NavigatorStyleSettingsMajorGridLineStyle] = js.native
  /** Options for customizing the minor grid lines.
    */
  var minorGridLineStyle: js.UndefOr[NavigatorStyleSettingsMinorGridLineStyle] = js.native
  /** Specifies the opacity of RangeNavigator.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the right side thumb template in range navigator we can give either div id or HTML string
    * @Default {null}
    */
  var rightThumbTemplate: js.UndefOr[String] = js.native
  /** Specifies the color of the selected region in range navigator.
    * @Default {#EFEFEF}
    */
  var selectedRegionColor: js.UndefOr[String] = js.native
  /** Specifies the opacity of Selected Region.
    * @Default {0}
    */
  var selectedRegionOpacity: js.UndefOr[Double] = js.native
  /** Contains the options for selection the range navigator on mouse over.
    */
  var selectionSettings: js.UndefOr[NavigatorStyleSettingsSelectionSettings] = js.native
  /** Specifies the color of the thumb in range navigator.
    * @Default {#2382C3}
    */
  var thumbColor: js.UndefOr[String] = js.native
  /** Specifies the radius of the thumb in range navigator.
    * @Default {10}
    */
  var thumbRadius: js.UndefOr[Double] = js.native
  /** Specifies the stroke color of the thumb in range navigator.
    * @Default {#303030}
    */
  var thumbStroke: js.UndefOr[String] = js.native
  /** Specifies the color of the unselected region in range navigator.
    * @Default {#5EABDE}
    */
  var unselectedRegionColor: js.UndefOr[String] = js.native
  /** Specifies the opacity of Unselected Region.
    * @Default {0.3}
    */
  var unselectedRegionOpacity: js.UndefOr[Double] = js.native
}

object NavigatorStyleSettings {
  @scala.inline
  def apply(): NavigatorStyleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorStyleSettings]
  }
  @scala.inline
  implicit class NavigatorStyleSettingsOps[Self <: NavigatorStyleSettings] (val x: Self) extends AnyVal {
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBorder(value: NavigatorStyleSettingsBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setHighlightSettings(value: NavigatorStyleSettingsHighlightSettings): Self = this.set("highlightSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightSettings: Self = this.set("highlightSettings", js.undefined)
    @scala.inline
    def setLeftThumbTemplate(value: String): Self = this.set("leftThumbTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftThumbTemplate: Self = this.set("leftThumbTemplate", js.undefined)
    @scala.inline
    def setMajorGridLineStyle(value: NavigatorStyleSettingsMajorGridLineStyle): Self = this.set("majorGridLineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorGridLineStyle: Self = this.set("majorGridLineStyle", js.undefined)
    @scala.inline
    def setMinorGridLineStyle(value: NavigatorStyleSettingsMinorGridLineStyle): Self = this.set("minorGridLineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorGridLineStyle: Self = this.set("minorGridLineStyle", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRightThumbTemplate(value: String): Self = this.set("rightThumbTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightThumbTemplate: Self = this.set("rightThumbTemplate", js.undefined)
    @scala.inline
    def setSelectedRegionColor(value: String): Self = this.set("selectedRegionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRegionColor: Self = this.set("selectedRegionColor", js.undefined)
    @scala.inline
    def setSelectedRegionOpacity(value: Double): Self = this.set("selectedRegionOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRegionOpacity: Self = this.set("selectedRegionOpacity", js.undefined)
    @scala.inline
    def setSelectionSettings(value: NavigatorStyleSettingsSelectionSettings): Self = this.set("selectionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionSettings: Self = this.set("selectionSettings", js.undefined)
    @scala.inline
    def setThumbColor(value: String): Self = this.set("thumbColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbColor: Self = this.set("thumbColor", js.undefined)
    @scala.inline
    def setThumbRadius(value: Double): Self = this.set("thumbRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbRadius: Self = this.set("thumbRadius", js.undefined)
    @scala.inline
    def setThumbStroke(value: String): Self = this.set("thumbStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbStroke: Self = this.set("thumbStroke", js.undefined)
    @scala.inline
    def setUnselectedRegionColor(value: String): Self = this.set("unselectedRegionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectedRegionColor: Self = this.set("unselectedRegionColor", js.undefined)
    @scala.inline
    def setUnselectedRegionOpacity(value: Double): Self = this.set("unselectedRegionOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectedRegionOpacity: Self = this.set("unselectedRegionOpacity", js.undefined)
  }
  
}


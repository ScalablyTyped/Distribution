package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueAxisSettings extends js.Object {
  
  /** Options for customizing the axis line.
    */
  var axisLine: js.UndefOr[ValueAxisSettingsAxisLine] = js.native
  
  /** Options for customizing the font of the axis.
    */
  var font: js.UndefOr[ValueAxisSettingsFont] = js.native
  
  /** Options for customizing the major grid lines.
    */
  var majorGridLines: js.UndefOr[ValueAxisSettingsMajorGridLines] = js.native
  
  /** Options for customizing the major tick lines in axis.
    */
  var majorTickLines: js.UndefOr[ValueAxisSettingsMajorTickLines] = js.native
  
  /** You can customize the range of the axis by setting minimum , maximum and interval.
    */
  var range: js.UndefOr[ValueAxisSettingsRange] = js.native
  
  /** If the range is not given explicitly, range will be calculated automatically. You can customize the automatic range calculation using rangePadding.
    * @Default {none}
    */
  var rangePadding: js.UndefOr[String] = js.native
  
  /** Toggles the visibility of axis in range navigator.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object ValueAxisSettings {
  
  @scala.inline
  def apply(): ValueAxisSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueAxisSettings]
  }
  
  @scala.inline
  implicit class ValueAxisSettingsOps[Self <: ValueAxisSettings] (val x: Self) extends AnyVal {
    
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
    def setAxisLine(value: ValueAxisSettingsAxisLine): Self = this.set("axisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLine: Self = this.set("axisLine", js.undefined)
    
    @scala.inline
    def setFont(value: ValueAxisSettingsFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setMajorGridLines(value: ValueAxisSettingsMajorGridLines): Self = this.set("majorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorGridLines: Self = this.set("majorGridLines", js.undefined)
    
    @scala.inline
    def setMajorTickLines(value: ValueAxisSettingsMajorTickLines): Self = this.set("majorTickLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorTickLines: Self = this.set("majorTickLines", js.undefined)
    
    @scala.inline
    def setRange(value: ValueAxisSettingsRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRangePadding(value: String): Self = this.set("rangePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangePadding: Self = this.set("rangePadding", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}

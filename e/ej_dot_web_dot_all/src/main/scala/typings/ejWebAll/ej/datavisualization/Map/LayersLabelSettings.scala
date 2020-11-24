package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayersLabelSettings extends js.Object {
  
  /** enable or disable the enableSmartLabel property
    * @Default {false}
    */
  var enableSmartLabel: js.UndefOr[Boolean] = js.native
  
  /** Options for customizing the data label font.
    */
  var font: js.UndefOr[LayersLabelSettingsFont] = js.native
  
  /** set the labelLength property
    * @Default {'2'}
    */
  var labelLength: js.UndefOr[Double] = js.native
  
  /** set the labelPath property
    * @Default {null}
    */
  var labelPath: js.UndefOr[String] = js.native
  
  /** The property specifies whether to show labels or not.
    * @Default {false}
    */
  var showLabels: js.UndefOr[Boolean] = js.native
  
  /** set the smartLabelSize property
    * @Default {fixed}
    */
  var smartLabelSize: js.UndefOr[LabelSize | String] = js.native
}
object LayersLabelSettings {
  
  @scala.inline
  def apply(): LayersLabelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersLabelSettings]
  }
  
  @scala.inline
  implicit class LayersLabelSettingsOps[Self <: LayersLabelSettings] (val x: Self) extends AnyVal {
    
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
    def setEnableSmartLabel(value: Boolean): Self = this.set("enableSmartLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSmartLabel: Self = this.set("enableSmartLabel", js.undefined)
    
    @scala.inline
    def setFont(value: LayersLabelSettingsFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setLabelLength(value: Double): Self = this.set("labelLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLength: Self = this.set("labelLength", js.undefined)
    
    @scala.inline
    def setLabelPath(value: String): Self = this.set("labelPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPath: Self = this.set("labelPath", js.undefined)
    
    @scala.inline
    def setShowLabels(value: Boolean): Self = this.set("showLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLabels: Self = this.set("showLabels", js.undefined)
    
    @scala.inline
    def setSmartLabelSize(value: LabelSize | String): Self = this.set("smartLabelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartLabelSize: Self = this.set("smartLabelSize", js.undefined)
  }
}

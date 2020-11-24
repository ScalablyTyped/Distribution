package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuantitativeScaleSettingsLabelSettings extends js.Object {
  
  /** Contains property to customize the font of the labels in bullet graph.
    */
  var font: js.UndefOr[QuantitativeScaleSettingsLabelSettingsFont] = js.native
  
  /** Specifies the placement of labels in bullet graph scale.
    * @Default {outside}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | String] = js.native
  
  /** Specifies the prefix to be added with labels in bullet graph.
    * @Default {Empty string}
    */
  var labelPrefix: js.UndefOr[String] = js.native
  
  /** Specifies the suffix to be added after labels in bullet graph.
    * @Default {Empty string}
    */
  var labelSuffix: js.UndefOr[String] = js.native
  
  /** Specifies the horizontal/vertical padding of labels.
    * @Default {15}
    */
  var offset: js.UndefOr[Double] = js.native
  
  /** Specifies the position of the labels to render either above or below the graph. See
    * @Default {below}
    */
  var position: js.UndefOr[LabelPosition | String] = js.native
  
  /** Specifies the Size of the labels.
    * @Default {12}
    */
  var size: js.UndefOr[Double] = js.native
  
  /** Specifies the stroke color of the labels in bullet graph.
    * @Default {null}
    */
  var stroke: js.UndefOr[String] = js.native
}
object QuantitativeScaleSettingsLabelSettings {
  
  @scala.inline
  def apply(): QuantitativeScaleSettingsLabelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuantitativeScaleSettingsLabelSettings]
  }
  
  @scala.inline
  implicit class QuantitativeScaleSettingsLabelSettingsOps[Self <: QuantitativeScaleSettingsLabelSettings] (val x: Self) extends AnyVal {
    
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
    def setFont(value: QuantitativeScaleSettingsLabelSettingsFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setLabelPlacement(value: LabelPlacement | String): Self = this.set("labelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPlacement: Self = this.set("labelPlacement", js.undefined)
    
    @scala.inline
    def setLabelPrefix(value: String): Self = this.set("labelPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPrefix: Self = this.set("labelPrefix", js.undefined)
    
    @scala.inline
    def setLabelSuffix(value: String): Self = this.set("labelSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSuffix: Self = this.set("labelSuffix", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: LabelPosition | String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
}

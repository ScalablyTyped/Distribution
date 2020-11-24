package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeafItemSettings extends js.Object {
  
  /** Specifies the border brush color of the leaf item.
    * @Default {white}
    */
  var borderBrush: js.UndefOr[String] = js.native
  
  /** Specifies the border thickness of the leaf item.
    * @Default {1}
    */
  var borderThickness: js.UndefOr[Double] = js.native
  
  /** Specifies the space between the leaf items.
    * @Default {0}
    */
  var gap: js.UndefOr[Double] = js.native
  
  /** Specifies the label template of the leaf item.
    * @Default {null}
    */
  var itemTemplate: js.UndefOr[String] = js.native
  
  /** Specifies the label path of the leaf item.
    * @Default {null}
    */
  var labelPath: js.UndefOr[String] = js.native
  
  /** Specifies the position of the leaf labels.
    * @Default {center}
    */
  var labelPosition: js.UndefOr[Position | String] = js.native
  
  /** Specifies the mode of label visibility
    * @Default {visible}
    */
  var labelVisibilityMode: js.UndefOr[VisibilityMode | String] = js.native
  
  /** Shows or hides the label of the leaf item.
    * @Default {false}
    */
  var showLabels: js.UndefOr[Boolean] = js.native
  
  /** Specifies the overflow options for leaf labels.
    * @Default {none}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.native
}
object LeafItemSettings {
  
  @scala.inline
  def apply(): LeafItemSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeafItemSettings]
  }
  
  @scala.inline
  implicit class LeafItemSettingsOps[Self <: LeafItemSettings] (val x: Self) extends AnyVal {
    
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
    def setBorderBrush(value: String): Self = this.set("borderBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBrush: Self = this.set("borderBrush", js.undefined)
    
    @scala.inline
    def setBorderThickness(value: Double): Self = this.set("borderThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderThickness: Self = this.set("borderThickness", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    
    @scala.inline
    def setItemTemplate(value: String): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    
    @scala.inline
    def setLabelPath(value: String): Self = this.set("labelPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPath: Self = this.set("labelPath", js.undefined)
    
    @scala.inline
    def setLabelPosition(value: Position | String): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    
    @scala.inline
    def setLabelVisibilityMode(value: VisibilityMode | String): Self = this.set("labelVisibilityMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelVisibilityMode: Self = this.set("labelVisibilityMode", js.undefined)
    
    @scala.inline
    def setShowLabels(value: Boolean): Self = this.set("showLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLabels: Self = this.set("showLabels", js.undefined)
    
    @scala.inline
    def setTextOverflow(value: TextOverflow | String): Self = this.set("textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOverflow: Self = this.set("textOverflow", js.undefined)
  }
}

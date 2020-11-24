package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends js.Object {
  
  /** specifies the group background
    * @Default {null}
    */
  var groupBackground: js.UndefOr[String] = js.native
  
  /** Specifies the group border color for tree map level.
    * @Default {null}
    */
  var groupBorderColor: js.UndefOr[String] = js.native
  
  /** Specifies the group border thickness for tree map level.
    * @Default {1}
    */
  var groupBorderThickness: js.UndefOr[Double] = js.native
  
  /** Specifies the group gap for tree map level.
    * @Default {1}
    */
  var groupGap: js.UndefOr[Double] = js.native
  
  /** Specifies the group padding for tree map level.
    * @Default {4}
    */
  var groupPadding: js.UndefOr[Double] = js.native
  
  /** Specifies the group path for tree map level.
    */
  var groupPath: js.UndefOr[String] = js.native
  
  /** Specifies the header height for tree map level.
    * @Default {0}
    */
  var headerHeight: js.UndefOr[Double] = js.native
  
  /** Specifies the header template for tree map level.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[String] = js.native
  
  /** Specifies the mode of header visibility
    * @Default {visible}
    */
  var headerVisibilityMode: js.UndefOr[VisibilityMode | String] = js.native
  
  /** Specifies the position of the labels.
    * @Default {center}
    */
  var labelPosition: js.UndefOr[Position | String] = js.native
  
  /** Specifies the label template for tree map level.
    * @Default {null}
    */
  var labelTemplate: js.UndefOr[String] = js.native
  
  /** Specifies the mode of label visibility
    * @Default {visible}
    */
  var labelVisibilityMode: js.UndefOr[VisibilityMode | String] = js.native
  
  /** Shows or hides the header for tree map level.
    * @Default {false}
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  
  /** Shows or hides the labels for tree map level.
    * @Default {false}
    */
  var showLabels: js.UndefOr[Boolean] = js.native
  
  /** Specifies the overflow options for leaf labels.
    * @Default {none}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.native
}
object Level {
  
  @scala.inline
  def apply(): Level = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
    
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
    def setGroupBackground(value: String): Self = this.set("groupBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBackground: Self = this.set("groupBackground", js.undefined)
    
    @scala.inline
    def setGroupBorderColor(value: String): Self = this.set("groupBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBorderColor: Self = this.set("groupBorderColor", js.undefined)
    
    @scala.inline
    def setGroupBorderThickness(value: Double): Self = this.set("groupBorderThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBorderThickness: Self = this.set("groupBorderThickness", js.undefined)
    
    @scala.inline
    def setGroupGap(value: Double): Self = this.set("groupGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupGap: Self = this.set("groupGap", js.undefined)
    
    @scala.inline
    def setGroupPadding(value: Double): Self = this.set("groupPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupPadding: Self = this.set("groupPadding", js.undefined)
    
    @scala.inline
    def setGroupPath(value: String): Self = this.set("groupPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupPath: Self = this.set("groupPath", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: String): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    
    @scala.inline
    def setHeaderVisibilityMode(value: VisibilityMode | String): Self = this.set("headerVisibilityMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderVisibilityMode: Self = this.set("headerVisibilityMode", js.undefined)
    
    @scala.inline
    def setLabelPosition(value: Position | String): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    
    @scala.inline
    def setLabelTemplate(value: String): Self = this.set("labelTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelTemplate: Self = this.set("labelTemplate", js.undefined)
    
    @scala.inline
    def setLabelVisibilityMode(value: VisibilityMode | String): Self = this.set("labelVisibilityMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelVisibilityMode: Self = this.set("labelVisibilityMode", js.undefined)
    
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    
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

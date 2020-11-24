package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Title extends js.Object {
  
  /** Background color for the chart title.
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.native
  
  /** Options to customize the border of the title.
    */
  var border: js.UndefOr[TitleBorder] = js.native
  
  /** Specifies whether to trim the Chart Title when the width of the title exceeds the maximumWidth.
    * @Default {false}
    */
  var enableTrim: js.UndefOr[Boolean] = js.native
  
  /** Options for customizing the font of Chart title.
    */
  var font: js.UndefOr[TitleFont] = js.native
  
  /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
    * @Default {auto}
    */
  var maximumWidth: js.UndefOr[String] = js.native
  
  /** Options to customize the sub title of Chart.
    */
  var subTitle: js.UndefOr[TitleSubTitle] = js.native
  
  /** Text to be displayed in Chart title.
    */
  var text: js.UndefOr[String] = js.native
  
  /** Alignment of the title text.
    * @Default {Center. See TextAlignment}
    */
  var textAlignment: js.UndefOr[Alignment | String] = js.native
  
  /** Specifies the action taken when the Chart width is more than the titleWidth.
    * @Default {trim.}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.native
  
  /** Controls the visibility of the Chart title
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object Title {
  
  @scala.inline
  def apply(): Title = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Title]
  }
  
  @scala.inline
  implicit class TitleOps[Self <: Title] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: TitleBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setEnableTrim(value: Boolean): Self = this.set("enableTrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTrim: Self = this.set("enableTrim", js.undefined)
    
    @scala.inline
    def setFont(value: TitleFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setMaximumWidth(value: String): Self = this.set("maximumWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumWidth: Self = this.set("maximumWidth", js.undefined)
    
    @scala.inline
    def setSubTitle(value: TitleSubTitle): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextAlignment(value: Alignment | String): Self = this.set("textAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlignment: Self = this.set("textAlignment", js.undefined)
    
    @scala.inline
    def setTextOverflow(value: TextOverflow | String): Self = this.set("textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOverflow: Self = this.set("textOverflow", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}

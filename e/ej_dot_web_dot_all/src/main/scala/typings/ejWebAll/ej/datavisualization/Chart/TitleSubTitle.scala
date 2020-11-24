package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TitleSubTitle extends js.Object {
  
  /** Background color for the chart subtitle.
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.native
  
  /** Options to customize the border of the title.
    */
  var border: js.UndefOr[TitleSubTitleBorder] = js.native
  
  /** Specifies whether to trim the Chart SubTitle when the width of the Subtitle exceeds the maximumWidth.
    * @Default {false}
    */
  var enableTrim: js.UndefOr[Boolean] = js.native
  
  /** Options for customizing the font of sub title.
    */
  var font: js.UndefOr[TitleSubTitleFont] = js.native
  
  /** Maximum width of the Subtitle, when the Subtitle exceeds this width, the Subtitle gets trimmed, when enableTrim is true.
    * @Default {auto}
    */
  var maximumWidth: js.UndefOr[String] = js.native
  
  /** Text to be displayed in sub title.
    */
  var text: js.UndefOr[String] = js.native
  
  /** Alignment of sub title text.
    * @Default {far. See TextAlignment}
    */
  var textAlignment: js.UndefOr[Alignment | String] = js.native
  
  /** Specifies the action taken when the Chart width is more than the SubTitleWidth.
    * @Default {trim.}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.native
  
  /** Controls the visibility of the Chart SubTitle
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object TitleSubTitle {
  
  @scala.inline
  def apply(): TitleSubTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleSubTitle]
  }
  
  @scala.inline
  implicit class TitleSubTitleOps[Self <: TitleSubTitle] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: TitleSubTitleBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setEnableTrim(value: Boolean): Self = this.set("enableTrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTrim: Self = this.set("enableTrim", js.undefined)
    
    @scala.inline
    def setFont(value: TitleSubTitleFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setMaximumWidth(value: String): Self = this.set("maximumWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumWidth: Self = this.set("maximumWidth", js.undefined)
    
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

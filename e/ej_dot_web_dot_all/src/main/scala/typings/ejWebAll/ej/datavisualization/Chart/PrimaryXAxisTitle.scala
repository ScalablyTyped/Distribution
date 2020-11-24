package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimaryXAxisTitle extends js.Object {
  
  /** Specifies the position of the axis title.
    * @Default {center. See Alignment}
    */
  var alignment: js.UndefOr[TextAlignment | String] = js.native
  
  /** Specifies whether to trim the axis title when it exceeds the chart area or the maximum width of the title.
    * @Default {false}
    */
  var enableTrim: js.UndefOr[Boolean] = js.native
  
  /** Options for customizing the title font.
    */
  var font: js.UndefOr[PrimaryXAxisTitleFont] = js.native
  
  /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
    * @Default {34}
    */
  var maximumTitleWidth: js.UndefOr[Double] = js.native
  
  /** offset value for axis title.
    * @Default {0}
    */
  var offset: js.UndefOr[Double] = js.native
  
  /** Specifies the position of the axis title.
    * @Default {outside. See Position}
    */
  var position: js.UndefOr[LabelPosition | String] = js.native
  
  /** Title for the axis.
    */
  var text: js.UndefOr[String] = js.native
  
  /** Controls the visibility of axis title.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object PrimaryXAxisTitle {
  
  @scala.inline
  def apply(): PrimaryXAxisTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryXAxisTitle]
  }
  
  @scala.inline
  implicit class PrimaryXAxisTitleOps[Self <: PrimaryXAxisTitle] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: TextAlignment | String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setEnableTrim(value: Boolean): Self = this.set("enableTrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTrim: Self = this.set("enableTrim", js.undefined)
    
    @scala.inline
    def setFont(value: PrimaryXAxisTitleFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setMaximumTitleWidth(value: Double): Self = this.set("maximumTitleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumTitleWidth: Self = this.set("maximumTitleWidth", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: LabelPosition | String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}

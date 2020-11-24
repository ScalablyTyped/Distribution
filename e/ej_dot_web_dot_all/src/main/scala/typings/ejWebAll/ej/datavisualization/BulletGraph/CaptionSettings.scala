package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionSettings extends js.Object {
  
  /** Specifies whether trim the labels will be true or false.
    * @Default {true}
    */
  var enableTrim: js.UndefOr[Boolean] = js.native
  
  /** Contains property to customize the font of caption.
    */
  var font: js.UndefOr[CaptionSettingsFont] = js.native
  
  /** Contains property to customize the indicator.
    */
  var indicator: js.UndefOr[CaptionSettingsIndicator] = js.native
  
  /** Contains property to customize the location.
    */
  var location: js.UndefOr[CaptionSettingsLocation] = js.native
  
  /** Specifies the padding to be applied when text position is used.
    * @Default {5}
    */
  var padding: js.UndefOr[Double] = js.native
  
  /** Contains property to customize the subtitle.
    */
  var subTitle: js.UndefOr[CaptionSettingsSubTitle] = js.native
  
  /** Specifies the text to be displayed on bullet graph.
    */
  var text: js.UndefOr[String] = js.native
  
  /** Specifies the alignment of caption text with respect to scale. This property will not be applied when text position is float.
    * @Default {'Near'}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.native
  
  /** Specifies caption text anchoring when caption text overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same position.
    * Anchoring is not applicable for float position.
    * @Default {'start'}
    */
  var textAnchor: js.UndefOr[TextAnchor | String] = js.native
  
  /** Specifies the angel in which the caption is rendered.
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.native
  
  /** Specifies how caption text should be placed.
    * @Default {'float'}
    */
  var textPosition: js.UndefOr[TextPosition | String] = js.native
}
object CaptionSettings {
  
  @scala.inline
  def apply(): CaptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSettings]
  }
  
  @scala.inline
  implicit class CaptionSettingsOps[Self <: CaptionSettings] (val x: Self) extends AnyVal {
    
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
    def setEnableTrim(value: Boolean): Self = this.set("enableTrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTrim: Self = this.set("enableTrim", js.undefined)
    
    @scala.inline
    def setFont(value: CaptionSettingsFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setIndicator(value: CaptionSettingsIndicator): Self = this.set("indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    
    @scala.inline
    def setLocation(value: CaptionSettingsLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setSubTitle(value: CaptionSettingsSubTitle): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextAlignment(value: TextAlignment | String): Self = this.set("textAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlignment: Self = this.set("textAlignment", js.undefined)
    
    @scala.inline
    def setTextAnchor(value: TextAnchor | String): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    
    @scala.inline
    def setTextAngle(value: Double): Self = this.set("textAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAngle: Self = this.set("textAngle", js.undefined)
    
    @scala.inline
    def setTextPosition(value: TextPosition | String): Self = this.set("textPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextPosition: Self = this.set("textPosition", js.undefined)
  }
}

package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionSettingsSubTitle extends js.Object {
  
  /** Contains property to customize the font of subtitle.
    */
  var font: js.UndefOr[CaptionSettingsSubTitleFont] = js.native
  
  /** Contains property to customize the location of subtitle.
    */
  var location: js.UndefOr[CaptionSettingsSubTitleLocation] = js.native
  
  /** Specifies the padding to be applied when text position is used.
    * @Default {5}
    */
  var padding: js.UndefOr[Double] = js.native
  
  /** Specifies the text to be displayed as subtitle.
    */
  var text: js.UndefOr[String] = js.native
  
  /** Specifies the alignment of sub title text with respect to scale. Alignment will not be applied in float position.
    * @Default {'Near'}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.native
  
  /** Specifies where subtitle text should be anchored when sub title text overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same
    * position. Anchoring is not applicable for float position.
    * @Default {'start'}
    */
  var textAnchor: js.UndefOr[TextAnchor | String] = js.native
  
  /** Subtitle render in the specified angle.
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.native
  
  /** Specifies where sub title text should be placed.
    * @Default {'float'}
    */
  var textPosition: js.UndefOr[TextPosition | String] = js.native
}
object CaptionSettingsSubTitle {
  
  @scala.inline
  def apply(): CaptionSettingsSubTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSettingsSubTitle]
  }
  
  @scala.inline
  implicit class CaptionSettingsSubTitleOps[Self <: CaptionSettingsSubTitle] (val x: Self) extends AnyVal {
    
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
    def setFont(value: CaptionSettingsSubTitleFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setLocation(value: CaptionSettingsSubTitleLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
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

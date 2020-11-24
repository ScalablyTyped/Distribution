package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionSettingsIndicator extends js.Object {
  
  /** Contains property to customize the font of indicator.
    */
  var font: js.UndefOr[CaptionSettingsIndicatorFont] = js.native
  
  /** Contains property to customize the location of indicator.
    */
  var location: js.UndefOr[CaptionSettingsIndicatorLocation] = js.native
  
  /** Specifies the padding to be applied when text position is used.
    * @Default {2}
    */
  var padding: js.UndefOr[Double] = js.native
  
  /** Contains property to customize the symbol of indicator.
    */
  var symbol: js.UndefOr[CaptionSettingsIndicatorSymbol] = js.native
  
  /** Specifies the text to be displayed as indicator text. By default difference between current value and target will be displayed
    */
  var text: js.UndefOr[String] = js.native
  
  /** Specifies the alignment of indicator with respect to scale based on text position
    * @Default {'Near'}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.native
  
  /** Specifies where indicator text should be anchored when indicator overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same
    * position. Anchoring is not applicable for float position.
    * @Default {'start'}
    */
  var textAnchor: js.UndefOr[TextAnchor | String] = js.native
  
  /** indicator text render in the specified angle.
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.native
  
  /** Specifies where indicator should be placed
    * @Default {'float'}
    */
  var textPosition: js.UndefOr[TextPosition | String] = js.native
  
  /** Specifies the space between indicator symbol and text.
    * @Default {3}
    */
  var textSpacing: js.UndefOr[Double] = js.native
  
  /** Specifies whether indicator will be visible or not.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object CaptionSettingsIndicator {
  
  @scala.inline
  def apply(): CaptionSettingsIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSettingsIndicator]
  }
  
  @scala.inline
  implicit class CaptionSettingsIndicatorOps[Self <: CaptionSettingsIndicator] (val x: Self) extends AnyVal {
    
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
    def setFont(value: CaptionSettingsIndicatorFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setLocation(value: CaptionSettingsIndicatorLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setSymbol(value: CaptionSettingsIndicatorSymbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
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
    
    @scala.inline
    def setTextSpacing(value: Double): Self = this.set("textSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSpacing: Self = this.set("textSpacing", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}

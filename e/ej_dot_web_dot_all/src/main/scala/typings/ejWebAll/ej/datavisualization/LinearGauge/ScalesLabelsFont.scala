package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesLabelsFont extends js.Object {
  
  /** Specifies the fontFamily of font.
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /** Specifies the fontStyle of font.See FontStyle
    * @Default {ej.datavisualization.LinearGauge.FontStyle.Bold}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.native
  
  /** Specifies the size of font.
    * @Default {11px}
    */
  var size: js.UndefOr[String] = js.native
}
object ScalesLabelsFont {
  
  @scala.inline
  def apply(): ScalesLabelsFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesLabelsFont]
  }
  
  @scala.inline
  implicit class ScalesLabelsFontOps[Self <: ScalesLabelsFont] (val x: Self) extends AnyVal {
    
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
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle | String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}

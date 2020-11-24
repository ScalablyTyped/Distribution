package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelSettingsHigherLevelStyleFont extends js.Object {
  
  /** Specifies the label font color. Labels render with the specified font color.
    * @Default {black}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Specifies the label font family. Labels render with the specified font family.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /** Specifies the label font style. Labels render with the specified font style.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[String] = js.native
  
  /** Specifies the label font weight. Labels render with the specified font weight.
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[String] = js.native
  
  /** Specifies the label opacity. Labels render with the specified opacity.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Specifies the label font size. Labels render with the specified font size.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.native
}
object LabelSettingsHigherLevelStyleFont {
  
  @scala.inline
  def apply(): LabelSettingsHigherLevelStyleFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettingsHigherLevelStyleFont]
  }
  
  @scala.inline
  implicit class LabelSettingsHigherLevelStyleFontOps[Self <: LabelSettingsHigherLevelStyleFont] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}

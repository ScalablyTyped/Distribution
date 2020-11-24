package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxesMultiLevelLabelsFont extends js.Object {
  
  /** Font color of the multi level labels text.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Font family of the multi level labels text.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /** Font style of the multi level labels text.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.native
  
  /** Font weight of the multi level label text.
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[String] = js.native
  
  /** Opacity of the multi level label text.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Font size of the multi level label text.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.native
}
object AxesMultiLevelLabelsFont {
  
  @scala.inline
  def apply(): AxesMultiLevelLabelsFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxesMultiLevelLabelsFont]
  }
  
  @scala.inline
  implicit class AxesMultiLevelLabelsFontOps[Self <: AxesMultiLevelLabelsFont] (val x: Self) extends AnyVal {
    
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
    def setFontStyle(value: FontStyle | String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
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

package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelSettingsStyleFont extends js.Object {
  
  /** Specifies the label color. This color is applied to the labels in range navigator.
    * @Default {#333333}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Specifies the label font family. Labels render with the specified font family.
    * @Default {Segoe UI}
    */
  var family: js.UndefOr[String] = js.native
  
  /** Specifies the label font opacity. Labels render with the specified font opacity.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Specifies the label font size. Labels render with the specified font size.
    * @Default {1px}
    */
  var size: js.UndefOr[String] = js.native
  
  /** Specifies the label font style. Labels render with the specified font style..
    * @Default {Normal}
    */
  var style: js.UndefOr[FontStyle | String] = js.native
  
  /** Specifies the label font weight
    * @Default {regular}
    */
  var weight: js.UndefOr[FontWeight | String] = js.native
}
object LabelSettingsStyleFont {
  
  @scala.inline
  def apply(): LabelSettingsStyleFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettingsStyleFont]
  }
  
  @scala.inline
  implicit class LabelSettingsStyleFontOps[Self <: LabelSettingsStyleFont] (val x: Self) extends AnyVal {
    
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
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: FontStyle | String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWeight(value: FontWeight | String): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}

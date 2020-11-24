package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelSettingsHigherLevelGridLineStyle extends js.Object {
  
  /** Specifies the color of grid lines in higher level.
    * @Default {#B5B5B5}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Specifies the dashArray of grid lines in higher level.
    * @Default {20 5 0}
    */
  var dashArray: js.UndefOr[String] = js.native
  
  /** Specifies the width of grid lines in higher level.
    * @Default {#B5B5B5}
    */
  var width: js.UndefOr[String] = js.native
}
object LabelSettingsHigherLevelGridLineStyle {
  
  @scala.inline
  def apply(): LabelSettingsHigherLevelGridLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettingsHigherLevelGridLineStyle]
  }
  
  @scala.inline
  implicit class LabelSettingsHigherLevelGridLineStyleOps[Self <: LabelSettingsHigherLevelGridLineStyle] (val x: Self) extends AnyVal {
    
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
    def setDashArray(value: String): Self = this.set("dashArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashArray: Self = this.set("dashArray", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

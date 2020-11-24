package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorStyleSettingsMajorGridLineStyle extends js.Object {
  
  /** Specifies the color of major grid lines in range navigator.
    * @Default {#B5B5B5}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Toggles the visibility of major grid lines.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object NavigatorStyleSettingsMajorGridLineStyle {
  
  @scala.inline
  def apply(): NavigatorStyleSettingsMajorGridLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorStyleSettingsMajorGridLineStyle]
  }
  
  @scala.inline
  implicit class NavigatorStyleSettingsMajorGridLineStyleOps[Self <: NavigatorStyleSettingsMajorGridLineStyle] (val x: Self) extends AnyVal {
    
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
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}

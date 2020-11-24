package typings.ejWebAll.ej.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerSettingsBorder extends js.Object {
  
  /** Border color of the marker shape.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Controls the opacity of the marker border.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Border width of the marker shape.
    * @Default {null}
    */
  var width: js.UndefOr[Double] = js.native
}
object MarkerSettingsBorder {
  
  @scala.inline
  def apply(): MarkerSettingsBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerSettingsBorder]
  }
  
  @scala.inline
  implicit class MarkerSettingsBorderOps[Self <: MarkerSettingsBorder] (val x: Self) extends AnyVal {
    
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
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

package typings.ejWebAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisLineSettings extends js.Object {
  
  /** Color of the axis line.
    * @Default {'#111111'}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Dash array of the axis line.
    * @Default {1}
    */
  var dashArray: js.UndefOr[Double] = js.native
  
  /** Controls the visibility of the axis.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** Width of the axis line.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}
object AxisLineSettings {
  
  @scala.inline
  def apply(): AxisLineSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLineSettings]
  }
  
  @scala.inline
  implicit class AxisLineSettingsOps[Self <: AxisLineSettings] (val x: Self) extends AnyVal {
    
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
    def setDashArray(value: Double): Self = this.set("dashArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashArray: Self = this.set("dashArray", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

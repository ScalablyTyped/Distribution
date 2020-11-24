package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesRangesBorder extends js.Object {
  
  /** Specifies the border color in the ranges.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Specifies the border width in the ranges.
    * @Default {1.5}
    */
  var width: js.UndefOr[Double] = js.native
}
object ScalesRangesBorder {
  
  @scala.inline
  def apply(): ScalesRangesBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesRangesBorder]
  }
  
  @scala.inline
  implicit class ScalesRangesBorderOps[Self <: ScalesRangesBorder] (val x: Self) extends AnyVal {
    
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
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

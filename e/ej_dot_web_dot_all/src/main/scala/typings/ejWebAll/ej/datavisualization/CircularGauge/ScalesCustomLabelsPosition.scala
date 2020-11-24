package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesCustomLabelsPosition extends js.Object {
  
  /** Specify x-axis position of label
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.native
  
  /** Specify y-axis  position of labels.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.native
}
object ScalesCustomLabelsPosition {
  
  @scala.inline
  def apply(): ScalesCustomLabelsPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesCustomLabelsPosition]
  }
  
  @scala.inline
  implicit class ScalesCustomLabelsPositionOps[Self <: ScalesCustomLabelsPosition] (val x: Self) extends AnyVal {
    
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}

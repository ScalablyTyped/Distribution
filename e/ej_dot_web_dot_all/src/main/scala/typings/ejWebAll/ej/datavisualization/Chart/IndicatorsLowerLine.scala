package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicatorsLowerLine extends js.Object {
  
  /** Color of lower line.
    * @Default {#008000}
    */
  var fill: js.UndefOr[String] = js.native
  
  /** Width of the lower line.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.native
}
object IndicatorsLowerLine {
  
  @scala.inline
  def apply(): IndicatorsLowerLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicatorsLowerLine]
  }
  
  @scala.inline
  implicit class IndicatorsLowerLineOps[Self <: IndicatorsLowerLine] (val x: Self) extends AnyVal {
    
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

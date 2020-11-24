package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicatorsPeriodLine extends js.Object {
  
  /** Color of period line in indicator.
    * @Default {blue}
    */
  var fill: js.UndefOr[String] = js.native
  
  /** Width of the period line in indicators.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.native
}
object IndicatorsPeriodLine {
  
  @scala.inline
  def apply(): IndicatorsPeriodLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicatorsPeriodLine]
  }
  
  @scala.inline
  implicit class IndicatorsPeriodLineOps[Self <: IndicatorsPeriodLine] (val x: Self) extends AnyVal {
    
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

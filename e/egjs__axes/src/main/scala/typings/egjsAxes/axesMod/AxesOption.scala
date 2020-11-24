package typings.egjsAxes.axesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxesOption extends js.Object {
  
  var deceleration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
  
  var interruptable: js.UndefOr[Boolean] = js.native
  
  var maximumDuration: js.UndefOr[Double] = js.native
  
  var minimumDuration: js.UndefOr[Double] = js.native
}
object AxesOption {
  
  @scala.inline
  def apply(): AxesOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxesOption]
  }
  
  @scala.inline
  implicit class AxesOptionOps[Self <: AxesOption] (val x: Self) extends AnyVal {
    
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
    def setDeceleration(value: Double): Self = this.set("deceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeceleration: Self = this.set("deceleration", js.undefined)
    
    @scala.inline
    def setEasing(value: /* x */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setInterruptable(value: Boolean): Self = this.set("interruptable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterruptable: Self = this.set("interruptable", js.undefined)
    
    @scala.inline
    def setMaximumDuration(value: Double): Self = this.set("maximumDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumDuration: Self = this.set("maximumDuration", js.undefined)
    
    @scala.inline
    def setMinimumDuration(value: Double): Self = this.set("minimumDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumDuration: Self = this.set("minimumDuration", js.undefined)
  }
}

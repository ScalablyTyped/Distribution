package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeightIn extends js.Object {
  
  var label: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var weightIn: js.UndefOr[Double] = js.native
  
  var weightOut: js.UndefOr[Double] = js.native
}
object WeightIn {
  
  @scala.inline
  def apply(): WeightIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeightIn]
  }
  
  @scala.inline
  implicit class WeightInOps[Self <: WeightIn] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWeightIn(value: Double): Self = this.set("weightIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightIn: Self = this.set("weightIn", js.undefined)
    
    @scala.inline
    def setWeightOut(value: Double): Self = this.set("weightOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightOut: Self = this.set("weightOut", js.undefined)
  }
}

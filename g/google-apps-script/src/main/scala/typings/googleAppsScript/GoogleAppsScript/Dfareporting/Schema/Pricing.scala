package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pricing extends js.Object {
  
  var capCostType: js.UndefOr[String] = js.native
  
  var endDate: js.UndefOr[String] = js.native
  
  var flights: js.UndefOr[js.Array[Flight]] = js.native
  
  var groupType: js.UndefOr[String] = js.native
  
  var pricingType: js.UndefOr[String] = js.native
  
  var startDate: js.UndefOr[String] = js.native
}
object Pricing {
  
  @scala.inline
  def apply(): Pricing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pricing]
  }
  
  @scala.inline
  implicit class PricingOps[Self <: Pricing] (val x: Self) extends AnyVal {
    
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
    def setCapCostType(value: String): Self = this.set("capCostType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapCostType: Self = this.set("capCostType", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setFlightsVarargs(value: Flight*): Self = this.set("flights", js.Array(value :_*))
    
    @scala.inline
    def setFlights(value: js.Array[Flight]): Self = this.set("flights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlights: Self = this.set("flights", js.undefined)
    
    @scala.inline
    def setGroupType(value: String): Self = this.set("groupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupType: Self = this.set("groupType", js.undefined)
    
    @scala.inline
    def setPricingType(value: String): Self = this.set("pricingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingType: Self = this.set("pricingType", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
}

package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var deliveryCountry: js.UndefOr[String] = js.native
  
  var deliveryTime: js.UndefOr[DeliveryTime] = js.native
  
  var eligibility: js.UndefOr[String] = js.native
  
  var minimumOrderValue: js.UndefOr[Price] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var rateGroups: js.UndefOr[js.Array[RateGroup]] = js.native
}
object Service {
  
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setDeliveryCountry(value: String): Self = this.set("deliveryCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryCountry: Self = this.set("deliveryCountry", js.undefined)
    
    @scala.inline
    def setDeliveryTime(value: DeliveryTime): Self = this.set("deliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryTime: Self = this.set("deliveryTime", js.undefined)
    
    @scala.inline
    def setEligibility(value: String): Self = this.set("eligibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEligibility: Self = this.set("eligibility", js.undefined)
    
    @scala.inline
    def setMinimumOrderValue(value: Price): Self = this.set("minimumOrderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumOrderValue: Self = this.set("minimumOrderValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRateGroupsVarargs(value: RateGroup*): Self = this.set("rateGroups", js.Array(value :_*))
    
    @scala.inline
    def setRateGroups(value: js.Array[RateGroup]): Self = this.set("rateGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateGroups: Self = this.set("rateGroups", js.undefined)
  }
}

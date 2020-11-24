package typings.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaseInfo extends js.Object {
  
  var durationInSecs: js.UndefOr[Double] = js.native
  
  var evictionTimestamp: js.UndefOr[Double] = js.native
  
  var lastRenewalTimestamp: js.UndefOr[Double] = js.native
  
  var registrationTimestamp: js.UndefOr[Double] = js.native
  
  var renewalIntervalInSecs: js.UndefOr[Double] = js.native
  
  var serviceUpTimestamp: js.UndefOr[Double] = js.native
}
object LeaseInfo {
  
  @scala.inline
  def apply(): LeaseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseInfo]
  }
  
  @scala.inline
  implicit class LeaseInfoOps[Self <: LeaseInfo] (val x: Self) extends AnyVal {
    
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
    def setDurationInSecs(value: Double): Self = this.set("durationInSecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationInSecs: Self = this.set("durationInSecs", js.undefined)
    
    @scala.inline
    def setEvictionTimestamp(value: Double): Self = this.set("evictionTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvictionTimestamp: Self = this.set("evictionTimestamp", js.undefined)
    
    @scala.inline
    def setLastRenewalTimestamp(value: Double): Self = this.set("lastRenewalTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRenewalTimestamp: Self = this.set("lastRenewalTimestamp", js.undefined)
    
    @scala.inline
    def setRegistrationTimestamp(value: Double): Self = this.set("registrationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistrationTimestamp: Self = this.set("registrationTimestamp", js.undefined)
    
    @scala.inline
    def setRenewalIntervalInSecs(value: Double): Self = this.set("renewalIntervalInSecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalIntervalInSecs: Self = this.set("renewalIntervalInSecs", js.undefined)
    
    @scala.inline
    def setServiceUpTimestamp(value: Double): Self = this.set("serviceUpTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUpTimestamp: Self = this.set("serviceUpTimestamp", js.undefined)
  }
}

package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DowngradeBillingPlanInformation extends js.Object {
  
  var downgradeEventType: js.UndefOr[String] = js.native
  
  /**
    * An object used to identify the features and attributes of the account being created.
    */
  var planInformation: js.UndefOr[
    /* An object used to identify the features and attributes of the account being created. */ PlanInformation
  ] = js.native
}
object DowngradeBillingPlanInformation {
  
  @scala.inline
  def apply(): DowngradeBillingPlanInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DowngradeBillingPlanInformation]
  }
  
  @scala.inline
  implicit class DowngradeBillingPlanInformationOps[Self <: DowngradeBillingPlanInformation] (val x: Self) extends AnyVal {
    
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
    def setDowngradeEventType(value: String): Self = this.set("downgradeEventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDowngradeEventType: Self = this.set("downgradeEventType", js.undefined)
    
    @scala.inline
    def setPlanInformation(
      value: /* An object used to identify the features and attributes of the account being created. */ PlanInformation
    ): Self = this.set("planInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanInformation: Self = this.set("planInformation", js.undefined)
  }
}

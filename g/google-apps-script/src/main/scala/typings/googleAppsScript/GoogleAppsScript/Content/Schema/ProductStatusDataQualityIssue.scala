package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductStatusDataQualityIssue extends js.Object {
  
  var destination: js.UndefOr[String] = js.native
  
  var detail: js.UndefOr[String] = js.native
  
  var fetchStatus: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var severity: js.UndefOr[String] = js.native
  
  var timestamp: js.UndefOr[String] = js.native
  
  var valueOnLandingPage: js.UndefOr[String] = js.native
  
  var valueProvided: js.UndefOr[String] = js.native
}
object ProductStatusDataQualityIssue {
  
  @scala.inline
  def apply(): ProductStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductStatusDataQualityIssue]
  }
  
  @scala.inline
  implicit class ProductStatusDataQualityIssueOps[Self <: ProductStatusDataQualityIssue] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setFetchStatus(value: String): Self = this.set("fetchStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchStatus: Self = this.set("fetchStatus", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setValueOnLandingPage(value: String): Self = this.set("valueOnLandingPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueOnLandingPage: Self = this.set("valueOnLandingPage", js.undefined)
    
    @scala.inline
    def setValueProvided(value: String): Self = this.set("valueProvided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueProvided: Self = this.set("valueProvided", js.undefined)
  }
}

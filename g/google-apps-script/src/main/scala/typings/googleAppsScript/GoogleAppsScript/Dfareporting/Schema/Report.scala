package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Report extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var criteria: js.UndefOr[ReportCriteria] = js.native
  
  var crossDimensionReachCriteria: js.UndefOr[ReportCrossDimensionReachCriteria] = js.native
  
  var delivery: js.UndefOr[ReportDelivery] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var floodlightCriteria: js.UndefOr[ReportFloodlightCriteria] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var lastModifiedTime: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var ownerProfileId: js.UndefOr[String] = js.native
  
  var pathToConversionCriteria: js.UndefOr[ReportPathToConversionCriteria] = js.native
  
  var reachCriteria: js.UndefOr[ReportReachCriteria] = js.native
  
  var schedule: js.UndefOr[ReportSchedule] = js.native
  
  var subAccountId: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Report {
  
  @scala.inline
  def apply(): Report = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Report]
  }
  
  @scala.inline
  implicit class ReportOps[Self <: Report] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setCriteria(value: ReportCriteria): Self = this.set("criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    
    @scala.inline
    def setCrossDimensionReachCriteria(value: ReportCrossDimensionReachCriteria): Self = this.set("crossDimensionReachCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossDimensionReachCriteria: Self = this.set("crossDimensionReachCriteria", js.undefined)
    
    @scala.inline
    def setDelivery(value: ReportDelivery): Self = this.set("delivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelivery: Self = this.set("delivery", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setFloodlightCriteria(value: ReportFloodlightCriteria): Self = this.set("floodlightCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightCriteria: Self = this.set("floodlightCriteria", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwnerProfileId(value: String): Self = this.set("ownerProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerProfileId: Self = this.set("ownerProfileId", js.undefined)
    
    @scala.inline
    def setPathToConversionCriteria(value: ReportPathToConversionCriteria): Self = this.set("pathToConversionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathToConversionCriteria: Self = this.set("pathToConversionCriteria", js.undefined)
    
    @scala.inline
    def setReachCriteria(value: ReportReachCriteria): Self = this.set("reachCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReachCriteria: Self = this.set("reachCriteria", js.undefined)
    
    @scala.inline
    def setSchedule(value: ReportSchedule): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setSubAccountId(value: String): Self = this.set("subAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubAccountId: Self = this.set("subAccountId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

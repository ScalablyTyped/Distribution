package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsampledReportDriveDownloadDetails extends js.Object {
  
  var documentId: js.UndefOr[String] = js.native
}
object UnsampledReportDriveDownloadDetails {
  
  @scala.inline
  def apply(): UnsampledReportDriveDownloadDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsampledReportDriveDownloadDetails]
  }
  
  @scala.inline
  implicit class UnsampledReportDriveDownloadDetailsOps[Self <: UnsampledReportDriveDownloadDetails] (val x: Self) extends AnyVal {
    
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
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
  }
}

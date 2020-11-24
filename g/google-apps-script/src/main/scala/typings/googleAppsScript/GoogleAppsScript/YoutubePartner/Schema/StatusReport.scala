package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusReport extends js.Object {
  
  var statusContent: js.UndefOr[String] = js.native
  
  var statusFileName: js.UndefOr[String] = js.native
}
object StatusReport {
  
  @scala.inline
  def apply(): StatusReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusReport]
  }
  
  @scala.inline
  implicit class StatusReportOps[Self <: StatusReport] (val x: Self) extends AnyVal {
    
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
    def setStatusContent(value: String): Self = this.set("statusContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusContent: Self = this.set("statusContent", js.undefined)
    
    @scala.inline
    def setStatusFileName(value: String): Self = this.set("statusFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusFileName: Self = this.set("statusFileName", js.undefined)
  }
}

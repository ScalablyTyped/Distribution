package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportSavedEventArgs extends js.Object {
  
  /** Specifies whether report opened from device or server.
    */
  var isServerReport: js.UndefOr[Boolean] = js.native
  
  /** States whether report is downloaded from ReportServer.
    */
  var reportAction: js.UndefOr[String] = js.native
}
object ReportSavedEventArgs {
  
  @scala.inline
  def apply(): ReportSavedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportSavedEventArgs]
  }
  
  @scala.inline
  implicit class ReportSavedEventArgsOps[Self <: ReportSavedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setIsServerReport(value: Boolean): Self = this.set("isServerReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsServerReport: Self = this.set("isServerReport", js.undefined)
    
    @scala.inline
    def setReportAction(value: String): Self = this.set("reportAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportAction: Self = this.set("reportAction", js.undefined)
  }
}

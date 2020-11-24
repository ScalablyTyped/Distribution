package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportModifiedEventArgs extends js.Object {
  
  /** Specifies whether the report is modified or not.
    */
  var isModified: js.UndefOr[Boolean] = js.native
  
  /** Name of Opened Report.
    */
  var reportName: js.UndefOr[String] = js.native
}
object ReportModifiedEventArgs {
  
  @scala.inline
  def apply(): ReportModifiedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportModifiedEventArgs]
  }
  
  @scala.inline
  implicit class ReportModifiedEventArgsOps[Self <: ReportModifiedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setIsModified(value: Boolean): Self = this.set("isModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsModified: Self = this.set("isModified", js.undefined)
    
    @scala.inline
    def setReportName(value: String): Self = this.set("reportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportName: Self = this.set("reportName", js.undefined)
  }
}

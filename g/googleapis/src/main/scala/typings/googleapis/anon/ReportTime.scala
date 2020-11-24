package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportTime extends js.Object {
  
  var reportTime: js.UndefOr[String] = js.native
  
  var systemRamFreeInfo: js.UndefOr[js.Array[String]] = js.native
}
object ReportTime {
  
  @scala.inline
  def apply(): ReportTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportTime]
  }
  
  @scala.inline
  implicit class ReportTimeOps[Self <: ReportTime] (val x: Self) extends AnyVal {
    
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
    def setReportTime(value: String): Self = this.set("reportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportTime: Self = this.set("reportTime", js.undefined)
    
    @scala.inline
    def setSystemRamFreeInfoVarargs(value: String*): Self = this.set("systemRamFreeInfo", js.Array(value :_*))
    
    @scala.inline
    def setSystemRamFreeInfo(value: js.Array[String]): Self = this.set("systemRamFreeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemRamFreeInfo: Self = this.set("systemRamFreeInfo", js.undefined)
  }
}

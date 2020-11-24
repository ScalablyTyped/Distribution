package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiRequestLogsResult extends js.Object {
  
  /**
    * Reserved: TBD
    */
  var apiRequestLogs: js.UndefOr[js.Array[/* Contains API request log information. */ ApiRequestLog]] = js.native
}
object ApiRequestLogsResult {
  
  @scala.inline
  def apply(): ApiRequestLogsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiRequestLogsResult]
  }
  
  @scala.inline
  implicit class ApiRequestLogsResultOps[Self <: ApiRequestLogsResult] (val x: Self) extends AnyVal {
    
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
    def setApiRequestLogsVarargs(value: (/* Contains API request log information. */ ApiRequestLog)*): Self = this.set("apiRequestLogs", js.Array(value :_*))
    
    @scala.inline
    def setApiRequestLogs(value: js.Array[/* Contains API request log information. */ ApiRequestLog]): Self = this.set("apiRequestLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiRequestLogs: Self = this.set("apiRequestLogs", js.undefined)
  }
}

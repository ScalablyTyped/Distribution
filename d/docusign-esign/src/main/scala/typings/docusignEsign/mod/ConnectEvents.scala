package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectEvents extends js.Object {
  
  /**
    * A list of Connect failure logs.
    */
  var failures: js.UndefOr[js.Array[/* Contains information about a Connect log entry. */ ConnectLog]] = js.native
  
  /**
    * A list of Connect general logs.
    */
  var logs: js.UndefOr[js.Array[/* Contains information about a Connect log entry. */ ConnectLog]] = js.native
  
  /**
    * The count of records in the log list.
    */
  var totalRecords: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ConnectEvents {
  
  @scala.inline
  def apply(): ConnectEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectEvents]
  }
  
  @scala.inline
  implicit class ConnectEventsOps[Self <: ConnectEvents] (val x: Self) extends AnyVal {
    
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
    def setFailuresVarargs(value: (/* Contains information about a Connect log entry. */ ConnectLog)*): Self = this.set("failures", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: js.Array[/* Contains information about a Connect log entry. */ ConnectLog]): Self = this.set("failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailures: Self = this.set("failures", js.undefined)
    
    @scala.inline
    def setLogsVarargs(value: (/* Contains information about a Connect log entry. */ ConnectLog)*): Self = this.set("logs", js.Array(value :_*))
    
    @scala.inline
    def setLogs(value: js.Array[/* Contains information about a Connect log entry. */ ConnectLog]): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogs: Self = this.set("logs", js.undefined)
    
    @scala.inline
    def setTotalRecords(value: String): Self = this.set("totalRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRecords: Self = this.set("totalRecords", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

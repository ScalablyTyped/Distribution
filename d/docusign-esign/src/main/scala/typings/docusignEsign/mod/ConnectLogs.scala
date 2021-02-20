package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectLogs extends StObject {
  
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
object ConnectLogs {
  
  @scala.inline
  def apply(): ConnectLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectLogs]
  }
  
  @scala.inline
  implicit class ConnectLogsMutableBuilder[Self <: ConnectLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: js.Array[/* Contains information about a Connect log entry. */ ConnectLog]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: (/* Contains information about a Connect log entry. */ ConnectLog)*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    @scala.inline
    def setLogs(value: js.Array[/* Contains information about a Connect log entry. */ ConnectLog]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
    
    @scala.inline
    def setLogsVarargs(value: (/* Contains information about a Connect log entry. */ ConnectLog)*): Self = StObject.set(x, "logs", js.Array(value :_*))
    
    @scala.inline
    def setTotalRecords(value: String): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

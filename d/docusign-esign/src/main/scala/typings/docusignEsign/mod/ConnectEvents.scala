package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectEvents extends StObject {
  
  /**
    * A list of Connect failure logs.
    */
  var failures: js.UndefOr[js.Array[/* Contains information about a Connect log entry. */ ConnectLog]] = js.undefined
  
  /**
    * A list of Connect general logs.
    */
  var logs: js.UndefOr[js.Array[/* Contains information about a Connect log entry. */ ConnectLog]] = js.undefined
  
  /**
    * The count of records in the log list.
    */
  var totalRecords: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ConnectEvents {
  
  inline def apply(): ConnectEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectEvents] (val x: Self) extends AnyVal {
    
    inline def setFailures(value: js.Array[/* Contains information about a Connect log entry. */ ConnectLog]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: (/* Contains information about a Connect log entry. */ ConnectLog)*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setLogs(value: js.Array[/* Contains information about a Connect log entry. */ ConnectLog]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    inline def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
    
    inline def setLogsVarargs(value: (/* Contains information about a Connect log entry. */ ConnectLog)*): Self = StObject.set(x, "logs", js.Array(value*))
    
    inline def setTotalRecords(value: String): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
    
    inline def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

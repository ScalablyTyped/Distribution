package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1NetworkDiagnosticsReport extends StObject {
  
  /**
    * Output only. HTTPS latency test data.
    */
  var httpsLatencyData: js.UndefOr[SchemaGoogleChromeManagementV1HttpsLatencyRoutineData] = js.undefined
  
  /**
    * Output only. Timestamp of when the diagnostics were collected.
    */
  var reportTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1NetworkDiagnosticsReport {
  
  inline def apply(): SchemaGoogleChromeManagementV1NetworkDiagnosticsReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1NetworkDiagnosticsReport]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1NetworkDiagnosticsReport](x: Self) {
    
    inline def setHttpsLatencyData(value: SchemaGoogleChromeManagementV1HttpsLatencyRoutineData): Self = StObject.set(x, "httpsLatencyData", value.asInstanceOf[js.Any])
    
    inline def setHttpsLatencyDataUndefined: Self = StObject.set(x, "httpsLatencyData", js.undefined)
    
    inline def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    inline def setReportTimeNull: Self = StObject.set(x, "reportTime", null)
    
    inline def setReportTimeUndefined: Self = StObject.set(x, "reportTime", js.undefined)
  }
}

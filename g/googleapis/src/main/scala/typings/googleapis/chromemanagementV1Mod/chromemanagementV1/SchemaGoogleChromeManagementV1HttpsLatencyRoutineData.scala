package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1HttpsLatencyRoutineData extends StObject {
  
  /**
    * Output only. HTTPS latency if routine succeeded or failed because of HIGH_LATENCY or VERY_HIGH_LATENCY.
    */
  var latency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. HTTPS latency routine problem if a problem occurred.
    */
  var problem: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1HttpsLatencyRoutineData {
  
  inline def apply(): SchemaGoogleChromeManagementV1HttpsLatencyRoutineData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1HttpsLatencyRoutineData]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1HttpsLatencyRoutineData](x: Self) {
    
    inline def setLatency(value: String): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setLatencyNull: Self = StObject.set(x, "latency", null)
    
    inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    inline def setProblem(value: String): Self = StObject.set(x, "problem", value.asInstanceOf[js.Any])
    
    inline def setProblemNull: Self = StObject.set(x, "problem", null)
    
    inline def setProblemUndefined: Self = StObject.set(x, "problem", js.undefined)
  }
}

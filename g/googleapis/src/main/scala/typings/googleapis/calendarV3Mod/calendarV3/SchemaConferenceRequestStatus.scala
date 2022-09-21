package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConferenceRequestStatus extends StObject {
  
  /**
    * The current status of the conference create request. Read-only.
    * The possible values are:
    * - "pending": the conference create request is still being processed.
    * - "success": the conference create request succeeded, the entry points are populated.
    * - "failure": the conference create request failed, there are no entry points.
    */
  var statusCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaConferenceRequestStatus {
  
  inline def apply(): SchemaConferenceRequestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceRequestStatus]
  }
  
  extension [Self <: SchemaConferenceRequestStatus](x: Self) {
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeNull: Self = StObject.set(x, "statusCode", null)
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}

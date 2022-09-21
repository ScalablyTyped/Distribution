package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAbuseReportingConfig extends StObject {
  
  /**
    * Whether the current call may include video recordings in its abuse reports.
    */
  var recordingAllowed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the current call may include user generated content (chat, polls, Q&A...) in its abuse reports.
    */
  var writtenUgcAllowed: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAbuseReportingConfig {
  
  inline def apply(): SchemaAbuseReportingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAbuseReportingConfig]
  }
  
  extension [Self <: SchemaAbuseReportingConfig](x: Self) {
    
    inline def setRecordingAllowed(value: Boolean): Self = StObject.set(x, "recordingAllowed", value.asInstanceOf[js.Any])
    
    inline def setRecordingAllowedNull: Self = StObject.set(x, "recordingAllowed", null)
    
    inline def setRecordingAllowedUndefined: Self = StObject.set(x, "recordingAllowed", js.undefined)
    
    inline def setWrittenUgcAllowed(value: Boolean): Self = StObject.set(x, "writtenUgcAllowed", value.asInstanceOf[js.Any])
    
    inline def setWrittenUgcAllowedNull: Self = StObject.set(x, "writtenUgcAllowed", null)
    
    inline def setWrittenUgcAllowedUndefined: Self = StObject.set(x, "writtenUgcAllowed", js.undefined)
  }
}

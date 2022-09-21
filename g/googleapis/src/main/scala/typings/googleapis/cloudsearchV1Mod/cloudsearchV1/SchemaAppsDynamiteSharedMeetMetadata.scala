package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedMeetMetadata extends StObject {
  
  /**
    * Required. A globally unique code (e.g. "cxv-zbgj-wzw") that points to a meeting space. Note: Meeting codes may be regenerated, which will cause old meeting codes to become invalid.
    */
  var meetingCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A URL, in the format "https://meet.google.com/x" (e.g. https://meet.google.com/cxv-zbgj-wzw), to identify and access the meeting space.
    */
  var meetingUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedMeetMetadata {
  
  inline def apply(): SchemaAppsDynamiteSharedMeetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedMeetMetadata]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedMeetMetadata](x: Self) {
    
    inline def setMeetingCode(value: String): Self = StObject.set(x, "meetingCode", value.asInstanceOf[js.Any])
    
    inline def setMeetingCodeNull: Self = StObject.set(x, "meetingCode", null)
    
    inline def setMeetingCodeUndefined: Self = StObject.set(x, "meetingCode", js.undefined)
    
    inline def setMeetingUrl(value: String): Self = StObject.set(x, "meetingUrl", value.asInstanceOf[js.Any])
    
    inline def setMeetingUrlNull: Self = StObject.set(x, "meetingUrl", null)
    
    inline def setMeetingUrlUndefined: Self = StObject.set(x, "meetingUrl", js.undefined)
  }
}

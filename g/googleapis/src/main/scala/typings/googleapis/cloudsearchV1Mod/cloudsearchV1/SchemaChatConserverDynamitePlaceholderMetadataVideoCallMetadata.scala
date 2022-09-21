package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChatConserverDynamitePlaceholderMetadataVideoCallMetadata extends StObject {
  
  var meetingUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaChatConserverDynamitePlaceholderMetadataVideoCallMetadata {
  
  inline def apply(): SchemaChatConserverDynamitePlaceholderMetadataVideoCallMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChatConserverDynamitePlaceholderMetadataVideoCallMetadata]
  }
  
  extension [Self <: SchemaChatConserverDynamitePlaceholderMetadataVideoCallMetadata](x: Self) {
    
    inline def setMeetingUrl(value: String): Self = StObject.set(x, "meetingUrl", value.asInstanceOf[js.Any])
    
    inline def setMeetingUrlNull: Self = StObject.set(x, "meetingUrl", null)
    
    inline def setMeetingUrlUndefined: Self = StObject.set(x, "meetingUrl", js.undefined)
  }
}

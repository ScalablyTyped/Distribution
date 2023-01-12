package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedStorageReportingMetadata extends StObject {
  
  var eventType: String
  
  var reportingUrl: String
}
object SharedStorageReportingMetadata {
  
  inline def apply(eventType: String, reportingUrl: String): SharedStorageReportingMetadata = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], reportingUrl = reportingUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStorageReportingMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedStorageReportingMetadata] (val x: Self) extends AnyVal {
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setReportingUrl(value: String): Self = StObject.set(x, "reportingUrl", value.asInstanceOf[js.Any])
  }
}

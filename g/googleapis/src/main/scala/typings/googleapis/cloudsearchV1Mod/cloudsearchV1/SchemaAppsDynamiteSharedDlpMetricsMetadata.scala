package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedDlpMetricsMetadata extends StObject {
  
  /**
    * [required] Describes the DLP status of message send and attachment upload events.
    */
  var dlpStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedDlpMetricsMetadata {
  
  inline def apply(): SchemaAppsDynamiteSharedDlpMetricsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedDlpMetricsMetadata]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedDlpMetricsMetadata](x: Self) {
    
    inline def setDlpStatus(value: String): Self = StObject.set(x, "dlpStatus", value.asInstanceOf[js.Any])
    
    inline def setDlpStatusNull: Self = StObject.set(x, "dlpStatus", null)
    
    inline def setDlpStatusUndefined: Self = StObject.set(x, "dlpStatus", js.undefined)
  }
}

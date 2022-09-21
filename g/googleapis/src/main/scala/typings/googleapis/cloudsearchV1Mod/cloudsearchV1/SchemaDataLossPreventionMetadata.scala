package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataLossPreventionMetadata extends StObject {
  
  /**
    * The DLP scan summary that should only be set after the message is scanned in the Chat backend.
    */
  var dlpScanSummary: js.UndefOr[SchemaDlpScanSummary] = js.undefined
  
  /**
    * Flag set by client on message resend to bypass WARN violation.
    */
  var warnAcknowledged: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDataLossPreventionMetadata {
  
  inline def apply(): SchemaDataLossPreventionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataLossPreventionMetadata]
  }
  
  extension [Self <: SchemaDataLossPreventionMetadata](x: Self) {
    
    inline def setDlpScanSummary(value: SchemaDlpScanSummary): Self = StObject.set(x, "dlpScanSummary", value.asInstanceOf[js.Any])
    
    inline def setDlpScanSummaryUndefined: Self = StObject.set(x, "dlpScanSummary", js.undefined)
    
    inline def setWarnAcknowledged(value: Boolean): Self = StObject.set(x, "warnAcknowledged", value.asInstanceOf[js.Any])
    
    inline def setWarnAcknowledgedNull: Self = StObject.set(x, "warnAcknowledged", null)
    
    inline def setWarnAcknowledgedUndefined: Self = StObject.set(x, "warnAcknowledged", js.undefined)
  }
}

package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopePurgeConfiguration extends StObject {
  
  /**
    * When set to **true**, purging is enabled.
    */
  var purgeEnvelopes: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the system also redacts personally identifiable information (PII).
    *
    * **Note**: To redact PII, you must also set the property `removeTabsAndEnvelopeAttachments` to **true**.
    */
  var redactPII: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the system also purges the tabs and attachments associated with the envelopes.
    */
  var removeTabsAndEnvelopeAttachments: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days to retain envelope documents before purging them. This value must be a number between `0` and `999`.
    */
  var retentionDays: js.UndefOr[String] = js.undefined
}
object EnvelopePurgeConfiguration {
  
  inline def apply(): EnvelopePurgeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopePurgeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvelopePurgeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setPurgeEnvelopes(value: String): Self = StObject.set(x, "purgeEnvelopes", value.asInstanceOf[js.Any])
    
    inline def setPurgeEnvelopesUndefined: Self = StObject.set(x, "purgeEnvelopes", js.undefined)
    
    inline def setRedactPII(value: String): Self = StObject.set(x, "redactPII", value.asInstanceOf[js.Any])
    
    inline def setRedactPIIUndefined: Self = StObject.set(x, "redactPII", js.undefined)
    
    inline def setRemoveTabsAndEnvelopeAttachments(value: String): Self = StObject.set(x, "removeTabsAndEnvelopeAttachments", value.asInstanceOf[js.Any])
    
    inline def setRemoveTabsAndEnvelopeAttachmentsUndefined: Self = StObject.set(x, "removeTabsAndEnvelopeAttachments", js.undefined)
    
    inline def setRetentionDays(value: String): Self = StObject.set(x, "retentionDays", value.asInstanceOf[js.Any])
    
    inline def setRetentionDaysUndefined: Self = StObject.set(x, "retentionDays", js.undefined)
  }
}

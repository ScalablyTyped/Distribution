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
  
  @scala.inline
  def apply(): EnvelopePurgeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopePurgeConfiguration]
  }
  
  @scala.inline
  implicit class EnvelopePurgeConfigurationMutableBuilder[Self <: EnvelopePurgeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPurgeEnvelopes(value: String): Self = StObject.set(x, "purgeEnvelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurgeEnvelopesUndefined: Self = StObject.set(x, "purgeEnvelopes", js.undefined)
    
    @scala.inline
    def setRedactPII(value: String): Self = StObject.set(x, "redactPII", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactPIIUndefined: Self = StObject.set(x, "redactPII", js.undefined)
    
    @scala.inline
    def setRemoveTabsAndEnvelopeAttachments(value: String): Self = StObject.set(x, "removeTabsAndEnvelopeAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveTabsAndEnvelopeAttachmentsUndefined: Self = StObject.set(x, "removeTabsAndEnvelopeAttachments", js.undefined)
    
    @scala.inline
    def setRetentionDays(value: String): Self = StObject.set(x, "retentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionDaysUndefined: Self = StObject.set(x, "retentionDays", js.undefined)
  }
}

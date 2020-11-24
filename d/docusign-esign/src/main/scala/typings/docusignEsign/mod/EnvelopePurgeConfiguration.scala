package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopePurgeConfiguration extends js.Object {
  
  /**
    * When set to **true**, purging is enabled.
    */
  var purgeEnvelopes: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the system also redacts personally identifiable information (PII).
    *
    * **Note**: To redact PII, you must also set the property `removeTabsAndEnvelopeAttachments` to **true**.
    */
  var redactPII: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the system also purges the tabs and attachments associated with the envelopes.
    */
  var removeTabsAndEnvelopeAttachments: js.UndefOr[String] = js.native
  
  /**
    * The number of days to retain envelope documents before purging them. This value must be a number between `0` and `999`.
    */
  var retentionDays: js.UndefOr[String] = js.native
}
object EnvelopePurgeConfiguration {
  
  @scala.inline
  def apply(): EnvelopePurgeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopePurgeConfiguration]
  }
  
  @scala.inline
  implicit class EnvelopePurgeConfigurationOps[Self <: EnvelopePurgeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPurgeEnvelopes(value: String): Self = this.set("purgeEnvelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurgeEnvelopes: Self = this.set("purgeEnvelopes", js.undefined)
    
    @scala.inline
    def setRedactPII(value: String): Self = this.set("redactPII", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedactPII: Self = this.set("redactPII", js.undefined)
    
    @scala.inline
    def setRemoveTabsAndEnvelopeAttachments(value: String): Self = this.set("removeTabsAndEnvelopeAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveTabsAndEnvelopeAttachments: Self = this.set("removeTabsAndEnvelopeAttachments", js.undefined)
    
    @scala.inline
    def setRetentionDays(value: String): Self = this.set("retentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionDays: Self = this.set("retentionDays", js.undefined)
  }
}

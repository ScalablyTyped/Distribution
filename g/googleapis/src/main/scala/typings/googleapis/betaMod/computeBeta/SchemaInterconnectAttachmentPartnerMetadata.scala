package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Informational metadata about Partner attachments from Partners to display
  * to customers. These fields are propagated from PARTNER_PROVIDER attachments
  * to their corresponding PARTNER attachments.
  */
@js.native
trait SchemaInterconnectAttachmentPartnerMetadata extends js.Object {
  /**
    * Plain text name of the Interconnect this attachment is connected to, as
    * displayed in the Partner?s portal. For instance &quot;Chicago 1&quot;.
    * This value may be validated to match approved Partner values.
    */
  var interconnectName: js.UndefOr[String] = js.native
  /**
    * Plain text name of the Partner providing this attachment. This value may
    * be validated to match approved Partner values.
    */
  var partnerName: js.UndefOr[String] = js.native
  /**
    * URL of the Partner?s portal for this Attachment. Partners may customise
    * this to be a deep-link to the specific resource on the Partner portal.
    * This value may be validated to match approved Partner values.
    */
  var portalUrl: js.UndefOr[String] = js.native
}

object SchemaInterconnectAttachmentPartnerMetadata {
  @scala.inline
  def apply(interconnectName: String = null, partnerName: String = null, portalUrl: String = null): SchemaInterconnectAttachmentPartnerMetadata = {
    val __obj = js.Dynamic.literal()
    if (interconnectName != null) __obj.updateDynamic("interconnectName")(interconnectName.asInstanceOf[js.Any])
    if (partnerName != null) __obj.updateDynamic("partnerName")(partnerName.asInstanceOf[js.Any])
    if (portalUrl != null) __obj.updateDynamic("portalUrl")(portalUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterconnectAttachmentPartnerMetadata]
  }
}


package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Informational metadata about Partner attachments from Partners to display
  * to customers. These fields are propagated from PARTNER_PROVIDER attachments
  * to their corresponding PARTNER attachments.
  */
trait SchemaInterconnectAttachmentPartnerMetadata extends StObject {
  
  /**
    * Plain text name of the Interconnect this attachment is connected to, as
    * displayed in the Partner?s portal. For instance &quot;Chicago 1&quot;.
    * This value may be validated to match approved Partner values.
    */
  var interconnectName: js.UndefOr[String] = js.undefined
  
  /**
    * Plain text name of the Partner providing this attachment. This value may
    * be validated to match approved Partner values.
    */
  var partnerName: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the Partner?s portal for this Attachment. Partners may customise
    * this to be a deep-link to the specific resource on the Partner portal.
    * This value may be validated to match approved Partner values.
    */
  var portalUrl: js.UndefOr[String] = js.undefined
}
object SchemaInterconnectAttachmentPartnerMetadata {
  
  inline def apply(): SchemaInterconnectAttachmentPartnerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectAttachmentPartnerMetadata]
  }
  
  extension [Self <: SchemaInterconnectAttachmentPartnerMetadata](x: Self) {
    
    inline def setInterconnectName(value: String): Self = StObject.set(x, "interconnectName", value.asInstanceOf[js.Any])
    
    inline def setInterconnectNameUndefined: Self = StObject.set(x, "interconnectName", js.undefined)
    
    inline def setPartnerName(value: String): Self = StObject.set(x, "partnerName", value.asInstanceOf[js.Any])
    
    inline def setPartnerNameUndefined: Self = StObject.set(x, "partnerName", js.undefined)
    
    inline def setPortalUrl(value: String): Self = StObject.set(x, "portalUrl", value.asInstanceOf[js.Any])
    
    inline def setPortalUrlUndefined: Self = StObject.set(x, "portalUrl", js.undefined)
  }
}

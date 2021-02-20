package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientUpdateResponse extends StObject {
  
  /**
    * When you use the query parameter `combine_same_order_recipients` on the PUT Recipients call, the `recipientUpdateResponse` returns this property.
    * When set to **true**, it indicates that the recipient has been combined or merged with a matching recipient. Recipient matching occurs as part of template matching,
    * and is based on Recipient Role and Routing Order.
    */
  var combined: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * A local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId` must be
    * unique, but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.native
  
  /**
    * The globally-unique identifier (GUID) for a specific recipient on a specific envelope. If the same recipient is associated with multiple envelopes,
    * they will have a different GUID for each one. Read only.
    */
  var recipientIdGuid: js.UndefOr[String] = js.native
  
  /**
    * All of the tabs associated with the recipient.
    */
  var tabs: js.UndefOr[EnvelopeRecipientTabs] = js.native
}
object RecipientUpdateResponse {
  
  @scala.inline
  def apply(): RecipientUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientUpdateResponse]
  }
  
  @scala.inline
  implicit class RecipientUpdateResponseMutableBuilder[Self <: RecipientUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCombined(value: String): Self = StObject.set(x, "combined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombinedUndefined: Self = StObject.set(x, "combined", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdGuid(value: String): Self = StObject.set(x, "recipientIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdGuidUndefined: Self = StObject.set(x, "recipientIdGuid", js.undefined)
    
    @scala.inline
    def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
    
    @scala.inline
    def setTabs(value: EnvelopeRecipientTabs): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
  }
}

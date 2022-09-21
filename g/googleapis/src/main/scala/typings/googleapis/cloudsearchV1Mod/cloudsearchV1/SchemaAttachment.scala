package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttachment extends StObject {
  
  /**
    * Revised version of Gmail AddOn attachment approved by API design review.
    */
  var addOnData: js.UndefOr[SchemaGoogleChatV1ContextualAddOnMarkup] = js.undefined
  
  /**
    * The userId for the bot/app that created this data, to be used for attribution of attachments when the attachment was not created by the message sender.
    */
  var appId: js.UndefOr[SchemaUserId] = js.undefined
  
  /**
    * To identify an attachment within repeated in a message
    */
  var attachmentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Card AddOn attachment with the possibility for specifying editable widgets.
    */
  var cardAddOnData: js.UndefOr[SchemaAppsDynamiteSharedCard] = js.undefined
  
  /**
    * Deprecated version of Gmail AddOn attachment.
    */
  var deprecatedAddOnData: js.UndefOr[SchemaContextualAddOnMarkup] = js.undefined
  
  /**
    * Slack attachment.
    */
  var slackData: js.UndefOr[SchemaAppsDynamiteV1ApiCompatV1Attachment] = js.undefined
  
  /**
    * The height of image url as fetched by fife. This field is asynchronously filled.
    */
  var slackDataImageUrlHeight: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAttachment {
  
  inline def apply(): SchemaAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachment]
  }
  
  extension [Self <: SchemaAttachment](x: Self) {
    
    inline def setAddOnData(value: SchemaGoogleChatV1ContextualAddOnMarkup): Self = StObject.set(x, "addOnData", value.asInstanceOf[js.Any])
    
    inline def setAddOnDataUndefined: Self = StObject.set(x, "addOnData", js.undefined)
    
    inline def setAppId(value: SchemaUserId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdNull: Self = StObject.set(x, "attachmentId", null)
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    inline def setCardAddOnData(value: SchemaAppsDynamiteSharedCard): Self = StObject.set(x, "cardAddOnData", value.asInstanceOf[js.Any])
    
    inline def setCardAddOnDataUndefined: Self = StObject.set(x, "cardAddOnData", js.undefined)
    
    inline def setDeprecatedAddOnData(value: SchemaContextualAddOnMarkup): Self = StObject.set(x, "deprecatedAddOnData", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedAddOnDataUndefined: Self = StObject.set(x, "deprecatedAddOnData", js.undefined)
    
    inline def setSlackData(value: SchemaAppsDynamiteV1ApiCompatV1Attachment): Self = StObject.set(x, "slackData", value.asInstanceOf[js.Any])
    
    inline def setSlackDataImageUrlHeight(value: Double): Self = StObject.set(x, "slackDataImageUrlHeight", value.asInstanceOf[js.Any])
    
    inline def setSlackDataImageUrlHeightNull: Self = StObject.set(x, "slackDataImageUrlHeight", null)
    
    inline def setSlackDataImageUrlHeightUndefined: Self = StObject.set(x, "slackDataImageUrlHeight", js.undefined)
    
    inline def setSlackDataUndefined: Self = StObject.set(x, "slackData", js.undefined)
  }
}

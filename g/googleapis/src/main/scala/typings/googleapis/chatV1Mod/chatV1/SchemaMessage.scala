package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMessage extends StObject {
  
  /**
    * Input only. Parameters that a Chat app can use to configure how its response is posted.
    */
  var actionResponse: js.UndefOr[SchemaActionResponse] = js.undefined
  
  /**
    * Output only. Annotations associated with the text in this message.
    */
  var annotations: js.UndefOr[js.Array[SchemaAnnotation]] = js.undefined
  
  /**
    * Plain-text body of the message with all Chat app mentions stripped out.
    */
  var argumentText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User uploaded attachment.
    */
  var attachment: js.UndefOr[js.Array[SchemaAttachment]] = js.undefined
  
  /**
    * Rich, formatted and interactive cards that can be used to display UI elements such as: formatted texts, buttons, clickable images. Cards are normally displayed below the plain-text body of the message.
    */
  var cards: js.UndefOr[js.Array[SchemaCard]] = js.undefined
  
  /**
    * Richly formatted and interactive cards that display UI elements and editable widgets, such as: - Formatted text - Buttons - Clickable images - Checkboxes - Radio buttons - Input widgets. Cards are usually displayed below the text-body of a Chat message, but can situationally appear other places, such as [dialogs](https://developers.google.com/chat/how-tos/dialogs). The `cardId` is a unique identifier among cards in the same message and for identifying user input values. Currently supported widgets include: - `TextParagraph` - `DecoratedText` - `Image` - `ButtonList`
    */
  var cardsV2: js.UndefOr[js.Array[SchemaCardWithId]] = js.undefined
  
  /**
    * Output only. The time at which the message was created in Google Chat server.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A plain-text description of the message's cards, used when the actual cards cannot be displayed (e.g. mobile notifications).
    */
  var fallbackText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which the message was last edited by a user. If the message has never been edited, this field is empty.
    */
  var lastUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A URL in `spaces.messages.text` that matches a link preview pattern. For more information, refer to [Preview links](https://developers.google.com/chat/how-tos/preview-links).
    */
  var matchedUrl: js.UndefOr[SchemaMatchedUrl] = js.undefined
  
  /**
    * Resource name in the form `spaces/x/messages/x`. Example: `spaces/AAAAAAAAAAA/messages/BBBBBBBBBBB.BBBBBBBBBBB`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The user who created the message.
    */
  var sender: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * Output only. Slash command information, if applicable.
    */
  var slashCommand: js.UndefOr[SchemaSlashCommand] = js.undefined
  
  /**
    * The space the message belongs to.
    */
  var space: js.UndefOr[SchemaSpace] = js.undefined
  
  /**
    * Plain-text body of the message. The first link to an image, video, web page, or other preview-able item generates a preview chip.
    */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The thread the message belongs to.
    */
  var thread: js.UndefOr[SchemaThread] = js.undefined
}
object SchemaMessage {
  
  inline def apply(): SchemaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessage]
  }
  
  extension [Self <: SchemaMessage](x: Self) {
    
    inline def setActionResponse(value: SchemaActionResponse): Self = StObject.set(x, "actionResponse", value.asInstanceOf[js.Any])
    
    inline def setActionResponseUndefined: Self = StObject.set(x, "actionResponse", js.undefined)
    
    inline def setAnnotations(value: js.Array[SchemaAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: SchemaAnnotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setArgumentText(value: String): Self = StObject.set(x, "argumentText", value.asInstanceOf[js.Any])
    
    inline def setArgumentTextNull: Self = StObject.set(x, "argumentText", null)
    
    inline def setArgumentTextUndefined: Self = StObject.set(x, "argumentText", js.undefined)
    
    inline def setAttachment(value: js.Array[SchemaAttachment]): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    inline def setAttachmentVarargs(value: SchemaAttachment*): Self = StObject.set(x, "attachment", js.Array(value*))
    
    inline def setCards(value: js.Array[SchemaCard]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
    
    inline def setCardsV2(value: js.Array[SchemaCardWithId]): Self = StObject.set(x, "cardsV2", value.asInstanceOf[js.Any])
    
    inline def setCardsV2Undefined: Self = StObject.set(x, "cardsV2", js.undefined)
    
    inline def setCardsV2Varargs(value: SchemaCardWithId*): Self = StObject.set(x, "cardsV2", js.Array(value*))
    
    inline def setCardsVarargs(value: SchemaCard*): Self = StObject.set(x, "cards", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFallbackText(value: String): Self = StObject.set(x, "fallbackText", value.asInstanceOf[js.Any])
    
    inline def setFallbackTextNull: Self = StObject.set(x, "fallbackText", null)
    
    inline def setFallbackTextUndefined: Self = StObject.set(x, "fallbackText", js.undefined)
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setMatchedUrl(value: SchemaMatchedUrl): Self = StObject.set(x, "matchedUrl", value.asInstanceOf[js.Any])
    
    inline def setMatchedUrlUndefined: Self = StObject.set(x, "matchedUrl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSender(value: SchemaUser): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setSlashCommand(value: SchemaSlashCommand): Self = StObject.set(x, "slashCommand", value.asInstanceOf[js.Any])
    
    inline def setSlashCommandUndefined: Self = StObject.set(x, "slashCommand", js.undefined)
    
    inline def setSpace(value: SchemaSpace): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setThread(value: SchemaThread): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
    
    inline def setThreadUndefined: Self = StObject.set(x, "thread", js.undefined)
  }
}

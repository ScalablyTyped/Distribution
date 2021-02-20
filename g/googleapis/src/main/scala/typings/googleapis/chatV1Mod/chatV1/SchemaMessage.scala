package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message in Hangouts Chat.
  */
@js.native
trait SchemaMessage extends StObject {
  
  /**
    * Input only. Parameters that a bot can use to configure how its response
    * is posted.
    */
  var actionResponse: js.UndefOr[SchemaActionResponse] = js.native
  
  /**
    * Output only. Annotations associated with the text in this message.
    */
  var annotations: js.UndefOr[js.Array[SchemaAnnotation]] = js.native
  
  /**
    * Plain-text body of the message with all bot mentions stripped out.
    */
  var argumentText: js.UndefOr[String] = js.native
  
  /**
    * Rich, formatted and interactive cards that can be used to display UI
    * elements such as: formatted texts, buttons, clickable images. Cards are
    * normally displayed below the plain-text body of the message.
    */
  var cards: js.UndefOr[js.Array[SchemaCard]] = js.native
  
  /**
    * Output only. The time at which the message was created in Hangouts Chat
    * server.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * A plain-text description of the message&#39;s cards, used when the actual
    * cards cannot be displayed (e.g. mobile notifications).
    */
  var fallbackText: js.UndefOr[String] = js.native
  
  /**
    * Resource name, in the form &quot;spaces/x/messages/ *&quot;.  Example:
    * spaces/AAAAMpdlehY/messages/UMxbHmzDlr4.UMxbHmzDlr4
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Text for generating preview chips. This text will not be displayed to the
    * user, but any links to images, web pages, videos, etc. included here will
    * generate preview chips.
    */
  var previewText: js.UndefOr[String] = js.native
  
  /**
    * The user who created the message.
    */
  var sender: js.UndefOr[SchemaUser] = js.native
  
  /**
    * The space the message belongs to.
    */
  var space: js.UndefOr[SchemaSpace] = js.native
  
  /**
    * Plain-text body of the message.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * The thread the message belongs to.
    */
  var thread: js.UndefOr[SchemaThread] = js.native
}
object SchemaMessage {
  
  @scala.inline
  def apply(): SchemaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessage]
  }
  
  @scala.inline
  implicit class SchemaMessageMutableBuilder[Self <: SchemaMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionResponse(value: SchemaActionResponse): Self = StObject.set(x, "actionResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionResponseUndefined: Self = StObject.set(x, "actionResponse", js.undefined)
    
    @scala.inline
    def setAnnotations(value: js.Array[SchemaAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: SchemaAnnotation*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setArgumentText(value: String): Self = StObject.set(x, "argumentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentTextUndefined: Self = StObject.set(x, "argumentText", js.undefined)
    
    @scala.inline
    def setCards(value: js.Array[SchemaCard]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
    
    @scala.inline
    def setCardsVarargs(value: SchemaCard*): Self = StObject.set(x, "cards", js.Array(value :_*))
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setFallbackText(value: String): Self = StObject.set(x, "fallbackText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackTextUndefined: Self = StObject.set(x, "fallbackText", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPreviewText(value: String): Self = StObject.set(x, "previewText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewTextUndefined: Self = StObject.set(x, "previewText", js.undefined)
    
    @scala.inline
    def setSender(value: SchemaUser): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    @scala.inline
    def setSpace(value: SchemaSpace): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setThread(value: SchemaThread): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadUndefined: Self = StObject.set(x, "thread", js.undefined)
  }
}

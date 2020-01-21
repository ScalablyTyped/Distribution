package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message in Hangouts Chat.
  */
@js.native
trait SchemaMessage extends js.Object {
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
  def apply(
    actionResponse: SchemaActionResponse = null,
    annotations: js.Array[SchemaAnnotation] = null,
    argumentText: String = null,
    cards: js.Array[SchemaCard] = null,
    createTime: String = null,
    fallbackText: String = null,
    name: String = null,
    previewText: String = null,
    sender: SchemaUser = null,
    space: SchemaSpace = null,
    text: String = null,
    thread: SchemaThread = null
  ): SchemaMessage = {
    val __obj = js.Dynamic.literal()
    if (actionResponse != null) __obj.updateDynamic("actionResponse")(actionResponse.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (argumentText != null) __obj.updateDynamic("argumentText")(argumentText.asInstanceOf[js.Any])
    if (cards != null) __obj.updateDynamic("cards")(cards.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (fallbackText != null) __obj.updateDynamic("fallbackText")(fallbackText.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (previewText != null) __obj.updateDynamic("previewText")(previewText.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (thread != null) __obj.updateDynamic("thread")(thread.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMessage]
  }
}


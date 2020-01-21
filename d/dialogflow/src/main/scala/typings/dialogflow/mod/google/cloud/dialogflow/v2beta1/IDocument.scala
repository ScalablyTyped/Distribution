package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Document.KnowledgeType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Document. */
trait IDocument extends js.Object {
  /** Document content */
  var content: js.UndefOr[String | Null] = js.undefined
  /** Document contentUri */
  var contentUri: js.UndefOr[String | Null] = js.undefined
  /** Document displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  /** Document knowledgeTypes */
  var knowledgeTypes: js.UndefOr[js.Array[KnowledgeType] | Null] = js.undefined
  /** Document mimeType */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  /** Document name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** Document rawContent */
  var rawContent: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IDocument {
  @scala.inline
  def apply(
    content: String = null,
    contentUri: String = null,
    displayName: String = null,
    knowledgeTypes: js.Array[KnowledgeType] = null,
    mimeType: String = null,
    name: String = null,
    rawContent: Uint8Array = null
  ): IDocument = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentUri != null) __obj.updateDynamic("contentUri")(contentUri.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (knowledgeTypes != null) __obj.updateDynamic("knowledgeTypes")(knowledgeTypes.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rawContent != null) __obj.updateDynamic("rawContent")(rawContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocument]
  }
}


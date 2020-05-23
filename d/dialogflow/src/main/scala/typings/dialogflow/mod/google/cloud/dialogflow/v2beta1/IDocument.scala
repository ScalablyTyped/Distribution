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
  var rawContent: js.UndefOr[Uint8Array | String | Null] = js.undefined
}

object IDocument {
  @scala.inline
  def apply(
    content: js.UndefOr[Null | String] = js.undefined,
    contentUri: js.UndefOr[Null | String] = js.undefined,
    displayName: js.UndefOr[Null | String] = js.undefined,
    knowledgeTypes: js.UndefOr[Null | js.Array[KnowledgeType]] = js.undefined,
    mimeType: js.UndefOr[Null | String] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    rawContent: js.UndefOr[Null | Uint8Array | String] = js.undefined
  ): IDocument = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(contentUri)) __obj.updateDynamic("contentUri")(contentUri.asInstanceOf[js.Any])
    if (!js.isUndefined(displayName)) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(knowledgeTypes)) __obj.updateDynamic("knowledgeTypes")(knowledgeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(mimeType)) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(rawContent)) __obj.updateDynamic("rawContent")(rawContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocument]
  }
}


package typings.gapiDotClientDotLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  /** Extract document-level sentiment. */
  var extractDocumentSentiment: js.UndefOr[Boolean] = js.undefined
  /** Extract entities. */
  var extractEntities: js.UndefOr[Boolean] = js.undefined
  /** Extract entities and their associated sentiment. */
  var extractEntitySentiment: js.UndefOr[Boolean] = js.undefined
  /** Extract syntax information. */
  var extractSyntax: js.UndefOr[Boolean] = js.undefined
}

object Features {
  @scala.inline
  def apply(
    extractDocumentSentiment: js.UndefOr[Boolean] = js.undefined,
    extractEntities: js.UndefOr[Boolean] = js.undefined,
    extractEntitySentiment: js.UndefOr[Boolean] = js.undefined,
    extractSyntax: js.UndefOr[Boolean] = js.undefined
  ): Features = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extractDocumentSentiment)) __obj.updateDynamic("extractDocumentSentiment")(extractDocumentSentiment.asInstanceOf[js.Any])
    if (!js.isUndefined(extractEntities)) __obj.updateDynamic("extractEntities")(extractEntities.asInstanceOf[js.Any])
    if (!js.isUndefined(extractEntitySentiment)) __obj.updateDynamic("extractEntitySentiment")(extractEntitySentiment.asInstanceOf[js.Any])
    if (!js.isUndefined(extractSyntax)) __obj.updateDynamic("extractSyntax")(extractSyntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
}


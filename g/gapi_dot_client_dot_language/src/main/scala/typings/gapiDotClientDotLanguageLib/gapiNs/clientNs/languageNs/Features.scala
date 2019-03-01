package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  /** Extract document-level sentiment. */
  var extractDocumentSentiment: js.UndefOr[scala.Boolean] = js.undefined
  /** Extract entities. */
  var extractEntities: js.UndefOr[scala.Boolean] = js.undefined
  /** Extract entities and their associated sentiment. */
  var extractEntitySentiment: js.UndefOr[scala.Boolean] = js.undefined
  /** Extract syntax information. */
  var extractSyntax: js.UndefOr[scala.Boolean] = js.undefined
}

object Features {
  @scala.inline
  def apply(
    extractDocumentSentiment: js.UndefOr[scala.Boolean] = js.undefined,
    extractEntities: js.UndefOr[scala.Boolean] = js.undefined,
    extractEntitySentiment: js.UndefOr[scala.Boolean] = js.undefined,
    extractSyntax: js.UndefOr[scala.Boolean] = js.undefined
  ): Features = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extractDocumentSentiment)) __obj.updateDynamic("extractDocumentSentiment")(extractDocumentSentiment)
    if (!js.isUndefined(extractEntities)) __obj.updateDynamic("extractEntities")(extractEntities)
    if (!js.isUndefined(extractEntitySentiment)) __obj.updateDynamic("extractEntitySentiment")(extractEntitySentiment)
    if (!js.isUndefined(extractSyntax)) __obj.updateDynamic("extractSyntax")(extractSyntax)
    __obj.asInstanceOf[Features]
  }
}


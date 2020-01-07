package typings.googleapis.buildSrcApisLanguageV1beta1Mod.language_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All available features for sentiment, syntax, and semantic analysis.
  * Setting each one to true will enable that specific analysis for the input.
  */
@js.native
trait Schema$Features extends js.Object {
  /**
    * Extract document-level sentiment.
    */
  var extractDocumentSentiment: js.UndefOr[Boolean] = js.native
  /**
    * Extract entities.
    */
  var extractEntities: js.UndefOr[Boolean] = js.native
  /**
    * Extract syntax information.
    */
  var extractSyntax: js.UndefOr[Boolean] = js.native
}

object Schema$Features {
  @scala.inline
  def apply(
    extractDocumentSentiment: js.UndefOr[Boolean] = js.undefined,
    extractEntities: js.UndefOr[Boolean] = js.undefined,
    extractSyntax: js.UndefOr[Boolean] = js.undefined
  ): Schema$Features = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extractDocumentSentiment)) __obj.updateDynamic("extractDocumentSentiment")(extractDocumentSentiment.asInstanceOf[js.Any])
    if (!js.isUndefined(extractEntities)) __obj.updateDynamic("extractEntities")(extractEntities.asInstanceOf[js.Any])
    if (!js.isUndefined(extractSyntax)) __obj.updateDynamic("extractSyntax")(extractSyntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Features]
  }
}


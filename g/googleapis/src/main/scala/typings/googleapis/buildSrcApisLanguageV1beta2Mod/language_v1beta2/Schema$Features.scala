package typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All available features for sentiment, syntax, and semantic analysis.
  * Setting each one to true will enable that specific analysis for the input.
  * Next ID: 10
  */
@js.native
trait Schema$Features extends js.Object {
  /**
    * Classify the full document into categories. If this is true, the API will
    * use the default model which classifies into a [predefined
    * taxonomy](/natural-language/docs/categories).
    */
  var classifyText: js.UndefOr[Boolean] = js.native
  /**
    * Extract document-level sentiment.
    */
  var extractDocumentSentiment: js.UndefOr[Boolean] = js.native
  /**
    * Extract entities.
    */
  var extractEntities: js.UndefOr[Boolean] = js.native
  /**
    * Extract entities and their associated sentiment.
    */
  var extractEntitySentiment: js.UndefOr[Boolean] = js.native
  /**
    * Extract syntax information.
    */
  var extractSyntax: js.UndefOr[Boolean] = js.native
}

object Schema$Features {
  @scala.inline
  def apply(
    classifyText: js.UndefOr[Boolean] = js.undefined,
    extractDocumentSentiment: js.UndefOr[Boolean] = js.undefined,
    extractEntities: js.UndefOr[Boolean] = js.undefined,
    extractEntitySentiment: js.UndefOr[Boolean] = js.undefined,
    extractSyntax: js.UndefOr[Boolean] = js.undefined
  ): Schema$Features = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(classifyText)) __obj.updateDynamic("classifyText")(classifyText.asInstanceOf[js.Any])
    if (!js.isUndefined(extractDocumentSentiment)) __obj.updateDynamic("extractDocumentSentiment")(extractDocumentSentiment.asInstanceOf[js.Any])
    if (!js.isUndefined(extractEntities)) __obj.updateDynamic("extractEntities")(extractEntities.asInstanceOf[js.Any])
    if (!js.isUndefined(extractEntitySentiment)) __obj.updateDynamic("extractEntitySentiment")(extractEntitySentiment.asInstanceOf[js.Any])
    if (!js.isUndefined(extractSyntax)) __obj.updateDynamic("extractSyntax")(extractSyntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Features]
  }
}


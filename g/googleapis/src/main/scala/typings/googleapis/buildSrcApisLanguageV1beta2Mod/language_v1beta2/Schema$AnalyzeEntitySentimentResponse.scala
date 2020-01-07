package typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The entity-level sentiment analysis response message.
  */
@js.native
trait Schema$AnalyzeEntitySentimentResponse extends js.Object {
  /**
    * The recognized entities in the input document with associated sentiments.
    */
  var entities: js.UndefOr[js.Array[Schema$Entity]] = js.native
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
}

object Schema$AnalyzeEntitySentimentResponse {
  @scala.inline
  def apply(entities: js.Array[Schema$Entity] = null, language: String = null): Schema$AnalyzeEntitySentimentResponse = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnalyzeEntitySentimentResponse]
  }
}


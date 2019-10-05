package typings.gapiDotClientDotLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyzeEntitySentimentResponse extends js.Object {
  /** The recognized entities in the input document with associated sentiments. */
  var entities: js.UndefOr[js.Array[Entity]] = js.undefined
  /**
    * The language of the text, which will be the same as the language specified
    * in the request or, if not specified, the automatically-detected language.
    * See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.undefined
}

object AnalyzeEntitySentimentResponse {
  @scala.inline
  def apply(entities: js.Array[Entity] = null, language: String = null): AnalyzeEntitySentimentResponse = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[AnalyzeEntitySentimentResponse]
  }
}


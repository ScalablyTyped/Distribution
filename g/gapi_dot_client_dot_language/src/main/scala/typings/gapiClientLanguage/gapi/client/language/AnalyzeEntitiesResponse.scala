package typings.gapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyzeEntitiesResponse extends js.Object {
  /** The recognized entities in the input document. */
  var entities: js.UndefOr[js.Array[Entity]] = js.undefined
  /**
    * The language of the text, which will be the same as the language specified
    * in the request or, if not specified, the automatically-detected language.
    * See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.undefined
}

object AnalyzeEntitiesResponse {
  @scala.inline
  def apply(entities: js.Array[Entity] = null, language: String = null): AnalyzeEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeEntitiesResponse]
  }
}


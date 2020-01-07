package typings.googleapis.buildSrcApisLanguageV1Mod.language_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The entity analysis response message.
  */
@js.native
trait Schema$AnalyzeEntitiesResponse extends js.Object {
  /**
    * The recognized entities in the input document.
    */
  var entities: js.UndefOr[js.Array[Schema$Entity]] = js.native
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
}

object Schema$AnalyzeEntitiesResponse {
  @scala.inline
  def apply(entities: js.Array[Schema$Entity] = null, language: String = null): Schema$AnalyzeEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnalyzeEntitiesResponse]
  }
}


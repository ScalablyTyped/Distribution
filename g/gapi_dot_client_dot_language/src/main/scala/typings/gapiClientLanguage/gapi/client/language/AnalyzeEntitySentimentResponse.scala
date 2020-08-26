package typings.gapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzeEntitySentimentResponse extends js.Object {
  /** The recognized entities in the input document with associated sentiments. */
  var entities: js.UndefOr[js.Array[Entity]] = js.native
  /**
    * The language of the text, which will be the same as the language specified
    * in the request or, if not specified, the automatically-detected language.
    * See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
}

object AnalyzeEntitySentimentResponse {
  @scala.inline
  def apply(): AnalyzeEntitySentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeEntitySentimentResponse]
  }
  @scala.inline
  implicit class AnalyzeEntitySentimentResponseOps[Self <: AnalyzeEntitySentimentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
  
}


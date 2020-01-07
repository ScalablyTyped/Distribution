package typings.googleapis.buildSrcApisLanguageV1Mod.language_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The entity-level sentiment analysis request message.
  */
@js.native
trait Schema$AnalyzeEntitySentimentRequest extends js.Object {
  /**
    * Input document.
    */
  var document: js.UndefOr[Schema$Document] = js.native
  /**
    * The encoding type used by the API to calculate offsets.
    */
  var encodingType: js.UndefOr[String] = js.native
}

object Schema$AnalyzeEntitySentimentRequest {
  @scala.inline
  def apply(document: Schema$Document = null, encodingType: String = null): Schema$AnalyzeEntitySentimentRequest = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnalyzeEntitySentimentRequest]
  }
}


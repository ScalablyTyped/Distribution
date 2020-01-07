package typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The sentiment analysis request message.
  */
@js.native
trait Schema$AnalyzeSentimentRequest extends js.Object {
  /**
    * Input document.
    */
  var document: js.UndefOr[Schema$Document] = js.native
  /**
    * The encoding type used by the API to calculate sentence offsets for the
    * sentence sentiment.
    */
  var encodingType: js.UndefOr[String] = js.native
}

object Schema$AnalyzeSentimentRequest {
  @scala.inline
  def apply(document: Schema$Document = null, encodingType: String = null): Schema$AnalyzeSentimentRequest = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnalyzeSentimentRequest]
  }
}


package typings.gapiDotClientDotLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSpan extends js.Object {
  /**
    * The API calculates the beginning offset of the content in the original
    * document according to the EncodingType specified in the API request.
    */
  var beginOffset: js.UndefOr[Double] = js.undefined
  /** The content of the output text. */
  var content: js.UndefOr[String] = js.undefined
}

object TextSpan {
  @scala.inline
  def apply(beginOffset: Int | Double = null, content: String = null): TextSpan = {
    val __obj = js.Dynamic.literal()
    if (beginOffset != null) __obj.updateDynamic("beginOffset")(beginOffset.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[TextSpan]
  }
}


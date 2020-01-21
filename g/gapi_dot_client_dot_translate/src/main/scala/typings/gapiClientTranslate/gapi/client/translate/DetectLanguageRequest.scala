package typings.gapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectLanguageRequest extends js.Object {
  /**
    * The input text upon which to perform language detection. Repeat this
    * parameter to perform language detection on multiple text inputs.
    */
  var q: js.UndefOr[js.Array[String]] = js.undefined
}

object DetectLanguageRequest {
  @scala.inline
  def apply(q: js.Array[String] = null): DetectLanguageRequest = {
    val __obj = js.Dynamic.literal()
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectLanguageRequest]
  }
}


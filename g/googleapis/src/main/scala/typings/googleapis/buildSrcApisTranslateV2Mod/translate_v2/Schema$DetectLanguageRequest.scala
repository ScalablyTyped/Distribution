package typings.googleapis.buildSrcApisTranslateV2Mod.translate_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for language detection.
  */
@js.native
trait Schema$DetectLanguageRequest extends js.Object {
  /**
    * The input text upon which to perform language detection. Repeat this
    * parameter to perform language detection on multiple text inputs.
    */
  var q: js.UndefOr[js.Array[String]] = js.native
}

object Schema$DetectLanguageRequest {
  @scala.inline
  def apply(q: js.Array[String] = null): Schema$DetectLanguageRequest = {
    val __obj = js.Dynamic.literal()
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DetectLanguageRequest]
  }
}


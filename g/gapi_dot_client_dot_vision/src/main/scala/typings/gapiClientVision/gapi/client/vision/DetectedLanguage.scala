package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectedLanguage extends js.Object {
  /** Confidence of detected language. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
    * information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.undefined
}

object DetectedLanguage {
  @scala.inline
  def apply(confidence: js.UndefOr[Double] = js.undefined, languageCode: String = null): DetectedLanguage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedLanguage]
  }
}


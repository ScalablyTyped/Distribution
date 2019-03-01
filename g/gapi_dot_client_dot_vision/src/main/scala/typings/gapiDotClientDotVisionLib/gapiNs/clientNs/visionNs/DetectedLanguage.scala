package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectedLanguage extends js.Object {
  /** Confidence of detected language. Range [0, 1]. */
  var confidence: js.UndefOr[scala.Double] = js.undefined
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
    * information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
}

object DetectedLanguage {
  @scala.inline
  def apply(confidence: scala.Int | scala.Double = null, languageCode: java.lang.String = null): DetectedLanguage = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    __obj.asInstanceOf[DetectedLanguage]
  }
}


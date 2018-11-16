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


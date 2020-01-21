package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProperty extends js.Object {
  /** Detected start or end of a text segment. */
  var detectedBreak: js.UndefOr[DetectedBreak] = js.undefined
  /** A list of detected languages together with confidence. */
  var detectedLanguages: js.UndefOr[js.Array[DetectedLanguage]] = js.undefined
}

object TextProperty {
  @scala.inline
  def apply(detectedBreak: DetectedBreak = null, detectedLanguages: js.Array[DetectedLanguage] = null): TextProperty = {
    val __obj = js.Dynamic.literal()
    if (detectedBreak != null) __obj.updateDynamic("detectedBreak")(detectedBreak.asInstanceOf[js.Any])
    if (detectedLanguages != null) __obj.updateDynamic("detectedLanguages")(detectedLanguages.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProperty]
  }
}


package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProperty extends js.Object {
  /** Detected start or end of a text segment. */
  var detectedBreak: js.UndefOr[DetectedBreak] = js.undefined
  /** A list of detected languages together with confidence. */
  var detectedLanguages: js.UndefOr[js.Array[DetectedLanguage]] = js.undefined
}


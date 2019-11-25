package typings.gapiDotClientDotVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectedBreak extends js.Object {
  /** True if break prepends the element. */
  var isPrefix: js.UndefOr[Boolean] = js.undefined
  /** Detected break type. */
  var `type`: js.UndefOr[String] = js.undefined
}

object DetectedBreak {
  @scala.inline
  def apply(isPrefix: js.UndefOr[Boolean] = js.undefined, `type`: String = null): DetectedBreak = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPrefix)) __obj.updateDynamic("isPrefix")(isPrefix.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedBreak]
  }
}


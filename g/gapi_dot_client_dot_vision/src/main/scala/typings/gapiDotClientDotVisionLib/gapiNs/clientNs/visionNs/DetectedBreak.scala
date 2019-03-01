package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectedBreak extends js.Object {
  /** True if break prepends the element. */
  var isPrefix: js.UndefOr[scala.Boolean] = js.undefined
  /** Detected break type. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DetectedBreak {
  @scala.inline
  def apply(isPrefix: js.UndefOr[scala.Boolean] = js.undefined, `type`: java.lang.String = null): DetectedBreak = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPrefix)) __obj.updateDynamic("isPrefix")(isPrefix)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DetectedBreak]
  }
}


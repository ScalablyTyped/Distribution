package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseMetadata extends js.Object {
  /** Debug information about this request. */
  var debugInfo: js.UndefOr[DebugInfo] = js.undefined
}

object ResponseMetadata {
  @scala.inline
  def apply(debugInfo: DebugInfo = null): ResponseMetadata = {
    val __obj = js.Dynamic.literal()
    if (debugInfo != null) __obj.updateDynamic("debugInfo")(debugInfo)
    __obj.asInstanceOf[ResponseMetadata]
  }
}


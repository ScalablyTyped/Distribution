package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CompanionSetting extends js.Object {
  /** Whether companions are disabled for this placement. */
  var companionsDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whitelist of companion sizes to be served to this placement. Set this list to null or empty to serve all companion sizes. */
  var enabledSizes: js.UndefOr[js.Array[Size]] = js.undefined
  /** Whether to serve only static images as companions. */
  var imageOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#companionSetting". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}


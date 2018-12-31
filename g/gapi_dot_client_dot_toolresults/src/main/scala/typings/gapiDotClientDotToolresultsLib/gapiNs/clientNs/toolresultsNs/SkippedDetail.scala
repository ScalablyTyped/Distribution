package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkippedDetail extends js.Object {
  /** If the App doesn't support the specific API level. */
  var incompatibleAppVersion: js.UndefOr[scala.Boolean] = js.undefined
  /** If the App doesn't run on the specific architecture, for example, x86. */
  var incompatibleArchitecture: js.UndefOr[scala.Boolean] = js.undefined
  /** If the requested OS version doesn't run on the specific device model. */
  var incompatibleDevice: js.UndefOr[scala.Boolean] = js.undefined
}


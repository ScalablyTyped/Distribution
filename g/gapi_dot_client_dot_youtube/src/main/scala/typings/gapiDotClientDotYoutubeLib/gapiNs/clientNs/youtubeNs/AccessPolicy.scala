package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessPolicy extends js.Object {
  /** The value of allowed indicates whether the access to the policy is allowed or denied by default. */
  var allowed: js.UndefOr[scala.Boolean] = js.undefined
  /** A list of region codes that identify countries where the default policy do not apply. */
  var exception: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}


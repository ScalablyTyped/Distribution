package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceWebDetails extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#instanceWebDetails. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Launch URL for the game. */
  var launchUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates that this instance is the default for new installations. */
  var preferred: js.UndefOr[scala.Boolean] = js.undefined
}

object InstanceWebDetails {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    launchUrl: java.lang.String = null,
    preferred: js.UndefOr[scala.Boolean] = js.undefined
  ): InstanceWebDetails = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (launchUrl != null) __obj.updateDynamic("launchUrl")(launchUrl)
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred)
    __obj.asInstanceOf[InstanceWebDetails]
  }
}


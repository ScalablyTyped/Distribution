package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceWebDetails extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#instanceWebDetails. */
  var kind: js.UndefOr[String] = js.undefined
  /** Launch URL for the game. */
  var launchUrl: js.UndefOr[String] = js.undefined
  /** Indicates that this instance is the default for new installations. */
  var preferred: js.UndefOr[Boolean] = js.undefined
}

object InstanceWebDetails {
  @scala.inline
  def apply(kind: String = null, launchUrl: String = null, preferred: js.UndefOr[Boolean] = js.undefined): InstanceWebDetails = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (launchUrl != null) __obj.updateDynamic("launchUrl")(launchUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceWebDetails]
  }
}


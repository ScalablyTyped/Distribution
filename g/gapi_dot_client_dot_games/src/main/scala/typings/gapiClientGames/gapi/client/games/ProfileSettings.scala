package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileSettings extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#profileSettings. */
  var kind: js.UndefOr[String] = js.undefined
  /** The player's current profile visibility. This field is visible to both 1P and 3P APIs. */
  var profileVisible: js.UndefOr[Boolean] = js.undefined
}

object ProfileSettings {
  @scala.inline
  def apply(kind: String = null, profileVisible: js.UndefOr[Boolean] = js.undefined): ProfileSettings = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(profileVisible)) __obj.updateDynamic("profileVisible")(profileVisible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileSettings]
  }
}


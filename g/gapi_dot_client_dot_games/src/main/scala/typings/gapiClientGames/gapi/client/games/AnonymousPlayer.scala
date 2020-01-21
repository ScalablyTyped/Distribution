package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonymousPlayer extends js.Object {
  /** The base URL for the image to display for the anonymous player. */
  var avatarImageUrl: js.UndefOr[String] = js.undefined
  /** The name to display for the anonymous player. */
  var displayName: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#anonymousPlayer. */
  var kind: js.UndefOr[String] = js.undefined
}

object AnonymousPlayer {
  @scala.inline
  def apply(avatarImageUrl: String = null, displayName: String = null, kind: String = null): AnonymousPlayer = {
    val __obj = js.Dynamic.literal()
    if (avatarImageUrl != null) __obj.updateDynamic("avatarImageUrl")(avatarImageUrl.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousPlayer]
  }
}


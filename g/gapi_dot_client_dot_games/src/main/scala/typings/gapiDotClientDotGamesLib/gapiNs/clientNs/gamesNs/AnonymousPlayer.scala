package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonymousPlayer extends js.Object {
  /** The base URL for the image to display for the anonymous player. */
  var avatarImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The name to display for the anonymous player. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#anonymousPlayer. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AnonymousPlayer {
  @scala.inline
  def apply(
    avatarImageUrl: java.lang.String = null,
    displayName: java.lang.String = null,
    kind: java.lang.String = null
  ): AnonymousPlayer = {
    val __obj = js.Dynamic.literal()
    if (avatarImageUrl != null) __obj.updateDynamic("avatarImageUrl")(avatarImageUrl)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AnonymousPlayer]
  }
}


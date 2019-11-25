package typings.gapiDotClientDotGames.gapi.client.games

import typings.gapiDotClientDotGames.Anon_Apnsdevicetoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushTokenId extends js.Object {
  /** A push token ID for iOS devices. */
  var ios: js.UndefOr[Anon_Apnsdevicetoken] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#pushTokenId. */
  var kind: js.UndefOr[String] = js.undefined
}

object PushTokenId {
  @scala.inline
  def apply(ios: Anon_Apnsdevicetoken = null, kind: String = null): PushTokenId = {
    val __obj = js.Dynamic.literal()
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushTokenId]
  }
}


package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushTokenId extends js.Object {
  /** A push token ID for iOS devices. */
  var ios: js.UndefOr[gapiDotClientDotGamesLib.Anon_Apnsdevicetoken] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#pushTokenId. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object PushTokenId {
  @scala.inline
  def apply(ios: gapiDotClientDotGamesLib.Anon_Apnsdevicetoken = null, kind: java.lang.String = null): PushTokenId = {
    val __obj = js.Dynamic.literal()
    if (ios != null) __obj.updateDynamic("ios")(ios)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[PushTokenId]
  }
}


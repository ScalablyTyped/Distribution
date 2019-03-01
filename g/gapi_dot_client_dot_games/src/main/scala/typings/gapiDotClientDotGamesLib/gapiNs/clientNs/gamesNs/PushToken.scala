package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushToken extends js.Object {
  /**
    * The revision of the client SDK used by your application, in the same format that's used by revisions.check. Used to send backward compatible messages.
    * Format: [PLATFORM_TYPE]:[VERSION_NUMBER]. Possible values of PLATFORM_TYPE are:
    * - IOS - Push token is for iOS
    */
  var clientRevision: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier for this push token. */
  var id: js.UndefOr[PushTokenId] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#pushToken. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The preferred language for notifications that are sent using this token. */
  var language: js.UndefOr[java.lang.String] = js.undefined
}

object PushToken {
  @scala.inline
  def apply(
    clientRevision: java.lang.String = null,
    id: PushTokenId = null,
    kind: java.lang.String = null,
    language: java.lang.String = null
  ): PushToken = {
    val __obj = js.Dynamic.literal()
    if (clientRevision != null) __obj.updateDynamic("clientRevision")(clientRevision)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[PushToken]
  }
}


package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushToken extends js.Object {
  /**
    * The revision of the client SDK used by your application, in the same format that's used by revisions.check. Used to send backward compatible messages.
    * Format: [PLATFORM_TYPE]:[VERSION_NUMBER]. Possible values of PLATFORM_TYPE are:
    * - IOS - Push token is for iOS
    */
  var clientRevision: js.UndefOr[String] = js.native
  /** Unique identifier for this push token. */
  var id: js.UndefOr[PushTokenId] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#pushToken. */
  var kind: js.UndefOr[String] = js.native
  /** The preferred language for notifications that are sent using this token. */
  var language: js.UndefOr[String] = js.native
}

object PushToken {
  @scala.inline
  def apply(): PushToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushToken]
  }
  @scala.inline
  implicit class PushTokenOps[Self <: PushToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClientRevision(value: String): Self = this.set("clientRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRevision: Self = this.set("clientRevision", js.undefined)
    @scala.inline
    def setId(value: PushTokenId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
  
}


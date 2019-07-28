package typings.evernote

import typings.evernote.evernoteMod.EvernoteNs.PrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NoteStoreUrl extends js.Object {
  var noteStoreUrl: js.UndefOr[String] = js.undefined
  var privilege: js.UndefOr[PrivilegeLevel] = js.undefined
  var shardId: String
  var userId: Double
  var username: js.UndefOr[String] = js.undefined
  var webApiUrlPrefix: js.UndefOr[String] = js.undefined
}

object Anon_NoteStoreUrl {
  @scala.inline
  def apply(
    shardId: String,
    userId: Double,
    noteStoreUrl: String = null,
    privilege: PrivilegeLevel = null,
    username: String = null,
    webApiUrlPrefix: String = null
  ): Anon_NoteStoreUrl = {
    val __obj = js.Dynamic.literal(shardId = shardId, userId = userId)
    if (noteStoreUrl != null) __obj.updateDynamic("noteStoreUrl")(noteStoreUrl)
    if (privilege != null) __obj.updateDynamic("privilege")(privilege)
    if (username != null) __obj.updateDynamic("username")(username)
    if (webApiUrlPrefix != null) __obj.updateDynamic("webApiUrlPrefix")(webApiUrlPrefix)
    __obj.asInstanceOf[Anon_NoteStoreUrl]
  }
}


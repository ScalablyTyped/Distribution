package typings.evernote

import typings.evernote.evernoteMod.Evernote.PrivilegeLevel
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
    val __obj = js.Dynamic.literal(shardId = shardId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (noteStoreUrl != null) __obj.updateDynamic("noteStoreUrl")(noteStoreUrl.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (webApiUrlPrefix != null) __obj.updateDynamic("webApiUrlPrefix")(webApiUrlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NoteStoreUrl]
  }
}


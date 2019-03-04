package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NoteStoreUrl extends js.Object {
  var noteStoreUrl: js.UndefOr[java.lang.String] = js.undefined
  var privilege: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.PrivilegeLevel] = js.undefined
  var shardId: java.lang.String
  var userId: scala.Double
  var username: js.UndefOr[java.lang.String] = js.undefined
  var webApiUrlPrefix: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_NoteStoreUrl {
  @scala.inline
  def apply(
    shardId: java.lang.String,
    userId: scala.Double,
    noteStoreUrl: java.lang.String = null,
    privilege: evernoteLib.evernoteMod.EvernoteNs.PrivilegeLevel = null,
    username: java.lang.String = null,
    webApiUrlPrefix: java.lang.String = null
  ): Anon_NoteStoreUrl = {
    val __obj = js.Dynamic.literal(shardId = shardId, userId = userId)
    if (noteStoreUrl != null) __obj.updateDynamic("noteStoreUrl")(noteStoreUrl)
    if (privilege != null) __obj.updateDynamic("privilege")(privilege)
    if (username != null) __obj.updateDynamic("username")(username)
    if (webApiUrlPrefix != null) __obj.updateDynamic("webApiUrlPrefix")(webApiUrlPrefix)
    __obj.asInstanceOf[Anon_NoteStoreUrl]
  }
}


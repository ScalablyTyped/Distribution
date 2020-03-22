package typings.evernote

import typings.evernote.mod.Types.ServiceLevel
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoteStoreUrl extends js.Object {
  var noteStoreUrl: js.UndefOr[String] = js.undefined
  var serviceLevel: js.UndefOr[ServiceLevel] = js.undefined
  var userId: js.UndefOr[UserID] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var webApiUrlPrefix: js.UndefOr[String] = js.undefined
}

object AnonNoteStoreUrl {
  @scala.inline
  def apply(
    noteStoreUrl: String = null,
    serviceLevel: ServiceLevel = null,
    userId: Int | Double = null,
    username: String = null,
    webApiUrlPrefix: String = null
  ): AnonNoteStoreUrl = {
    val __obj = js.Dynamic.literal()
    if (noteStoreUrl != null) __obj.updateDynamic("noteStoreUrl")(noteStoreUrl.asInstanceOf[js.Any])
    if (serviceLevel != null) __obj.updateDynamic("serviceLevel")(serviceLevel.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (webApiUrlPrefix != null) __obj.updateDynamic("webApiUrlPrefix")(webApiUrlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoteStoreUrl]
  }
}


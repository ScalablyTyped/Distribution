package typings.evernote.anon

import typings.evernote.mod.Types.ServiceLevel
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoteStoreUrl extends js.Object {
  var noteStoreUrl: js.UndefOr[String] = js.undefined
  var serviceLevel: js.UndefOr[ServiceLevel] = js.undefined
  var userId: js.UndefOr[UserID] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var webApiUrlPrefix: js.UndefOr[String] = js.undefined
}

object NoteStoreUrl {
  @scala.inline
  def apply(
    noteStoreUrl: String = null,
    serviceLevel: ServiceLevel = null,
    userId: js.UndefOr[UserID] = js.undefined,
    username: String = null,
    webApiUrlPrefix: String = null
  ): NoteStoreUrl = {
    val __obj = js.Dynamic.literal()
    if (noteStoreUrl != null) __obj.updateDynamic("noteStoreUrl")(noteStoreUrl.asInstanceOf[js.Any])
    if (serviceLevel != null) __obj.updateDynamic("serviceLevel")(serviceLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(userId)) __obj.updateDynamic("userId")(userId.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (webApiUrlPrefix != null) __obj.updateDynamic("webApiUrlPrefix")(webApiUrlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteStoreUrl]
  }
}


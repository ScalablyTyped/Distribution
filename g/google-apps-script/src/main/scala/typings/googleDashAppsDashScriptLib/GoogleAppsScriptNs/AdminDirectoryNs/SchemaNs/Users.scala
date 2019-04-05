package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Users extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var trigger_event: js.UndefOr[java.lang.String] = js.undefined
  var users: js.UndefOr[js.Array[User]] = js.undefined
}

object Users {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    trigger_event: java.lang.String = null,
    users: js.Array[User] = null
  ): Users = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (trigger_event != null) __obj.updateDynamic("trigger_event")(trigger_event)
    if (users != null) __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[Users]
  }
}


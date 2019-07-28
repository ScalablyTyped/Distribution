package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Members extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var members: js.UndefOr[js.Array[Member]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object Members {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    members: js.Array[Member] = null,
    nextPageToken: String = null
  ): Members = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (members != null) __obj.updateDynamic("members")(members)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[Members]
  }
}


package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var groups: js.UndefOr[js.Array[Group]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object Groups {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    groups: js.Array[Group] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): Groups = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[Groups]
  }
}


package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDriveList extends js.Object {
  var items: js.UndefOr[js.Array[TeamDrive]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object TeamDriveList {
  @scala.inline
  def apply(
    items: js.Array[TeamDrive] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): TeamDriveList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[TeamDriveList]
  }
}


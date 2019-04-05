package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectList extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var projects: js.UndefOr[js.Array[ProjectListProjects]] = js.undefined
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

object ProjectList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    projects: js.Array[ProjectListProjects] = null,
    totalItems: scala.Int | scala.Double = null
  ): ProjectList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectList]
  }
}


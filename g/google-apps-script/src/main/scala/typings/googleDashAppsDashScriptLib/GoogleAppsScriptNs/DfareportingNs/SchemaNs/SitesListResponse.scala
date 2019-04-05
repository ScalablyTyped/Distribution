package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesListResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var sites: js.UndefOr[js.Array[Site]] = js.undefined
}

object SitesListResponse {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    sites: js.Array[Site] = null
  ): SitesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (sites != null) __obj.updateDynamic("sites")(sites)
    __obj.asInstanceOf[SitesListResponse]
  }
}


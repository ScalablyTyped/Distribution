package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivitiesListResponse extends js.Object {
  var floodlightActivities: js.UndefOr[js.Array[FloodlightActivity]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object FloodlightActivitiesListResponse {
  @scala.inline
  def apply(
    floodlightActivities: js.Array[FloodlightActivity] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): FloodlightActivitiesListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivities != null) __obj.updateDynamic("floodlightActivities")(floodlightActivities)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[FloodlightActivitiesListResponse]
  }
}


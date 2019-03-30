package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementStrategiesListResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var placementStrategies: js.UndefOr[js.Array[PlacementStrategy]] = js.undefined
}

object PlacementStrategiesListResponse {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    placementStrategies: js.Array[PlacementStrategy] = null
  ): PlacementStrategiesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (placementStrategies != null) __obj.updateDynamic("placementStrategies")(placementStrategies)
    __obj.asInstanceOf[PlacementStrategiesListResponse]
  }
}


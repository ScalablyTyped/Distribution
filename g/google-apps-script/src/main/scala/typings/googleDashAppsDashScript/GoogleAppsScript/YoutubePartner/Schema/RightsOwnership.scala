package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightsOwnership extends js.Object {
  var general: js.UndefOr[js.Array[TerritoryOwners]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var mechanical: js.UndefOr[js.Array[TerritoryOwners]] = js.undefined
  var performance: js.UndefOr[js.Array[TerritoryOwners]] = js.undefined
  var synchronization: js.UndefOr[js.Array[TerritoryOwners]] = js.undefined
}

object RightsOwnership {
  @scala.inline
  def apply(
    general: js.Array[TerritoryOwners] = null,
    kind: String = null,
    mechanical: js.Array[TerritoryOwners] = null,
    performance: js.Array[TerritoryOwners] = null,
    synchronization: js.Array[TerritoryOwners] = null
  ): RightsOwnership = {
    val __obj = js.Dynamic.literal()
    if (general != null) __obj.updateDynamic("general")(general)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (mechanical != null) __obj.updateDynamic("mechanical")(mechanical)
    if (performance != null) __obj.updateDynamic("performance")(performance)
    if (synchronization != null) __obj.updateDynamic("synchronization")(synchronization)
    __obj.asInstanceOf[RightsOwnership]
  }
}


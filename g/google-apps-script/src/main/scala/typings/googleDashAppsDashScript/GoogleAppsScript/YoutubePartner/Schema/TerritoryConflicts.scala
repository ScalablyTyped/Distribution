package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerritoryConflicts extends js.Object {
  var conflictingOwnership: js.UndefOr[js.Array[ConflictingOwnership]] = js.undefined
  var territory: js.UndefOr[String] = js.undefined
}

object TerritoryConflicts {
  @scala.inline
  def apply(conflictingOwnership: js.Array[ConflictingOwnership] = null, territory: String = null): TerritoryConflicts = {
    val __obj = js.Dynamic.literal()
    if (conflictingOwnership != null) __obj.updateDynamic("conflictingOwnership")(conflictingOwnership.asInstanceOf[js.Any])
    if (territory != null) __obj.updateDynamic("territory")(territory.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerritoryConflicts]
  }
}


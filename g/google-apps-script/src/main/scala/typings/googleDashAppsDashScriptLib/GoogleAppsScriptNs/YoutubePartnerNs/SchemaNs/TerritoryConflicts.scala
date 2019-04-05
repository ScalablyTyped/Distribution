package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerritoryConflicts extends js.Object {
  var conflictingOwnership: js.UndefOr[js.Array[ConflictingOwnership]] = js.undefined
  var territory: js.UndefOr[java.lang.String] = js.undefined
}

object TerritoryConflicts {
  @scala.inline
  def apply(conflictingOwnership: js.Array[ConflictingOwnership] = null, territory: java.lang.String = null): TerritoryConflicts = {
    val __obj = js.Dynamic.literal()
    if (conflictingOwnership != null) __obj.updateDynamic("conflictingOwnership")(conflictingOwnership)
    if (territory != null) __obj.updateDynamic("territory")(territory)
    __obj.asInstanceOf[TerritoryConflicts]
  }
}


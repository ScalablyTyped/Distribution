package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnershipConflicts extends js.Object {
  var general: js.UndefOr[js.Array[TerritoryConflicts]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var mechanical: js.UndefOr[js.Array[TerritoryConflicts]] = js.undefined
  var performance: js.UndefOr[js.Array[TerritoryConflicts]] = js.undefined
  var synchronization: js.UndefOr[js.Array[TerritoryConflicts]] = js.undefined
}

object OwnershipConflicts {
  @scala.inline
  def apply(
    general: js.Array[TerritoryConflicts] = null,
    kind: String = null,
    mechanical: js.Array[TerritoryConflicts] = null,
    performance: js.Array[TerritoryConflicts] = null,
    synchronization: js.Array[TerritoryConflicts] = null
  ): OwnershipConflicts = {
    val __obj = js.Dynamic.literal()
    if (general != null) __obj.updateDynamic("general")(general.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mechanical != null) __obj.updateDynamic("mechanical")(mechanical.asInstanceOf[js.Any])
    if (performance != null) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (synchronization != null) __obj.updateDynamic("synchronization")(synchronization.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnershipConflicts]
  }
}


package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerritoryConflicts extends js.Object {
  var conflictingOwnership: js.UndefOr[js.Array[ConflictingOwnership]] = js.native
  var territory: js.UndefOr[String] = js.native
}

object TerritoryConflicts {
  @scala.inline
  def apply(): TerritoryConflicts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerritoryConflicts]
  }
  @scala.inline
  implicit class TerritoryConflictsOps[Self <: TerritoryConflicts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConflictingOwnershipVarargs(value: ConflictingOwnership*): Self = this.set("conflictingOwnership", js.Array(value :_*))
    @scala.inline
    def setConflictingOwnership(value: js.Array[ConflictingOwnership]): Self = this.set("conflictingOwnership", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConflictingOwnership: Self = this.set("conflictingOwnership", js.undefined)
    @scala.inline
    def setTerritory(value: String): Self = this.set("territory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerritory: Self = this.set("territory", js.undefined)
  }
  
}


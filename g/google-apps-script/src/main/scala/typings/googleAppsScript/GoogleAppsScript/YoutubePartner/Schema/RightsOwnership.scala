package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightsOwnership extends js.Object {
  var general: js.UndefOr[js.Array[TerritoryOwners]] = js.native
  var kind: js.UndefOr[String] = js.native
  var mechanical: js.UndefOr[js.Array[TerritoryOwners]] = js.native
  var performance: js.UndefOr[js.Array[TerritoryOwners]] = js.native
  var synchronization: js.UndefOr[js.Array[TerritoryOwners]] = js.native
}

object RightsOwnership {
  @scala.inline
  def apply(): RightsOwnership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsOwnership]
  }
  @scala.inline
  implicit class RightsOwnershipOps[Self <: RightsOwnership] (val x: Self) extends AnyVal {
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
    def setGeneralVarargs(value: TerritoryOwners*): Self = this.set("general", js.Array(value :_*))
    @scala.inline
    def setGeneral(value: js.Array[TerritoryOwners]): Self = this.set("general", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneral: Self = this.set("general", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMechanicalVarargs(value: TerritoryOwners*): Self = this.set("mechanical", js.Array(value :_*))
    @scala.inline
    def setMechanical(value: js.Array[TerritoryOwners]): Self = this.set("mechanical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMechanical: Self = this.set("mechanical", js.undefined)
    @scala.inline
    def setPerformanceVarargs(value: TerritoryOwners*): Self = this.set("performance", js.Array(value :_*))
    @scala.inline
    def setPerformance(value: js.Array[TerritoryOwners]): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    @scala.inline
    def setSynchronizationVarargs(value: TerritoryOwners*): Self = this.set("synchronization", js.Array(value :_*))
    @scala.inline
    def setSynchronization(value: js.Array[TerritoryOwners]): Self = this.set("synchronization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynchronization: Self = this.set("synchronization", js.undefined)
  }
  
}


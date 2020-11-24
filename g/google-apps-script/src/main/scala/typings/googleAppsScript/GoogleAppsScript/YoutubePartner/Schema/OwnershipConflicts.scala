package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OwnershipConflicts extends js.Object {
  
  var general: js.UndefOr[js.Array[TerritoryConflicts]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var mechanical: js.UndefOr[js.Array[TerritoryConflicts]] = js.native
  
  var performance: js.UndefOr[js.Array[TerritoryConflicts]] = js.native
  
  var synchronization: js.UndefOr[js.Array[TerritoryConflicts]] = js.native
}
object OwnershipConflicts {
  
  @scala.inline
  def apply(): OwnershipConflicts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OwnershipConflicts]
  }
  
  @scala.inline
  implicit class OwnershipConflictsOps[Self <: OwnershipConflicts] (val x: Self) extends AnyVal {
    
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
    def setGeneralVarargs(value: TerritoryConflicts*): Self = this.set("general", js.Array(value :_*))
    
    @scala.inline
    def setGeneral(value: js.Array[TerritoryConflicts]): Self = this.set("general", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneral: Self = this.set("general", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMechanicalVarargs(value: TerritoryConflicts*): Self = this.set("mechanical", js.Array(value :_*))
    
    @scala.inline
    def setMechanical(value: js.Array[TerritoryConflicts]): Self = this.set("mechanical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMechanical: Self = this.set("mechanical", js.undefined)
    
    @scala.inline
    def setPerformanceVarargs(value: TerritoryConflicts*): Self = this.set("performance", js.Array(value :_*))
    
    @scala.inline
    def setPerformance(value: js.Array[TerritoryConflicts]): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    
    @scala.inline
    def setSynchronizationVarargs(value: TerritoryConflicts*): Self = this.set("synchronization", js.Array(value :_*))
    
    @scala.inline
    def setSynchronization(value: js.Array[TerritoryConflicts]): Self = this.set("synchronization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronization: Self = this.set("synchronization", js.undefined)
  }
}

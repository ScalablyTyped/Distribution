package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistenceSettings extends js.Object {
  
  var experimentalForceOwningTab: js.UndefOr[Boolean] = js.native
  
  var experimentalTabSynchronization: js.UndefOr[Boolean] = js.native
  
  var synchronizeTabs: js.UndefOr[Boolean] = js.native
}
object PersistenceSettings {
  
  @scala.inline
  def apply(): PersistenceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceSettings]
  }
  
  @scala.inline
  implicit class PersistenceSettingsOps[Self <: PersistenceSettings] (val x: Self) extends AnyVal {
    
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
    def setExperimentalForceOwningTab(value: Boolean): Self = this.set("experimentalForceOwningTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentalForceOwningTab: Self = this.set("experimentalForceOwningTab", js.undefined)
    
    @scala.inline
    def setExperimentalTabSynchronization(value: Boolean): Self = this.set("experimentalTabSynchronization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentalTabSynchronization: Self = this.set("experimentalTabSynchronization", js.undefined)
    
    @scala.inline
    def setSynchronizeTabs(value: Boolean): Self = this.set("synchronizeTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronizeTabs: Self = this.set("synchronizeTabs", js.undefined)
  }
}

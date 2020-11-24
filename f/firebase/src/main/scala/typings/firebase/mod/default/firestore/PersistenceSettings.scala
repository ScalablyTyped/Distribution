package typings.firebase.mod.default.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistenceSettings extends js.Object {
  
  /**
    * Whether to force enable persistence for the client. This cannot be used
    * with `synchronizeTabs:true` and is primarily intended for use with Web
    * Workers. Setting this to `true` will enable persistence, but cause other
    * tabs using persistence to fail.
    *
    * This setting may be removed in a future release. If you find yourself
    * using it for a specific use case or run into any issues, please tell us
    * about it in
    * https://github.com/firebase/firebase-js-sdk/issues/983.
    */
  var experimentalForceOwningTab: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to synchronize the in-memory state of multiple tabs. Setting this
    * to `true` in all open tabs enables shared access to local persistence,
    * shared execution of queries and latency-compensated local document updates
    * across all connected instances.
    *
    * To enable this mode, `synchronizeTabs:true` needs to be set globally in all
    * active tabs. If omitted or set to 'false', `enablePersistence()` will fail
    * in all but the first tab.
    */
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
    def setSynchronizeTabs(value: Boolean): Self = this.set("synchronizeTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronizeTabs: Self = this.set("synchronizeTabs", js.undefined)
  }
}

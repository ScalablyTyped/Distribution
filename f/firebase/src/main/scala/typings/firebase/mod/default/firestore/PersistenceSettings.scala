package typings.firebase.mod.default.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceSettings extends StObject {
  
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
  var experimentalForceOwningTab: js.UndefOr[Boolean] = js.undefined
  
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
  var synchronizeTabs: js.UndefOr[Boolean] = js.undefined
}
object PersistenceSettings {
  
  inline def apply(): PersistenceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceSettings]
  }
  
  extension [Self <: PersistenceSettings](x: Self) {
    
    inline def setExperimentalForceOwningTab(value: Boolean): Self = StObject.set(x, "experimentalForceOwningTab", value.asInstanceOf[js.Any])
    
    inline def setExperimentalForceOwningTabUndefined: Self = StObject.set(x, "experimentalForceOwningTab", js.undefined)
    
    inline def setSynchronizeTabs(value: Boolean): Self = StObject.set(x, "synchronizeTabs", value.asInstanceOf[js.Any])
    
    inline def setSynchronizeTabsUndefined: Self = StObject.set(x, "synchronizeTabs", js.undefined)
  }
}

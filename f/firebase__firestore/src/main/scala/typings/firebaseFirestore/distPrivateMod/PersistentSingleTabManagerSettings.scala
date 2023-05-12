package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentSingleTabManagerSettings extends StObject {
  
  /**
    * Whether to force-enable persistent (IndexedDB) cache for the client. This
    * cannot be used with multi-tab synchronization and is primarily intended for
    * use with Web Workers. Setting this to `true` will enable IndexedDB, but cause
    * other tabs using IndexedDB cache to fail.
    */
  var forceOwnership: js.UndefOr[Boolean] = js.undefined
}
object PersistentSingleTabManagerSettings {
  
  inline def apply(): PersistentSingleTabManagerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentSingleTabManagerSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistentSingleTabManagerSettings] (val x: Self) extends AnyVal {
    
    inline def setForceOwnership(value: Boolean): Self = StObject.set(x, "forceOwnership", value.asInstanceOf[js.Any])
    
    inline def setForceOwnershipUndefined: Self = StObject.set(x, "forceOwnership", js.undefined)
  }
}

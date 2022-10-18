package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceSettings extends StObject {
  
  /**
    * Whether to force enable persistence for the client. This cannot be used
    * with multi-tab synchronization and is primarily intended for use with Web
    * Workers. Setting this to `true` will enable persistence, but cause other
    * tabs using persistence to fail.
    */
  var forceOwnership: js.UndefOr[Boolean] = js.undefined
}
object PersistenceSettings {
  
  inline def apply(): PersistenceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceSettings]
  }
  
  extension [Self <: PersistenceSettings](x: Self) {
    
    inline def setForceOwnership(value: Boolean): Self = StObject.set(x, "forceOwnership", value.asInstanceOf[js.Any])
    
    inline def setForceOwnershipUndefined: Self = StObject.set(x, "forceOwnership", js.undefined)
  }
}

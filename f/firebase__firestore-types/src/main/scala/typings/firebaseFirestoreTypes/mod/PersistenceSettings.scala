package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceSettings extends StObject {
  
  var experimentalForceOwningTab: js.UndefOr[Boolean] = js.undefined
  
  var experimentalTabSynchronization: js.UndefOr[Boolean] = js.undefined
  
  var synchronizeTabs: js.UndefOr[Boolean] = js.undefined
}
object PersistenceSettings {
  
  inline def apply(): PersistenceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistenceSettings] (val x: Self) extends AnyVal {
    
    inline def setExperimentalForceOwningTab(value: Boolean): Self = StObject.set(x, "experimentalForceOwningTab", value.asInstanceOf[js.Any])
    
    inline def setExperimentalForceOwningTabUndefined: Self = StObject.set(x, "experimentalForceOwningTab", js.undefined)
    
    inline def setExperimentalTabSynchronization(value: Boolean): Self = StObject.set(x, "experimentalTabSynchronization", value.asInstanceOf[js.Any])
    
    inline def setExperimentalTabSynchronizationUndefined: Self = StObject.set(x, "experimentalTabSynchronization", js.undefined)
    
    inline def setSynchronizeTabs(value: Boolean): Self = StObject.set(x, "synchronizeTabs", value.asInstanceOf[js.Any])
    
    inline def setSynchronizeTabsUndefined: Self = StObject.set(x, "synchronizeTabs", js.undefined)
  }
}

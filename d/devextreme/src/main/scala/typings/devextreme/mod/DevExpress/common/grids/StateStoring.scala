package typings.devextreme.mod.DevExpress.common.grids

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateStoring extends StObject {
  
  /**
    * Specifies a function that is executed on state loading. Applies only if the type is &apos;custom&apos;.
    */
  var customLoad: js.UndefOr[js.Function0[PromiseLike[Any]]] = js.undefined
  
  /**
    * Specifies a function that is executed on state saving. Applies only if the type is &apos;custom&apos;.
    */
  var customSave: js.UndefOr[js.Function1[/* gridState */ Any, Any]] = js.undefined
  
  /**
    * Enables state storing.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the delay in milliseconds between when a user makes a change and when this change is saved.
    */
  var savingTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the key for storing the UI component state.
    */
  var storageKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of storage where the state is saved.
    */
  var `type`: js.UndefOr[StateStoreType] = js.undefined
}
object StateStoring {
  
  inline def apply(): StateStoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateStoring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateStoring] (val x: Self) extends AnyVal {
    
    inline def setCustomLoad(value: () => PromiseLike[Any]): Self = StObject.set(x, "customLoad", js.Any.fromFunction0(value))
    
    inline def setCustomLoadUndefined: Self = StObject.set(x, "customLoad", js.undefined)
    
    inline def setCustomSave(value: /* gridState */ Any => Any): Self = StObject.set(x, "customSave", js.Any.fromFunction1(value))
    
    inline def setCustomSaveUndefined: Self = StObject.set(x, "customSave", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setSavingTimeout(value: Double): Self = StObject.set(x, "savingTimeout", value.asInstanceOf[js.Any])
    
    inline def setSavingTimeoutUndefined: Self = StObject.set(x, "savingTimeout", js.undefined)
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    
    inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
    
    inline def setType(value: StateStoreType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

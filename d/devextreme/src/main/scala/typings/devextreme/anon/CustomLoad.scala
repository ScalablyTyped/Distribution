package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.charts.StateStoreType
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLoad extends StObject {
  
  /**
    * Specifies a function that is executed on state loading. Applies only if the type is &apos;custom&apos;.
    */
  var customLoad: js.UndefOr[js.Function0[PromiseLike[Any]]] = js.undefined
  
  /**
    * Specifies a function that is executed on state saving. Applies only if the type is &apos;custom&apos;.
    */
  var customSave: js.UndefOr[js.Function1[/* state */ Any, Any]] = js.undefined
  
  /**
    * Specifies whether or not a grid saves its state.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the delay between the last change of a grid state and the operation of saving this state in milliseconds.
    */
  var savingTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a unique key to be used for storing the grid state.
    */
  var storageKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of storage to be used for state storing.
    */
  var `type`: js.UndefOr[StateStoreType] = js.undefined
}
object CustomLoad {
  
  inline def apply(): CustomLoad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLoad]
  }
  
  extension [Self <: CustomLoad](x: Self) {
    
    inline def setCustomLoad(value: () => PromiseLike[Any]): Self = StObject.set(x, "customLoad", js.Any.fromFunction0(value))
    
    inline def setCustomLoadUndefined: Self = StObject.set(x, "customLoad", js.undefined)
    
    inline def setCustomSave(value: /* state */ Any => Any): Self = StObject.set(x, "customSave", js.Any.fromFunction1(value))
    
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

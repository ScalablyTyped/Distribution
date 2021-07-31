package typings.devextreme.anon

import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.localStorage
import typings.devextreme.devextremeStrings.sessionStorage
import typings.devextreme.mod.global.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLoad extends StObject {
  
  var customLoad: js.UndefOr[
    js.Function0[typings.devextreme.mod.global.Promise[js.Any] | JQueryPromise[js.Any]]
  ] = js.undefined
  
  var customSave: js.UndefOr[js.Function1[/* state */ js.Any, js.Any]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var savingTimeout: js.UndefOr[Double] = js.undefined
  
  var storageKey: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[custom | localStorage | sessionStorage] = js.undefined
}
object CustomLoad {
  
  @scala.inline
  def apply(): CustomLoad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLoad]
  }
  
  @scala.inline
  implicit class CustomLoadMutableBuilder[Self <: CustomLoad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomLoad(value: () => typings.devextreme.mod.global.Promise[js.Any] | JQueryPromise[js.Any]): Self = StObject.set(x, "customLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCustomLoadUndefined: Self = StObject.set(x, "customLoad", js.undefined)
    
    @scala.inline
    def setCustomSave(value: /* state */ js.Any => js.Any): Self = StObject.set(x, "customSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomSaveUndefined: Self = StObject.set(x, "customSave", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setSavingTimeout(value: Double): Self = StObject.set(x, "savingTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingTimeoutUndefined: Self = StObject.set(x, "savingTimeout", js.undefined)
    
    @scala.inline
    def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
    
    @scala.inline
    def setType(value: custom | localStorage | sessionStorage): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

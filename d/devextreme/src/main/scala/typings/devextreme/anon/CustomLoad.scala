package typings.devextreme.anon

import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.localStorage
import typings.devextreme.devextremeStrings.sessionStorage
import typings.devextreme.mod.global.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLoad extends js.Object {
  
  var customLoad: js.UndefOr[js.Function0[typings.devextreme.mod.global.Promise[_] | JQueryPromise[_]]] = js.native
  
  var customSave: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var savingTimeout: js.UndefOr[Double] = js.native
  
  var storageKey: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[custom | localStorage | sessionStorage] = js.native
}
object CustomLoad {
  
  @scala.inline
  def apply(): CustomLoad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLoad]
  }
  
  @scala.inline
  implicit class CustomLoadOps[Self <: CustomLoad] (val x: Self) extends AnyVal {
    
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
    def setCustomLoad(value: () => typings.devextreme.mod.global.Promise[_] | JQueryPromise[_]): Self = this.set("customLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCustomLoad: Self = this.set("customLoad", js.undefined)
    
    @scala.inline
    def setCustomSave(value: /* state */ js.Any => _): Self = this.set("customSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomSave: Self = this.set("customSave", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setSavingTimeout(value: Double): Self = this.set("savingTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingTimeout: Self = this.set("savingTimeout", js.undefined)
    
    @scala.inline
    def setStorageKey(value: String): Self = this.set("storageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageKey: Self = this.set("storageKey", js.undefined)
    
    @scala.inline
    def setType(value: custom | localStorage | sessionStorage): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

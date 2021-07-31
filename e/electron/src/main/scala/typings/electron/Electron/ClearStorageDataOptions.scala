package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearStorageDataOptions extends StObject {
  
  /**
    * Should follow `window.location.origin`’s representation `scheme://host:port`.
    */
  var origin: js.UndefOr[String] = js.undefined
  
  /**
    * The types of quotas to clear, can contain: `temporary`, `persistent`,
    * `syncable`. If not specified, clear all quotas.
    */
  var quotas: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The types of storages to clear, can contain: `appcache`, `cookies`,
    * `filesystem`, `indexdb`, `localstorage`, `shadercache`, `websql`,
    * `serviceworkers`, `cachestorage`. If not specified, clear all storage types.
    */
  var storages: js.UndefOr[js.Array[String]] = js.undefined
}
object ClearStorageDataOptions {
  
  @scala.inline
  def apply(): ClearStorageDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearStorageDataOptions]
  }
  
  @scala.inline
  implicit class ClearStorageDataOptionsMutableBuilder[Self <: ClearStorageDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setQuotas(value: js.Array[String]): Self = StObject.set(x, "quotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotasUndefined: Self = StObject.set(x, "quotas", js.undefined)
    
    @scala.inline
    def setQuotasVarargs(value: String*): Self = StObject.set(x, "quotas", js.Array(value :_*))
    
    @scala.inline
    def setStorages(value: js.Array[String]): Self = StObject.set(x, "storages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoragesUndefined: Self = StObject.set(x, "storages", js.undefined)
    
    @scala.inline
    def setStoragesVarargs(value: String*): Self = StObject.set(x, "storages", js.Array(value :_*))
  }
}

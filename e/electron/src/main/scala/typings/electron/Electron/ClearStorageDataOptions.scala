package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearStorageDataOptions extends js.Object {
  /**
    * Should follow `window.location.origin`’s representation `scheme://host:port`.
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * The types of quotas to clear, can contain: `temporary`, `persistent`,
    * `syncable`. If not specified, clear all quotas.
    */
  var quotas: js.UndefOr[js.Array[String]] = js.native
  /**
    * The types of storages to clear, can contain: `appcache`, `cookies`,
    * `filesystem`, `indexdb`, `localstorage`, `shadercache`, `websql`,
    * `serviceworkers`, `cachestorage`. If not specified, clear all storage types.
    */
  var storages: js.UndefOr[js.Array[String]] = js.native
}

object ClearStorageDataOptions {
  @scala.inline
  def apply(): ClearStorageDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearStorageDataOptions]
  }
  @scala.inline
  implicit class ClearStorageDataOptionsOps[Self <: ClearStorageDataOptions] (val x: Self) extends AnyVal {
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
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setQuotasVarargs(value: String*): Self = this.set("quotas", js.Array(value :_*))
    @scala.inline
    def setQuotas(value: js.Array[String]): Self = this.set("quotas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotas: Self = this.set("quotas", js.undefined)
    @scala.inline
    def setStoragesVarargs(value: String*): Self = this.set("storages", js.Array(value :_*))
    @scala.inline
    def setStorages(value: js.Array[String]): Self = this.set("storages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorages: Self = this.set("storages", js.undefined)
  }
  
}


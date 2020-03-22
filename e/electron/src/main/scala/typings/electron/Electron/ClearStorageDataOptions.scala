package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearStorageDataOptions extends js.Object {
  /**
    * Should follow `window.location.origin`’s representation `scheme://host:port`.
    */
  var origin: js.UndefOr[String] = js.undefined
  /**
    * The types of quotas to clear, can contain: `temporary`, `persistent`,
    * `syncable`.
    */
  var quotas: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The types of storages to clear, can contain: `appcache`, `cookies`,
    * `filesystem`, `indexdb`, `localstorage`, `shadercache`, `websql`,
    * `serviceworkers`, `cachestorage`.
    */
  var storages: js.UndefOr[js.Array[String]] = js.undefined
}

object ClearStorageDataOptions {
  @scala.inline
  def apply(origin: String = null, quotas: js.Array[String] = null, storages: js.Array[String] = null): ClearStorageDataOptions = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (quotas != null) __obj.updateDynamic("quotas")(quotas.asInstanceOf[js.Any])
    if (storages != null) __obj.updateDynamic("storages")(storages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearStorageDataOptions]
  }
}


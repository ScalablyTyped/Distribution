package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearStorageDataOptions extends js.Object {
  /**
    * Should follow window.location.origin’s representation scheme://host:port.
    */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The types of quotas to clear, can contain: temporary, persistent, syncable.
    */
  var quotas: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The types of storages to clear, can contain: appcache, cookies, filesystem,
    * indexdb, localstorage, shadercache, websql, serviceworkers, cachestorage.
    */
  var storages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ClearStorageDataOptions {
  @scala.inline
  def apply(
    origin: java.lang.String = null,
    quotas: js.Array[java.lang.String] = null,
    storages: js.Array[java.lang.String] = null
  ): ClearStorageDataOptions = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (quotas != null) __obj.updateDynamic("quotas")(quotas)
    if (storages != null) __obj.updateDynamic("storages")(storages)
    __obj.asInstanceOf[ClearStorageDataOptions]
  }
}

